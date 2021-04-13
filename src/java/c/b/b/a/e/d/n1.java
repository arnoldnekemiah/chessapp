/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.f1
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.z5
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.o1;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.r1;
import c.b.b.a.e.d.s1;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.z5;
import java.util.Collections;
import java.util.List;

public final class n1
extends q5<o1, n1>
implements v6 {
    public n1() {
        super(o1.zzj);
    }

    public /* synthetic */ n1(f1 f12) {
        super(o1.zzj);
    }

    public final n1 a(int n7, s1 s12) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        o1.a((o1)this.b, n7, s12);
        return this;
    }

    @Override
    public final n1 a(long l5) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        o1 o12 = (o1)this.b;
        o12.zza = 2 | o12.zza;
        o12.zzg = l5;
        return this;
    }

    @Override
    public final n1 a(r1 r12) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        o1.a((o1)this.b, (s1)r12.f());
        return this;
    }

    @Override
    public final n1 a(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        o1.a((o1)this.b, string);
        return this;
    }

    @Override
    public final s1 a(int n7) {
        return (s1)((o1)this.b).zze.get(n7);
    }

    public final n1 b(int n7) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        o1.a((o1)this.b, n7);
        return this;
    }

    public final n1 b(long l5) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        o1 o12 = (o1)this.b;
        o12.zza = 4 | o12.zza;
        o12.zzh = l5;
        return this;
    }

    public final List<s1> j() {
        return Collections.unmodifiableList(((o1)this.b).zze);
    }

    public final int k() {
        return ((o1)this.b).zze.size();
    }

    public final String l() {
        return ((o1)this.b).zzf;
    }

    public final long m() {
        return ((o1)this.b).zzg;
    }

    public final long n() {
        return ((o1)this.b).zzh;
    }
}

