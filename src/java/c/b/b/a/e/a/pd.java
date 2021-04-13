/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.c.c
 *  c.b.b.a.c.c$a
 *  c.b.b.a.e.a.c8
 *  c.b.b.a.e.a.ee
 *  c.b.b.a.e.a.gf
 *  c.b.b.a.e.a.h8
 *  c.b.b.a.e.a.od
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package c.b.b.a.e.a;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.c.c;
import c.b.b.a.e.a.c8;
import c.b.b.a.e.a.d8;
import c.b.b.a.e.a.e8;
import c.b.b.a.e.a.ee;
import c.b.b.a.e.a.gf;
import c.b.b.a.e.a.h8;
import c.b.b.a.e.a.od;

public final class pd
extends ee<c8> {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ od c;

    public pd(od od2, Activity activity) {
        this.c = od2;
        this.b = activity;
    }

    public final /* synthetic */ Object a() {
        od.a((Context)this.b, (String)"ad_overlay");
        return null;
    }

    public final /* synthetic */ Object a(gf gf2) {
        return gf2.g(new b<Activity>(this.b));
    }

    public final /* synthetic */ Object b() {
        Object object;
        block6 : {
            d8 d82 = this.c.f;
            Activity activity = this.b;
            if (d82 != null) {
                void var4_9;
                IBinder iBinder;
                block5 : {
                    b<Activity> b7 = new b<Activity>(activity);
                    iBinder = ((h8)d82.a((Context)activity)).s(b7);
                    if (iBinder != null) break block5;
                    return null;
                }
                try {
                    IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    object = iInterface instanceof c8 ? (c8)iInterface : new e8(iBinder);
                    break block6;
                }
                catch (c.a a6) {
                }
                catch (RemoteException remoteException) {
                    // empty catch block
                }
                a.c.a.a.b("Could not create remote AdOverlay.", (Throwable)var4_9);
                return null;
            }
            throw null;
        }
        return object;
    }
}

