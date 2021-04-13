/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.f1
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.y5
 *  c.b.b.a.e.d.z5
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.b2;
import c.b.b.a.e.d.d7;
import c.b.b.a.e.d.e2;
import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.k6;
import c.b.b.a.e.d.l1;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.y5;
import c.b.b.a.e.d.z5;
import java.util.List;
import java.util.Map;

public final class c2
extends t5<c2, b2>
implements v6 {
    public static final c2 zzh;
    public y5 zza;
    public y5 zze;
    public z5<l1> zzf;
    public z5<e2> zzg;

    public static {
        c2 c22;
        zzh = c22 = new c2();
        t5.zza.put(c2.class, (Object)c22);
    }

    public c2() {
        k6 k62 = k6.d;
        this.zza = k62;
        this.zze = k62;
        d7<Object> d72 = d7.d;
        this.zzf = d72;
        this.zzg = d72;
    }

    public static /* synthetic */ void a(c2 c22) {
        c22.zza = k6.d;
    }

    public static /* synthetic */ void b(c2 c22) {
        c22.zze = k6.d;
    }

    public static b2 p() {
        return (b2)((Object)zzh.g());
    }

    public final l1 a(int n7) {
        return (l1)this.zzf.get(n7);
    }

    @Override
    public final Object a(int n7, Object object, Object object2) {
        int n9 = n7 - 1;
        if (n9 != 0) {
            if (n9 != 2) {
                if (n9 != 3) {
                    if (n9 != 4) {
                        if (n9 != 5) {
                            return null;
                        }
                        return zzh;
                    }
                    return new b2(null);
                }
                return new c2();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf", l1.class, "zzg", e2.class};
            return new e7((u6)zzh, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", arrobject);
        }
        return (byte)1;
    }

    public final e2 b(int n7) {
        return (e2)this.zzg.get(n7);
    }

    public final List<Long> i() {
        return this.zza;
    }

    public final int j() {
        return this.zza.size();
    }

    public final List<Long> k() {
        return this.zze;
    }

    public final List<l1> l() {
        return this.zzf;
    }

    public final int m() {
        return this.zzf.size();
    }

    public final List<e2> n() {
        return this.zzg;
    }

    public final int o() {
        return this.zzg.size();
    }
}

