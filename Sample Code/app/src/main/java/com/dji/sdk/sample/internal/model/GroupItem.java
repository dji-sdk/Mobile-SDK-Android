package com.dji.sdk.sample.internal.model;


import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import com.dji.sdk.sample.internal.view.PresentableView;

/**
 * List item that belongs to a group.
 * This item is directly linked to a PresentableView.
 */

public class GroupItem extends ListItem {

    private final @NonNull
    Class<? extends PresentableView> linkedViewClass;

    public GroupItem(@StringRes int titleStringId, @NonNull Class<? extends PresentableView> linkedView) {
        super(titleStringId);
        if (View.class.isAssignableFrom(linkedView)) {
            this.linkedViewClass = linkedView;
        } else {
            throw new RuntimeException("Class "
                                           + linkedView.getClass().getSimpleName()
                                           + " needs to extend from a View!");
        }
    }

    @NonNull
    public Class<? extends PresentableView> getLinkedViewClass() {
        return linkedViewClass;
    }
}
