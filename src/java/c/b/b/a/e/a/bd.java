/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  android.util.Log
 *  c.b.b.a.c.a
 *  c.b.b.a.c.c
 *  c.b.b.a.c.c$a
 *  c.b.b.a.e.a.af
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.ve
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package c.b.b.a.e.a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.c.c;
import c.b.b.a.e.a.af;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.ve;
import c.b.b.a.e.a.xe;
import c.b.b.a.e.a.ze;
import com.google.android.gms.internal.ads.zzvs;

public final class bd
extends c<af> {
    public bd() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final ve a(Context context, zzvs zzvs2, String string, v4 v42, int n10) {
        IBinder iBinder;
        block6 : {
            b<Context> b2 = new b<Context>(context);
            iBinder = ((af)this.a(context)).a(b2, zzvs2, string, v42, 204204000, n10);
            if (iBinder != null) break block6;
            return null;
        }
        try {
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterface instanceof ve) {
                return (ve)iInterface;
            }
            xe xe2 = new xe(iBinder);
            return xe2;
        }
        catch (c.a a5) {
        }
        catch (RemoteException remoteException) {
            // empty catch block
        }
        if (a.c.a.a.d(3)) {
            void var7_12;
            Log.d((String)"Ads", (String)"Could not create remote AdManager.", (Throwable)var7_12);
        }
        return null;
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (iInterface instanceof af) {
            return (af)iInterface;
        }
        return new ze(iBinder);
    }
}

