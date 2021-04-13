/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.v4
 *  c.b.b.a.e.d.x4
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.v4;
import c.b.b.a.e.d.x4;

public final class t4
extends v4 {
    public final int e;

    public t4(byte[] arrby, int n7) {
        super(arrby);
        x4.a((int)0, (int)n7, (int)arrby.length);
        this.e = n7;
    }

    public final byte c(int n7) {
        int n9 = this.e;
        if ((n7 | n9 - (n7 + 1)) < 0) {
            if (n7 < 0) {
                StringBuilder stringBuilder = new StringBuilder(22);
                stringBuilder.append("Index < 0: ");
                stringBuilder.append(n7);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Index > length: ");
            stringBuilder.append(n7);
            stringBuilder.append(", ");
            stringBuilder.append(n9);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        return this.d[n7];
    }

    public final int c() {
        return this.e;
    }

    public final byte d(int n7) {
        return this.d[n7];
    }

    public final int d() {
        return 0;
    }
}

