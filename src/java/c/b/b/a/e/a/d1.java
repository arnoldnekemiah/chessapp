/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.e1
 *  c.b.b.a.e.a.gc
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.e1;
import c.b.b.a.e.a.g1;
import c.b.b.a.e.a.gc;

public abstract class d1
extends gc
implements e1 {
    public static e1 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (iInterface instanceof e1) {
            return (e1)iInterface;
        }
        return new g1(iBinder);
    }
}

