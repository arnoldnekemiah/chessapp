/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.os.Bundle;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.w;
import c.b.b.a.e.d.wb;

public final class c
extends w {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Bundle g;
    public final /* synthetic */ f0 h;

    public c(f0 f02, String string, String string2, Bundle bundle) {
        this.h = f02;
        this.e = string;
        this.f = string2;
        this.g = bundle;
        super(f02, true);
    }

    @Override
    public final void a() {
        this.h.h.clearConditionalUserProperty(this.e, this.f, this.g);
    }
}

