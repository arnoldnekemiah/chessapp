/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.i4;
import java.util.ArrayList;
import java.util.List;

public final class c8
implements Runnable {
    public final /* synthetic */ a9 a;
    public final /* synthetic */ Runnable b;

    public c8(a9 a92, Runnable runnable) {
        this.a = a92;
        this.b = runnable;
    }

    public final void run() {
        this.a.h();
        a9 a92 = this.a;
        Runnable runnable = this.b;
        a92.j.d().g();
        if (a92.n == null) {
            a92.n = new ArrayList();
        }
        a92.n.add((Object)runnable);
        this.a.g();
    }
}

