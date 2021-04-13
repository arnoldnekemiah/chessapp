/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  c.b.b.a.c.a
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.app.Activity;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.w;
import c.b.b.a.e.d.wb;

public final class e
extends w {
    public final /* synthetic */ Activity e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ f0 h;

    public e(f0 f02, Activity activity, String string, String string2) {
        this.h = f02;
        this.e = activity;
        this.f = string;
        this.g = string2;
        super(f02, true);
    }

    @Override
    public final void a() {
        this.h.h.setCurrentScreen(new b<Activity>(this.e), this.f, this.g, this.a);
    }
}

