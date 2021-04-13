/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.c5
 *  c.b.b.a.e.d.u6
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.a5;
import c.b.b.a.e.d.a6;
import c.b.b.a.e.d.c5;
import c.b.b.a.e.d.f7;
import c.b.b.a.e.d.k4;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;

public final class d5 {
    public final c5 a;

    public d5(c5 c52) {
        a6.a((Object)c52, (String)"output");
        this.a = c52;
        c52.a = this;
    }

    public final void a(int n2, double d2) {
        c5 c52 = this.a;
        long l2 = Double.doubleToRawLongBits((double)d2);
        a5 a52 = (a5)c52;
        a52.b(1 | n2 << 3);
        a52.b(l2);
    }

    public final void a(int n2, float f2) {
        c5 c52 = this.a;
        int n6 = Float.floatToRawIntBits((float)f2);
        a5 a52 = (a5)c52;
        a52.b(5 | n2 << 3);
        a52.c(n6);
    }

    public final void a(int n2, int n6) {
        a5 a52 = (a5)this.a;
        a52.b(5 | n2 << 3);
        a52.c(n6);
    }

    public final void a(int n2, long l2) {
        a5 a52 = (a5)this.a;
        a52.b(n2 << 3);
        a52.a(l2);
    }

    public final void a(int n2, Object object, f7 f72) {
        c5 c52 = this.a;
        u6 u62 = (u6)object;
        a5 a52 = (a5)c52;
        a52.b(2 | n2 << 3);
        k4 k42 = (k4)u62;
        int n6 = ((t5)k42).zzd;
        if (n6 == -1) {
            ((t5)k42).zzd = n6 = f72.c(k42);
        }
        a52.b(n6);
        f72.a(u62, a52.a);
    }

    public final void a(int n2, boolean bl) {
        a5 a52 = (a5)this.a;
        a52.b(n2 << 3);
        a52.a((byte)bl);
    }

    public final void b(int n2, int n6) {
        a5 a52 = (a5)this.a;
        a52.b(5 | n2 << 3);
        a52.c(n6);
    }

    public final void b(int n2, long l2) {
        a5 a52 = (a5)this.a;
        a52.b(1 | n2 << 3);
        a52.b(l2);
    }

    public final void b(int n2, Object object, f7 f72) {
        c5 c52 = this.a;
        u6 u62 = (u6)object;
        a5 a52 = (a5)c52;
        int n6 = n2 << 3;
        a52.b(n6 | 3);
        f72.a(u62, c52.a);
        ((a5)c52).b(n6 | 4);
    }

    public final void c(int n2, int n6) {
        a5 a52 = (a5)this.a;
        a52.b(n2 << 3);
        a52.b(n6);
    }

    public final void c(int n2, long l2) {
        a5 a52 = (a5)this.a;
        a52.b(n2 << 3);
        a52.a(l2);
    }

    public final void d(int n2, int n6) {
        c5 c52 = this.a;
        int n10 = n6 + n6 ^ n6 >> 31;
        a5 a52 = (a5)c52;
        a52.b(n2 << 3);
        a52.b(n10);
    }

    public final void d(int n2, long l2) {
        a5 a52 = (a5)this.a;
        a52.b(1 | n2 << 3);
        a52.b(l2);
    }

    public final void e(int n2, long l2) {
        c5 c52 = this.a;
        long l10 = l2 + l2 ^ l2 >> 63;
        a5 a52 = (a5)c52;
        a52.b(n2 << 3);
        a52.a(l10);
    }
}

