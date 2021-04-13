/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.j6;

public final class q5
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ j6 e;

    public q5(j6 j62, String string, String string2, Object object, long l2) {
        this.e = j62;
        this.a = string;
        this.b = string2;
        this.c = object;
        this.d = l2;
    }

    public final void run() {
        this.e.a(this.a, this.b, this.c, this.d);
    }
}

