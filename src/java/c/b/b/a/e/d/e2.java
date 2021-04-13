/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.f1
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.y5
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.d2;
import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.k6;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.y5;
import java.util.Map;

public final class e2
extends t5<e2, d2>
implements v6 {
    public static final e2 zzg;
    public int zza;
    public int zze;
    public y5 zzf = k6.d;

    public static {
        e2 e22;
        zzg = e22 = new e2();
        t5.zza.put(e2.class, (Object)e22);
    }

    public final long a(int n7) {
        k6 k62 = (k6)this.zzf;
        k62.e(n7);
        return k62.b[n7];
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
                    return new d2(null);
                }
                return new e2();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf"};
            return new e7((u6)zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014", arrobject);
        }
        return (byte)1;
    }

    public final boolean i() {
        return (1 & this.zza) != 0;
    }

    public final int j() {
        return this.zze;
    }

    public final int k() {
        return this.zzf.size();
    }
}

