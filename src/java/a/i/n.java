/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package a.i;

public final class n
extends Enum<n> {
    public static final /* enum */ n a;
    public static final /* enum */ n b;
    public static final /* enum */ n c;
    public static final /* enum */ n d;
    public static final /* enum */ n e;
    public static final /* enum */ n f;
    public static final /* synthetic */ n[] g;

    public static {
        n n2;
        a = new n();
        b = new n();
        c = new n();
        d = new n();
        e = new n();
        f = n2 = new n();
        n[] arrn = new n[]{a, b, c, d, e, n2};
        g = arrn;
    }

    public static n valueOf(String string) {
        return (n)Enum.valueOf(n.class, (String)string);
    }

    public static n[] values() {
        return (n[])g.clone();
    }

    public boolean d() {
        return this == c || this == d || this == f;
        {
        }
    }
}

