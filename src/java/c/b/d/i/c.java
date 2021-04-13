/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.d.i;

public interface c {
    public a a(String var1);

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a b;
        public static final /* enum */ a c;
        public static final /* enum */ a d;
        public static final /* enum */ a e;
        public static final /* synthetic */ a[] f;
        public final int a;

        public static {
            a a10;
            b = new a(0);
            c = new a(1);
            d = new a(2);
            e = a10 = new a(3);
            a[] arra = new a[]{b, c, d, a10};
            f = arra;
        }

        public a(int n11) {
            this.a = n11;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])f.clone();
        }
    }

}

