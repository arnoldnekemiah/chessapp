/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.work.impl.WorkDatabase
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package a.i.r.q;

import a.i.b;
import a.i.r.d;
import a.i.r.e;
import a.i.r.j;
import a.i.r.p.k;
import a.i.r.p.l;
import a.i.r.q.c;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;

public final class a
extends c {
    public final /* synthetic */ j b;
    public final /* synthetic */ String c;

    public a(j j2, String string) {
        this.b = j2;
        this.c = string;
    }

    @Override
    public void a() {
        WorkDatabase workDatabase = this.b.c;
        workDatabase.c();
        k k2 = workDatabase.k();
        String string = this.c;
        l l8 = (l)k2;
        List<String> list = l8.c(string);
        ArrayList arrayList = (ArrayList)list;
        try {
            for (String string2 : arrayList) {
                this.a(this.b, string2);
            }
            workDatabase.g();
        }
        catch (Throwable throwable) {
            workDatabase.d();
            throw throwable;
        }
        workDatabase.d();
        j j2 = this.b;
        e.a(j2.b, j2.c, j2.e);
    }
}

