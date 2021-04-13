/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.v6
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.mediation.MediationAdLoadCallback
 *  com.google.android.gms.ads.mediation.MediationRewardedAd
 *  com.google.android.gms.ads.mediation.MediationRewardedAdCallback
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.e7;
import c.b.b.a.e.a.j7;
import c.b.b.a.e.a.v6;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.internal.ads.zzvg;

public final class h7
implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    public final /* synthetic */ v6 a;
    public final /* synthetic */ b5 b;
    public final /* synthetic */ e7 c;

    public h7(e7 e72, v6 v62, b5 b52) {
        this.c = e72;
        this.a = v62;
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
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd)object;
        if (mediationRewardedAd == null) {
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
            this.c.c = mediationRewardedAd;
            this.a.y();
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
        }
        return new j7(this.b);
    }
}

