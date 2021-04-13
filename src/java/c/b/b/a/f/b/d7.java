/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.d.z8
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReference
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.d.z8;
import c.b.b.a.e.d.zb;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.t3;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;
import c.b.b.a.f.b.x2;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.atomic.AtomicReference;

public final class d7
implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ zb b;
    public final /* synthetic */ y7 c;

    public d7(y7 y72, zzp zzp2, zb zb2) {
        this.c = y72;
        this.a = zzp2;
        this.b = zb2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        block11 : {
            block10 : {
                block12 : {
                    var1_1 = null;
                    try {
                        z8.c();
                        var5_2 = this.c.a.g.c(null, u2.w0);
                        var1_1 = null;
                        if (var5_2) {
                            var6_3 = this.c.a.m().p().c();
                            var1_1 = null;
                            if (!var6_3) {
                                this.c.a.a().k.a("Analytics storage consent denied; will not get app instance id");
                                this.c.a.o().g.set(null);
                                this.c.a.m().l.a(null);
                                break block10;
                            }
                        }
                        ** try [egrp 2[TRYBLOCK] [6 : 136->243)] { 
lbl15: // 1 sources:
                    }
                    catch (Throwable var3_4) {
                        break block11;
                    }
lbl18: // 2 sources:
                    catch (RemoteException var2_5) {
                        break block12;
                    }
                    var7_6 = this.c.d;
                    var1_1 = null;
                    if (var7_6 == null) {
                        this.c.a.a().f.a("Failed to get app instance id");
                        var1_1 = null;
                    } else {
                        a.a(this.a);
                        var1_1 = var7_6.d(this.a);
                        if (var1_1 != null) {
                            this.c.a.o().g.set((Object)var1_1);
                            this.c.a.m().l.a(var1_1);
                        }
                        this.c.r();
                    }
                    break block10;
                }
                this.c.a.a().f.a("Failed to get app instance id", (Object)var2_5);
            }
            this.c.a.p().a(this.b, var1_1);
            return;
        }
        this.c.a.p().a(this.b, var1_1);
        throw var3_4;
    }
}

