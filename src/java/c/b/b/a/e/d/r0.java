/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.e7
 *  c.b.b.a.e.d.q0
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v6
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.n0;
import c.b.b.a.e.d.q0;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import java.util.Map;

public final class r0
extends t5<r0, n0>
implements v6 {
    public static final r0 zzj;
    public int zza;
    public int zze;
    public boolean zzf;
    public String zzg = "";
    public String zzh = "";
    public String zzi = "";

    public static {
        r0 r02;
        zzj = r02 = new r0();
        t5.zza.put(r0.class, (Object)r02);
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
                        return zzj;
                    }
                    return new n0();
                }
                return new r0();
            }
            Object[] arrobject = new Object[]{"zza", "zze", q0.b(), "zzf", "zzg", "zzh", "zzi"};
            return new e7((u6)zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", arrobject);
        }
        return (byte)1;
    }

    public final q0 i() {
        q0 q02 = q0.a((int)this.zze);
        if (q02 == null) {
            q02 = q0.b;
        }
        return q02;
    }
}

