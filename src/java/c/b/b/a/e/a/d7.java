/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.view.View
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.o6
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.mediation.MediationAdLoadCallback
 *  com.google.android.gms.ads.mediation.MediationBannerAd
 *  com.google.android.gms.ads.mediation.MediationBannerAdCallback
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import android.view.View;
import c.b.b.a.c.b;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.j7;
import c.b.b.a.e.a.o6;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.internal.ads.zzvg;

public final class d7
implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {
    public final /* synthetic */ o6 a;
    public final /* synthetic */ b5 b;

    public d7(o6 o62, b5 b52) {
        this.a = o62;
        this.b = b52;
    }

    public final void onFailure(AdError adError) {
        try {
            this.a.a(adError.zzdq());
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final void onFailure(String string) {
        try {
            this.a.a(string);
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final /* synthetic */ Object onSuccess(Object object) {
        MediationBannerAd mediationBannerAd = (MediationBannerAd)object;
        if (mediationBannerAd == null) {
            a.i("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.a.a("Adapter returned null.");
            }
            catch (RemoteException remoteException) {
                a.a("", remoteException);
            }
            return null;
        }
        try {
            this.a.y(new b<View>(mediationBannerAd.getView()));
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
        }
        return new j7(this.b);
    }
}

