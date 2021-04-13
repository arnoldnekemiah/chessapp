/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package c.c.b.i;

import c.c.b.i.l;

public class f {
    public int a;
    public int b;
    public int c;

    public f(int n10, int n11, int n12) {
        this.a = n10;
        this.b = n11;
        this.c = n12;
    }

    public f(f f10) {
        this.a = f10.a;
        this.b = f10.b;
        this.c = f10.c;
    }

    public boolean equals(Object object) {
        if (object != null) {
            if (object.getClass() != f.class) {
                return false;
            }
            f f10 = (f)object;
            if (this.a != f10.a) {
                return false;
            }
            if (this.b != f10.b) {
                return false;
            }
            return this.c == f10.c;
        }
        return false;
    }

    public int hashCode() {
        return 16 * (64 * this.a + this.b) + this.c;
    }

    public final String toString() {
        return l.a(this);
    }
}

