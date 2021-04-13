/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;
import java.util.List;

public final class n9
implements Parcelable.Creator<zzp> {
    public final Object createFromParcel(Parcel parcel) {
        long l2;
        long l10;
        long l11;
        long l12;
        int n2 = a.b(parcel);
        long l13 = l2 = (l12 = (l11 = (l10 = 0L)));
        String string = null;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        Boolean bl = null;
        ArrayList<String> arrayList = null;
        String string8 = null;
        String string9 = "";
        long l14 = Integer.MIN_VALUE;
        boolean bl2 = true;
        boolean bl3 = false;
        int n10 = 0;
        boolean bl4 = true;
        boolean bl5 = false;
        block24 : while (parcel.dataPosition() < n2) {
            int n11 = parcel.readInt();
            switch (65535 & n11) {
                default: {
                    a.j(parcel, n11);
                    continue block24;
                }
                case 25: {
                    string9 = a.b(parcel, n11);
                    continue block24;
                }
                case 24: {
                    string8 = a.b(parcel, n11);
                    continue block24;
                }
                case 23: {
                    arrayList = a.c(parcel, n11);
                    continue block24;
                }
                case 22: {
                    l13 = a.h(parcel, n11);
                    continue block24;
                }
                case 21: {
                    int n12 = a.i(parcel, n11);
                    if (n12 == 0) {
                        bl = null;
                        continue block24;
                    }
                    a.d(parcel, n12, 4);
                    boolean bl6 = parcel.readInt() != 0;
                    bl = bl6;
                    continue block24;
                }
                case 19: {
                    string7 = a.b(parcel, n11);
                    continue block24;
                }
                case 18: {
                    bl5 = a.e(parcel, n11);
                    continue block24;
                }
                case 16: {
                    bl4 = a.e(parcel, n11);
                    continue block24;
                }
                case 15: {
                    n10 = a.g(parcel, n11);
                    continue block24;
                }
                case 14: {
                    l2 = a.h(parcel, n11);
                    continue block24;
                }
                case 13: {
                    l12 = a.h(parcel, n11);
                    continue block24;
                }
                case 12: {
                    string6 = a.b(parcel, n11);
                    continue block24;
                }
                case 11: {
                    l14 = a.h(parcel, n11);
                    continue block24;
                }
                case 10: {
                    bl3 = a.e(parcel, n11);
                    continue block24;
                }
                case 9: {
                    bl2 = a.e(parcel, n11);
                    continue block24;
                }
                case 8: {
                    string5 = a.b(parcel, n11);
                    continue block24;
                }
                case 7: {
                    l11 = a.h(parcel, n11);
                    continue block24;
                }
                case 6: {
                    l10 = a.h(parcel, n11);
                    continue block24;
                }
                case 5: {
                    string4 = a.b(parcel, n11);
                    continue block24;
                }
                case 4: {
                    string3 = a.b(parcel, n11);
                    continue block24;
                }
                case 3: {
                    string2 = a.b(parcel, n11);
                    continue block24;
                }
                case 2: 
            }
            string = a.b(parcel, n11);
        }
        a.d(parcel, n2);
        zzp zzp2 = new zzp(string, string2, string3, string4, l10, l11, string5, bl2, bl3, l14, string6, l12, l2, n10, bl4, bl5, string7, bl, l13, arrayList, string8, string9);
        return zzp2;
    }
}

