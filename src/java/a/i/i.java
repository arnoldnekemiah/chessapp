/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package a.i;

public final class i
extends Enum<i> {
    public static final /* enum */ i a;
    public static final /* enum */ i b;
    public static final /* enum */ i c;
    public static final /* enum */ i d;
    public static final /* enum */ i e;
    public static final /* synthetic */ i[] f;

    public static {
        i i2;
        a = new i();
        b = new i();
        c = new i();
        d = new i();
        e = i2 = new i();
        i[] arri = new i[]{a, b, c, d, i2};
        f = arri;
    }

    public static i valueOf(String string) {
        return (i)Enum.valueOf(i.class, (String)string);
    }

    public static i[] values() {
        return (i[])f.clone();
    }
}

