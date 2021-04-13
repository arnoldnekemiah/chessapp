/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.z5
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.d7;
import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.h2;
import c.b.b.a.e.d.k2;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.z5;
import java.util.Map;

public final class i2
extends t5<i2, h2>
implements v6 {
    public static final i2 zze;
    public z5<k2> zza = d7.d;

    public static {
        i2 i22;
        zze = i22 = new i2();
        t5.zza.put(i2.class, (Object)i22);
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
                    return new h2();
                }
                return new i2();
            }
            Object[] arrobject = new Object[]{"zza", k2.class};
            return new e7((u6)zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", arrobject);
        }
        return (byte)1;
    }
}

