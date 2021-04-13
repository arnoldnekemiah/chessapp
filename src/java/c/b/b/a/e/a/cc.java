/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.ac
 *  c.b.b.a.e.a.bc
 *  c.b.b.a.e.a.yb
 *  java.io.PrintWriter
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.Reference
 *  java.lang.ref.ReferenceQueue
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.ConcurrentHashMap
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.ac;
import c.b.b.a.e.a.bc;
import c.b.b.a.e.a.yb;
import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class cc
extends yb {
    public final bc a = new bc();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Throwable throwable, PrintWriter printWriter) {
        Reference reference;
        throwable.printStackTrace(printWriter);
        bc bc2 = this.a;
        while ((reference = bc2.b.poll()) != null) {
            bc2.a.remove((Object)reference);
        }
        ac ac2 = new ac(throwable, null);
        List list = (List)bc2.a.get((Object)ac2);
        if (list == null) {
            return;
        }
        List list2 = list;
        synchronized (list2) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                Throwable throwable2 = (Throwable)iterator.next();
                printWriter.print("Suppressed: ");
                throwable2.printStackTrace(printWriter);
            }
            return;
        }
    }
}

