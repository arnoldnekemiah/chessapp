/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.q.l.c
 *  androidx.work.ListenableWorker
 *  androidx.work.ListenableWorker$a
 *  c.b.c.a.a.a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.i.r;

import a.i.h;
import a.i.r.m;
import a.i.r.p.j;
import a.i.r.q.l.c;
import androidx.work.ListenableWorker;
import c.b.c.a.a.a;

public class k
implements Runnable {
    public final /* synthetic */ c a;
    public final /* synthetic */ m b;

    public k(m m2, c c2) {
        this.b = m2;
        this.a = c2;
    }

    public void run() {
        try {
            h h2 = h.a();
            String string = m.s;
            Object[] arrobject = new Object[]{this.b.e.c};
            h2.a(string, String.format((String)"Starting work for %s", (Object[])arrobject), new Throwable[0]);
            this.b.q = this.b.f.startWork();
            this.a.b(this.b.q);
            return;
        }
        catch (Throwable throwable) {
            this.a.a(throwable);
            return;
        }
    }
}

