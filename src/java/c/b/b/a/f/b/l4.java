/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzkg
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzkg;
import com.google.android.gms.measurement.internal.zzp;

public final class l4
implements Runnable {
    public final /* synthetic */ zzaa a;
    public final /* synthetic */ b5 b;

    public l4(b5 b52, zzaa zzaa2) {
        this.b = b52;
        this.a = zzaa2;
    }

    public final void run() {
        this.b.a.h();
        if (this.a.c.a() == null) {
            a9 a92 = this.b.a;
            zzaa zzaa2 = this.a;
            if (a92 != null) {
                zzp zzp2 = a92.a(zzaa2.a);
                if (zzp2 != null) {
                    a92.b(zzaa2, zzp2);
                }
                return;
            }
            throw null;
        }
        a9 a93 = this.b.a;
        zzaa zzaa3 = this.a;
        if (a93 != null) {
            zzp zzp3 = a93.a(zzaa3.a);
            if (zzp3 != null) {
                a93.a(zzaa3, zzp3);
            }
            return;
        }
        throw null;
    }
}

