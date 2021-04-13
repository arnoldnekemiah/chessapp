/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.z8
 *  c.b.b.a.f.b.a9
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package c.b.b.a.f.b;

import c.b.b.a.e.d.z8;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.x4;
import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.Callable;

public final class v8
implements Callable<String> {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ a9 b;

    public v8(a9 a92, zzp zzp2) {
        this.b = a92;
        this.a = zzp2;
    }

    public final Object call() {
        z8.c();
        if (!(!this.b.j.g.c(null, u2.y0) || this.b.b(this.a.a).c() && f.a(this.a.v).c())) {
            this.b.a().n.a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        return this.b.c(this.a).n();
    }
}

