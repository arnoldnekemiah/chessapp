/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.Object
 */
package a.i;

import a.i.d;
import a.i.i;
import android.os.Build;

public final class c {
    public static final c i = new a().a();
    public i a = i.a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f = -1L;
    public long g = -1L;
    public d h = new d();

    public c() {
    }

    public c(a a2) {
        this.b = a2.a;
        boolean bl = Build.VERSION.SDK_INT >= 23 && a2.b;
        this.c = bl;
        this.a = a2.c;
        this.d = a2.d;
        this.e = a2.e;
        if (Build.VERSION.SDK_INT >= 24) {
            this.h = a2.h;
            this.f = a2.f;
            this.g = a2.g;
        }
    }

    public c(c c2) {
        this.b = c2.b;
        this.c = c2.c;
        this.a = c2.a;
        this.d = c2.d;
        this.e = c2.e;
        this.h = c2.h;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (c.class != object.getClass()) {
                return false;
            }
            c c2 = (c)object;
            if (this.b != c2.b) {
                return false;
            }
            if (this.c != c2.c) {
                return false;
            }
            if (this.d != c2.d) {
                return false;
            }
            if (this.e != c2.e) {
                return false;
            }
            if (this.f != c2.f) {
                return false;
            }
            if (this.g != c2.g) {
                return false;
            }
            if (this.a != c2.a) {
                return false;
            }
            return this.h.equals(c2.h);
        }
        return false;
    }

    public int hashCode() {
        int n2 = 31 * (31 * (31 * (31 * (31 * this.a.hashCode() + this.b) + this.c) + this.d) + this.e);
        long l2 = this.f;
        int n3 = 31 * (n2 + (int)(l2 ^ l2 >>> 32));
        long l3 = this.g;
        return 31 * (n3 + (int)(l3 ^ l3 >>> 32)) + this.h.hashCode();
    }

    public static final class a {
        public boolean a = false;
        public boolean b = false;
        public i c = i.a;
        public boolean d = false;
        public boolean e = false;
        public long f = -1L;
        public long g = -1L;
        public d h = new d();

        public c a() {
            return new c(this);
        }
    }

}

