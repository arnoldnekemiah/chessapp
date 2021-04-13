/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.f1
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.y5
 *  c.b.b.a.e.d.z5
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.c2;
import c.b.b.a.e.d.e2;
import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.k4;
import c.b.b.a.e.d.l1;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.y5;
import c.b.b.a.e.d.z5;

public final class b2
extends q5<c2, b2>
implements v6 {
    public b2() {
        super(c2.zzh);
    }

    public /* synthetic */ b2(f1 f12) {
        super(c2.zzh);
    }

    @Override
    public final b2 a(int n7) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        c2 c22 = (c2)this.b;
        z5<l1> z52 = c22.zzf;
        if (!z52.a()) {
            c22.zzf = t5.a(z52);
        }
        c22.zzf.remove(n7);
        return this;
    }

    @Override
    public final b2 a(Iterable<? extends Long> iterable) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        c2 c22 = (c2)this.b;
        y5 y52 = c22.zza;
        if (!y52.a()) {
            c22.zza = t5.a(y52);
        }
        k4.a(iterable, c22.zza);
        return this;
    }

    public final b2 b(int n7) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        c2 c22 = (c2)this.b;
        z5<e2> z52 = c22.zzg;
        if (!z52.a()) {
            c22.zzg = t5.a(z52);
        }
        c22.zzg.remove(n7);
        return this;
    }

    public final b2 b(Iterable<? extends Long> iterable) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        c2 c22 = (c2)this.b;
        y5 y52 = c22.zze;
        if (!y52.a()) {
            c22.zze = t5.a(y52);
        }
        k4.a(iterable, c22.zze);
        return this;
    }

    public final b2 j() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        c2.a((c2)this.b);
        return this;
    }

    public final b2 k() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        c2.b((c2)this.b);
        return this;
    }
}

