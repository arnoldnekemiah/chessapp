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

public final class vd
extends ee<ve> {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzvs c;
    public final /* synthetic */ String d;
    public final /* synthetic */ od e;

    public vd(od od2, Context context, zzvs zzvs2, String string) {
        this.e = od2;
        this.b = context;
        this.c = zzvs2;
        this.d = string;
    }

    public final /* synthetic */ Object a() {
        od.a((Context)this.b, (String)"search");
        return new c();
    }

    public final /* synthetic */ Object a(gf gf2) {
        return gf2.a(new b<Context>(this.b), this.c, this.d, 204204000);
    }

    public final /* synthetic */ Object b() {
        return this.e.a.a(this.b, this.c, this.d, null, 3);
    }
}

