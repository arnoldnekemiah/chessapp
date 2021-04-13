/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.c
 *  a.i.r.j
 *  a.i.r.p.l
 *  androidx.work.impl.WorkDatabase
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.i.r.q;

import a.i.h;
import a.i.n;
import a.i.r.c;
import a.i.r.p.k;
import a.i.r.p.l;
import androidx.work.impl.WorkDatabase;

public class j
implements Runnable {
    public static final String c = h.a("StopWorkRunnable");
    public a.i.r.j a;
    public String b;

    public j(a.i.r.j j2, String string) {
        this.a = j2;
        this.b = string;
    }

    public void run() {
        WorkDatabase workDatabase = this.a.c;
        k k2 = workDatabase.k();
        workDatabase.c();
        String string = this.b;
        l l2 = (l)k2;
        try {
            if (l2.a(string) == n.b) {
                n n2 = n.a;
                String[] arrstring = new String[]{this.b};
                l2.a(n2, arrstring);
            }
            boolean bl = this.a.f.d(this.b);
            h h2 = h.a();
            String string2 = c;
            Object[] arrobject = new Object[]{this.b, bl};
            h2.a(string2, String.format((String)"StopWorkRunnable for %s; Processor.stopWork = %s", (Object[])arrobject), new Throwable[0]);
            workDatabase.g();
            return;
        }
        finally {
            workDatabase.d();
        }
    }
}

