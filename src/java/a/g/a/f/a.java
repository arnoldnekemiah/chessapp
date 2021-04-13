/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  java.lang.Object
 *  java.lang.String
 */
package a.g.a.f;

import a.g.a.b;
import a.g.a.e;
import a.g.a.f.a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class a
implements b {
    public static final String[] b = new String[0];
    public final SQLiteDatabase a;

    public a(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public Cursor a(e e6) {
        return this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory(this, e6){
            public final /* synthetic */ e a;
            {
                this.a = e6;
            }

            public Cursor newCursor(SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, String string, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                this.a.a(new a.g.a.f.d((android.database.sqlite.SQLiteProgram)sQLiteQuery));
                return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, string, sQLiteQuery);
            }
        }, e6.a(), b, null);
    }

    public Cursor a(String string) {
        return this.a(new a.g.a.a(string));
    }

    public String a() {
        return this.a.getPath();
    }

    public void close() {
        this.a.close();
    }
}

