/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.g5
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.internal.ads.zzavj
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.d5;
import c.b.b.a.e.a.e2;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.f5;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.g5;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.sa;
import c.b.b.a.e.a.w9;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzvg;

public abstract class e5
extends gc
implements b5 {
    public e5() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static b5 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (iInterface instanceof b5) {
            return (b5)iInterface;
        }
        return new d5(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        switch (n10) {
            default: {
                return false;
            }
            case 24: {
                this.i((zzvg)fc.a((Parcel)parcel, (Parcelable.Creator)zzvg.CREATOR));
                break;
            }
            case 23: {
                this.b((zzvg)fc.a((Parcel)parcel, (Parcelable.Creator)zzvg.CREATOR));
                break;
            }
            case 22: {
                this.a(parcel.readInt(), parcel.readString());
                break;
            }
            case 21: {
                this.m(parcel.readString());
                break;
            }
            case 20: {
                this.onVideoPlay();
                break;
            }
            case 19: {
                this.zzb((Bundle)fc.a((Parcel)parcel, (Parcelable.Creator)Bundle.CREATOR));
                break;
            }
            case 18: {
                this.z0();
                break;
            }
            case 17: {
                this.d(parcel.readInt());
                break;
            }
            case 16: {
                this.a(sa.a(parcel.readStrongBinder()));
                break;
            }
            case 15: {
                this.onVideoPause();
                break;
            }
            case 14: {
                this.a((zzavj)fc.a((Parcel)parcel, (Parcelable.Creator)zzavj.CREATOR));
                break;
            }
            case 13: {
                this.P();
                break;
            }
            case 12: {
                this.c(parcel.readString());
                break;
            }
            case 11: {
                this.D();
                break;
            }
            case 10: {
                this.a(e2.a(parcel.readStrongBinder()), parcel.readString());
                break;
            }
            case 9: {
                this.onAppEvent(parcel.readString(), parcel.readString());
                break;
            }
            case 8: {
                this.onAdImpression();
                break;
            }
            case 7: {
                IInterface iInterface;
                IBinder iBinder = parcel.readStrongBinder();
                Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata")) instanceof g5 ? (g5)iInterface : new f5(iBinder));
                this.a(object);
                break;
            }
            case 6: {
                this.onAdLoaded();
                break;
            }
            case 5: {
                this.onAdOpened();
                break;
            }
            case 4: {
                this.onAdLeftApplication();
                break;
            }
            case 3: {
                this.onAdFailedToLoad(parcel.readInt());
                break;
            }
            case 2: {
                this.onAdClosed();
                break;
            }
            case 1: {
                this.onAdClicked();
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

