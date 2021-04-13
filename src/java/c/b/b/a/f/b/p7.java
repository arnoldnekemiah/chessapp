/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.a.e.d.zb;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.x2;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;
import java.util.List;

public final class p7
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzp c;
    public final /* synthetic */ zb d;
    public final /* synthetic */ y7 e;

    public p7(y7 y72, String string, String string2, zzp zzp2, zb zb2) {
        this.e = y72;
        this.a = string;
        this.b = string2;
        this.c = zzp2;
        this.d = zb2;
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
                    var1_1 = new ArrayList<Bundle>();
                    try {
                        var4_2 = this.e.d;
                        if (var4_2 == null) {
                            this.e.a.a().f.a("Failed to get conditional properties; not connected to service", this.a, this.b);
                            break block6;
                        }
                        ** try [egrp 2[TRYBLOCK] [4 : 75->116)] { 
lbl8: // 1 sources:
                    }
                    catch (Throwable var3_3) {
                        break block7;
                    }
lbl11: // 2 sources:
                    catch (RemoteException var2_4) {
                        break block8;
                    }
                    a.a(this.c);
                    var1_1 = g9.a(var4_2.a(this.a, this.b, this.c));
                    this.e.r();
                    break block6;
                }
                this.e.a.a().f.a("Failed to get conditional properties; remote exception", this.a, this.b, (Object)var2_4);
            }
            this.e.a.p().a(this.d, var1_1);
            return;
        }
        this.e.a.p().a(this.d, var1_1);
        throw var3_3;
    }
}

