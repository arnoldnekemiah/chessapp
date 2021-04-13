/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.b.j.c
 *  c.b.b.a.f.b.a9
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 */
package c.b.b.a.f.b;

import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b4;
import c.b.b.a.f.b.b9;
import c.b.b.a.f.b.d;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.o3;
import c.b.b.a.f.b.o6;
import c.b.b.a.f.b.q8;
import c.b.b.a.f.b.r3;
import c.b.b.a.f.b.u3;
import c.b.b.a.f.b.u9;
import c.b.b.a.f.b.z7;

public final class s8
implements Runnable {
    public final /* synthetic */ b9 a;
    public final /* synthetic */ a9 b;

    public s8(a9 a92, b9 b92) {
        this.b = a92;
        this.a = b92;
    }

    public final void run() {
        a9 a92 = this.b;
        a92.j.d().g();
        i i2 = new i(a92);
        i2.i();
        a92.c = i2;
        a92.j.g.c = a92.a;
        z7 z72 = new z7(a92);
        z72.i();
        a92.i = z72;
        u9 u92 = new u9(a92);
        u92.i();
        a92.f = u92;
        o6 o62 = new o6(a92);
        o62.i();
        a92.h = o62;
        q8 q82 = new q8(a92);
        q82.i();
        a92.e = q82;
        a92.d = new o3(a92);
        if (a92.o != a92.p) {
            a92.j.a().f.a("Not all upload components initialized", a92.o, a92.p);
        }
        a92.k = true;
        a9 a93 = this.b;
        a93.j.d().g();
        a93.n().q();
        if (a93.j.m().e.a() == 0L) {
            r3 r32 = a93.j.m().e;
            if ((c)a93.j.n != null) {
                r32.a(System.currentTimeMillis());
            } else {
                throw null;
            }
        }
        a93.j();
    }
}

