/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.os.Handler;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.i8;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.p3;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;

public final class j8 {
    public i8 a;
    public final /* synthetic */ n8 b;

    public j8(n8 n82) {
        this.b = n82;
    }

    public final void a() {
        this.b.g();
        i8 i82 = this.a;
        if (i82 != null) {
            this.b.c.removeCallbacks((Runnable)i82);
        }
        if (this.b.a.g.c(null, u2.u0)) {
            this.b.a.m().v.a(false);
        }
    }
}

