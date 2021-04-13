/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package a.e;

public abstract class b {

    public static final class a
    extends Enum<a> {
        public static final /* synthetic */ a[] $VALUES;
        public static final /* enum */ a ON_ANY;
        public static final /* enum */ a ON_CREATE;
        public static final /* enum */ a ON_DESTROY;
        public static final /* enum */ a ON_PAUSE;
        public static final /* enum */ a ON_RESUME;
        public static final /* enum */ a ON_START;
        public static final /* enum */ a ON_STOP;

        public static {
            a a2;
            ON_CREATE = new a();
            ON_START = new a();
            ON_RESUME = new a();
            ON_PAUSE = new a();
            ON_STOP = new a();
            ON_DESTROY = new a();
            ON_ANY = a2 = new a();
            a[] arra = new a[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, a2};
            $VALUES = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])$VALUES.clone();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a;
        public static final /* enum */ b b;
        public static final /* enum */ b c;
        public static final /* enum */ b d;
        public static final /* enum */ b e;
        public static final /* synthetic */ b[] f;

        public static {
            b b2;
            a = new b();
            b = new b();
            c = new b();
            d = new b();
            e = b2 = new b();
            b[] arrb = new b[]{a, b, c, d, b2};
            f = arrb;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])f.clone();
        }
    }

}

