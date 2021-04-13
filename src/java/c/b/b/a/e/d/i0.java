/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.g0
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.z5
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.d7;
import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.g0;
import c.b.b.a.e.d.h0;
import c.b.b.a.e.d.k0;
import c.b.b.a.e.d.t0;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.z5;
import java.util.Map;

public final class i0
extends t5<i0, h0>
implements v6 {
    public static final i0 zzj;
    public int zza;
    public int zze;
    public z5<t0> zzf;
    public z5<k0> zzg;
    public boolean zzh;
    public boolean zzi;

    public static {
        i0 i02;
        zzj = i02 = new i0();
        t5.zza.put(i0.class, (Object)i02);
    }

    public i0() {
        d7<Object> d72 = d7.d;
        this.zzf = d72;
        this.zzg = d72;
    }

    public static /* synthetic */ void a(i0 i02, int n7, k0 k02) {
        k02.getClass();
        z5<k0> z52 = i02.zzg;
        if (!z52.a()) {
            i02.zzg = t5.a(z52);
        }
        i02.zzg.set(n7, (Object)k02);
    }

    public static /* synthetic */ void a(i0 i02, int n7, t0 t02) {
        t02.getClass();
        z5<t0> z52 = i02.zzf;
        if (!z52.a()) {
            i02.zzf = t5.a(z52);
        }
        i02.zzf.set(n7, (Object)t02);
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
                        return zzj;
                    }
                    return new h0(null);
                }
                return new i0();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf", t0.class, "zzg", k0.class, "zzh", "zzi"};
            return new e7((u6)zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1007\u0001\u0005\u1007\u0002", arrobject);
        }
        return (byte)1;
    }
}

