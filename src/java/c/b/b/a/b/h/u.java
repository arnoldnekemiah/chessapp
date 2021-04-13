/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.c.a
 *  java.lang.String
 */
package c.b.b.a.b.h;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.b.h.v;
import c.b.b.a.b.h.w;
import c.b.b.a.e.c.a;

public abstract class u
extends a
implements v {
    public static v a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (iInterface instanceof v) {
            return (v)iInterface;
        }
        return new w(iBinder);
    }
}

