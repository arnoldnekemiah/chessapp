/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.qc
 *  com.google.android.gms.ads.appopen.AppOpenAdPresentationCallback
 *  java.lang.Deprecated
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Parcel;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.qc;
import com.google.android.gms.ads.appopen.AppOpenAdPresentationCallback;

@Deprecated
public final class kc
extends gc
implements qc {
    public final AppOpenAdPresentationCallback a;

    public kc(AppOpenAdPresentationCallback appOpenAdPresentationCallback) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
        this.a = appOpenAdPresentationCallback;
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            this.a.onAppOpenAdClosed();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

