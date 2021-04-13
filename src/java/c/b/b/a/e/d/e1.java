/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.d1;
import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import java.util.Map;

public final class e1
extends t5<e1, d1>
implements v6 {
    public static final e1 zzg;
    public int zza;
    public String zze = "";
    public String zzf = "";

    public static {
        e1 e12;
        zzg = e12 = new e1();
        t5.zza.put(e1.class, (Object)e12);
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
                    return new d1();
                }
                return new e1();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf"};
            return new e7((u6)zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", arrobject);
        }
        return (byte)1;
    }
}

