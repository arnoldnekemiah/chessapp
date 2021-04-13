/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.i8;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.j8;
import c.b.b.a.f.b.k;
import c.b.b.a.f.b.l8;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.p3;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;
import c.b.b.a.f.b.y6;

public final class h8
implements Runnable {
    public final i8 a;

    public h8(i8 i82) {
        this.a = i82;
    }

    public final void run() {
        i8 i82 = this.a;
        j8 j82 = i82.c;
        long l2 = i82.a;
        long l10 = i82.b;
        j82.b.g();
        j82.b.a.a().m.a("Application going to the background");
        boolean bl = j82.b.a.g.c(null, u2.u0);
        boolean bl2 = true;
        if (bl) {
            j82.b.a.m().v.a(bl2);
        }
        Bundle bundle = new Bundle();
        if (!j82.b.a.g.n()) {
            j82.b.e.c.b();
            if (j82.b.a.g.c(null, u2.l0)) {
                l8 l82 = j82.b.e;
                long l11 = l82.b;
                l82.b = l10;
                bundle.putLong("_et", l10 - l11);
                y6.a(j82.b.a.u().a(bl2), bundle, bl2);
            } else {
                bl2 = false;
            }
            j82.b.e.a(false, bl2, l10);
        }
        j82.b.a.o().a("auto", "_ab", l2, bundle);
    }
}

