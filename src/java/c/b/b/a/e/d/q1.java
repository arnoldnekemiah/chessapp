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
import c.b.b.a.e.d.p1;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import java.util.Map;

public final class q1
extends t5<q1, p1>
implements v6 {
    public static final q1 zzg;
    public int zza;
    public String zze = "";
    public long zzf;

    public static {
        q1 q12;
        zzg = q12 = new q1();
        t5.zza.put(q1.class, (Object)q12);
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
                    return new p1(null);
                }
                return new q1();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf"};
            return new e7((u6)zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", arrobject);
        }
        return (byte)1;
    }
}

