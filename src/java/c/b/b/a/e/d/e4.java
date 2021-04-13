/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.b4
 *  c.b.b.a.e.d.c4
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.Reference
 *  java.lang.ref.ReferenceQueue
 *  java.util.List
 *  java.util.Vector
 *  java.util.concurrent.ConcurrentHashMap
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.b4;
import c.b.b.a.e.d.c4;
import c.b.b.a.e.d.d4;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public final class e4
extends b4 {
    public final d4 a = new d4();

    public final void a(Throwable throwable, Throwable throwable2) {
        IllegalArgumentException illegalArgumentException;
        if (throwable2 != throwable) {
            List list;
            Reference reference;
            d4 d42 = this.a;
            while ((reference = d42.b.poll()) != null) {
                d42.a.remove((Object)reference);
            }
            c4 c42 = new c4(throwable, null);
            List list2 = (List)d42.a.get((Object)c42);
            if (list2 == null && (list = (List)d42.a.putIfAbsent((Object)new c4(throwable, d42.b), (Object)(list2 = new Vector(2)))) != null) {
                list2 = list;
            }
            list2.add((Object)throwable2);
            return;
        }
        illegalArgumentException = new IllegalArgumentException("Self suppression is not allowed.", throwable2);
        throw illegalArgumentException;
    }
}

