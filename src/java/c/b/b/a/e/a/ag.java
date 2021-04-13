/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.bg
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  com.google.android.gms.internal.ads.zzvu
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.dg;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import com.google.android.gms.internal.ads.zzvu;

public abstract class ag
extends gc
implements bg {
    public ag() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static bg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (iInterface instanceof bg) {
            return (bg)iInterface;
        }
        return new dg(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            this.a((zzvu)fc.a((Parcel)parcel, (Parcelable.Creator)zzvu.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

