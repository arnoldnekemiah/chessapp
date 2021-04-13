/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  android.view.View
 *  c.b.b.a.c.a
 *  c.b.b.a.c.c
 *  c.b.b.a.c.c$a
 *  c.b.b.a.e.a.ee
 *  c.b.b.a.e.a.gf
 *  c.b.b.a.e.a.od
 *  c.b.b.a.e.a.s1
 *  c.b.b.a.e.a.x1
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 */
package c.b.b.a.e.a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.c.c;
import c.b.b.a.e.a.ee;
import c.b.b.a.e.a.gf;
import c.b.b.a.e.a.i3;
import c.b.b.a.e.a.j;
import c.b.b.a.e.a.od;
import c.b.b.a.e.a.s1;
import c.b.b.a.e.a.u1;
import c.b.b.a.e.a.x1;
import java.util.HashMap;

public final class ce
extends ee<s1> {
    public final /* synthetic */ View b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ od e;

    public ce(od od2, View view, HashMap hashMap, HashMap hashMap2) {
        this.e = od2;
        this.b = view;
        this.c = hashMap;
        this.d = hashMap2;
    }

    public final /* synthetic */ Object a() {
        od.a((Context)this.b.getContext(), (String)"native_ad_view_holder_delegate");
        return new j();
    }

    public final /* synthetic */ Object a(gf gf2) {
        return gf2.b(new b<View>(this.b), new b<HashMap>(this.c), new b<HashMap>(this.d));
    }

    public final /* synthetic */ Object b() {
        Object object;
        block6 : {
            i3 i32 = this.e.g;
            View view = this.b;
            HashMap hashMap = this.c;
            HashMap hashMap2 = this.d;
            if (i32 != null) {
                void var8_13;
                IBinder iBinder;
                block5 : {
                    b<View> b2 = new b<View>(view);
                    b<HashMap> b7 = new b<HashMap>(hashMap);
                    b<HashMap> b10 = new b<HashMap>(hashMap2);
                    iBinder = ((x1)i32.a(view.getContext())).c(b2, b7, b10);
                    if (iBinder != null) break block5;
                    return null;
                }
                try {
                    IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
                    object = iInterface instanceof s1 ? (s1)iInterface : new u1(iBinder);
                    break block6;
                }
                catch (c.a a6) {
                }
                catch (RemoteException remoteException) {
                    // empty catch block
                }
                a.c.a.a.b("Could not create remote NativeAdViewHolderDelegate.", (Throwable)var8_13);
                return null;
            }
            throw null;
        }
        return object;
    }
}

