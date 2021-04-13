/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.x2;
import c.b.b.a.f.b.x7;
import c.b.b.a.f.b.y7;

public final class t7
implements Runnable {
    public final /* synthetic */ x2 a;
    public final /* synthetic */ x7 b;

    public t7(x7 x72, x2 x22) {
        this.b = x72;
        this.a = x22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        x7 x72;
        x7 x73 = x72 = this.b;
        synchronized (x73) {
            this.b.a = false;
            if (!this.b.c.t()) {
                this.b.c.a.a().m.a("Connected to remote service");
                y7 y72 = this.b.c;
                x2 x22 = this.a;
                y72.g();
                a.a(x22);
                y72.d = x22;
                y72.r();
                y72.s();
            }
            return;
        }
    }
}

