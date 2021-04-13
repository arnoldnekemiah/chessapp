/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.bf
 *  c.b.b.a.e.a.gc
 *  com.google.android.gms.ads.reward.AdMetadataListener
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.bf;
import c.b.b.a.e.a.df;
import c.b.b.a.e.a.gc;
import com.google.android.gms.ads.reward.AdMetadataListener;

public final class dd
extends gc
implements bf {
    public final AdMetadataListener a;

    public dd(AdMetadataListener adMetadataListener) {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        this.a = adMetadataListener;
    }

    public static bf a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        if (iInterface instanceof bf) {
            return (bf)iInterface;
        }
        return new df(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            this.onAdMetadataChanged();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public final void onAdMetadataChanged() {
        AdMetadataListener adMetadataListener = this.a;
        if (adMetadataListener != null) {
            adMetadataListener.onAdMetadataChanged();
        }
    }
}

