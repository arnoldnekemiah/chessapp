/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.g1;
import c.b.b.a.e.d.v5;
import c.b.b.a.e.d.w5;

public final class h1
extends Enum<h1>
implements v5 {
    public static final /* enum */ h1 b;
    public static final /* enum */ h1 c;
    public static final /* enum */ h1 d;
    public static final /* enum */ h1 e;
    public static final /* enum */ h1 f;
    public static final /* enum */ h1 g;
    public static final /* synthetic */ h1[] h;
    public final int a;

    public static {
        h1 h12;
        b = new h1(0);
        c = new h1(1);
        d = new h1(2);
        e = new h1(3);
        f = new h1(4);
        g = h12 = new h1(5);
        h1[] arrh1 = new h1[]{b, c, d, e, f, h12};
        h = arrh1;
    }

    public h1(int n11) {
        this.a = n11;
    }

    public static h1 a(int n10) {
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        if (n10 != 4) {
                            if (n10 != 5) {
                                return null;
                            }
                            return g;
                        }
                        return f;
                    }
                    return e;
                }
                return d;
            }
            return c;
        }
        return b;
    }

    public static w5 b() {
        return g1.a;
    }

    public static h1[] values() {
        return (h1[])h.clone();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(h1.class.getName());
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        stringBuilder.append(" number=");
        stringBuilder.append(this.a);
        stringBuilder.append(" name=");
        stringBuilder.append(this.name());
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

