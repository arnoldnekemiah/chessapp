/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.tf
 *  com.google.android.gms.ads.MuteThisAdReason
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.tf;
import com.google.android.gms.ads.MuteThisAdReason;

public final class yf
implements MuteThisAdReason {
    public final String a;
    public tf b;

    public yf(tf tf2) {
        String string;
        this.b = tf2;
        try {
            string = tf2.getDescription();
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            string = null;
        }
        this.a = string;
    }

    public final String getDescription() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }
}

