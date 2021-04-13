/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package a.b;

public class d {
    public static final int[] a = new int[0];
    public static final Object[] b = new Object[0];

    public static int a(int n2) {
        int n3 = n2 * 4;
        for (int i2 = 4; i2 < 32; ++i2) {
            int n4 = -12 + (1 << i2);
            if (n3 > n4) continue;
            n3 = n4;
            break;
        }
        return n3 / 4;
    }

    public static int a(int[] arrn, int n2, int n3) {
        int n4 = n2 - 1;
        int n5 = 0;
        while (n5 <= n4) {
            int n6 = n5 + n4 >>> 1;
            int n7 = arrn[n6];
            if (n7 < n3) {
                n5 = n6 + 1;
                continue;
            }
            if (n7 > n3) {
                n4 = n6 - 1;
                continue;
            }
            return n6;
        }
        return ~n5;
    }

    public static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }
}

