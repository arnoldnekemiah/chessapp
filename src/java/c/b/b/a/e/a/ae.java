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
 *  c.b.b.a.e.a.of
 *  c.b.b.a.e.a.pf
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
import c.b.b.a.e.a.ah;
import c.b.b.a.e.a.e;
import c.b.b.a.e.a.ee;
import c.b.b.a.e.a.gf;
import c.b.b.a.e.a.od;
import c.b.b.a.e.a.of;
import c.b.b.a.e.a.pf;
import c.b.b.a.e.a.qf;

public final class ae
extends ee<of> {
    public final /* synthetic */ Context b;
    public final /* synthetic */ od c;

    public ae(od od2, Context context) {
        this.c = od2;
        this.b = context;
    }

    public final /* synthetic */ Object a() {
        od.a((Context)this.b, (String)"mobile_ads_settings");
        return new e();
    }

    public final /* synthetic */ Object a(gf gf2) {
        return gf2.c(new b<Context>(this.b), 204204000);
    }

    public final /* synthetic */ Object b() {
        Object object;
        block6 : {
            ah ah2 = this.c.c;
            Context context = this.b;
            if (ah2 != null) {
                void var4_9;
                IBinder iBinder;
                block5 : {
                    b<Context> b2 = new b<Context>(context);
                    iBinder = ((pf)ah2.a(context)).e(b2, 204204000);
                    if (iBinder != null) break block5;
                    return null;
                }
                try {
                    IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                    object = iInterface instanceof of ? (of)iInterface : new qf(iBinder);
                    break block6;
                }
                catch (c.a a5) {
                }
                catch (RemoteException remoteException) {
                    // empty catch block
                }
                a.c.a.a.b("Could not get remote MobileAdsSettingManager.", (Throwable)var4_9);
                return null;
            }
            throw null;
        }
        return object;
    }
}

