/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package a.i.r.p;

public class d {
    public final String a;
    public final int b;

    public d(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (d.class != object.getClass()) {
                return false;
            }
            d d2 = (d)object;
            if (this.b != d2.b) {
                return false;
            }
            return this.a.equals((Object)d2.a);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b;
    }
}

