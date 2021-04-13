/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.p8
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.p8;
import java.util.ArrayList;
import java.util.List;

public abstract class o8
extends gc
implements p8 {
    public o8() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                return false;
            }
            this.i(parcel.readString());
        } else {
            this.b((List)parcel.createTypedArrayList(Uri.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

