/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.g0
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.g0;
import c.b.b.a.e.d.m0;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.s0;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import java.util.Map;

public final class t0
extends t5<t0, s0>
implements v6 {
    public static final t0 zzk;
    public int zza;
    public int zze;
    public String zzf = "";
    public m0 zzg;
    public boolean zzh;
    public boolean zzi;
    public boolean zzj;

    public static {
        t0 t02;
        zzk = t02 = new t0();
        t5.zza.put(t0.class, (Object)t02);
    }

    public static s0 l() {
        return (s0)((Object)zzk.g());
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
                        return zzk;
                    }
                    return new s0(null);
                }
                return new t0();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"};
            return new e7((u6)zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005", arrobject);
        }
        return (byte)1;
    }

    public final boolean i() {
        return (1 & this.zza) != 0;
    }

    public final int j() {
        return this.zze;
    }

    public final String k() {
        return this.zzf;
    }
}

