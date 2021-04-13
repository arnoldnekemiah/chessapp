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

import c.b.b.a.e.d.c2;
import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.i1;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import java.util.Map;

public final class j1
extends t5<j1, i1>
implements v6 {
    public static final j1 zzi;
    public int zza;
    public int zze;
    public c2 zzf;
    public c2 zzg;
    public boolean zzh;

    public static {
        j1 j12;
        zzi = j12 = new j1();
        t5.zza.put(j1.class, (Object)j12);
    }

    public static /* synthetic */ void a(j1 j12, c2 c22) {
        c22.getClass();
        j12.zzf = c22;
        j12.zza = 2 | j12.zza;
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
                    return new i1(null);
                }
                return new j1();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf", "zzg", "zzh"};
            return new e7((u6)zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003", arrobject);
        }
        return (byte)1;
    }

    public final c2 i() {
        c2 c22 = this.zzf;
        if (c22 == null) {
            c22 = c2.zzh;
        }
        return c22;
    }
}

