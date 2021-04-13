/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.f1
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
import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.t1;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.w1;
import c.b.b.a.e.d.z5;
import java.util.Map;

public final class u1
extends t5<u1, t1>
implements v6 {
    public static final u1 zze;
    public z5<w1> zza = d7.d;

    public static {
        u1 u12;
        zze = u12 = new u1();
        t5.zza.put(u1.class, (Object)u12);
    }

    public static /* synthetic */ void a(u1 u12, w1 w12) {
        w12.getClass();
        z5<w1> z52 = u12.zza;
        if (!z52.a()) {
            u12.zza = t5.a(z52);
        }
        u12.zza.add((Object)w12);
    }

    public static t1 i() {
        return (t1)((Object)zze.g());
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
                        return zze;
                    }
                    return new t1(null);
                }
                return new u1();
            }
            Object[] arrobject = new Object[]{"zza", w1.class};
            return new e7((u6)zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", arrobject);
        }
        return (byte)1;
    }
}

