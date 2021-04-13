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
import c.b.b.a.e.d.r1;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.z5;
import java.util.Map;

public final class s1
extends t5<s1, r1>
implements v6 {
    public static final s1 zzk;
    public int zza;
    public String zze = "";
    public String zzf = "";
    public long zzg;
    public float zzh;
    public double zzi;
    public z5<s1> zzj = d7.d;

    public static {
        s1 s12;
        zzk = s12 = new s1();
        t5.zza.put(s1.class, (Object)s12);
    }

    public static /* synthetic */ void a(s1 s12) {
        s12.zzj = d7.d;
    }

    public static /* synthetic */ void a(s1 s12, s1 s13) {
        s13.getClass();
        z5<s1> z52 = s12.zzj;
        if (!z52.a()) {
            s12.zzj = t5.a(z52);
        }
        s12.zzj.add((Object)s13);
    }

    public static /* synthetic */ void a(s1 s12, String string) {
        string.getClass();
        s12.zza = 1 | s12.zza;
        s12.zze = string;
    }

    public static /* synthetic */ void b(s1 s12, String string) {
        string.getClass();
        s12.zza = 2 | s12.zza;
        s12.zzf = string;
    }

    public static r1 p() {
        return (r1)((Object)zzk.g());
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
                    return new r1(null);
                }
                return new s1();
            }
            Object[] arrobject = new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", s1.class};
            return new e7((u6)zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b", arrobject);
        }
        return (byte)1;
    }

    public final String i() {
        return this.zze;
    }

    public final boolean j() {
        return (2 & this.zza) != 0;
    }

    public final String k() {
        return this.zzf;
    }

    public final boolean l() {
        return (4 & this.zza) != 0;
    }

    public final long m() {
        return this.zzg;
    }

    public final boolean n() {
        return (16 & this.zza) != 0;
    }

    public final int o() {
        return this.zzj.size();
    }
}

