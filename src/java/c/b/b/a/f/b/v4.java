/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  com.google.android.gms.measurement.internal.zzas
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import c.b.b.a.f.b.o6;
import c.b.b.a.f.b.r8;
import com.google.android.gms.measurement.internal.zzas;
import java.util.concurrent.Callable;

public final class v4
implements Callable<byte[]> {
    public final /* synthetic */ zzas a;
    public final /* synthetic */ String b;
    public final /* synthetic */ b5 c;

    public v4(b5 b52, zzas zzas2, String string) {
        this.c = b52;
        this.a = zzas2;
        this.b = string;
    }

    public final Object call() {
        this.c.a.h();
        a9 a92 = this.c.a;
        a9.a((r8)a92.h);
        a92.h.g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}

