/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.y3
 *  com.google.android.gms.ads.mediation.InitializationCompleteCallback
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.y3;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

public final class u5
implements InitializationCompleteCallback {
    public final /* synthetic */ y3 a;

    public u5(y3 y32) {
        this.a = y32;
    }

    public final void onInitializationFailed(String string) {
        try {
            this.a.onInitializationFailed(string);
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.a.onInitializationSucceeded();
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }
}

