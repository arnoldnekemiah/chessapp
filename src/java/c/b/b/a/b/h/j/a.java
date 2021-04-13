/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.b.h.j;

import android.os.Parcel;

public class a
extends RuntimeException {
    public a(String string, Parcel parcel) {
        int n2 = parcel.dataPosition();
        int n3 = parcel.dataSize();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string, 41));
        stringBuilder.append(string);
        stringBuilder.append(" Parcel: pos=");
        stringBuilder.append(n2);
        stringBuilder.append(" size=");
        stringBuilder.append(n3);
        super(stringBuilder.toString());
    }
}

