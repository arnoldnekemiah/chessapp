/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.f1
 *  c.b.b.a.e.d.v6
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.g2;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.v6;

public final class f2
extends q5<g2, f2>
implements v6 {
    public f2() {
        super(g2.zzk);
    }

    public /* synthetic */ f2(f1 f12) {
        super(g2.zzk);
    }

    @Override
    public final f2 a(long l5) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        g2 g22 = (g2)this.b;
        g22.zza = 1 | g22.zza;
        g22.zze = l5;
        return this;
    }

    @Override
    public final f2 a(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        g2.a((g2)this.b, string);
        return this;
    }

    public final f2 b(long l5) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        g2 g22 = (g2)this.b;
        g22.zza = 8 | g22.zza;
        g22.zzh = l5;
        return this;
    }
}

