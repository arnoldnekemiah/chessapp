/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.c4
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.lang.ref.ReferenceQueue
 *  java.util.List
 *  java.util.concurrent.ConcurrentHashMap
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.c4;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class d4 {
    public final ConcurrentHashMap<c4, List<Throwable>> a = new ConcurrentHashMap(16, 0.75f, 10);
    public final ReferenceQueue<Throwable> b = new ReferenceQueue();
}

