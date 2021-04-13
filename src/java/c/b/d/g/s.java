/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.g.r
 *  c.b.d.h.a
 *  c.b.d.h.b
 *  c.b.d.h.c
 *  c.b.d.h.d
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Queue
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 */
package c.b.d.g;

import c.b.d.g.r;
import c.b.d.h.a;
import c.b.d.h.b;
import c.b.d.h.c;
import c.b.d.h.d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class s
implements d,
c {
    public final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a = new HashMap();
    public Queue<a<?>> b = new ArrayDeque();

    public s(Executor executor) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Set<Map.Entry<b<Object>, Executor>> a(a<?> a8) {
        s s10 = this;
        synchronized (s10) {
            block6 : {
                Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> map = this.a;
                if (a8 == null) break block6;
                Map map2 = (Map)map.get(null);
                if (map2 != null) return map2.entrySet();
                return Collections.emptySet();
            }
            throw null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a() {
        s s10 = this;
        // MONITORENTER : s10
        Queue<a<?>> queue = this.b;
        Queue<a<?>> queue2 = null;
        if (queue != null) {
            Queue<a<?>> queue3 = this.b;
            this.b = null;
            queue2 = queue3;
        }
        // MONITOREXIT : s10
        if (queue2 == null) return;
        Iterator iterator = queue2.iterator();
        while (iterator.hasNext()) {
            this.b((a)iterator.next());
        }
        return;
        {
            catch (Throwable throwable) {}
            {
                // MONITOREXIT : s10
                throw throwable;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public <T> void a(Class<T> class_, Executor executor, b<? super T> b6) {
        s s10 = this;
        // MONITORENTER : s10
        if (class_ == null) throw null;
        if (b6 == null) throw null;
        if (executor == null) throw null;
        if (!this.a.containsKey(class_)) {
            this.a.put(class_, (Object)new ConcurrentHashMap());
        }
        ((ConcurrentHashMap)this.a.get(class_)).put(b6, (Object)executor);
        // MONITOREXIT : s10
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(a<?> a8) {
        if (a8 == null) {
            throw null;
        }
        s s10 = this;
        synchronized (s10) {
            if (this.b != null) {
                this.b.add(a8);
                return;
            }
        }
        Iterator iterator = this.a(a8).iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            ((Executor)entry.getValue()).execute((Runnable)new r(entry, a8));
        }
        return;
    }
}

