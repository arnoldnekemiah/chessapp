/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.h1
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.h1;
import c.b.b.a.e.a.j1;

public abstract class k1
extends gc
implements h1 {
    public static h1 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        if (iInterface instanceof h1) {
            return (h1)iInterface;
        }
        return new j1(iBinder);
    }
}

