/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  c.b.b.a.e.a.e1
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.l1
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.a.e.a.e1;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.l1;
import java.util.ArrayList;
import java.util.List;

public final class g1
extends ec
implements e1 {
    public g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String d0() {
        Parcel parcel = this.a(2, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final List<l1> u0() {
        Parcel parcel = this.a(3, this.Z0());
        ArrayList arrayList = fc.b((Parcel)parcel);
        parcel.recycle();
        return arrayList;
    }
}

