/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzas
 *  com.google.android.gms.measurement.internal.zzkg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkg;

public final class b
implements Parcelable.Creator<zzaa> {
    public final Object createFromParcel(Parcel parcel) {
        long l2;
        long l10;
        int n2 = a.b(parcel);
        long l11 = l10 = (l2 = 0L);
        String string = null;
        String string2 = null;
        zzkg zzkg2 = null;
        String string3 = null;
        zzas zzas2 = null;
        zzas zzas3 = null;
        zzas zzas4 = null;
        boolean bl = false;
        block13 : while (parcel.dataPosition() < n2) {
            int n10 = parcel.readInt();
            switch (65535 & n10) {
                default: {
                    a.j(parcel, n10);
                    continue block13;
                }
                case 12: {
                    zzas4 = (zzas)a.a(parcel, n10, zzas.CREATOR);
                    continue block13;
                }
                case 11: {
                    l11 = a.h(parcel, n10);
                    continue block13;
                }
                case 10: {
                    zzas3 = (zzas)a.a(parcel, n10, zzas.CREATOR);
                    continue block13;
                }
                case 9: {
                    l10 = a.h(parcel, n10);
                    continue block13;
                }
                case 8: {
                    zzas2 = (zzas)a.a(parcel, n10, zzas.CREATOR);
                    continue block13;
                }
                case 7: {
                    string3 = a.b(parcel, n10);
                    continue block13;
                }
                case 6: {
                    bl = a.e(parcel, n10);
                    continue block13;
                }
                case 5: {
                    l2 = a.h(parcel, n10);
                    continue block13;
                }
                case 4: {
                    zzkg2 = (zzkg)a.a(parcel, n10, zzkg.CREATOR);
                    continue block13;
                }
                case 3: {
                    string2 = a.b(parcel, n10);
                    continue block13;
                }
                case 2: 
            }
            string = a.b(parcel, n10);
        }
        a.d(parcel, n2);
        zzaa zzaa2 = new zzaa(string, string2, zzkg2, l2, bl, string3, zzas2, l10, zzas3, l11, zzas4);
        return zzaa2;
    }
}

