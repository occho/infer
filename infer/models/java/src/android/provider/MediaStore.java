/*
* Copyright (c) 2013- Facebook.
* All rights reserved.
*/

package android.provider;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

public final class MediaStore {

    public static final class Images {


        public static final class Media {
            public static final Cursor query(ContentResolver cr, Uri uri, String[] projection) {
                return cr.query(uri, projection, null, null, null);
            }

            public static final Cursor query(ContentResolver cr, Uri uri, String[] projection,
                                             String where, String orderBy) {
                return cr.query(uri, projection, where, null, orderBy);
            }

            public static final Cursor query(ContentResolver cr, Uri uri, String[] projection,
                                             String selection, String[] selectionArgs, String orderBy) {
                return cr.query(uri, projection, selection, selectionArgs, orderBy);
            }
        }
    }
}
