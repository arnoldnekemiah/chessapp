/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.common.api.Scope
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.b.g;

import a.c.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

public final class b
implements Parcelable.Creator<Scope> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        String string = null;
        while (parcel.dataPosition() < n2) {
            int n5 = parcel.readInt();
            int n7 = 65535 & n5;
            if (n7 != 1) {
                if (n7 != 2) {
                    a.j(parcel, n5);
                    continue;
                }
                string = a.b(parcel, n5);
                continue;
            }
            n3 = a.g(parcel, n5);
        }
        a.d(parcel, n2);
        return new Scope(n3, string);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        return new Scope[n2];
    }
}

