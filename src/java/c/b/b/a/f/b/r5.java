/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReference
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.y7;
import java.util.concurrent.atomic.AtomicReference;

public final class r5
implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ j6 b;

    public r5(j6 j62, long l2) {
        this.b = j62;
        this.a = l2;
    }

    public final void run() {
        this.b.a(this.a, true);
        this.b.a.v().a((AtomicReference<String>)new AtomicReference());
    }
}

