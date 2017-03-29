package com.dji.sdk.sample.internal.controller;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.model.ViewWrapper;
import com.dji.sdk.sample.internal.model.GroupHeader;
import com.dji.sdk.sample.internal.model.GroupItem;
import com.dji.sdk.sample.internal.model.SingleItem;
import com.dji.sdk.sample.internal.view.PresentableView;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 * Adapter for a ListView that has expandable items.
 * Use @link {#GroupItem} for an expandable item and @link {#GroupItem} for a children of an expandable item.
 * Use @link {#SingleItem} to present an non-expandable item.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private List<GroupHeader> itemList;
    private final List<GroupHeader> backupList;
    private final Context context;
    private LayoutInflater layoutInflater;

    public ExpandableListAdapter(@NonNull Context context, @NonNull List<GroupHeader> itemList) {
        this.itemList = itemList;
        backupList = new ArrayList<>(itemList);
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getGroupCount() {
        return itemList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return itemList.get(groupPosition).getGroupItems().length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return itemList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        if (isSingleItem(groupPosition)) {
            return null;
        } else {
            return (itemList.get(groupPosition)).getGroupItems()[childPosition];
        }
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        final GroupHeader item = (GroupHeader) getGroup(groupPosition);

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.expandable_first_level_item, parent, false);
        }

        final TextView titleText = (TextView) convertView.findViewById(R.id.expandable_item_title);
        TextView rightArrowText = (TextView) convertView.findViewById(R.id.expandable_item_right_arrow);
        TextView arrowText = (TextView) convertView.findViewById(R.id.expandable_item_down_arrow);
        titleText.setText(context.getResources().getString(item.getTitleStringId()));

        if (isSingleItem(groupPosition)) {
            arrowText.setVisibility(View.INVISIBLE);
            rightArrowText.setVisibility(View.VISIBLE);
            titleText.setTypeface(Typeface.DEFAULT);
            titleText.setTextColor(context.getResources().getColor(R.color.gray));
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Constructor<? extends PresentableView> cons =
                            ((SingleItem) item).getLinkedViewClass().getConstructor(Context.class);
                        PresentableView linkedView = cons.newInstance(context);
                        DJISampleApplication.getEventBus()
                                            .post(new ViewWrapper((View) linkedView, item.getTitleStringId()));
                    } catch (Exception e) {
                        throw new RuntimeException("Class "
                                                       + ((SingleItem) item).getLinkedViewClass().getSimpleName()
                                                       + " is missing a constructor that takes Context");
                    }
                }
            });
        } else {
            convertView.setClickable(false);
            arrowText.setVisibility(View.VISIBLE);
            rightArrowText.setVisibility(View.INVISIBLE);
            titleText.setTypeface(Typeface.DEFAULT_BOLD);
            titleText.setTextColor(context.getResources().getColor(R.color.black));
        }
        if (isExpanded) {
            arrowText.setText("⌃");
        } else {
            arrowText.setText("⌄");
        }

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition,
                             int childPosition,
                             boolean isLastChild,
                             View convertView,
                             ViewGroup parent) {
        final GroupItem item = (GroupItem) getChild(groupPosition, childPosition);
        if (item == null) {
            return null;
        } else {
            if (convertView == null) {
                convertView = layoutInflater.inflate(R.layout.expandable_second_level_item, parent, false);
            }
            final TextView titleText = (TextView) convertView.findViewById(R.id.expandable_item_title);
            titleText.setText(context.getResources().getString(item.getTitleStringId()));

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Constructor<? extends PresentableView> cons =
                            (item.getLinkedViewClass().getConstructor(Context.class));
                        PresentableView linkedView = cons.newInstance(context);
                        DJISampleApplication.getEventBus()
                                            .post(new ViewWrapper((View) linkedView, item.getTitleStringId()));
                    } catch (Exception e) {
                        throw new RuntimeException("Class "
                                                       + (item).getLinkedViewClass().getSimpleName()
                                                       + " is missing a constructor that takes Context");
                    }
                }
            });
            return convertView;
        }
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    /**
     * Filters list item by a string.
     * If the item's title has the string, immediately keep that item.
     * If not, searches through it's children and only keep the child whose title has the string
     */
    public void filterData(String query) {
        query = query.toLowerCase();
        itemList.clear();

        if (query.isEmpty()) {
            itemList.addAll(backupList);
        } else {

            for (GroupHeader eachItem : backupList) {
                final String groupTitle = context.getResources().getString(eachItem.getTitleStringId());
                if (groupTitle.toLowerCase().contains(query)) {
                    itemList.add(eachItem);
                } else {
                    GroupItem[] allItems = eachItem.getGroupItems();
                    List<GroupItem> filteredItems = new ArrayList<>();
                    for (GroupItem eachGroupItem : allItems) {
                        final String itemTitle = context.getResources().getString(eachGroupItem.getTitleStringId());
                        if (itemTitle.toLowerCase().contains(query)) {
                            filteredItems.add(eachGroupItem);
                        }
                    }
                    if (!filteredItems.isEmpty()) {
                        final GroupHeader groupHeader = new GroupHeader(eachItem.getTitleStringId(),
                                                                        filteredItems.toArray(new GroupItem[filteredItems.size()]));
                        itemList.add(groupHeader);
                    }
                }
            }
        }

        notifyDataSetChanged();
    }

    /**
     * Checks if the list item is single or group header
     *
     * @return true if the item is single
     */
    private boolean isSingleItem(int groupPosition) {
        return getChildrenCount(groupPosition) <= 0;
    }
}
