/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ee
 *  c.b.b.a.e.a.gf
 *  c.b.b.a.e.a.od
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.ve
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.content.Context;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.bd;
import c.b.b.a.e.a.c;
import c.b.b.a.e.a.ee;
import c.b.b.a.e.a.gf;
import c.b.b.a.e.a.od;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.ve;
import com.google.android.gms.internal.ads.zzvs;

public final class wd
extends ee<ve> {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzvs c;
    public final /* synthetic */ String d;
    public final /* synthetic */ v4 e;
    public final /* synthetic */ od f;

    public wd(od od2, Context context, zzvs zzvs2, String string, v4 v42) {
        this.f = od2;
        this.b = context;
        this.c = zzvs2;
        this.d = string;
        this.e = v42;
    }

    public final /* synthetic */ Object a() {
        od.a((Context)this.b, (String)"app_open");
        return new c();
    }

    public final /* synthetic */ Object a(gf gf2) {
        return gf2.b(new b<Context>(this.b), this.c, this.d, this.e, 204204000);
    }

    public final /* synthetic */ Object b() {
        return this.f.a.a(this.b, this.c, this.d, this.e, 4);
    }
}

