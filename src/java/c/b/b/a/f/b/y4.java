/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.concurrent.Callable
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import c.b.b.a.f.b.e9;
import c.b.b.a.f.b.i;
import java.util.List;
import java.util.concurrent.Callable;

public final class y4
implements Callable<List<e9>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ b5 b;

    public y4(b5 b52, String string) {
        this.b = b52;
        this.a = string;
    }

    public final Object call() {
        this.b.a.h();
        return this.b.a.n().c(this.a);
    }
}

