/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.l8
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.l8;
import c.b.b.a.e.a.m8;

public final class n8
extends gc
implements l8 {
    public static l8 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (iInterface instanceof l8) {
            return (l8)iInterface;
        }
        return new m8(iBinder);
    }
}

