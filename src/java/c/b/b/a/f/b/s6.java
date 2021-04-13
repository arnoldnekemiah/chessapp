/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.y6;

public final class s6
implements Runnable {
    public final /* synthetic */ q6 a;
    public final /* synthetic */ q6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ y6 e;

    public s6(y6 y62, q6 q62, q6 q63, long l2, boolean bl) {
        this.e = y62;
        this.a = q62;
        this.b = q63;
        this.c = l2;
        this.d = bl;
    }

    public final void run() {
        this.e.a(this.a, this.b, this.c, this.d, null);
    }
}

