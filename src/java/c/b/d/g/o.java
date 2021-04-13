/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.d.g;

import a.c.a.a;

public final class o {
    public final Class<?> a;
    public final int b;
    public final int c;

    public o(Class<?> class_, int n10, int n11) {
        a.a(class_, "Null dependency anInterface.");
        this.a = class_;
        this.b = n10;
        this.c = n11;
    }

    public static o a(Class<?> class_) {
        return new o(class_, 1, 0);
    }

    public boolean a() {
        return this.b == 2;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof o;
        boolean bl2 = false;
        if (bl) {
            o o10 = (o)object;
            Class<?> class_ = this.a;
            Class<?> class_2 = o10.a;
            bl2 = false;
            if (class_ == class_2) {
                int n10 = this.b;
                int n11 = o10.b;
                bl2 = false;
                if (n10 == n11) {
                    int n12 = this.c;
                    int n13 = o10.c;
                    bl2 = false;
                    if (n12 == n13) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    public int hashCode() {
        return 1000003 * (1000003 * (1000003 ^ this.a.hashCode()) ^ this.b) ^ this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
        stringBuilder.append(this.a);
        stringBuilder.append(", type=");
        boolean bl = this.b;
        boolean bl2 = true;
        String string = bl == bl2 ? "required" : (!bl ? "optional" : "set");
        stringBuilder.append(string);
        stringBuilder.append(", direct=");
        if (this.c != 0) {
            bl2 = false;
        }
        stringBuilder.append(bl2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

