/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  com.google.android.gms.measurement.internal.zzaa
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.concurrent.Callable
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import c.b.b.a.f.b.i;
import com.google.android.gms.measurement.internal.zzaa;
import java.util.List;
import java.util.concurrent.Callable;

public final class o4
implements Callable<List<zzaa>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b5 d;

    public o4(b5 b52, String string, String string2, String string3) {
        this.d = b52;
        this.a = string;
        this.b = string2;
        this.c = string3;
    }

    public final Object call() {
        this.d.a.h();
        return this.d.a.n().b(this.a, this.b, this.c);
    }
}

