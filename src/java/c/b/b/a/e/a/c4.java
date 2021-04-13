/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.z3
 *  com.google.android.gms.internal.ads.zzajh
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.b4;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.z3;
import com.google.android.gms.internal.ads.zzajh;
import java.util.ArrayList;
import java.util.List;

public abstract class c4
extends gc
implements z3 {
    public c4() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static z3 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        if (iInterface instanceof z3) {
            return (z3)iInterface;
        }
        return new b4(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            this.a((List)parcel.createTypedArrayList(zzajh.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

