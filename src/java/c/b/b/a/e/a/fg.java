/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.gc
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.eg;
import c.b.b.a.e.a.gc;

public abstract class fg
extends gc
implements cg {
    public static cg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        if (iInterface instanceof cg) {
            return (cg)iInterface;
        }
        return new eg(iBinder);
    }
}

