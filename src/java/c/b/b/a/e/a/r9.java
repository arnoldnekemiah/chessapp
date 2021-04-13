/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.s9
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.s9;
import c.b.b.a.e.a.u9;

public abstract class r9
extends gc
implements s9 {
    public static s9 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (iInterface instanceof s9) {
            return (s9)iInterface;
        }
        return new u9(iBinder);
    }
}

