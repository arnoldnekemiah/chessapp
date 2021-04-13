/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  com.google.android.gms.measurement.internal.zzkg
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
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
import com.google.android.gms.measurement.internal.zzkg;
import com.google.android.gms.measurement.internal.zzp;
import java.util.List;

public final class z6
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzp c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zb e;
    public final /* synthetic */ y7 f;

    public z6(y7 y72, String string, String string2, zzp zzp2, boolean bl, zb zb2) {
        this.f = y72;
        this.a = string;
        this.b = string2;
        this.c = zzp2;
        this.d = bl;
        this.e = zb2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        Bundle bundle;
        Throwable throwable;
        block14 : {
            Bundle bundle2;
            RemoteException remoteException;
            block15 : {
                block13 : {
                    List<zzkg> list;
                    block12 : {
                        x2 x22;
                        block11 : {
                            bundle = new Bundle();
                            x22 = this.f.d;
                            if (x22 != null) break block11;
                            this.f.a.a().f.a("Failed to get user properties; not connected to service", this.a, this.b);
                            this.f.a.p().a(this.e, bundle);
                            return;
                        }
                        try {
                            a.a(this.c);
                            list = x22.a(this.a, this.b, this.d, this.c);
                            bundle2 = new Bundle();
                            if (list != null) break block12;
                            break block13;
                        }
                        catch (Throwable throwable2) {
                            break block14;
                        }
                    }
                    for (zzkg zzkg2 : list) {
                        String string = zzkg2.e;
                        if (string != null) {
                            bundle2.putString(zzkg2.b, string);
                            continue;
                        }
                        Long l10 = zzkg2.d;
                        if (l10 != null) {
                            bundle2.putLong(zzkg2.b, l10.longValue());
                            continue;
                        }
                        Double d10 = zzkg2.g;
                        if (d10 == null) continue;
                        bundle2.putDouble(zzkg2.b, d10.doubleValue());
                    }
                }
                try {
                    this.f.r();
                }
                catch (RemoteException remoteException2) {
                    break block15;
                }
                this.f.a.p().a(this.e, bundle2);
                return;
                catch (RemoteException remoteException3) {
                    bundle2 = bundle;
                    remoteException = remoteException3;
                }
            }
            try {
                this.f.a.a().f.a("Failed to get user properties; remote exception", this.a, (Object)remoteException);
            }
            catch (Throwable throwable3) {
                throwable = throwable3;
                bundle = bundle2;
            }
            this.f.a.p().a(this.e, bundle2);
            return;
        }
        this.f.a.p().a(this.e, bundle);
        throw throwable;
    }
}

