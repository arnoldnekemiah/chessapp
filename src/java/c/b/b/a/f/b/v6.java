/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f7;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.y6;
import c.b.b.a.f.b.y7;

public final class v6
implements Runnable {
    public final /* synthetic */ q6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ y6 c;

    public v6(y6 y62, q6 q62, long l10) {
        this.c = y62;
        this.a = q62;
        this.b = l10;
    }

    public final void run() {
        this.c.a(this.a, false, this.b);
        y6 y62 = this.c;
        y62.e = null;
        y7 y72 = y62.a.v();
        y72.g();
        y72.h();
        y72.a(new f7(y72, null));
    }
}

