/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.security.SecureRandom
 *  java.util.ArrayList
 *  java.util.Random
 */
package c.c.b.g;

import android.annotation.SuppressLint;
import c.c.b.g.b;
import c.c.b.g.d;
import c.c.b.g.e;
import c.c.b.g.f;
import c.c.b.g.g;
import c.c.b.i.j;
import c.c.b.i.l;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public final class c {
    public static final c e = new c();
    @SuppressLint(value={"TrulyRandom"})
    public Random a = new SecureRandom();
    public d b = new f();
    public d c = new e();
    public c.c.b.g.a d = null;

    public c() {
        this.a.setSeed(System.currentTimeMillis());
    }

    public final double a(double d10) {
        if (d10 <= 0.0) {
            return 0.0;
        }
        c.c.b.g.a a10 = this.d;
        if (a10 == null) {
            return d10;
        }
        return Math.pow((double)d10, (double)Math.exp((double)(-a10.e)));
    }

    public final c.c.b.i.f a(j j10) {
        c c10 = this;
        synchronized (c10) {
            ArrayList<a> arrayList;
            double d10;
            block16 : {
                block15 : {
                    int n10;
                    int n11;
                    if (this.d == null || (n10 = j10.f) <= (n11 = this.d.b)) break block15;
                    return null;
                }
                d d11 = this.b.a() ? this.b : this.c;
                arrayList = d11.a(j10);
                if (arrayList != null) break block16;
                return null;
            }
            ArrayList<c.c.b.i.f> arrayList2 = new c.c.b.i.g().a(j10);
            int n12 = arrayList.size();
            int n13 = 0;
            double d12 = d10 = 0.0;
            for (int i10 = 0; i10 < n12; ++i10) {
                block17 : {
                    boolean bl = arrayList2.contains((Object)((a)arrayList.get((int)i10)).a);
                    if (bl) break block17;
                    return null;
                }
                double d13 = this.a(((a)arrayList.get((int)i10)).b);
                d12 += d13;
            }
            if (d12 <= d10) {
                return null;
            }
            double d14 = d12 * this.a.nextDouble();
            while (n13 < n12) {
                d10 += this.a(((a)arrayList.get((int)n13)).b);
                if (d14 < d10) {
                    c.c.b.i.f f10 = ((a)arrayList.get((int)n13)).a;
                    return f10;
                }
                ++n13;
            }
            int n14 = n12 - 1;
            try {
                c.c.b.i.f f11 = ((a)arrayList.get((int)n14)).a;
                return f11;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(c.c.b.g.a a10) {
        c c10 = this;
        synchronized (c10) {
            this.d = a10;
            String string = a10.a;
            boolean bl = string.endsWith(".ctg") || string.endsWith(".ctb") || string.endsWith(".cto");
            d d10 = bl ? new b() : (a10.a.endsWith(".bin") ? new g() : new f());
            this.b = d10;
            d10.a(a10);
            this.c.a(a10);
            return;
        }
    }

    public static final class a {
        public c.c.b.i.f a;
        public float b;

        public a(c.c.b.i.f f10) {
            this.a = f10;
            this.b = 1.0f;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(l.a(this.a));
            stringBuilder.append(" (");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

}

