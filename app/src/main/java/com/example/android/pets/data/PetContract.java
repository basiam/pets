package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;


public final class PetContract {

    private static final String TAG = "Pets";
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PETS = "pets";

    private PetContract() {}



    public static class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PetContract.PATH_PETS);



        public final static String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";


        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
