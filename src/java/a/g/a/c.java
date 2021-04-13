/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  android.util.Log
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package a.g.a;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

public interface c {

    public static abstract class a {
        public final int a;

        public a(int n2) {
            this.a = n2;
        }

        public abstract void a(a.g.a.b var1, int var2, int var3);

        public final void a(String string) {
            if (!string.equalsIgnoreCase(":memory:")) {
                if (string.trim().length() == 0) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("deleting the database file: ");
                stringBuilder.append(string);
                Log.w((String)"SupportSQLite", (String)stringBuilder.toString());
                try {
                    SQLiteDatabase.deleteDatabase((File)new File(string));
                    return;
                }
                catch (Exception exception) {
                    Log.w((String)"SupportSQLite", (String)"delete failed: ", (Throwable)exception);
                }
            }
        }
    }

    public static interface b {
    }

}

