/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.common.ConnectionResult
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.b;

import a.c.a.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

public final class l
implements Parcelable.Creator<ConnectionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n2 = a.b(parcel);
        int n3 = 0;
        PendingIntent pendingIntent = null;
        String string = null;
        int n5 = 0;
        while (parcel.dataPosition() < n2) {
            int n7 = parcel.readInt();
            int n8 = 65535 & n7;
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            a.j(parcel, n7);
                            continue;
                        }
                        string = a.b(parcel, n7);
                        continue;
                    }
                    pendingIntent = (PendingIntent)a.a(parcel, n7, PendingIntent.CREATOR);
                    continue;
                }
                n5 = a.g(parcel, n7);
                continue;
            }
            n3 = a.g(parcel, n7);
        }
        a.d(parcel, n2);
        return new ConnectionResult(n3, n5, pendingIntent, string);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        return new ConnectionResult[n2];
    }
}

