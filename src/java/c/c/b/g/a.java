/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package c.c.b.g;

public final class a {
    public String a = "";
    public int b = 1000000;
    public boolean c = false;
    public boolean d = false;
    public double e = 0.0;

    public a() {
    }

    public a(a a10) {
        this.a = a10.a;
        this.b = a10.b;
        this.c = a10.c;
        this.d = a10.d;
        this.e = a10.e;
    }

    public boolean equals(Object object) {
        boolean bl = false;
        if (object != null) {
            if (object.getClass() != a.class) {
                return false;
            }
            a a10 = (a)object;
            boolean bl2 = this.a.equals((Object)a10.a);
            bl = false;
            if (bl2) {
                int n10 = this.b;
                int n11 = a10.b;
                bl = false;
                if (n10 == n11) {
                    boolean bl3 = this.c;
                    boolean bl4 = a10.c;
                    bl = false;
                    if (bl3 == bl4) {
                        boolean bl5 = this.d;
                        boolean bl6 = a10.d;
                        bl = false;
                        if (bl5 == bl6) {
                            double d10 = this.e DCMPL a10.e;
                            bl = false;
                            if (d10 == false) {
                                bl = true;
                            }
                        }
                    }
                }
            }
        }
        return bl;
    }

    public int hashCode() {
        return 0;
    }
}

