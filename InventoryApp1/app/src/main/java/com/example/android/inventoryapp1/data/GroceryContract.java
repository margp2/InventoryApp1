package com.example.android.inventoryapp1.data;

import android.provider.BaseColumns;

public class GroceryContract {

    private GroceryContract() {}

    public static final class GroceryEntry implements BaseColumns {
        public final static String TABLE_NAME = "grocery";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_GROCERY_NAME = "name";

        public final static String COLUMN_GROCERY_PRICE = "price";

        public final static String COLUMN_GROCERY_QUANTITY = "quantity";

        public final static String COLUMN_SUPPLIER_NAME = "supplier name";

        public final static String COLUMN_SUPPLIER_PHONE_NUMBER = "supplier phone";
    }
}
