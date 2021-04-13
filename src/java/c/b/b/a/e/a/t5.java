/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.b5
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.mediation.MediationAdLoadCallback
 *  com.google.android.gms.ads.mediation.MediationRewardedAd
 *  com.google.android.gms.ads.mediation.MediationRewardedAdCallback
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.r5;
import c.b.b.a.e.a.ta;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.internal.ads.zzvg;

public final class t5
implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    public final /* synthetic */ b5 a;
    public final /* synthetic */ r5 b;

    public t5(r5 r52, b5 b52) {
        this.b = r52;
        this.a = b52;
    }

    public final void onFailure(AdError adError) {
        try {
            String string = this.b.a.getClass().getCanonicalName();
            int n10 = adError.getCode();
            String string2 = adError.getMessage();
            String string3 = adError.getDomain();
            StringBuilder stringBuilder = new StringBuilder(87 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length());
            stringBuilder.append(string);
            stringBuilder.append("failed to loaded mediation ad: ErrorCode = ");
            stringBuilder.append(n10);
            stringBuilder.append(". ErrorMessage = ");
            stringBuilder.append(string2);
            stringBuilder.append(". ErrorDomain = ");
            stringBuilder.append(string3);
            a.g(stringBuilder.toString());
            this.a.b(adError.zzdq());
            this.a.a(adError.getCode(), adError.getMessage());
            this.a.onAdFailedToLoad(adError.getCode());
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final void onFailure(String string) {
        try {
            String string2 = this.b.a.getClass().getCanonicalName();
            StringBuilder stringBuilder = new StringBuilder(31 + String.valueOf((Object)string2).length() + String.valueOf((Object)string).length());
            stringBuilder.append(string2);
            stringBuilder.append("failed to loaded mediation ad: ");
            stringBuilder.append(string);
            a.g(stringBuilder.toString());
            this.a.a(0, string);
            this.a.onAdFailedToLoad(0);
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final /* synthetic */ Object onSuccess(Object object) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd)object;
        try {
            this.b.e = mediationRewardedAd;
            this.a.onAdLoaded();
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
        }
        return new ta(this.a);
    }
}

