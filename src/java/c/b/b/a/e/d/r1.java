/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.f1
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.z5
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.k4;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.s1;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.z5;

public final class r1
extends q5<s1, r1>
implements v6 {
    public r1() {
        super(s1.zzk);
    }

    public /* synthetic */ r1(f1 f12) {
        super(s1.zzk);
    }

    @Override
    public final r1 a(double d4) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        s1 s12 = (s1)this.b;
        s12.zza = 16 | s12.zza;
        s12.zzi = d4;
        return this;
    }

    @Override
    public final r1 a(long l5) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        s1 s12 = (s1)this.b;
        s12.zza = 4 | s12.zza;
        s12.zzg = l5;
        return this;
    }

    @Override
    public final r1 a(Iterable<? extends s1> iterable) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        s1 s12 = (s1)this.b;
        z5<s1> z52 = s12.zzj;
        if (!z52.a()) {
            s12.zzj = t5.a(z52);
        }
        k4.a(iterable, s12.zzj);
        return this;
    }

    @Override
    public final r1 a(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        s1.a((s1)this.b, string);
        return this;
    }

    public final r1 b(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        s1.b((s1)this.b, string);
        return this;
    }
}

