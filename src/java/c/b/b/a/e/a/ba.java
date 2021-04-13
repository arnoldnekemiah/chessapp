/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.ca
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.ca;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.w9;
import c.b.b.a.e.a.y9;
import com.google.android.gms.internal.ads.zzvg;

public abstract class ba
extends gc
implements ca {
    public ba() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    if (n10 != 4) {
                        if (n10 != 5) {
                            return false;
                        }
                        this.j((zzvg)fc.a((Parcel)parcel, (Parcelable.Creator)zzvg.CREATOR));
                    } else {
                        this.c(parcel.readInt());
                    }
                } else {
                    IInterface iInterface;
                    IBinder iBinder = parcel.readStrongBinder();
                    Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem")) instanceof w9 ? (w9)iInterface : new y9(iBinder));
                    this.a(object);
                }
            } else {
                this.h0();
            }
        } else {
            this.H0();
        }
        parcel2.writeNoException();
        return true;
    }
}

