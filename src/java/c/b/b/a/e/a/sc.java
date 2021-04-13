/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.tc
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.FullScreenContentCallback
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.mc;
import c.b.b.a.e.a.tc;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.internal.ads.zzvg;

public abstract class sc
extends gc
implements tc {
    public sc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    return false;
                }
                zzvg zzvg2 = (zzvg)fc.a((Parcel)parcel, (Parcelable.Creator)zzvg.CREATOR);
                FullScreenContentCallback fullScreenContentCallback = ((mc)this).a;
                if (fullScreenContentCallback != null) {
                    fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzvg2.c());
                }
            } else {
                FullScreenContentCallback fullScreenContentCallback = ((mc)this).a;
                if (fullScreenContentCallback != null) {
                    fullScreenContentCallback.onAdDismissedFullScreenContent();
                }
            }
        } else {
            FullScreenContentCallback fullScreenContentCallback = ((mc)this).a;
            if (fullScreenContentCallback != null) {
                fullScreenContentCallback.onAdShowedFullScreenContent();
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

