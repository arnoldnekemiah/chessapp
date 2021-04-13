/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.internal.measurement.zzy
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import a.c.a.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzy;

public final class ec
implements Parcelable.Creator<zzy> {
    public final Object createFromParcel(Parcel parcel) {
        long l2;
        int n2 = a.b(parcel);
        long l10 = l2 = 0L;
        String string = null;
        String string2 = null;
        String string3 = null;
        Bundle bundle = null;
        String string4 = null;
        boolean bl = false;
        block10 : while (parcel.dataPosition() < n2) {
            int n6 = parcel.readInt();
            switch (65535 & n6) {
                default: {
                    a.j(parcel, n6);
                    continue block10;
                }
                case 8: {
                    string4 = a.b(parcel, n6);
                    continue block10;
                }
                case 7: {
                    bundle = a.a(parcel, n6);
                    continue block10;
                }
                case 6: {
                    string3 = a.b(parcel, n6);
                    continue block10;
                }
                case 5: {
                    string2 = a.b(parcel, n6);
                    continue block10;
                }
                case 4: {
                    string = a.b(parcel, n6);
                    continue block10;
                }
                case 3: {
                    bl = a.e(parcel, n6);
                    continue block10;
                }
                case 2: {
                    l10 = a.h(parcel, n6);
                    continue block10;
                }
                case 1: 
            }
            l2 = a.h(parcel, n6);
        }
        a.d(parcel, n2);
        zzy zzy2 = new zzy(l2, l10, bl, string, string2, string3, bundle, string4);
        return zzy2;
    }
}

