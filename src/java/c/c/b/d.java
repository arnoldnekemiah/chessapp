/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package c.c.b;

public class d {
    public final int a;

    public d(int n10) {
        this.a = n10;
    }

    public final boolean a() {
        int n10 = this.a;
        return n10 == 1 || n10 == 2 || n10 == 3 || n10 == 5;
    }

    public final boolean b() {
        int n10 = this.a;
        return n10 == 2 || n10 == 3 || n10 == 6;
    }

    public final boolean c() {
        int n10 = this.a;
        return n10 == 1 || n10 == 3 || n10 == 6;
    }

    public boolean equals(Object object) {
        boolean bl = false;
        if (object != null) {
            if (object.getClass() != d.class) {
                return false;
            }
            d d10 = (d)object;
            int n10 = this.a;
            int n11 = d10.a;
            bl = false;
            if (n10 == n11) {
                bl = true;
            }
        }
        return bl;
    }

    public int hashCode() {
        return this.a;
    }
}

