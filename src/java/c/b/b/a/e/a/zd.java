/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  android.widget.FrameLayout
 *  c.b.b.a.c.a
 *  c.b.b.a.c.c
 *  c.b.b.a.c.c$a
 *  c.b.b.a.e.a.ee
 *  c.b.b.a.e.a.gf
 *  c.b.b.a.e.a.od
 *  c.b.b.a.e.a.p1
 *  c.b.b.a.e.a.q1
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package c.b.b.a.e.a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.c.c;
import c.b.b.a.e.a.ee;
import c.b.b.a.e.a.g;
import c.b.b.a.e.a.gf;
import c.b.b.a.e.a.j3;
import c.b.b.a.e.a.od;
import c.b.b.a.e.a.p1;
import c.b.b.a.e.a.q1;
import c.b.b.a.e.a.r1;

public final class zd
extends ee<p1> {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ od e;

    public zd(od od2, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.e = od2;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = context;
    }

    public final /* synthetic */ Object a() {
        od.a((Context)this.d, (String)"native_ad_view_delegate");
        return new g();
    }

    public final /* synthetic */ Object a(gf gf2) {
        return gf2.a(new b<FrameLayout>(this.b), new b<FrameLayout>(this.c));
    }

    public final /* synthetic */ Object b() {
        Object object;
        block6 : {
            j3 j32 = this.e.d;
            Context context = this.d;
            FrameLayout frameLayout = this.b;
            FrameLayout frameLayout2 = this.c;
            if (j32 != null) {
                void var8_13;
                IBinder iBinder;
                block5 : {
                    b<Context> b7 = new b<Context>(context);
                    b<FrameLayout> b10 = new b<FrameLayout>(frameLayout);
                    b<FrameLayout> b11 = new b<FrameLayout>(frameLayout2);
                    iBinder = ((q1)j32.a(context)).a(b7, b10, b11, 204204000);
                    if (iBinder != null) break block5;
                    return null;
                }
                try {
                    IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                    object = iInterface instanceof p1 ? (p1)iInterface : new r1(iBinder);
                    break block6;
                }
                catch (c.a a6) {
                }
                catch (RemoteException remoteException) {
                    // empty catch block
                }
                a.c.a.a.b("Could not create remote NativeAdViewDelegate.", (Throwable)var8_13);
                return null;
            }
            throw null;
        }
        return object;
    }
}

