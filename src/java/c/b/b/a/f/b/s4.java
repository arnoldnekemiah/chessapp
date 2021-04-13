/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.z8
 *  c.b.b.a.f.b.a9
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.e.d.z8;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import com.google.android.gms.measurement.internal.zzp;

public final class s4
implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ b5 b;

    public s4(b5 b52, zzp zzp2) {
        this.b = b52;
        this.a = zzp2;
    }

    public final void run() {
        this.b.a.h();
        a9 a92 = this.b.a;
        zzp zzp2 = this.a;
        if (a92 != null) {
            z8.c();
            if (a92.j.g.c(null, u2.y0)) {
                a92.j.d().g();
                a92.t();
                a.c(zzp2.a);
                f f10 = f.a(zzp2.v);
                f f11 = a92.b(zzp2.a);
                a92.j.a().n.a("Setting consent, package, consent", zzp2.a, f10);
                a92.a(zzp2.a, f10);
                if (f10.a(f11)) {
                    a92.a(zzp2);
                }
            }
            return;
        }
        throw null;
    }
}

