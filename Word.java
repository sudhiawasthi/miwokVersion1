package com.example.android.miwokk;

import android.content.Context;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokkTranslation;
    private int mImageid=-1;
    private int mAudioid;

    public Word(String DefaultTranslation,String MiwokkTranslation,int audioid)
    {
        mDefaultTranslation=DefaultTranslation;
        mMiwokkTranslation=MiwokkTranslation;
        mAudioid=audioid;
    }
    public Word(String DefaultTranslation,String MiwokkTranslation,int imageid,int audioid)
    {
        mDefaultTranslation=DefaultTranslation;
        mMiwokkTranslation=MiwokkTranslation;
        mImageid=imageid;
        mAudioid=audioid;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokkTranslation() {
        return mMiwokkTranslation;
    }

    public int getmImageid() {
        return mImageid;
    }

    public int getmAudioid() {
        return mAudioid;
    }

    public boolean hasImage()
    {
       if(mImageid==-1)
           return false;
       else
           return true;
    }
}
