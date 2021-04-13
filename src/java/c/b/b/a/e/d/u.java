/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Long
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.os.Bundle;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.w;
import c.b.b.a.e.d.wb;

public final class u
extends w {
    public final /* synthetic */ Long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ f0 k;

    public u(f0 f02, Long l10, String string, String string2, Bundle bundle, boolean bl, boolean bl2) {
        this.k = f02;
        this.e = l10;
        this.f = string;
        this.g = string2;
        this.h = bundle;
        this.i = bl;
        this.j = bl2;
        super(f02, true);
    }

    @Override
    public final void a() {
        Long l10 = this.e;
        long l11 = l10 == null ? this.a : l10;
        long l12 = l11;
        this.k.h.logEvent(this.f, this.g, this.h, this.i, this.j, l12);
    }
}

