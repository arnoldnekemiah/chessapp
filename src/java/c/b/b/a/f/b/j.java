/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.e5;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.k;
import c.b.b.a.f.b.v9;

public final class j
implements Runnable {
    public final /* synthetic */ e5 a;
    public final /* synthetic */ k b;

    public j(k k2, e5 e52) {
        this.b = k2;
        this.a = e52;
    }

    public final void run() {
        this.a.c();
        if (v9.a()) {
            this.a.d().a(this);
            return;
        }
        boolean bl = this.b.c != 0L;
        this.b.c = 0L;
        if (bl) {
            this.b.a();
        }
    }
}

