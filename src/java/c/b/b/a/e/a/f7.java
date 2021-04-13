/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.o5
 *  c.b.b.a.e.a.s6
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.mediation.MediationAdLoadCallback
 *  com.google.android.gms.ads.mediation.MediationNativeAdCallback
 *  com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.j7;
import c.b.b.a.e.a.o5;
import c.b.b.a.e.a.p6;
import c.b.b.a.e.a.s6;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzvg;

public final class f7
implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {
    public final /* synthetic */ s6 a;
    public final /* synthetic */ b5 b;

    public f7(s6 s62, b5 b52) {
        this.a = s62;
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
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper)object;
        if (unifiedNativeAdMapper == null) {
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
            this.a.a((o5)new p6(unifiedNativeAdMapper));
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
        }
        return new j7(this.b);
    }
}

