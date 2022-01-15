package com.example.ud839_miwok_lesson_one;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    public Word(String defaultTranslations, String miwokTranslation){
        mDefaultTranslation = defaultTranslations;
        mMiwokTranslation = miwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
