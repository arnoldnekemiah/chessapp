/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.g.d
 *  c.b.d.g.e
 *  c.b.d.g.f
 *  c.b.d.g.g
 *  c.b.d.g.l
 *  c.b.d.g.m
 *  c.b.d.g.n
 *  c.b.d.g.o
 *  c.b.d.h.c
 *  c.b.d.h.d
 *  c.b.d.j.a
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package c.b.d.g;

import c.b.d.g.a;
import c.b.d.g.d;
import c.b.d.g.e;
import c.b.d.g.f;
import c.b.d.g.g;
import c.b.d.g.h;
import c.b.d.g.i;
import c.b.d.g.j;
import c.b.d.g.l;
import c.b.d.g.m;
import c.b.d.g.n;
import c.b.d.g.o;
import c.b.d.g.p;
import c.b.d.g.s;
import c.b.d.g.t;
import c.b.d.g.u;
import c.b.d.g.v;
import c.b.d.h.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class k
extends a {
    public static final c.b.d.j.a<Set<Object>> e = j.a;
    public final Map<d<?>, t<?>> a = new HashMap();
    public final Map<Class<?>, t<?>> b = new HashMap();
    public final Map<Class<?>, t<Set<?>>> c = new HashMap();
    public final s d;

    public /* varargs */ k(Executor executor, Iterable<g> iterable, d<?> ... arrd) {
        p p10;
        this.d = new s(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)d.a((Object)this.d, s.class, (Class[])new Class[]{c.b.d.h.d.class, c.class}));
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            arrayList.addAll((Collection)((g)iterator.next()).getComponents());
        }
        for (d<?> d6 : arrd) {
            if (d6 == null) continue;
            arrayList.add(d6);
        }
        HashMap hashMap = new HashMap(arrayList.size());
        for (d d8 : arrayList) {
            m m6 = new m(d8);
            for (Class class_ : d8.a) {
                Set set;
                n n9 = new n(class_, true ^ d8.a(), null);
                if (!hashMap.containsKey((Object)n9)) {
                    hashMap.put((Object)n9, (Object)new HashSet());
                }
                if (!(set = (Set)hashMap.get((Object)n9)).isEmpty() && !n9.b) {
                    throw new IllegalArgumentException(String.format((String)"Multiple components provide %s.", (Object[])new Object[]{class_}));
                }
                set.add((Object)m6);
            }
        }
        Iterator iterator2 = hashMap.values().iterator();
        while (iterator2.hasNext()) {
            for (m m7 : (Set)iterator2.next()) {
                for (o o10 : m7.a.b) {
                    Set set;
                    boolean bl = o10.c == 0;
                    if (!bl || (set = (Set)hashMap.get((Object)new n(o10.a, o10.a(), null))) == null) continue;
                    for (m m10 : set) {
                        m7.b.add((Object)m10);
                        m10.c.add((Object)m7);
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator iterator3 = hashMap.values().iterator();
        while (iterator3.hasNext()) {
            hashSet.addAll((Collection)((Set)iterator3.next()));
        }
        HashSet hashSet2 = new HashSet();
        for (m m11 : hashSet) {
            if (!m11.a()) continue;
            hashSet2.add((Object)m11);
        }
        int n10 = 0;
        while (!hashSet2.isEmpty()) {
            m m12 = (m)hashSet2.iterator().next();
            hashSet2.remove((Object)m12);
            ++n10;
            for (m m13 : m12.b) {
                m13.c.remove((Object)m12);
                if (!m13.a()) continue;
                hashSet2.add((Object)m13);
            }
        }
        if (n10 == arrayList.size()) {
            for (d d10 : arrayList) {
                t t10 = new t(new h(this, d10));
                this.a.put((Object)d10, t10);
            }
            for (Map.Entry entry : this.a.entrySet()) {
                d d11 = (d)entry.getKey();
                if (!d11.a()) continue;
                t t11 = (t)entry.getValue();
                for (Class class_ : d11.a) {
                    this.b.put((Object)class_, (Object)t11);
                }
            }
            for (d d12 : this.a.keySet()) {
                for (o o11 : d12.b) {
                    boolean bl = o11.b == 1;
                    if (!bl || this.b.containsKey((Object)o11.a)) continue;
                    Object[] arrobject = new Object[]{d12, o11.a};
                    throw new u(String.format((String)"Unsatisfied dependency for component %s: %s", (Object[])arrobject));
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                d d13 = (d)entry.getKey();
                if (d13.a()) continue;
                t t12 = (t)entry.getValue();
                for (Class class_ : d13.a) {
                    if (!hashMap2.containsKey((Object)class_)) {
                        hashMap2.put((Object)class_, (Object)new HashSet());
                    }
                    ((Set)hashMap2.get((Object)class_)).add((Object)t12);
                }
            }
            for (Map.Entry entry : hashMap2.entrySet()) {
                Set set = (Set)entry.getValue();
                this.c.put((Object)((Class)entry.getKey()), new t(new i(set)));
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (m m14 : hashSet) {
            if (m14.a() || m14.b.isEmpty()) continue;
            arrayList2.add((Object)m14.a);
        }
        p10 = new p((List<d<?>>)arrayList2);
        throw p10;
    }

    public static /* synthetic */ Object a(k k5, d d6) {
        return d6.e.a((e)new v(d6, k5));
    }

    public static /* synthetic */ Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            hashSet.add(((t)iterator.next()).get());
        }
        return Collections.unmodifiableSet((Set)hashSet);
    }

    public <T> c.b.d.j.a<T> b(Class<T> class_) {
        a.c.a.a.a(class_, "Null interface requested.");
        return (c.b.d.j.a)this.b.get(class_);
    }

    public <T> c.b.d.j.a<Set<T>> d(Class<T> class_) {
        t t10 = (t)this.c.get(class_);
        if (t10 != null) {
            return t10;
        }
        return e;
    }
}

