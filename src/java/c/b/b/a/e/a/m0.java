/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.i0
 *  c.b.b.a.e.a.l0
 *  com.google.android.gms.ads.doubleclick.CustomRenderedAd
 *  com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.i0;
import c.b.b.a.e.a.j0;
import c.b.b.a.e.a.k0;
import c.b.b.a.e.a.l0;
import c.b.b.a.e.a.n0;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

public final class m0
extends gc
implements l0 {
    public final OnCustomRenderedAdLoadedListener a;

    public m0(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        this.a = onCustomRenderedAdLoadedListener;
    }

    public static l0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (iInterface instanceof l0) {
            return (l0)iInterface;
        }
        return new n0(iBinder);
    }

    public final void a(i0 i02) {
        this.a.onCustomRenderedAdLoaded((CustomRenderedAd)new j0(i02));
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            IInterface iInterface;
            IBinder iBinder = parcel.readStrongBinder();
            Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd")) instanceof i0 ? (i0)iInterface : new k0(iBinder));
            this.a(object);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

