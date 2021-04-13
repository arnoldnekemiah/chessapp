/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package a.i;

public final class f
extends Enum<f> {
    public static final /* enum */ f a;
    public static final /* enum */ f b;
    public static final /* enum */ f c;
    public static final /* synthetic */ f[] d;

    public static {
        f f2;
        a = new f();
        b = new f();
        c = f2 = new f();
        f[] arrf = new f[]{a, b, f2};
        d = arrf;
    }

    public static f valueOf(String string) {
        return (f)Enum.valueOf(f.class, (String)string);
    }

    public static f[] values() {
        return (f[])d.clone();
    }
}

