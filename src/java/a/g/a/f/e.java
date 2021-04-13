/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.g.a.f.d
 *  android.database.sqlite.SQLiteProgram
 *  android.database.sqlite.SQLiteStatement
 */
package a.g.a.f;

import a.g.a.f.d;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;

public class e
extends d
implements a.g.a.d {
    public final SQLiteStatement b;

    public e(SQLiteStatement sQLiteStatement) {
        super((SQLiteProgram)sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public int a() {
        return this.b.executeUpdateDelete();
    }
}

