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

import c.b.b.a.e.d.p0;
import c.b.b.a.e.d.v5;
import c.b.b.a.e.d.w5;

public final class q0
extends Enum<q0>
implements v5 {
    public static final /* enum */ q0 b;
    public static final /* enum */ q0 c;
    public static final /* enum */ q0 d;
    public static final /* enum */ q0 e;
    public static final /* enum */ q0 f;
    public static final /* synthetic */ q0[] g;
    public final int a;

    public static {
        q0 q02;
        b = new q0(0);
        c = new q0(1);
        d = new q0(2);
        e = new q0(3);
        f = q02 = new q0(4);
        q0[] arrq0 = new q0[]{b, c, d, e, q02};
        g = arrq0;
    }

    public q0(int n11) {
        this.a = n11;
    }

    public static q0 a(int n10) {
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
        return p0.a;
    }

    public static q0[] values() {
        return (q0[])g.clone();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(q0.class.getName());
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

