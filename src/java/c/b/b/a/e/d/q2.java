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

import c.b.b.a.e.d.p2;
import c.b.b.a.e.d.v5;
import c.b.b.a.e.d.w5;

public final class q2
extends Enum<q2>
implements v5 {
    public static final /* enum */ q2 b;
    public static final /* enum */ q2 c;
    public static final /* enum */ q2 d;
    public static final /* enum */ q2 e;
    public static final /* enum */ q2 f;
    public static final /* synthetic */ q2[] g;
    public final int a;

    public static {
        q2 q22;
        b = new q2(0);
        c = new q2(1);
        d = new q2(2);
        e = new q2(3);
        f = q22 = new q2(4);
        q2[] arrq2 = new q2[]{b, c, d, e, q22};
        g = arrq2;
    }

    public q2(int n11) {
        this.a = n11;
    }

    public static q2 a(int n10) {
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        if (n10 != 4) {
                            return null;
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
        return p2.a;
    }

    public static q2[] values() {
        return (q2[])g.clone();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(q2.class.getName());
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

