/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.y0
 *  c.b.b.a.e.d.z5
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.a1;
import c.b.b.a.e.d.b1;
import c.b.b.a.e.d.d7;
import c.b.b.a.e.d.e1;
import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.i0;
import c.b.b.a.e.d.n2;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.y0;
import c.b.b.a.e.d.z5;
import java.util.Map;

public final class c1
extends t5<c1, b1>
implements v6 {
    public static final c1 zzn;
    public int zza;
    public long zze;
    public String zzf = "";
    public int zzg;
    public z5<e1> zzh;
    public z5<a1> zzi;
    public z5<i0> zzj;
    public String zzk;
    public boolean zzl;
    public z5<n2> zzm;

    public static {
        c1 c12;
        zzn = c12 = new c1();
        t5.zza.put(c1.class, (Object)c12);
    }

    public c1() {
        d7<Object> d72 = d7.d;
        this.zzh = d72;
        this.zzi = d72;
        this.zzj = d72;
        this.zzk = "";
        this.zzm = d72;
    }

    public static /* synthetic */ void a(c1 c12) {
        c12.zzj = d7.d;
    }

    public static /* synthetic */ void a(c1 c12, int n7, a1 a12) {
        a12.getClass();
        z5<a1> z52 = c12.zzi;
        if (!z52.a()) {
            c12.zzi = t5.a(z52);
        }
        c12.zzi.set(n7, (Object)a12);
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
                        return zzn;
                    }
                    return new b1(null);
                }
                return new c1();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf", "zzg", "zzh", e1.class, "zzi", a1.class, "zzj", i0.class, "zzk", "zzl", "zzm", n2.class};
            return new e7((u6)zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\b\u1007\u0004\t\u001b", arrobject);
        }
        return (byte)1;
    }

    public final boolean i() {
        return (1 & this.zza) != 0;
    }

    public final long j() {
        return this.zze;
    }
}

