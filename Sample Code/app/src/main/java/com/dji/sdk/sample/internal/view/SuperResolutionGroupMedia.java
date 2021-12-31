package com.dji.sdk.sample.internal.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.dji.sdk.sample.demo.camera.ShootSuperResolutionPhotoView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.media.MediaFile;
import dji.sdk.media.SuperResInfoBean;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

/**
 * 超解析Group，是一个文件夹里面包含有wide和zoom的照片
 * 获取子照片，必须先调用fetchSubMediaList拉取子文件
 */
public class SuperResolutionGroupMedia {

    /**
     * 超解析group里面的子照片，第一张是WIDE的照片，其他是ZOOM的照片
     */
    private List<MediaFile> mSubMediaList;
    /**
     * 超解析ZOOM的照片
     */
    private List<MediaFile> mZoomMediaList;


    private String mOriginPath;


    private MediaFile mMediaFile;

    /**
     * 广角照片
     */
    private MediaFile mWideMedia;

    public SuperResolutionGroupMedia(MediaFile mediaFile) {
        mMediaFile = mediaFile;
    }

    /**
     * 获取WIDE照片，必须先调用fetchSubMediaList拉取子文件
     * @return
     */
    public MediaFile getWideMedia() {
        return mWideMedia;
    }

    /**
     * 获取ZOOM照片列表，必须先调用fetchSubMediaList拉取子文件
     * @return
     */
    public List<MediaFile> getZoomMediaList() {
        return mZoomMediaList;
    }

    /**
     * 拉取所有子照片列表，包括WIDE和ZOOM照片
     * @return
     */
    public void fetchSubMediaList(ShootSuperResolutionPhotoView.FetchListener listener) {
        mMediaFile.fetchSubFileDataList(new CommonCallbacks.CompletionCallbackWith<List<MediaFile>>() {
            @Override
            public void onSuccess(List<MediaFile> mediaFileList) {
                mSubMediaList = new ArrayList<>();
                for (MediaFile mediaFile : mediaFileList) {

                    mSubMediaList.add(mediaFile);
                    // 填充thumbnail
                    mediaFile.fetchThumbnail(error -> {});
                }
                mZoomMediaList = new ArrayList<>(mSubMediaList);
                // 第一张是WIDE照片
                mWideMedia = mZoomMediaList.remove(0);
                mMediaFile.fetchThumbnailWithPath(error -> {
                   if (listener != null) {
                       listener.onSuccess();
                   }
                });
            }
            @Override
            public void onFailure(DJIError error) {

            }
        });
    }

    public SuperResInfoBean getHyperAnalyticInfo() {
        return mMediaFile.getSuperResInfoBean();
    }



}
