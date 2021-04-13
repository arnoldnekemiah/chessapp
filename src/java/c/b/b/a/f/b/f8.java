/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.b.j.c
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 */
package c.b.b.a.f.b;

import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j8;
import c.b.b.a.f.b.k;
import c.b.b.a.f.b.l8;
import c.b.b.a.f.b.m8;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.p3;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;

public final class f8
implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ n8 b;

    public f8(n8 n82, long l2) {
        this.b = n82;
        this.a = l2;
    }

    public final void run() {
        n8 n82 = this.b;
        long l2 = this.a;
        n82.g();
        n82.l();
        n82.a.a().n.a("Activity resumed, time", l2);
        if (n82.a.g.c(null, u2.u0)) {
            if (n82.a.g.n() || n82.a.m().v.a()) {
                l8 l82 = n82.e;
                l82.d.g();
                l82.c.b();
                l82.a = l2;
                l82.b = l2;
            }
            n82.f.a();
        } else {
            n82.f.a();
            if (n82.a.g.n()) {
                l8 l83 = n82.e;
                l83.d.g();
                l83.c.b();
                l83.a = l2;
                l83.b = l2;
            }
        }
        m8 m82 = n82.d;
        m82.a.g();
        if (!m82.a.a.i()) {
            return;
        }
        if (!m82.a.a.g.c(null, u2.u0)) {
            m82.a.a.m().v.a(false);
        }
        if ((c)m82.a.a.n != null) {
            m82.a(System.currentTimeMillis(), false);
            return;
        }
        throw null;
    }
}

