/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  I
 *  java.lang.Object
 *  java.lang.reflect.Array
 */
package b;

import b.g;
import b.j;
import java.lang.reflect.Array;

public final class e {
    public int[][] a;
    public int[][] b;
    public int[][] c;

    public e() {
        this.a();
    }

    public void a() {
        this.a = (int[][])Array.newInstance(I.class, (int[])new int[]{13, 64});
        this.b = (int[][])Array.newInstance(I.class, (int[])new int[]{13, 64});
        this.c = (int[][])Array.newInstance(I.class, (int[])new int[]{13, 64});
        for (int i2 = 0; i2 < 13; ++i2) {
            for (int i3 = 0; i3 < 64; ++i3) {
                this.a[i2][i3] = 0;
                this.b[i2][i3] = 0;
                this.c[i2][i3] = -1;
            }
        }
    }

    public final void a(j j2, g g2, int n2) {
        int n3 = g2.a;
        int n5 = j2.a[n3];
        int[] arrn = this.b[n5];
        int n7 = g2.b;
        arrn[n7] = n2 + arrn[n7];
        this.c[n5][n7] = -1;
    }
}

