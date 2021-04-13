/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  c.b.b.a.b.j.c
 *  c.b.b.a.f.b.e5
 *  c.b.b.a.f.b.k
 *  c.b.b.a.f.b.l8
 */
package c.b.b.a.f.b;

import android.os.SystemClock;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e5;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.k;
import c.b.b.a.f.b.l8;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.z1;

public final class k8
extends k {
    public final /* synthetic */ l8 e;

    public k8(l8 l82, e5 e52) {
        this.e = l82;
        super(e52);
    }

    public final void a() {
        l8 l82 = this.e;
        l82.d.g();
        if ((c)l82.d.a.n != null) {
            l82.a(false, false, SystemClock.elapsedRealtime());
            z1 z12 = l82.d.a.g();
            if ((c)l82.d.a.n != null) {
                z12.a(SystemClock.elapsedRealtime());
                return;
            }
            throw null;
        }
        throw null;
    }
}

