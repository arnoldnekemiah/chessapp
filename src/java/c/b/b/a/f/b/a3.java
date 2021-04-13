/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteOpenHelper
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import c.b.b.a.f.b.b3;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import java.io.File;

public final class a3
extends SQLiteOpenHelper {
    public final /* synthetic */ b3 a;

    public a3(b3 b32, Context context) {
        this.a = b32;
        super(context, "google_app_measurement_local.db", null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            SQLiteDatabase sQLiteDatabase = super.getWritableDatabase();
            return sQLiteDatabase;
        }
        catch (SQLiteException sQLiteException) {
            this.a.a.a().f.a("Opening the local database failed, dropping and recreating it");
            i4 i42 = this.a.a;
            if (!i42.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                this.a.a.a().f.a("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                SQLiteDatabase sQLiteDatabase = super.getWritableDatabase();
                return sQLiteDatabase;
            }
            catch (SQLiteException sQLiteException2) {
                this.a.a.a().f.a("Failed to open local database. Events will bypass local storage", (Object)sQLiteException2);
                return null;
            }
        }
        catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
            throw sQLiteDatabaseLockedException;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a.a(this.a.a.a(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n2, int n10) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        a.a(this.a.a.a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n10) {
    }
}

