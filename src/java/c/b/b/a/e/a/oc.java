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
 *  c.b.b.a.e.a.lc
 *  c.b.b.a.e.a.pc
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
import c.b.b.a.e.a.lc;
import c.b.b.a.e.a.nc;
import c.b.b.a.e.a.pc;
import c.b.b.a.e.a.rc;
import com.google.android.gms.internal.ads.zzvg;

public abstract class oc
extends gc
implements pc {
    public oc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static pc a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (iInterface instanceof pc) {
            return (pc)iInterface;
        }
        return new rc(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    return false;
                }
                this.c((zzvg)fc.a((Parcel)parcel, (Parcelable.Creator)zzvg.CREATOR));
            } else {
                this.a(parcel.readInt());
            }
        } else {
            IInterface iInterface;
            IBinder iBinder = parcel.readStrongBinder();
            Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd")) instanceof lc ? (lc)iInterface : new nc(iBinder));
            this.a(object);
        }
        parcel2.writeNoException();
        return true;
    }
}

