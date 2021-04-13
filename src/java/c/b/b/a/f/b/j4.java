/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.os.Bundle
 *  c.b.b.a.f.b.a9
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import c.b.b.a.e.d.o1;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import c.b.b.a.f.b.c3;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.c9;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.m;
import c.b.b.a.f.b.r8;

public final class j4
implements Runnable {
    public final b5 a;
    public final String b;
    public final Bundle c;

    public j4(b5 b52, String string, Bundle bundle) {
        this.a = b52;
        this.b = string;
        this.c = bundle;
    }

    public final void run() {
        b5 b52 = this.a;
        String string = this.b;
        Bundle bundle = this.c;
        i i2 = b52.a.n();
        i2.g();
        i2.h();
        m m2 = new m(i2.a, "", string, "dep", 0L, 0L, bundle);
        byte[] arrby = i2.b.r().a(m2).f();
        i2.a.a().n.a("Saving default event parameters, appId, data size", i2.a.q().a(string), arrby.length);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", string);
        contentValues.put("parameters", arrby);
        try {
            if (i2.o().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1L) {
                i2.a.a().f.a("Failed to insert default event parameters (got -1). appId", h3.a(string));
                return;
            }
        }
        catch (SQLiteException sQLiteException) {
            i2.a.a().f.a("Error storing default event parameters. appId", h3.a(string), (Object)sQLiteException);
        }
    }
}

