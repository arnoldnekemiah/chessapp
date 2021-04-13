/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Arrays
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.u4;
import java.util.Arrays;

public final class s4
implements u4 {
    @Override
    public final byte[] a(byte[] arrby, int n10, int n11) {
        return Arrays.copyOfRange((byte[])arrby, (int)n10, (int)(n11 + n10));
    }
}

