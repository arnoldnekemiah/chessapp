/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.da
 *  c.b.b.a.e.a.kb
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.da;
import c.b.b.a.e.a.ga;
import c.b.b.a.e.a.kb;

public final class qa
implements kb {
    public static final kb a = new qa();

    public final Object a(Object object) {
        IBinder iBinder = (IBinder)object;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (iInterface instanceof da) {
            return (da)iInterface;
        }
        return new ga(iBinder);
    }
}

