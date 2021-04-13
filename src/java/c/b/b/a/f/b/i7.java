/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  com.google.android.gms.measurement.internal.zzas
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package c.b.b.a.f.b;

import android.os.RemoteException;
import c.b.b.a.e.d.zb;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.x2;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.zzas;

public final class i7
implements Runnable {
    public final /* synthetic */ zzas a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zb c;
    public final /* synthetic */ y7 d;

    public i7(y7 y72, zzas zzas2, String string, zb zb2) {
        this.d = y72;
        this.a = zzas2;
        this.b = string;
        this.c = zb2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        block7 : {
            block6 : {
                block8 : {
                    var1_1 = null;
                    try {
                        var4_2 = this.d.d;
                        var1_1 = null;
                        if (var4_2 == null) {
                            this.d.a.a().f.a("Discarding data. Failed to send event to service to bundle");
                            break block6;
                        }
                        ** try [egrp 2[TRYBLOCK] [4 : 63->89)] { 
lbl9: // 1 sources:
                    }
                    catch (Throwable var3_3) {
                        break block7;
                    }
lbl12: // 2 sources:
                    catch (RemoteException var2_4) {
                        break block8;
                    }
                    var1_1 = var4_2.a(this.a, this.b);
                    this.d.r();
                    break block6;
                }
                this.d.a.a().f.a("Failed to send event to the service to bundle", (Object)var2_4);
            }
            this.d.a.p().a(this.c, var1_1);
            return;
        }
        this.d.a.p().a(this.c, var1_1);
        throw var3_3;
    }
}

