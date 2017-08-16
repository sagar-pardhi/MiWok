package com.example.android.miwokapp;

/**
 * Created by Sagar on 12/22/2016.
 */
public class word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourseId;

    public word(String defaultTranslation, String MiwokTranslation, int audioResourseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourseId = audioResourseId;
    }

    public word(String defaultTranslation, String MiwokTranslation, int ImageResourceId, int audioResourseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourseId = audioResourseId;
    }

    public String getdefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourseId(){
        return mAudioResourseId;
    }
}
