/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.e.d;

public final class h8
extends IllegalArgumentException {
    public h8(int n2, int n6) {
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Unpaired surrogate at index ");
        stringBuilder.append(n2);
        stringBuilder.append(" of ");
        stringBuilder.append(n6);
        super(stringBuilder.toString());
    }
}

