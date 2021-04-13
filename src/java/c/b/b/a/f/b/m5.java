/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;

public final class m5
implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ j6 b;

    public m5(j6 j62, boolean bl) {
        this.b = j62;
        this.a = bl;
    }

    public final void run() {
        boolean bl = this.b.a.i();
        boolean bl2 = this.b.a.h();
        this.b.a.B = this.a;
        if (bl2 == this.a) {
            this.b.a.a().n.a("Default data collection state already set to", this.a);
        }
        if (this.b.a.i() == bl || this.b.a.i() != this.b.a.h()) {
            this.b.a.a().k.a("Default data collection is different than actual status", this.a, bl);
        }
        this.b.n();
    }
}

