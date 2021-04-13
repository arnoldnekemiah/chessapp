/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.f;
import c.b.b.a.f.b.j6;

public final class g6
implements Runnable {
    public final /* synthetic */ f a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ j6 e;

    public g6(j6 j62, f f2, int n2, long l2, boolean bl) {
        this.e = j62;
        this.a = f2;
        this.b = n2;
        this.c = l2;
        this.d = bl;
    }

    public final void run() {
        this.e.a(this.a);
        j6.a(this.e, this.a, this.b, this.c, false, this.d);
    }
}

