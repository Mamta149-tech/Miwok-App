package com.example.android.miwok;

public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public word(String DefaultTranslation, String MiwokTranslation, int AudioResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceId = AudioResourceId;
    }

    public word(String DefaultTranslation, String MiwokTranslation, int ImageResourde, int AudioResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourde;
        mAudioResourceId = AudioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasimage()
    {
       return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId()
    {
        return mAudioResourceId;
    }
}
