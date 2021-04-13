/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Array
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NoSuchElementException
 *  java.util.Set
 */
package a.b;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class e<K, V> {
    public e<K, V> a;
    public e<K, V> b;
    public e<K, V> c;

    /*
     * Exception decompiling
     */
    public static <T> boolean a(Set<T> var0, Object var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl27.1 : ICONST_0 : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public abstract int a(Object var1);

    public abstract Object a(int var1, int var2);

    public abstract V a(int var1, V var2);

    public abstract void a();

    public abstract void a(int var1);

    public abstract void a(K var1, V var2);

    public <T> T[] a(T[] arrobject, int n2) {
        int n3 = this.c();
        if (arrobject.length < n3) {
            arrobject = (Object[])Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)n3);
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            arrobject[i2] = this.a(i2, n2);
        }
        if (arrobject.length > n3) {
            arrobject[n3] = null;
        }
        return arrobject;
    }

    public abstract int b(Object var1);

    public abstract Map<K, V> b();

    public Object[] b(int n2) {
        int n3 = this.c();
        Object[] arrobject = new Object[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrobject[i2] = this.a(i2, n2);
        }
        return arrobject;
    }

    public abstract int c();

    public final class a<T>
    implements Iterator<T> {
        public final int a;
        public int b;
        public int c;
        public boolean d = false;

        public a(int n2) {
            this.a = n2;
            this.b = e.this.c();
        }

        public boolean hasNext() {
            return this.c < this.b;
        }

        public T next() {
            if (this.hasNext()) {
                Object object = e.this.a(this.c, this.a);
                this.c = 1 + this.c;
                this.d = true;
                return (T)object;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.d) {
                int n2;
                this.c = n2 = -1 + this.c;
                this.b = -1 + this.b;
                this.d = false;
                e.this.a(n2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final class b
    implements Set<Map.Entry<K, V>> {
        public boolean add(Object object) {
            (Map.Entry)object;
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int n2 = e.this.c();
            for (Map.Entry entry : collection) {
                e.this.a(entry.getKey(), entry.getValue());
            }
            return n2 != e.this.c();
        }

        public void clear() {
            e.this.a();
        }

        public boolean contains(Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry)object;
            int n2 = e.this.a(entry.getKey());
            if (n2 < 0) {
                return false;
            }
            return a.b.d.a(e.this.a(n2, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (this.contains(iterator.next())) continue;
                return false;
            }
            return true;
        }

        public boolean equals(Object object) {
            return e.a(this, object);
        }

        public int hashCode() {
            int n2 = 0;
            for (int i2 = e.this.c() - 1; i2 >= 0; --i2) {
                Object object = e.this.a(i2, 0);
                Object object2 = e.this.a(i2, 1);
                int n3 = object == null ? 0 : object.hashCode();
                int n4 = object2 == null ? 0 : object2.hashCode();
                n2 += n3 ^ n4;
            }
            return n2;
        }

        public boolean isEmpty() {
            return e.this.c() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return e.this.c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] arrT) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c
    implements Set<K> {
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            e.this.a();
        }

        public boolean contains(Object object) {
            return e.this.a(object) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Map map = e.this.b();
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (map.containsKey(iterator.next())) continue;
                return false;
            }
            return true;
        }

        public boolean equals(Object object) {
            return e.a(this, object);
        }

        public int hashCode() {
            int n2 = 0;
            for (int i2 = -1 + e.this.c(); i2 >= 0; --i2) {
                Object object = e.this.a(i2, 0);
                int n3 = object == null ? 0 : object.hashCode();
                n2 += n3;
            }
            return n2;
        }

        public boolean isEmpty() {
            return e.this.c() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object object) {
            int n2 = e.this.a(object);
            if (n2 >= 0) {
                e.this.a(n2);
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            Map map = e.this.b();
            int n2 = map.size();
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                map.remove(iterator.next());
            }
            return n2 != map.size();
        }

        public boolean retainAll(Collection<?> collection) {
            Map map = e.this.b();
            int n2 = map.size();
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                if (collection.contains(iterator.next())) continue;
                iterator.remove();
            }
            return n2 != map.size();
        }

        public int size() {
            return e.this.c();
        }

        public Object[] toArray() {
            return e.this.b(0);
        }

        public <T> T[] toArray(T[] arrT) {
            return e.this.a(arrT, 0);
        }
    }

    public final class d
    implements Iterator<Map.Entry<K, V>>,
    Map.Entry<K, V> {
        public int a;
        public int b;
        public boolean c = false;

        public d() {
            this.a = -1 + e.this.c();
            this.b = -1;
        }

        public boolean equals(Object object) {
            if (this.c) {
                if (!(object instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry)object;
                boolean bl = a.b.d.a(entry.getKey(), e.this.a(this.b, 0));
                boolean bl2 = false;
                if (bl) {
                    boolean bl3 = a.b.d.a(entry.getValue(), e.this.a(this.b, 1));
                    bl2 = false;
                    if (bl3) {
                        bl2 = true;
                    }
                }
                return bl2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.c) {
                return (K)e.this.a(this.b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.c) {
                return (V)e.this.a(this.b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.b < this.a;
        }

        public int hashCode() {
            if (this.c) {
                Object object = e.this.a(this.b, 0);
                Object object2 = e.this.a(this.b, 1);
                int n2 = object == null ? 0 : object.hashCode();
                int n3 = object2 == null ? 0 : object2.hashCode();
                return n2 ^ n3;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object next() {
            if (this.hasNext()) {
                this.b = 1 + this.b;
                this.c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.c) {
                e.this.a(this.b);
                this.b = -1 + this.b;
                this.a = -1 + this.a;
                this.c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v2) {
            if (this.c) {
                return e.this.a(this.b, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getKey());
            stringBuilder.append("=");
            stringBuilder.append(this.getValue());
            return stringBuilder.toString();
        }
    }

    public final class e
    implements Collection<V> {
        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            e.this.a();
        }

        public boolean contains(Object object) {
            return e.this.b(object) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (this.contains(iterator.next())) continue;
                return false;
            }
            return true;
        }

        public boolean isEmpty() {
            return e.this.c() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object object) {
            int n2 = e.this.b(object);
            if (n2 >= 0) {
                e.this.a(n2);
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            int n2 = e.this.c();
            boolean bl = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!collection.contains(e.this.a(i2, 1))) continue;
                e.this.a(i2);
                --i2;
                --n2;
                bl = true;
            }
            return bl;
        }

        public boolean retainAll(Collection<?> collection) {
            int n2 = e.this.c();
            boolean bl = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (collection.contains(e.this.a(i2, 1))) continue;
                e.this.a(i2);
                --i2;
                --n2;
                bl = true;
            }
            return bl;
        }

        public int size() {
            return e.this.c();
        }

        public Object[] toArray() {
            return e.this.b(1);
        }

        public <T> T[] toArray(T[] arrT) {
            return e.this.a(arrT, 1);
        }
    }

}

