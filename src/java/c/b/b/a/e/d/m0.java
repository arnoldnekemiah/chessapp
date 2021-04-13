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
import c.b.b.a.e.d.l0;
import c.b.b.a.e.d.r0;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.x0;
import java.util.Map;

public final class m0
extends t5<m0, l0>
implements v6 {
    public static final m0 zzi;
    public int zza;
    public x0 zze;
    public r0 zzf;
    public boolean zzg;
    public String zzh = "";

    public static {
        m0 m02;
        zzi = m02 = new m0();
        t5.zza.put(m0.class, (Object)m02);
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
                        return zzi;
                    }
                    return new l0(null);
                }
                return new m0();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf", "zzg", "zzh"};
            return new e7((u6)zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0004\u1008\u0003", arrobject);
        }
        return (byte)1;
    }

    public final boolean i() {
        return (1 & this.zza) != 0;
    }

    public final x0 j() {
        x0 x02 = this.zze;
        if (x02 == null) {
            x02 = x0.zzi;
        }
        return x02;
    }

    public final boolean k() {
        return (2 & this.zza) != 0;
    }

    public final r0 l() {
        r0 r02 = this.zzf;
        if (r02 == null) {
            r02 = r0.zzj;
        }
        return r02;
    }
}

