/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.f1
 *  c.b.b.a.e.d.v6
 *  c.b.b.a.e.d.x5
 *  c.b.b.a.e.d.z5
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.f1;
import c.b.b.a.e.d.f2;
import c.b.b.a.e.d.g2;
import c.b.b.a.e.d.j1;
import c.b.b.a.e.d.k4;
import c.b.b.a.e.d.n1;
import c.b.b.a.e.d.o1;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u5;
import c.b.b.a.e.d.v6;
import c.b.b.a.e.d.w1;
import c.b.b.a.e.d.x5;
import c.b.b.a.e.d.z5;
import java.util.Collections;
import java.util.List;

public final class v1
extends q5<w1, v1>
implements v6 {
    public v1() {
        super(w1.zzZ);
    }

    public /* synthetic */ v1(f1 f12) {
        super(w1.zzZ);
    }

    public final List<g2> A() {
        return Collections.unmodifiableList(((w1)this.b).zzi);
    }

    public final int B() {
        return ((w1)this.b).zzi.size();
    }

    public final long C() {
        return ((w1)this.b).zzk;
    }

    public final long D() {
        return ((w1)this.b).zzl;
    }

    public final v1 E() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = -17 & w12.zze;
        w12.zzm = 0L;
        return this;
    }

    public final v1 F() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = -33 & w12.zze;
        w12.zzn = 0L;
        return this;
    }

    @Override
    public final v1 a(int n7) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 1024 | w12.zze;
        w12.zzs = n7;
        return this;
    }

    public final v1 a(int n7, g2 g22) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.a((w1)this.b, n7, g22);
        return this;
    }

    public final v1 a(int n7, n1 n12) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.a((w1)this.b, n7, (o1)n12.f());
        return this;
    }

    @Override
    public final v1 a(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 16384 | w12.zze;
        w12.zzw = l6;
        return this;
    }

    @Override
    public final v1 a(f2 f22) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.a((w1)this.b, (g2)f22.f());
        return this;
    }

    @Override
    public final v1 a(g2 g22) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.a((w1)this.b, g22);
        return this;
    }

    @Override
    public final v1 a(n1 n12) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.a((w1)this.b, (o1)n12.f());
        return this;
    }

    @Override
    public final v1 a(Iterable<? extends j1> iterable) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        z5<j1> z52 = w12.zzG;
        if (!z52.a()) {
            w12.zzG = t5.a(z52);
        }
        k4.a(iterable, w12.zzG);
        return this;
    }

    @Override
    public final v1 a(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.a((w1)this.b, string);
        return this;
    }

    @Override
    public final v1 a(boolean bl) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 131072 | w12.zze;
        w12.zzz = bl;
        return this;
    }

    public final v1 b(int n7) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 1048576 | w12.zze;
        w12.zzC = n7;
        return this;
    }

    public final v1 b(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 524288 | w12.zze;
        w12.zzB = l6;
        return this;
    }

    public final v1 b(Iterable<? extends Integer> iterable) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        x5 x52 = w12.zzT;
        if (!x52.a()) {
            int n7 = x52.size();
            int n9 = n7 == 0 ? 10 : n7 + n7;
            w12.zzT = ((u5)x52).c(n9);
        }
        k4.a(iterable, w12.zzT);
        return this;
    }

    public final v1 b(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.b((w1)this.b, string);
        return this;
    }

    public final v1 b(boolean bl) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 8388608 | w12.zze;
        w12.zzF = bl;
        return this;
    }

    public final v1 c(int n7) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 33554432 | w12.zze;
        w12.zzI = n7;
        return this;
    }

    public final v1 c(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 536870912 | w12.zze;
        w12.zzM = l6;
        return this;
    }

    public final v1 c(Iterable<? extends o1> iterable) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.a((w1)this.b, iterable);
        return this;
    }

    public final v1 c(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.c((w1)this.b, string);
        return this;
    }

    public final v1 d(int n7) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zzf = 2 | w12.zzf;
        w12.zzQ = n7;
        return this;
    }

    public final v1 d(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 1073741824 | w12.zze;
        w12.zzN = l6;
        return this;
    }

    public final v1 d(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.d((w1)this.b, string);
        return this;
    }

    public final o1 e(int n7) {
        return (o1)((w1)this.b).zzh.get(n7);
    }

    public final v1 e(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zzf = 16 | w12.zzf;
        w12.zzU = l6;
        return this;
    }

    public final v1 e(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.e((w1)this.b, string);
        return this;
    }

    public final v1 f(int n7) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.a((w1)this.b, n7);
        return this;
    }

    public final v1 f(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zzf = 32 | w12.zzf;
        w12.zzV = l6;
        return this;
    }

    public final v1 f(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.f((w1)this.b, string);
        return this;
    }

    public final g2 g(int n7) {
        return (g2)((w1)this.b).zzi.get(n7);
    }

    public final v1 g(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 2 | w12.zze;
        w12.zzj = l6;
        return this;
    }

    public final v1 g(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.g((w1)this.b, string);
        return this;
    }

    public final v1 h(int n7) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.b((w1)this.b, n7);
        return this;
    }

    public final v1 h(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 4 | w12.zze;
        w12.zzk = l6;
        return this;
    }

    public final v1 h(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.h((w1)this.b, string);
        return this;
    }

    public final v1 i(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 8 | w12.zze;
        w12.zzl = l6;
        return this;
    }

    public final v1 i(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 2097152 | w12.zze;
        w12.zzD = string;
        return this;
    }

    public final v1 j() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 64 | w12.zze;
        w12.zzo = "android";
        return this;
    }

    public final v1 j(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 16 | w12.zze;
        w12.zzm = l6;
        return this;
    }

    public final v1 j(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.i((w1)this.b, string);
        return this;
    }

    public final v1 k(long l6) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 32 | w12.zze;
        w12.zzn = l6;
        return this;
    }

    public final v1 k(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.j((w1)this.b, string);
        return this;
    }

    public final String k() {
        return ((w1)this.b).zzu;
    }

    public final v1 l() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 32768 | w12.zze;
        w12.zzx = 39000L;
        return this;
    }

    public final v1 l(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.k((w1)this.b, string);
        return this;
    }

    public final v1 m() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = -65537 & w12.zze;
        w12.zzy = w1.zzZ.zzy;
        return this;
    }

    public final v1 m(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.l((w1)this.b, string);
        return this;
    }

    public final v1 n() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = -131073 & w12.zze;
        w12.zzz = false;
        return this;
    }

    public final v1 n(String string) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.m((w1)this.b, string);
        return this;
    }

    public final v1 o() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = -262145 & w12.zze;
        w12.zzA = w1.zzZ.zzA;
        return this;
    }

    public final v1 p() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = -2097153 & w12.zze;
        w12.zzD = w1.zzZ.zzD;
        return this;
    }

    public final String q() {
        return ((w1)this.b).zzE;
    }

    public final v1 r() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.a((w1)this.b);
        return this;
    }

    public final v1 s() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = 1 | w12.zze;
        w12.zzg = 1;
        return this;
    }

    public final v1 t() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = -268435457 & w12.zze;
        w12.zzL = w1.zzZ.zzL;
        return this;
    }

    public final v1 u() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        (w1)this.b;
        throw null;
    }

    public final v1 v() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1 w12 = (w1)this.b;
        w12.zze = Integer.MAX_VALUE & w12.zze;
        w12.zzO = w1.zzZ.zzO;
        return this;
    }

    public final String w() {
        return ((w1)this.b).zzW;
    }

    public final List<o1> x() {
        return Collections.unmodifiableList(((w1)this.b).zzh);
    }

    public final int y() {
        return ((w1)this.b).zzh.size();
    }

    public final v1 z() {
        if (this.c) {
            this.g();
            this.c = false;
        }
        w1.b((w1)this.b);
        return this;
    }
}

