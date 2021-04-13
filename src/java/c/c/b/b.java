/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package c.c.b;

public final class b {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;

    public b() {
        this.a = 16;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
    }

    public b(b b10) {
        this.a = b10.a;
        this.b = b10.b;
        this.c = b10.c;
        this.d = b10.d;
        this.e = b10.e;
        this.f = b10.f;
        this.g = b10.g;
        this.h = b10.h;
        this.i = b10.i;
        this.j = b10.j;
        this.k = b10.k;
    }

    public boolean equals(Object object) {
        boolean bl = false;
        if (object != null) {
            if (object.getClass() != b.class) {
                return false;
            }
            b b10 = (b)object;
            int n10 = this.a;
            int n11 = b10.a;
            bl = false;
            if (n10 == n11) {
                boolean bl2 = this.b;
                boolean bl3 = b10.b;
                bl = false;
                if (bl2 == bl3) {
                    boolean bl4 = this.c;
                    boolean bl5 = b10.c;
                    bl = false;
                    if (bl4 == bl5) {
                        boolean bl6 = this.d;
                        boolean bl7 = b10.d;
                        bl = false;
                        if (bl6 == bl7) {
                            boolean bl8 = this.e;
                            boolean bl9 = b10.e;
                            bl = false;
                            if (bl8 == bl9) {
                                boolean bl10 = this.f;
                                boolean bl11 = b10.f;
                                bl = false;
                                if (bl10 == bl11) {
                                    boolean bl12 = this.g.equals((Object)b10.g);
                                    bl = false;
                                    if (bl12) {
                                        boolean bl13 = this.h.equals((Object)b10.h);
                                        bl = false;
                                        if (bl13) {
                                            boolean bl14 = this.i.equals((Object)b10.i);
                                            bl = false;
                                            if (bl14) {
                                                boolean bl15 = this.j.equals((Object)b10.j);
                                                bl = false;
                                                if (bl15) {
                                                    boolean bl16 = this.k.equals((Object)b10.k);
                                                    bl = false;
                                                    if (bl16) {
                                                        bl = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
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

