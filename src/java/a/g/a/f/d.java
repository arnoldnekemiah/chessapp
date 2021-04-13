/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteProgram
 *  java.lang.Object
 *  java.lang.String
 */
package a.g.a.f;

import android.database.sqlite.SQLiteProgram;

public class d
implements a.g.a.d {
    public final SQLiteProgram a;

    public d(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override
    public void bindBlob(int n4, byte[] arrby) {
        this.a.bindBlob(n4, arrby);
    }

    @Override
    public void bindDouble(int n4, double d6) {
        this.a.bindDouble(n4, d6);
    }

    @Override
    public void bindLong(int n4, long l8) {
        this.a.bindLong(n4, l8);
    }

    @Override
    public void bindNull(int n4) {
        this.a.bindNull(n4);
    }

    @Override
    public void bindString(int n4, String string) {
        this.a.bindString(n4, string);
    }

    public void close() {
        this.a.close();
    }
}

