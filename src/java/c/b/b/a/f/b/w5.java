/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReference
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.o7;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.atomic.AtomicReference;

public final class w5
implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ j6 d;

    public w5(j6 j62, AtomicReference atomicReference, String string, String string2) {
        this.d = j62;
        this.a = atomicReference;
        this.b = string;
        this.c = string2;
    }

    public final void run() {
        y7 y72 = this.d.a.v();
        AtomicReference atomicReference = this.a;
        String string = this.b;
        String string2 = this.c;
        y72.g();
        y72.h();
        zzp zzp2 = y72.a(false);
        o7 o72 = new o7(y72, atomicReference, string, string2, zzp2);
        y72.a(o72);
    }
}

