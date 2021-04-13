/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  c.b.b.a.b.j.c
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 */
package c.b.b.a.f.b;

import android.os.Handler;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.i8;
import c.b.b.a.f.b.j8;
import c.b.b.a.f.b.k;
import c.b.b.a.f.b.l8;
import c.b.b.a.f.b.m8;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.p3;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;

public final class g8
implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ n8 b;

    public g8(n8 n82, long l2) {
        this.b = n82;
        this.a = l2;
    }

    public final void run() {
        n8 n82 = this.b;
        long l2 = this.a;
        n82.g();
        n82.l();
        n82.a.a().n.a("Activity paused, time", l2);
        j8 j82 = n82.f;
        if ((c)j82.b.a.n != null) {
            i8 i82;
            j82.a = i82 = new i8(j82, System.currentTimeMillis(), l2);
            j82.b.c.postDelayed((Runnable)i82, 2000L);
            if (n82.a.g.n()) {
                n82.e.c.b();
            }
            m8 m82 = n82.d;
            if (!m82.a.a.g.c(null, u2.u0)) {
                m82.a.a.m().v.a(true);
            }
            return;
        }
        throw null;
    }
}

