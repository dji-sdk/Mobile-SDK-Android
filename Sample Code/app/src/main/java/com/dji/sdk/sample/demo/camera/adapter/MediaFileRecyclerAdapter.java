package com.dji.sdk.sample.demo.camera.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.dji.sdk.sample.R;

import java.util.ArrayList;
import java.util.List;

import dji.sdk.media.MediaFile;


public class MediaFileRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /**
     * 上拉加载
     */
    public static final int PULL_UP_LOADMORE = 0;
    public static final int LOADING = 1;
    public static final int LOAD_FINISH = 2;


    private int mLoadStatus = 0;
    private LayoutInflater mInflater;
    private List<MediaFile> mMediaFile = null;
    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;

    public MediaFileRecyclerAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mMediaFile = new ArrayList<>();
    }

    public void setMediaFileList(List<MediaFile> pList) {
        mMediaFile = pList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == TYPE_ITEM) {
            View view = mInflater.inflate(R.layout.media_recycler_item, parent, false);
            ItemViewHolder itemViewHolder = new ItemViewHolder(view);
            return itemViewHolder;
        } else if (viewType == TYPE_FOOTER) {
            View foot_view = mInflater.inflate(R.layout.media_recycler_footview, parent, false);
            FootViewHolder footViewHolder = new FootViewHolder(foot_view);
            return footViewHolder;
        }
        return null;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ItemViewHolder) {
            ((ItemViewHolder) holder).item_tv.setText(mMediaFile.get(position).getFileName());
            holder.itemView.setTag(position);
        } else if (holder instanceof FootViewHolder) {
            FootViewHolder footViewHolder = (FootViewHolder) holder;
            switch (mLoadStatus) {
                case PULL_UP_LOADMORE:
                    footViewHolder.mProgressBar.setVisibility(View.GONE);
                    footViewHolder.mFooViewTv.setText(R.string.pull_up_load_more);
                    break;
                case LOADING:
                    footViewHolder.mProgressBar.setVisibility(View.VISIBLE);
                    footViewHolder.mFooViewTv.setText(R.string.fetch_media_loading);
                    break;
                case LOAD_FINISH:
                    footViewHolder.mProgressBar.setVisibility(View.GONE);
                    footViewHolder.mFooViewTv.setText(R.string.load_finish);
                    break;
                default:
                    break;
            }
        }
    }


    @Override
    public int getItemViewType(int position) {
        if (position + 1 == getItemCount()) {
            return TYPE_FOOTER;
        } else {
            return TYPE_ITEM;
        }
    }

    @Override
    public int getItemCount() {
        return mMediaFile.size() + 1;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public TextView item_tv;

        public ItemViewHolder(View view) {
            super(view);
            item_tv = (TextView) view.findViewById(R.id.item_tv);
        }
    }


    public static class FootViewHolder extends RecyclerView.ViewHolder {
        private TextView mFooViewTv;
        private ProgressBar mProgressBar;

        public FootViewHolder(View view) {
            super(view);
            mFooViewTv = (TextView) view.findViewById(R.id.foot_view_item_tv);
            mProgressBar = (ProgressBar) view.findViewById(R.id.foot_progressbar);

        }
    }


    public void addMoreItem(List<MediaFile> newDatas) {
        mMediaFile.addAll(newDatas);
        notifyDataSetChanged();
    }

    public void changeLoadStatus(int status) {
        mLoadStatus = status;
        notifyDataSetChanged();
    }
}
