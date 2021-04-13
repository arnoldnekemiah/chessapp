/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Collection
 *  java.util.ConcurrentModificationException
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package a.b;

import a.b.e;
import a.b.f;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

public class a<K, V>
extends f<K, V>
implements Map<K, V> {
    public e<K, V> h;

    public a() {
    }

    public a(int n4) {
        super(n4);
    }

    public final e<K, V> b() {
        if (this.h == null) {
            this.h = new e<K, V>(){

                @Override
                public int a(Object object) {
                    return a.this.a(object);
                }

                @Override
                public Object a(int n4, int n10) {
                    return a.this.b[n10 + (n4 << 1)];
                }

                @Override
                public V a(int n4, V v2) {
                    a a5 = a.this;
                    int n10 = 1 + (n4 << 1);
                    Object[] arrobject = a5.b;
                    Object object = arrobject[n10];
                    arrobject[n10] = v2;
                    return (V)object;
                }

                @Override
                public void a() {
                    a.this.clear();
                }

                @Override
                public void a(int n4) {
                    a.this.c(n4);
                }

                @Override
                public void a(K k2, V v2) {
                    a.this.put(k2, v2);
                }

                @Override
                public int b(Object object) {
                    return a.this.b(object);
                }

                @Override
                public Map<K, V> b() {
                    return a.this;
                }

                @Override
                public int c() {
                    return a.this.c;
                }
            };
        }
        return this.h;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        e<K, V> e6 = this.b();
        if (e6.a == null) {
            e6.a = new e.b(e6);
        }
        return e6.a;
    }

    public Set<K> keySet() {
        e<K, V> e6 = this.b();
        if (e6.b == null) {
            e6.b = new e.c(e6);
        }
        return e6.b;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        ConcurrentModificationException concurrentModificationException;
        int n4 = this.c + map.size();
        int n10 = this.c;
        int[] arrn = this.a;
        if (arrn.length < n4) {
            Object[] arrobject = this.b;
            this.a(n4);
            if (this.c > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)this.a, (int)0, (int)n10);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.b, (int)0, (int)(n10 << 1));
            }
            f.a(arrn, arrobject, n10);
        }
        if (this.c == n10) {
            for (Map.Entry entry : map.entrySet()) {
                this.put(entry.getKey(), entry.getValue());
            }
            return;
        }
        concurrentModificationException = new ConcurrentModificationException();
        throw concurrentModificationException;
    }

    public Collection<V> values() {
        e<K, V> e6 = this.b();
        if (e6.c == null) {
            e6.c = new e.e(e6);
        }
        return e6.c;
    }

}

