/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  c.b.b.a.c.a
 */
package c.b.b.a.e.d;

import android.app.Activity;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.d.e0;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.w;
import c.b.b.a.e.d.wb;

public final class d0
extends w {
    public final /* synthetic */ Activity e;
    public final /* synthetic */ e0 f;

    public d0(e0 e02, Activity activity) {
        this.f = e02;
        this.e = activity;
        super(e02.a, true);
    }

    @Override
    public final void a() {
        this.f.a.h.onActivityDestroyed(new b<Activity>(this.e), this.b);
    }
}

