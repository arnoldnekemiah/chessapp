/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;

public final class n {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public n(String string, String string2, long l2, long l10, long l11, long l12, long l13, Long l14, Long l15, Long l16, Boolean bl) {
        a.c(string);
        a.c(string2);
        boolean bl2 = true;
        boolean bl3 = l2 >= 0L;
        a.a(bl3);
        boolean bl4 = l10 >= 0L;
        a.a(bl4);
        boolean bl5 = l11 >= 0L;
        a.a(bl5);
        if (l13 < 0L) {
            bl2 = false;
        }
        a.a(bl2);
        this.a = string;
        this.b = string2;
        this.c = l2;
        this.d = l10;
        this.e = l11;
        this.f = l12;
        this.g = l13;
        this.h = l14;
        this.i = l15;
        this.j = l16;
        this.k = bl;
    }

    public final n a(long l2) {
        n n2 = new n(this.a, this.b, this.c, this.d, this.e, l2, this.g, this.h, this.i, this.j, this.k);
        return n2;
    }

    public final n a(long l2, long l10) {
        n n2 = new n(this.a, this.b, this.c, this.d, this.e, this.f, l2, l10, this.i, this.j, this.k);
        return n2;
    }

    public final n a(Long l2, Long l10, Boolean bl) {
        Object object = bl != null && bl == false ? null : bl;
        n n2 = new n(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l2, l10, (Boolean)object);
        return n2;
    }
}

