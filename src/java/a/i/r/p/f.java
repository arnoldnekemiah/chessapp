/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteProgram
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package a.i.r.p;

import a.f.g;
import a.f.i;
import a.f.j;
import a.i.r.p.d;
import a.i.r.p.e;
import a.i.r.p.f;
import android.database.Cursor;
import android.database.sqlite.SQLiteProgram;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f
implements e {
    public final g a;
    public final a.f.b b;
    public final j c;

    public f(g g5) {
        this.a = g5;
        this.b = new a.f.b<d>(this, g5){

            public void a(a.g.a.f.e e6, Object object) {
                d d6 = (d)object;
                String string = d6.a;
                if (string == null) {
                    e6.a.bindNull(1);
                } else {
                    e6.a.bindString(1, string);
                }
                long l8 = d6.b;
                e6.a.bindLong(2, l8);
            }

            public String b() {
                return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
            }
        };
        this.c = new j(this, g5){

            @Override
            public String b() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    public d a(String string) {
        d d6;
        i i10 = i.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (string == null) {
            i10.bindNull(1);
        } else {
            i10.bindString(1, string);
        }
        this.a.b();
        Cursor cursor = a.f.l.a.a(this.a, i10, false);
        try {
            int n10 = a.c.a.a.a(cursor, "work_spec_id");
            int n11 = a.c.a.a.a(cursor, "system_id");
            d6 = cursor.moveToFirst() ? new d(cursor.getString(n10), cursor.getInt(n11)) : null;
        }
        catch (Throwable throwable) {
            cursor.close();
            i10.b();
            throw throwable;
        }
        cursor.close();
        i10.b();
        return d6;
    }

    public void a(d d6) {
        this.a.b();
        this.a.c();
        try {
            this.b.a(d6);
            this.a.g();
            return;
        }
        finally {
            this.a.d();
        }
    }

    public void b(String string) {
        this.a.b();
        a.g.a.f.e e6 = this.c.a();
        if (string == null) {
            e6.a.bindNull(1);
        } else {
            e6.a.bindString(1, string);
        }
        this.a.c();
        try {
            e6.a();
            this.a.g();
        }
        catch (Throwable throwable) {
            this.a.d();
            this.c.a(e6);
            throw throwable;
        }
        this.a.d();
        j j2 = this.c;
        if (e6 == j2.c) {
            j2.a.set(false);
        }
    }

}

