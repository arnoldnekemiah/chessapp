/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.c.c
 *  c.b.b.a.c.c$a
 *  c.b.b.a.e.a.ee
 *  c.b.b.a.e.a.g9
 *  c.b.b.a.e.a.gf
 *  c.b.b.a.e.a.h9
 *  c.b.b.a.e.a.od
 *  c.b.b.a.e.a.v4
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
import c.b.b.a.c.c;
import c.b.b.a.e.a.ee;
import c.b.b.a.e.a.g9;
import c.b.b.a.e.a.gf;
import c.b.b.a.e.a.h9;
import c.b.b.a.e.a.i9;
import c.b.b.a.e.a.k;
import c.b.b.a.e.a.m9;
import c.b.b.a.e.a.od;
import c.b.b.a.e.a.v4;

public final class be
extends ee<g9> {
    public final /* synthetic */ Context b;
    public final /* synthetic */ v4 c;
    public final /* synthetic */ od d;

    public be(od od2, Context context, v4 v42) {
        this.d = od2;
        this.b = context;
        this.c = v42;
    }

    public final /* synthetic */ Object a() {
        od.a((Context)this.b, (String)"rewarded_video");
        return new k();
    }

    public final /* synthetic */ Object a(gf gf2) {
        return gf2.e(new b<Context>(this.b), this.c, 204204000);
    }

    public final /* synthetic */ Object b() {
        Object object;
        block6 : {
            m9 m92 = this.d.e;
            Context context = this.b;
            v4 v42 = this.c;
            if (m92 != null) {
                void var5_10;
                IBinder iBinder;
                block5 : {
                    b<Context> b2 = new b<Context>(context);
                    iBinder = ((h9)m92.a(context)).d(b2, v42, 204204000);
                    if (iBinder != null) break block5;
                    return null;
                }
                try {
                    IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    object = iInterface instanceof g9 ? (g9)iInterface : new i9(iBinder);
                    break block6;
                }
                catch (c.a a5) {
                }
                catch (RemoteException remoteException) {
                    // empty catch block
                }
                a.c.a.a.b("Could not get remote RewardedVideoAd.", (Throwable)var5_10);
                return null;
            }
            throw null;
        }
        return object;
    }
}

