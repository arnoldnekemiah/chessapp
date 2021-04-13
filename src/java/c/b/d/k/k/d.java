/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.d.k.k;

public abstract class d {

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a;
        public static final /* enum */ a b;
        public static final /* synthetic */ a[] c;

        public static {
            a a10;
            a = new a();
            b = a10 = new a();
            a[] arra = new a[]{a, a10};
            c = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])c.clone();
        }
    }

}

