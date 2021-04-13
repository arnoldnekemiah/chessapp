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
 *  c.b.b.a.e.a.gf
 *  c.b.b.a.e.a.od
 *  c.b.b.a.e.a.se
 *  c.b.b.a.e.a.te
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
import c.b.b.a.e.a.cd;
import c.b.b.a.e.a.ee;
import c.b.b.a.e.a.gf;
import c.b.b.a.e.a.od;
import c.b.b.a.e.a.se;
import c.b.b.a.e.a.te;
import c.b.b.a.e.a.ue;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.zg;

public final class xd
extends ee<se> {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ v4 d;
    public final /* synthetic */ od e;

    public xd(od od2, Context context, String string, v4 v42) {
        this.e = od2;
        this.b = context;
        this.c = string;
        this.d = v42;
    }

    public final /* synthetic */ Object a() {
        od.a((Context)this.b, (String)"native_ad");
        return new zg();
    }

    public final /* synthetic */ Object a(gf gf2) {
        return gf2.a(new b<Context>(this.b), this.c, this.d, 204204000);
    }

    public final /* synthetic */ Object b() {
        Object object;
        block6 : {
            cd cd2 = this.e.b;
            Context context = this.b;
            String string = this.c;
            v4 v42 = this.d;
            if (cd2 != null) {
                void var6_11;
                IBinder iBinder;
                block5 : {
                    b<Context> b7 = new b<Context>(context);
                    iBinder = ((te)cd2.a(context)).b(b7, string, v42, 204204000);
                    if (iBinder != null) break block5;
                    return null;
                }
                try {
                    IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    object = iInterface instanceof se ? (se)iInterface : new ue(iBinder);
                    break block6;
                }
                catch (c.a a6) {
                }
                catch (RemoteException remoteException) {
                    // empty catch block
                }
                a.c.a.a.b("Could not create remote builder for AdLoader.", (Throwable)var6_11);
                return null;
            }
            throw null;
        }
        return object;
    }
}

