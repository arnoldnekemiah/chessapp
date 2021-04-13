/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.o.e.c
 *  a.i.r.o.f.e
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.i.r.o.e;

import a.i.h;
import a.i.i;
import a.i.r.o.b;
import a.i.r.o.e.c;
import a.i.r.o.f.d;
import a.i.r.o.f.e;
import a.i.r.o.f.g;
import a.i.r.p.j;
import a.i.r.q.m.a;
import android.content.Context;
import android.os.Build;

public class f
extends c<b> {
    public static final String e = h.a("NetworkNotRoamingCtrlr");

    public f(Context context, a a3) {
        super((d)g.a((Context)context, (a)a3).c);
    }

    public boolean a(j j3) {
        return j3.j.a == i.d;
    }

    public boolean b(Object object) {
        b b6 = (b)object;
        int n7 = Build.VERSION.SDK_INT;
        boolean bl = true;
        if (n7 < 24) {
            h.a().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return bl ^ b6.a;
        }
        if (b6.a && b6.d) {
            bl = false;
        }
        return bl;
    }
}

