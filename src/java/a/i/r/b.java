/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package a.i.r;

import a.e.f;
import a.i.k;
import a.i.r.q.l.c;

public class b
implements k {
    public final f<k.b> c = new f();
    public final c<k.b.c> d = new c();

    public b() {
        this.a(k.b);
    }

    public void a(k.b b2) {
        this.c.a(b2);
        if (b2 instanceof k.b.c) {
            this.d.c(b2);
            return;
        }
        if (b2 instanceof k.b.a) {
            k.b.a a5 = b2;
            this.d.a(a5.a);
        }
    }
}

