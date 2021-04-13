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

public final class e6
implements Runnable {
    public final /* synthetic */ f a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ j6 f;

    public e6(j6 j62, f f2, long l2, int n2, long l10, boolean bl) {
        this.f = j62;
        this.a = f2;
        this.b = l2;
        this.c = n2;
        this.d = l10;
        this.e = bl;
    }

    public final void run() {
        this.f.a(this.a);
        this.f.a(this.b, false);
        j6.a(this.f, this.a, this.c, this.d, true, this.e);
    }
}

