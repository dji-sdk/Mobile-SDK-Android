package com.dji.sdk.sample.internal.model;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

/**
 * List item that has at least one child.
 * This should be used to hold data for the header of a group in the ListView
 */

public class GroupHeader extends ListItem {
    private final GroupItem[] groupItemList;
    private boolean shouldCollapseByDefault;

    public GroupHeader(@StringRes int titleStringId, @NonNull GroupItem[] groupItemList) {
        this(titleStringId, groupItemList, false);
    }

    public GroupHeader(@StringRes int titleStringId, @NonNull GroupItem[] groupItemList, boolean shouldCollapseByDefault) {
        super(titleStringId);
        this.groupItemList = groupItemList;
        this.shouldCollapseByDefault = shouldCollapseByDefault;
    }

    public boolean shouldCollapseByDefault() {
        return shouldCollapseByDefault;
    }

    @NonNull
    public GroupItem[] getGroupItems() {
        return groupItemList;
    }
}
