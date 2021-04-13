/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  c.b.b.a.c.a
 *  java.lang.Object
 */
package c.b.b.a.e.d;

import android.app.Activity;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.d.e0;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.w;
import c.b.b.a.e.d.wb;
import c.b.b.a.e.d.x9;
import c.b.b.a.e.d.zb;

public final class c0
extends w {
    public final /* synthetic */ Activity e;
    public final /* synthetic */ x9 f;
    public final /* synthetic */ e0 g;

    public c0(e0 e02, Activity activity, x9 x92) {
        this.g = e02;
        this.e = activity;
        this.f = x92;
        super(e02.a, true);
    }

    @Override
    public final void a() {
        this.g.a.h.onActivitySaveInstanceState(new b<Activity>(this.e), (zb)((Object)this.f), this.b);
    }
}

