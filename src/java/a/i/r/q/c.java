/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.k$b$a
 *  a.i.k$b$c
 *  a.i.r.b
 *  a.i.r.c
 *  a.i.r.j
 *  a.i.r.p.c
 *  a.i.r.p.l
 *  androidx.work.impl.WorkDatabase
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 */
package a.i.r.q;

import a.i.k;
import a.i.n;
import a.i.r.b;
import a.i.r.d;
import a.i.r.j;
import a.i.r.p.l;
import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Exception performing whole class analysis.
 */
public abstract class c
implements Runnable {
    public final b a;

    public c() {
        this.a = new b();
    }

    public abstract void a();

    public void a(j j2, String string) {
        WorkDatabase workDatabase = j2.c;
        a.i.r.p.k k2 = workDatabase.k();
        a.i.r.p.b b2 = workDatabase.h();
        LinkedList linkedList = new LinkedList();
        linkedList.add((Object)string);
        while (!linkedList.isEmpty()) {
            l l2 = (l)k2;
            String string2 = (String)linkedList.remove();
            n n2 = l2.a(string2);
            if (n2 != n.c && n2 != n.d) {
                l2.a(n.f, new String[]{string2});
            }
            linkedList.addAll((Collection)((a.i.r.p.c)b2).a(string2));
        }
        j2.f.c(string);
        Iterator iterator = j2.e.iterator();
        while (iterator.hasNext()) {
            ((d)iterator.next()).a(string);
        }
    }

    public void run() {
        try {
            this.a();
            this.a.a((k.b)k.a);
            return;
        }
        catch (Throwable throwable) {
            this.a.a((k.b)new /* Unavailable Anonymous Inner Class!! */);
            return;
        }
    }
}

