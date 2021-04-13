/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.f1
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.k1;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import java.util.Map;

public final class l1
extends t5<l1, k1>
implements v6 {
    public static final l1 zzg;
    public int zza;
    public int zze;
    public long zzf;

    public static {
        l1 l12;
        zzg = l12 = new l1();
        t5.zza.put(l1.class, (Object)l12);
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
                        return zzg;
                    }
                    return new k1(null);
                }
                return new l1();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf"};
            return new e7((u6)zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001", arrobject);
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
        return (2 & this.zza) != 0;
    }

    public final long l() {
        return this.zzf;
    }
}

