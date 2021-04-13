/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package a.i.r.p;

import a.f.g;
import a.f.i;
import a.i.r.p.b;
import a.i.r.p.c;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

public final class c
implements b {
    public final g a;
    public final a.f.b b;

    public c(g g5) {
        this.a = g5;
        this.b = new a.f.b<a.i.r.p.a>(this, g5){

            public void a(a.g.a.f.e e6, Object object) {
                a.i.r.p.a a5 = (a.i.r.p.a)object;
                String string = a5.a;
                if (string == null) {
                    e6.a.bindNull(1);
                } else {
                    e6.a.bindString(1, string);
                }
                String string2 = a5.b;
                if (string2 == null) {
                    e6.a.bindNull(2);
                    return;
                }
                e6.a.bindString(2, string2);
            }

            public String b() {
                return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }
        };
    }

    public List<String> a(String string) {
        ArrayList arrayList;
        i i10 = i.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (string == null) {
            i10.bindNull(1);
        } else {
            i10.bindString(1, string);
        }
        this.a.b();
        Cursor cursor = a.f.l.a.a(this.a, i10, false);
        try {
            arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                arrayList.add((Object)cursor.getString(0));
            }
        }
        catch (Throwable throwable) {
            cursor.close();
            i10.b();
            throw throwable;
        }
        cursor.close();
        i10.b();
        return arrayList;
    }

    public boolean b(String string) {
        int n4;
        Cursor cursor;
        i i10;
        block6 : {
            int n10 = 1;
            i10 = i.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", n10);
            if (string == null) {
                i10.bindNull(n10);
            } else {
                i10.bindString(n10, string);
            }
            this.a.b();
            cursor = a.f.l.a.a(this.a, i10, false);
            try {
                boolean bl = cursor.moveToFirst();
                n4 = 0;
                if (!bl) break block6;
            }
            catch (Throwable throwable) {
                cursor.close();
                i10.b();
                throw throwable;
            }
            int n11 = cursor.getInt(0);
            if (n11 == 0) {
                n10 = 0;
            }
            n4 = n10;
        }
        cursor.close();
        i10.b();
        return (boolean)n4;
    }
}

