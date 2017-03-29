package com.dji.sdk.sample.internal.model;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import com.dji.sdk.sample.internal.view.PresentableView;
import java.util.ArrayList;
import java.util.List;

/**
 * A list item
 */
public abstract class ListItem {
    private @StringRes int titleStringId;

    public ListItem(@StringRes int titleStringId) {
        this.titleStringId = titleStringId;
    }

    public int getTitleStringId() {
        return titleStringId;
    }

    /**
     * Builder to easily build a hierarchical list of ListItem
     */
    public static final class ListBuilder {
        private final List<GroupHeader> demos;

        public ListBuilder() {
            demos = new ArrayList<>();
        }

        /**
         * Ands a stand alone first level item
         */
        private ListBuilder singleItem(@StringRes int titleString,
                                       @NonNull Class<? extends PresentableView> linkedDemoView) {
            try {
                demos.add(new SingleItem(titleString, linkedDemoView));
            } catch (Exception e) {
                throw new RuntimeException("Class "
                                               + linkedDemoView.getSimpleName()
                                               + " is missing a constructor that takes Context");
            }
            return this;
        }

        /**
         * Add a group of items
         */
        public ListBuilder addGroup(@StringRes int titleString, boolean shouldCollapseByDefault, GroupItem ... items) {
            demos.add(new GroupHeader(titleString, items, shouldCollapseByDefault));
            return this;
        }

        public List<GroupHeader> build() {
            return this.demos;
        }
    }
}
