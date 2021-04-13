/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package a.i.r.p;

import a.i.c;
import a.i.e;
import a.i.h;
import a.i.n;

public class j {
    public String a;
    public n b = n.a;
    public String c;
    public String d;
    public e e;
    public e f;
    public long g;
    public long h;
    public long i;
    public c j;
    public int k;
    public a.i.a l;
    public long m;
    public long n;
    public long o;
    public long p;

    public static {
        h.a("WorkSpec");
    }

    public j(j j2) {
        e e2;
        this.e = e2 = e.c;
        this.f = e2;
        this.j = c.i;
        this.l = a.i.a.a;
        this.m = 30000L;
        this.p = -1L;
        this.a = j2.a;
        this.c = j2.c;
        this.b = j2.b;
        this.d = j2.d;
        this.e = new e(j2.e);
        this.f = new e(j2.f);
        this.g = j2.g;
        this.h = j2.h;
        this.i = j2.i;
        this.j = new c(j2.j);
        this.k = j2.k;
        this.l = j2.l;
        this.m = j2.m;
        this.n = j2.n;
        this.o = j2.o;
        this.p = j2.p;
    }

    public j(String string, String string2) {
        e e2;
        this.e = e2 = e.c;
        this.f = e2;
        this.j = c.i;
        this.l = a.i.a.a;
        this.m = 30000L;
        this.p = -1L;
        this.a = string;
        this.c = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long a() {
        long l2;
        long l3;
        if (this.c()) {
            a.i.a a2 = this.l;
            a.i.a a4 = a.i.a.b;
            boolean bl = false;
            if (a2 == a4) {
                bl = true;
            }
            long l4 = bl ? this.m * (long)this.k : (long)Math.scalb((float)this.m, (int)(this.k - 1));
            l2 = this.n;
            l3 = Math.min((long)18000000L, (long)l4);
            do {
                return l3 + l2;
                break;
            } while (true);
        }
        boolean bl = this.d();
        long l5 = 0L;
        if (bl) {
            long l6 = System.currentTimeMillis();
            long l7 = this.n;
            if (l7 == l5) {
                l7 = l6 + this.g;
            }
            long l8 = this.i LCMP this.h;
            boolean bl2 = false;
            if (l8 != false) {
                bl2 = true;
            }
            if (bl2) {
                if (this.n != l5) return l5 + (l7 + this.h);
                l5 = -1L * this.i;
                return l5 + (l7 + this.h);
            }
            if (this.n == l5) return l7 + l5;
            l5 = this.h;
            return l7 + l5;
        }
        l3 = this.n;
        if (l3 == l5) {
            l3 = System.currentTimeMillis();
        }
        l2 = this.g;
        return l3 + l2;
    }

    public boolean b() {
        return true ^ c.i.equals(this.j);
    }

    public boolean c() {
        return this.b == n.a && this.k > 0;
    }

    public boolean d() {
        return this.h != 0L;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (j.class != object.getClass()) {
                return false;
            }
            j j2 = (j)object;
            if (this.g != j2.g) {
                return false;
            }
            if (this.h != j2.h) {
                return false;
            }
            if (this.i != j2.i) {
                return false;
            }
            if (this.k != j2.k) {
                return false;
            }
            if (this.m != j2.m) {
                return false;
            }
            if (this.n != j2.n) {
                return false;
            }
            if (this.o != j2.o) {
                return false;
            }
            if (this.p != j2.p) {
                return false;
            }
            if (!this.a.equals((Object)j2.a)) {
                return false;
            }
            if (this.b != j2.b) {
                return false;
            }
            if (!this.c.equals((Object)j2.c)) {
                return false;
            }
            String string = this.d;
            if (string != null ? !string.equals((Object)j2.d) : j2.d != null) {
                return false;
            }
            if (!this.e.equals(j2.e)) {
                return false;
            }
            if (!this.f.equals(j2.f)) {
                return false;
            }
            if (!this.j.equals(j2.j)) {
                return false;
            }
            return this.l == j2.l;
        }
        return false;
    }

    public int hashCode() {
        int n2 = 31 * (31 * (31 * this.a.hashCode() + this.b.hashCode()) + this.c.hashCode());
        String string = this.d;
        int n3 = string != null ? string.hashCode() : 0;
        int n5 = 31 * (31 * (31 * (n2 + n3) + this.e.hashCode()) + this.f.hashCode());
        long l2 = this.g;
        int n7 = 31 * (n5 + (int)(l2 ^ l2 >>> 32));
        long l3 = this.h;
        int n8 = 31 * (n7 + (int)(l3 ^ l3 >>> 32));
        long l4 = this.i;
        int n9 = 31 * (31 * (31 * (31 * (n8 + (int)(l4 ^ l4 >>> 32)) + this.j.hashCode()) + this.k) + this.l.hashCode());
        long l5 = this.m;
        int n10 = 31 * (n9 + (int)(l5 ^ l5 >>> 32));
        long l6 = this.n;
        int n11 = 31 * (n10 + (int)(l6 ^ l6 >>> 32));
        long l7 = this.o;
        int n12 = 31 * (n11 + (int)(l7 ^ l7 >>> 32));
        long l8 = this.p;
        return n12 + (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        return c.a.b.a.a.a(c.a.b.a.a.a("{WorkSpec: "), this.a, "}");
    }

    public static class a {
        public String a;
        public n b;

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (a.class != object.getClass()) {
                    return false;
                }
                a a2 = (a)object;
                if (this.b != a2.b) {
                    return false;
                }
                return this.a.equals((Object)a2.a);
            }
            return false;
        }

        public int hashCode() {
            return 31 * this.a.hashCode() + this.b.hashCode();
        }
    }

}

