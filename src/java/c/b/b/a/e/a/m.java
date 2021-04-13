/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.xf
 *  com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.xf;
import c.b.b.a.e.a.zf;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

public final class m
extends gc
implements xf {
    public final OnAdMetadataChangedListener a;

    public m(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        this.a = onAdMetadataChangedListener;
    }

    public static xf a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        if (iInterface instanceof xf) {
            return (xf)iInterface;
        }
        return new zf(iBinder);
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
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.a;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}

