/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.y0
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.y0;
import c.b.b.a.e.d.z0;
import java.util.Map;

public final class a1
extends t5<a1, z0>
implements v6 {
    public static final a1 zzi;
    public int zza;
    public String zze = "";
    public boolean zzf;
    public boolean zzg;
    public int zzh;

    public static {
        a1 a12;
        zzi = a12 = new a1();
        t5.zza.put(a1.class, (Object)a12);
    }

    public static /* synthetic */ void a(a1 a12, String string) {
        string.getClass();
        a12.zza = 1 | a12.zza;
        a12.zze = string;
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
                    return new z0(null);
                }
                return new a1();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf", "zzg", "zzh"};
            return new e7((u6)zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1004\u0003", arrobject);
        }
        return (byte)1;
    }
}

