/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.ec
 *  com.google.android.gms.internal.ads.zzvw
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.ec;
import com.google.android.gms.internal.ads.zzvw;
import java.util.ArrayList;
import java.util.List;

public final class eg
extends ec
implements cg {
    public eg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public final String G0() {
        Parcel parcel = this.a(2, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final List<zzvw> T() {
        Parcel parcel = this.a(3, this.Z0());
        ArrayList arrayList = parcel.createTypedArrayList(zzvw.CREATOR);
        parcel.recycle();
        return arrayList;
    }

    public final String getMediationAdapterClassName() {
        Parcel parcel = this.a(1, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }
}

