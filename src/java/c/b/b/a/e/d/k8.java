/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.l8;

public final class k8
extends Enum<k8> {
    public static final /* enum */ k8 b;
    public static final /* enum */ k8 c;
    public static final /* enum */ k8 d;
    public static final /* enum */ k8 e;
    public static final /* enum */ k8 f;
    public static final /* enum */ k8 g;
    public static final /* enum */ k8 h;
    public static final /* enum */ k8 i;
    public static final /* enum */ k8 j;
    public static final /* enum */ k8 k;
    public static final /* enum */ k8 l;
    public static final /* enum */ k8 m;
    public static final /* enum */ k8 n;
    public static final /* enum */ k8 o;
    public static final /* enum */ k8 p;
    public static final /* enum */ k8 q;
    public static final /* enum */ k8 r;
    public static final /* enum */ k8 s;
    public static final /* synthetic */ k8[] t;
    public final l8 a;

    public static {
        k8 k82;
        b = new k8("DOUBLE", 0, l8.e);
        c = new k8("FLOAT", 1, l8.d);
        d = new k8("INT64", 2, l8.c);
        e = new k8("UINT64", 3, l8.c);
        f = new k8("INT32", 4, l8.b);
        g = new k8("FIXED64", 5, l8.c);
        h = new k8("FIXED32", 6, l8.b);
        i = new k8("BOOL", 7, l8.f);
        j = new k8("STRING", 8, l8.g);
        k = new k8("GROUP", 9, l8.j);
        l = new k8("MESSAGE", 10, l8.j);
        m = new k8("BYTES", 11, l8.h);
        n = new k8("UINT32", 12, l8.b);
        o = new k8("ENUM", 13, l8.i);
        p = new k8("SFIXED32", 14, l8.b);
        q = new k8("SFIXED64", 15, l8.c);
        r = new k8("SINT32", 16, l8.b);
        s = k82 = new k8("SINT64", 17, l8.c);
        k8[] arrk8 = new k8[]{b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, k82};
        t = arrk8;
    }

    public k8(l8 l82, int n6) {
        this.a = l82;
    }

    public static k8[] values() {
        return (k8[])t.clone();
    }
}

