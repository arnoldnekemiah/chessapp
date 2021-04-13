/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.SystemClock
 *  c.b.b.a.b.j.c
 *  c.b.b.a.e.d.u9
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import android.os.SystemClock;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.u9;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.e5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.k;
import c.b.b.a.f.b.k8;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.r3;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;
import c.b.b.a.f.b.y6;

public final class l8 {
    public long a;
    public long b;
    public final k c;
    public final /* synthetic */ n8 d;

    public l8(n8 n82) {
        this.d = n82;
        this.c = new k8(this, this.d.a);
        if ((c)n82.a.n != null) {
            long l2;
            this.a = l2 = SystemClock.elapsedRealtime();
            this.b = l2;
            return;
        }
        throw null;
    }

    public final boolean a(boolean bl, boolean bl2, long l2) {
        block12 : {
            block10 : {
                r3 r32;
                block11 : {
                    block9 : {
                        this.d.g();
                        this.d.h();
                        u9.c();
                        if (!this.d.a.g.c(null, u2.p0)) break block9;
                        if (!this.d.a.i()) break block10;
                        r32 = this.d.a.m().t;
                        if ((c)this.d.a.n == null) {
                            throw null;
                        }
                        break block11;
                    }
                    r32 = this.d.a.m().t;
                    if ((c)this.d.a.n == null) break block12;
                }
                r32.a(System.currentTimeMillis());
            }
            long l10 = l2 - this.a;
            if (!bl && l10 < 1000L) {
                this.d.a.a().n.a("Screen exposed for less than 1000 ms. Event not sent. time", l10);
                return false;
            }
            if (!bl2) {
                l10 = l2 - this.b;
                this.b = l2;
            }
            this.d.a.a().n.a("Recording user engagement, ms", l10);
            Bundle bundle = new Bundle();
            bundle.putLong("_et", l10);
            boolean bl3 = this.d.a.g.n();
            y6.a(this.d.a.u().a(bl3 ^ true), bundle, true);
            if (!this.d.a.g.c(null, u2.U) && bl2) {
                bundle.putLong("_fr", 1L);
            }
            if (!this.d.a.g.c(null, u2.U) || !bl2) {
                this.d.a.o().b("auto", "_e", bundle);
            }
            this.a = l2;
            this.c.b();
            this.c.a(3600000L);
            return true;
        }
        throw null;
    }
}

