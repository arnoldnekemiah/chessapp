/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.f1
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.f2;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import java.util.Map;

public final class g2
extends t5<g2, f2>
implements v6 {
    public static final g2 zzk;
    public int zza;
    public long zze;
    public String zzf = "";
    public String zzg = "";
    public long zzh;
    public float zzi;
    public double zzj;

    public static {
        g2 g22;
        zzk = g22 = new g2();
        t5.zza.put(g2.class, (Object)g22);
    }

    public static /* synthetic */ void a(g2 g22, String string) {
        string.getClass();
        g22.zza = 2 | g22.zza;
        g22.zzf = string;
    }

    public static /* synthetic */ void b(g2 g22, String string) {
        string.getClass();
        g22.zza = 4 | g22.zza;
        g22.zzg = string;
    }

    public static f2 j() {
        return (f2)((Object)zzk.g());
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
                    return new f2(null);
                }
                return new g2();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"};
            return new e7((u6)zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1001\u0004\u0006\u1000\u0005", arrobject);
        }
        return (byte)1;
    }

    public final String i() {
        return this.zzf;
    }
}

