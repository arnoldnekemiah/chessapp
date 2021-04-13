/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.c8
 *  c.b.b.a.e.a.gc
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.c8;
import c.b.b.a.e.a.e8;
import c.b.b.a.e.a.gc;

public abstract class f8
extends gc
implements c8 {
    public static c8 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (iInterface instanceof c8) {
            return (c8)iInterface;
        }
        return new e8(iBinder);
    }
}

