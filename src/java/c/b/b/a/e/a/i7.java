/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.a7
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.mediation.rtb.SignalCallbacks
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.a7;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.internal.ads.zzvg;

public final class i7
implements SignalCallbacks {
    public final /* synthetic */ a7 a;

    public i7(a7 a72) {
        this.a = a72;
    }

    public final void onFailure(AdError adError) {
        try {
            this.a.g(adError.zzdq());
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final void onFailure(String string) {
        try {
            this.a.onFailure(string);
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final void onSuccess(String string) {
        try {
            this.a.j(string);
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }
}

