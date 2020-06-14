package com.example.annang;

public class Word {

    private String mDefaultTranslation;

    private String mAnnangTranslation;

    private int ImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word (String defaultTranslation, String annangTranslation) {

        mDefaultTranslation = defaultTranslation;
        mAnnangTranslation = annangTranslation;
    }
    public Word (String defaultTranslation, String annangTranslation, int imageResourceId) {

        mDefaultTranslation = defaultTranslation;
        mAnnangTranslation = annangTranslation;
        ImageResourceId = imageResourceId;
    }

    public String getmDefaultTranslation () {

        return mDefaultTranslation;
    }

    public String getmAnnangTranslation () {

        return mAnnangTranslation;
    }
    public int getImageResourceId(){

        return ImageResourceId;
    }
    public boolean hasImage(){
        return ImageResourceId != NO_IMAGE_PROVIDED;
    }
    }

