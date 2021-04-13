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

public final class m4
implements Callable<List<e9>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b5 d;

    public m4(b5 b52, String string, String string2, String string3) {
        this.d = b52;
        this.a = string;
        this.b = string2;
        this.c = string3;
    }

    public final Object call() {
        this.d.a.h();
        return this.d.a.n().a(this.a, this.b, this.c);
    }
}

