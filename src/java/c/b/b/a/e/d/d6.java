/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Void
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.x4;

public final class d6
extends Enum<d6> {
    public static final /* enum */ d6 c;
    public static final /* enum */ d6 d;
    public static final /* enum */ d6 e;
    public static final /* enum */ d6 f;
    public static final /* enum */ d6 g;
    public static final /* enum */ d6 h;
    public static final /* enum */ d6 i;
    public static final /* enum */ d6 j;
    public static final /* enum */ d6 k;
    public static final /* enum */ d6 l;
    public static final /* synthetic */ d6[] m;
    public final Class<?> a;
    public final Object b;

    public static {
        d6 d62;
        d6 d63;
        d6 d64;
        d6 d65;
        d6 d66;
        d6 d67;
        d6 d68;
        d6 d69;
        d6 d610;
        d6 d611;
        c = d63 = new d6(Void.class, Void.class, null);
        d = d64 = new d6(Integer.TYPE, Integer.class, 0);
        e = d610 = new d6(Long.TYPE, Long.class, 0L);
        f = d66 = new d6(Float.TYPE, Float.class, (Object)Float.valueOf((float)0.0f));
        g = d69 = new d6(Double.TYPE, Double.class, 0.0);
        h = d62 = new d6(Boolean.TYPE, Boolean.class, false);
        i = d68 = new d6(String.class, String.class, "");
        j = d67 = new d6(x4.class, x4.class, x4.b);
        k = d65 = new d6(Integer.TYPE, Integer.class, null);
        l = d611 = new d6(Object.class, Object.class, null);
        d6[] arrd6 = new d6[]{c, d, e, f, g, h, i, j, k, d611};
        m = arrd6;
    }

    public d6(Class<?> class_, Class<?> class_2, Object object) {
        this.a = class_2;
        this.b = object;
    }

    public static d6[] values() {
        return (d6[])m.clone();
    }
}

