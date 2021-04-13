/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.tf
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.tf;
import c.b.b.a.e.a.vf;

public abstract class wf
extends gc
implements tf {
    public static tf a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (iInterface instanceof tf) {
            return (tf)iInterface;
        }
        return new vf(iBinder);
    }
}

