/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.d.k.k;

import c.b.d.k.k.b;

public abstract class e {
    public static a a() {
        b.b b10 = new b.b();
        b10.a(0L);
        return b10;
    }

    public static abstract class a {
        public abstract a a(long var1);

        public abstract e a();
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a;
        public static final /* enum */ b b;
        public static final /* enum */ b c;
        public static final /* synthetic */ b[] d;

        public static {
            b b10;
            a = new b();
            b = new b();
            c = b10 = new b();
            b[] arrb = new b[]{a, b, b10};
            d = arrb;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])d.clone();
        }
    }

}

