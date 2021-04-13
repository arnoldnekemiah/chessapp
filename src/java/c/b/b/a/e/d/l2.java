/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.d.j3;
import c.b.b.a.e.d.m1;
import c.b.b.a.e.d.t;

public abstract class l2
extends t
implements j3 {
    public static j3 a(IBinder iBinder) {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (iInterface instanceof j3) {
            return (j3)iInterface;
        }
        return new m1(iBinder);
    }
}

