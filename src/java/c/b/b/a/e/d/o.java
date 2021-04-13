/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.os.Bundle;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.w;
import c.b.b.a.e.d.wb;
import c.b.b.a.e.d.x9;
import c.b.b.a.e.d.zb;

public final class o
extends w {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ x9 h;
    public final /* synthetic */ f0 i;

    public o(f0 f02, String string, String string2, boolean bl, x9 x92) {
        this.i = f02;
        this.e = string;
        this.f = string2;
        this.g = bl;
        this.h = x92;
        super(f02, true);
    }

    @Override
    public final void a() {
        this.i.h.getUserProperties(this.e, this.f, this.g, (zb)((Object)this.h));
    }

    @Override
    public final void b() {
        this.h.zzb(null);
    }
}

