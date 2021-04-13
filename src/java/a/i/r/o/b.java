/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package a.i.r.o;

public class b {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public b(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.a = bl;
        this.b = bl2;
        this.c = bl3;
        this.d = bl4;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (b.class != object.getClass()) {
                return false;
            }
            b b2 = (b)object;
            return this.a == b2.a && this.b == b2.b && this.c == b2.c && this.d == b2.d;
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.a ? 1 : 0;
        if (this.b) {
            n2 += 16;
        }
        if (this.c) {
            n2 += 256;
        }
        if (this.d) {
            n2 += 4096;
        }
        return n2;
    }

    public String toString() {
        Object[] arrobject = new Object[]{this.a, this.b, this.c, this.d};
        return String.format((String)"[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", (Object[])arrobject);
    }
}

