/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractMap
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NavigableMap
 *  java.util.Set
 *  java.util.SortedMap
 *  java.util.TreeMap
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.m7;
import c.b.b.a.e.d.o7;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class p7<K extends Comparable<K>, V>
extends AbstractMap<K, V> {
    public final int a;
    public List<m7> b;
    public Map<K, V> c;
    public boolean d;
    public volatile o7 e;
    public Map<K, V> f;

    public /* synthetic */ p7(int n2) {
        this.a = n2;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    public static /* synthetic */ void a(p7 p72) {
        p72.c();
    }

    public final int a(K k2) {
        int n2 = -1 + this.b.size();
        int n6 = 0;
        if (n2 >= 0) {
            int n10 = k2.compareTo((Object)((m7)this.b.get((int)n2)).a);
            if (n10 > 0) {
                return -(n2 + 2);
            }
            if (n10 != 0) {
                n6 = 0;
            } else {
                return n2;
            }
        }
        while (n6 <= n2) {
            int n11 = (n6 + n2) / 2;
            int n12 = k2.compareTo((Object)((m7)this.b.get((int)n11)).a);
            if (n12 < 0) {
                n2 = n11 - 1;
                continue;
            }
            if (n12 > 0) {
                n6 = n11 + 1;
                continue;
            }
            return n11;
        }
        return -(n6 + 1);
    }

    public final V a(K k2, V v2) {
        int n2;
        int n6;
        this.c();
        int n10 = this.a(k2);
        if (n10 >= 0) {
            m7 m72 = (m7)this.b.get(n10);
            m72.c.c();
            Object object = m72.b;
            m72.b = v2;
            return (V)object;
        }
        this.c();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        if ((n2 = -(n10 + 1)) >= this.a) {
            return (V)this.d().put(k2, v2);
        }
        int n11 = this.b.size();
        if (n11 == (n6 = this.a)) {
            m7 m73 = (m7)this.b.remove(n6 - 1);
            this.d().put((Object)m73.a, m73.b);
        }
        this.b.add(n2, (Object)new m7(this, (Comparable)k2, v2));
        return null;
    }

    public final Map.Entry<K, V> a(int n2) {
        return (Map.Entry)this.b.get(n2);
    }

    public void a() {
        if (!this.d) {
            Map map = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
            this.c = map;
            Map map2 = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
            this.f = map2;
            this.d = true;
        }
    }

    public final int b() {
        return this.b.size();
    }

    public final V b(int n2) {
        this.c();
        Object object = ((m7)this.b.remove((int)n2)).b;
        if (!this.c.isEmpty()) {
            Iterator iterator = this.d().entrySet().iterator();
            List<m7> list = this.b;
            Map.Entry entry = (Map.Entry)iterator.next();
            list.add((Object)new m7(this, (Comparable)entry.getKey(), entry.getValue()));
            iterator.remove();
        }
        return (V)object;
    }

    public final void c() {
        if (!this.d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.c();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    public final boolean containsKey(Object object) {
        Comparable comparable = (Comparable)object;
        return this.a((K)comparable) >= 0 || this.c.containsKey((Object)comparable);
        {
        }
    }

    public final SortedMap<K, V> d() {
        this.c();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap;
            this.c = treeMap = new TreeMap();
            this.f = treeMap.descendingMap();
        }
        return (SortedMap)this.c;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new o7(this);
        }
        return this.e;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p7)) {
            return super.equals(object);
        }
        p7 p72 = (p7)((Object)object);
        int n2 = this.size();
        if (n2 != p72.size()) {
            return false;
        }
        int n6 = this.b();
        if (n6 == p72.b()) {
            for (int i2 = 0; i2 < n6; ++i2) {
                if (this.a(i2).equals(p72.a(i2))) continue;
                return false;
            }
            if (n6 != n2) {
                return this.c.equals(p72.c);
            }
            return true;
        }
        return this.entrySet().equals(p72.entrySet());
    }

    public final V get(Object object) {
        Comparable comparable = (Comparable)object;
        int n2 = this.a((K)comparable);
        if (n2 >= 0) {
            return (V)((m7)this.b.get((int)n2)).b;
        }
        return (V)this.c.get((Object)comparable);
    }

    public final int hashCode() {
        int n2 = this.b();
        int n6 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n6 += ((m7)this.b.get(i2)).hashCode();
        }
        if (this.c.size() > 0) {
            return n6 + this.c.hashCode();
        }
        return n6;
    }

    public final V remove(Object object) {
        this.c();
        Comparable comparable = (Comparable)object;
        int n2 = this.a((K)comparable);
        if (n2 >= 0) {
            return this.b(n2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return (V)this.c.remove((Object)comparable);
    }

    public final int size() {
        return this.b.size() + this.c.size();
    }
}

