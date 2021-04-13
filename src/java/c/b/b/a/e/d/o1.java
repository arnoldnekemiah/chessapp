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
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.d7;
import c.b.b.a.e.d.e7;
import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.k4;
import c.b.b.a.e.d.n1;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.s1;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.z5;
import java.util.List;
import java.util.Map;

public final class o1
extends t5<o1, n1>
implements v6 {
    public static final o1 zzj;
    public int zza;
    public z5<s1> zze = d7.d;
    public String zzf = "";
    public long zzg;
    public long zzh;
    public int zzi;

    public static {
        o1 o12;
        zzj = o12 = new o1();
        t5.zza.put(o1.class, (Object)o12);
    }

    public static /* synthetic */ void a(o1 o12) {
        o12.zze = d7.d;
    }

    public static /* synthetic */ void a(o1 o12, int n7) {
        o12.m();
        o12.zze.remove(n7);
    }

    public static /* synthetic */ void a(o1 o12, int n7, s1 s12) {
        s12.getClass();
        o12.m();
        o12.zze.set(n7, (Object)s12);
    }

    public static /* synthetic */ void a(o1 o12, s1 s12) {
        s12.getClass();
        o12.m();
        o12.zze.add((Object)s12);
    }

    public static /* synthetic */ void a(o1 o12, Iterable iterable) {
        o12.m();
        k4.a(iterable, o12.zze);
    }

    public static /* synthetic */ void a(o1 o12, String string) {
        string.getClass();
        o12.zza = 1 | o12.zza;
        o12.zzf = string;
    }

    public static n1 n() {
        return (n1)((Object)zzj.g());
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
                    return new n1(null);
                }
                return new o1();
            }
            Object[] arrobject = new Object[]{"zza", "zze", s1.class, "zzf", "zzg", "zzh", "zzi"};
            return new e7((u6)zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003", arrobject);
        }
        return (byte)1;
    }

    public final List<s1> i() {
        return this.zze;
    }

    public final String j() {
        return this.zzf;
    }

    public final boolean k() {
        return (2 & this.zza) != 0;
    }

    public final long l() {
        return this.zzg;
    }

    public final void m() {
        z5<s1> z52 = this.zze;
        if (!z52.a()) {
            this.zze = t5.a(z52);
        }
    }
}

