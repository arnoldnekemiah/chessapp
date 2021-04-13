/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package b;

import b.l;
import c.a.b.a.a;

public class g {
    public int a;
    public int b;
    public int c;
    public int d;

    public g(int n2, int n3, int n5) {
        this.a = n2;
        this.b = n3;
        this.c = n5;
        this.d = 0;
    }

    public g(int n2, int n3, int n5, int n7) {
        this.a = n2;
        this.b = n3;
        this.c = n5;
        this.d = n7;
    }

    public g(g g2) {
        this.a = g2.a;
        this.b = g2.b;
        this.c = g2.c;
        this.d = g2.d;
    }

    public boolean equals(Object object) {
        if (object != null) {
            if (object.getClass() != g.class) {
                return false;
            }
            g g2 = (g)object;
            if (this.a != g2.a) {
                return false;
            }
            if (this.b != g2.b) {
                return false;
            }
            return this.c == g2.c;
        }
        return false;
    }

    public int hashCode() {
        return 16 * (64 * this.a + this.b) + this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        String string;
        StringBuilder stringBuilder2 = a.a(l.b(this.a));
        stringBuilder2.append(l.b(this.b));
        String string2 = stringBuilder2.toString();
        switch (this.c) {
            default: {
                return string2;
            }
            case 5: 
            case 11: {
                stringBuilder = a.a(string2);
                string = "n";
                break;
            }
            case 4: 
            case 10: {
                stringBuilder = a.a(string2);
                string = "b";
                break;
            }
            case 3: 
            case 9: {
                stringBuilder = a.a(string2);
                string = "r";
                break;
            }
            case 2: 
            case 8: {
                stringBuilder = a.a(string2);
                string = "q";
            }
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

