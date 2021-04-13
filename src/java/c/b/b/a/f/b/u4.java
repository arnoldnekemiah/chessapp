/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  com.google.android.gms.measurement.internal.zzas
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import com.google.android.gms.measurement.internal.zzas;

public final class u4
implements Runnable {
    public final /* synthetic */ zzas a;
    public final /* synthetic */ String b;
    public final /* synthetic */ b5 c;

    public u4(b5 b52, zzas zzas2, String string) {
        this.c = b52;
        this.a = zzas2;
        this.b = string;
    }

    public final void run() {
        this.c.a.h();
        this.c.a.a(this.a, this.b);
    }
}

