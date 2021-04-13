/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.c.a
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.w;
import c.b.b.a.e.d.wb;

public final class p
extends w {
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ f0 g;

    public p(f0 f02, String string, Object object) {
        this.g = f02;
        this.e = string;
        this.f = object;
        super(f02, false);
    }

    @Override
    public final void a() {
        this.g.h.logHealthData(5, this.e, new b<Object>(this.f), new b<Object>(null), new b<Object>(null));
    }
}

