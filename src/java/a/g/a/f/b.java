/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.DatabaseErrorHandler
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteOpenHelper
 *  androidx.work.impl.WorkDatabase
 *  androidx.work.impl.WorkDatabase_Impl
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package a.g.a.f;

import a.f.g;
import a.f.h;
import a.g.a.c;
import a.g.a.e;
import a.i.r.i;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.List;

public class b
implements c {
    public final a a;

    public b(Context context, String string, c.a a5) {
        this.a = new SQLiteOpenHelper(context, string, new a.g.a.f.a[1], a5){
            public final a.g.a.f.a[] a;
            public final c.a b;
            public boolean c;
            {
                this.b = a5;
                this.a = arra;
            }

            public static a.g.a.f.a a(a.g.a.f.a[] arra, SQLiteDatabase sQLiteDatabase) {
                boolean bl;
                a.g.a.f.a a5 = arra[0];
                if (a5 == null || !(bl = a5.a == sQLiteDatabase)) {
                    arra[0] = new a.g.a.f.a(sQLiteDatabase);
                }
                return arra[0];
            }

            public a.g.a.b a() {
                a a5 = this;
                synchronized (a5) {
                    SQLiteDatabase sQLiteDatabase;
                    block4 : {
                        this.c = false;
                        sQLiteDatabase = super.getWritableDatabase();
                        if (!this.c) break block4;
                        this.close();
                        a.g.a.b b2 = this.a();
                        return b2;
                    }
                    a.g.a.f.a a6 = this.a(sQLiteDatabase);
                    return a6;
                }
            }

            public a.g.a.f.a a(SQLiteDatabase sQLiteDatabase) {
                return a.a(this.a, sQLiteDatabase);
            }

            public void close() {
                a a5 = this;
                synchronized (a5) {
                    super.close();
                    this.a[0] = null;
                    return;
                }
            }

            public void onConfigure(SQLiteDatabase sQLiteDatabase) {
                c.a a5 = this.b;
                a.a(this.a, sQLiteDatabase);
                if ((h)a5 != null) {
                    return;
                }
                throw null;
            }

            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                c.a a5 = this.b;
                a.g.a.f.a a6 = a.a(this.a, sQLiteDatabase);
                h h4 = (h)a5;
                h4.a(a6);
                h4.c.a(a6);
                i i10 = (i)h4.c;
                if (WorkDatabase_Impl.a((WorkDatabase_Impl)i10.b) != null) {
                    int n4 = i10.b.g.size();
                    for (int i11 = 0; i11 < n4; ++i11) {
                        if ((g.b)i10.b.g.get(i11) != null) {
                            continue;
                        }
                        throw null;
                    }
                }
            }

            public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n4, int n10) {
                this.c = true;
                c.a a5 = this.b;
                a.g.a.f.a a6 = a.a(this.a, sQLiteDatabase);
                ((h)a5).a(a6, n4, n10);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onOpen(SQLiteDatabase sQLiteDatabase) {
                block16 : {
                    i i10;
                    int n4;
                    a.g.a.f.a a5;
                    int n11;
                    block17 : {
                        h h4;
                        Cursor cursor;
                        String string;
                        block15 : {
                            int n10;
                            if (this.c) {
                                return;
                            }
                            c.a a6 = this.b;
                            a5 = a.a(this.a, sQLiteDatabase);
                            h4 = (h)a6;
                            if (h4 == null) {
                                throw null;
                            }
                            cursor = a5.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                            boolean bl2 = cursor.moveToFirst();
                            n4 = 0;
                            boolean bl = bl2 && (n10 = cursor.getInt(0)) != 0;
                            if (!bl) break block15;
                            Cursor cursor2 = a5.a(new a.g.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                            try {
                                if (cursor2.moveToFirst()) {
                                    string = cursor2.getString(0);
                                }
                                string = null;
                            }
                            finally {
                                cursor2.close();
                            }
                        }
                        string = null;
                        if (!h4.d.equals(string) && !h4.e.equals(string)) {
                            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                        }
                        i10 = (i)h4.c;
                        WorkDatabase_Impl.a((WorkDatabase_Impl)i10.b, (a.g.a.b)a5);
                        a5.a.execSQL("PRAGMA foreign_keys = ON");
                        i10.b.d.a(a5);
                        List<g.b> list = i10.b.g;
                        if (list == null) break block16;
                        n11 = list.size();
                        break block17;
                        finally {
                            cursor.close();
                        }
                    }
                    while (n4 < n11) {
                        if ((a.i.r.g)((g.b)i10.b.g.get(n4)) == null) {
                            throw null;
                        }
                        a5.a.beginTransaction();
                        try {
                            String string2 = WorkDatabase.m();
                            a5.a.execSQL(string2);
                            a5.a.setTransactionSuccessful();
                            ++n4;
                        }
                        finally {
                            a5.a.endTransaction();
                        }
                    }
                }
                h4.b = null;
            }

            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n4, int n10) {
                this.c = true;
                this.b.a(a.a(this.a, sQLiteDatabase), n4, n10);
            }

        };
    }

    public a.g.a.b a() {
        return this.a.a();
    }

}

