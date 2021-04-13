/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.b.b
 *  java.lang.String
 */
package c.b.b.a.e.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.b.b;
import c.b.b.a.e.b.d;

public abstract class c
extends Binder
implements b,
IInterface {
    public static b a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (iInterface instanceof b) {
            return (b)iInterface;
        }
        return new d(iBinder);
    }
}

