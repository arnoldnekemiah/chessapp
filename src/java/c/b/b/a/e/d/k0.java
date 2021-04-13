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
import c.b.b.a.e.d.j0;
import c.b.b.a.e.d.m0;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.r0;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.z5;
import java.util.Map;

public final class k0
extends t5<k0, j0>
implements v6 {
    public static final k0 zzm;
    public int zza;
    public int zze;
    public String zzf = "";
    public z5<m0> zzg = d7.d;
    public boolean zzh;
    public r0 zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;

    public static {
        k0 k02;
        zzm = k02 = new k0();
        t5.zza.put(k0.class, (Object)k02);
    }

    public static /* synthetic */ void a(k0 k02, int n7, m0 m02) {
        m02.getClass();
        z5<m0> z52 = k02.zzg;
        if (!z52.a()) {
            k02.zzg = t5.a(z52);
        }
        k02.zzg.set(n7, (Object)m02);
    }

    public static j0 m() {
        return (j0)((Object)zzm.g());
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
                        return zzm;
                    }
                    return new j0(null);
                }
                return new k0();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf", "zzg", m0.class, "zzh", "zzi", "zzj", "zzk", "zzl"};
            return new e7((u6)zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006", arrobject);
        }
        return (byte)1;
    }

    public final boolean i() {
        return (1 & this.zza) != 0;
    }

    public final int j() {
        return this.zze;
    }

    public final boolean k() {
        return (8 & this.zza) != 0;
    }

    public final boolean l() {
        return this.zzk;
    }
}

