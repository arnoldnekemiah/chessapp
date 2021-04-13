/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.w0
 *  c.b.b.a.e.d.z5
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.d7;
import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u0;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.w0;
import c.b.b.a.e.d.z5;
import java.util.Map;

public final class x0
extends t5<x0, u0>
implements v6 {
    public static final x0 zzi;
    public int zza;
    public int zze;
    public String zzf = "";
    public boolean zzg;
    public z5<String> zzh = d7.d;

    public static {
        x0 x02;
        zzi = x02 = new x0();
        t5.zza.put(x0.class, (Object)x02);
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
                    return new u0();
                }
                return new x0();
            }
            Object[] arrobject = new Object[]{"zza", "zze", w0.b(), "zzf", "zzg", "zzh"};
            return new e7((u6)zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a", arrobject);
        }
        return (byte)1;
    }

    public final w0 i() {
        w0 w02 = w0.a((int)this.zze);
        if (w02 == null) {
            w02 = w0.b;
        }
        return w02;
    }

    public final int j() {
        return this.zzh.size();
    }
}

