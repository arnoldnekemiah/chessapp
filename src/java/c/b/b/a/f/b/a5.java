/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.y6;

public final class a5
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ b5 e;

    public a5(b5 b52, String string, String string2, String string3, long l2) {
        this.e = b52;
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = l2;
    }

    public final void run() {
        String string = this.a;
        if (string == null) {
            this.e.a.j.u().a(this.b, null);
            return;
        }
        q6 q62 = new q6(this.c, string, this.d);
        this.e.a.j.u().a(this.b, q62);
    }
}

