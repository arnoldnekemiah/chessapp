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
 */
package a.i.r.o.e;

import a.i.i;
import a.i.r.o.b;
import a.i.r.o.e.c;
import a.i.r.o.f.e;
import a.i.r.o.f.g;
import a.i.r.p.j;
import a.i.r.q.m.a;
import android.content.Context;
import android.os.Build;

public class d
extends c<b> {
    public d(Context context, a a3) {
        super((a.i.r.o.f.d)g.a((Context)context, (a)a3).c);
    }

    public boolean a(j j3) {
        return j3.j.a == i.b;
    }

    public boolean b(Object object) {
        b b6 = (b)object;
        int n7 = Build.VERSION.SDK_INT;
        boolean bl = true;
        if (n7 >= 26) {
            if (b6.a) {
                if (!b6.b) {
                    return bl;
                }
                return false;
            }
        } else {
            bl ^= b6.a;
        }
        return bl;
    }
}

