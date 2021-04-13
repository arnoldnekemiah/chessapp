/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.da
 *  c.b.b.a.e.a.ee
 *  c.b.b.a.e.a.gf
 *  c.b.b.a.e.a.jb
 *  c.b.b.a.e.a.kb
 *  c.b.b.a.e.a.od
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.x9
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package c.b.b.a.e.a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.da;
import c.b.b.a.e.a.ee;
import c.b.b.a.e.a.gf;
import c.b.b.a.e.a.i;
import c.b.b.a.e.a.jb;
import c.b.b.a.e.a.kb;
import c.b.b.a.e.a.od;
import c.b.b.a.e.a.qa;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.x9;
import c.b.b.a.e.a.z9;

public final class qd
extends ee<x9> {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ v4 d;

    public qd(od od2, Context context, String string, v4 v42) {
        this.b = context;
        this.c = string;
        this.d = v42;
    }

    public final /* synthetic */ Object a() {
        od.a((Context)this.b, (String)"rewarded");
        return new i();
    }

    public final /* synthetic */ Object a(gf gf2) {
        return gf2.c(new b<Context>(this.b), this.c, this.d, 204204000);
    }

    public final /* synthetic */ Object b() {
        Object object;
        block5 : {
            void var5_10;
            IBinder iBinder;
            block4 : {
                Context context = this.b;
                String string = this.c;
                v4 v42 = this.d;
                b<Context> b7 = new b<Context>(context);
                iBinder = ((da)a.c.a.a.a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", qa.a)).d(b7, string, v42, 204204000);
                if (iBinder != null) break block4;
                return null;
            }
            try {
                IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                object = iInterface instanceof x9 ? (x9)iInterface : new z9(iBinder);
                break block5;
            }
            catch (RemoteException remoteException) {
            }
            catch (jb jb2) {
                // empty catch block
            }
            a.c.a.a.c("#007 Could not call remote method.", (Throwable)var5_10);
            return null;
        }
        return object;
    }
}

