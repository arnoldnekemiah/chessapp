/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.o.f.a
 *  a.i.r.o.f.b
 *  a.i.r.o.f.e
 *  a.i.r.o.f.f
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 */
package a.i.r.o.f;

import a.i.r.o.f.a;
import a.i.r.o.f.b;
import a.i.r.o.f.e;
import a.i.r.o.f.f;
import android.content.Context;

public class g {
    public static g e;
    public a a;
    public b b;
    public e c;
    public f d;

    public g(Context context, a.i.r.q.m.a a2) {
        Context context2 = context.getApplicationContext();
        this.a = new a(context2, a2);
        this.b = new b(context2, a2);
        this.c = new e(context2, a2);
        this.d = new f(context2, a2);
    }

    public static g a(Context context, a.i.r.q.m.a a2) {
        Class<g> class_ = g.class;
        synchronized (g.class) {
            if (e == null) {
                e = new g(context, a2);
            }
            g g2 = e;
            // ** MonitorExit[var4_2] (shouldn't be in output)
            return g2;
        }
    }
}

