/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.h4
 *  c.b.b.a.e.a.k4
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.h4;
import c.b.b.a.e.a.i4;
import c.b.b.a.e.a.k4;
import c.b.b.a.e.a.m4;
import com.google.android.gms.internal.ads.zzvg;

public abstract class j4
extends gc
implements k4 {
    public j4() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public static k4 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        if (iInterface instanceof k4) {
            return (k4)iInterface;
        }
        return new m4(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    return false;
                }
                this.e((zzvg)fc.a((Parcel)parcel, (Parcelable.Creator)zzvg.CREATOR));
            } else {
                this.b(parcel.readInt());
            }
        } else {
            IInterface iInterface;
            IBinder iBinder = parcel.readStrongBinder();
            Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAd")) instanceof h4 ? (h4)iInterface : new i4(iBinder));
            this.a(object);
        }
        parcel2.writeNoException();
        return true;
    }
}

