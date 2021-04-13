/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractList
 *  java.util.Collection
 *  java.util.List
 *  java.util.RandomAccess
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.z5;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class l4<E>
extends AbstractList<E>
implements z5<E> {
    public boolean a = true;

    @Override
    public final boolean a() {
        return this.a;
    }

    public boolean add(E e10) {
        this.c();
        return super.add(e10);
    }

    public boolean addAll(int n10, Collection<? extends E> collection) {
        this.c();
        return super.addAll(n10, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        this.c();
        return super.addAll(collection);
    }

    @Override
    public final void b() {
        this.a = false;
    }

    public final void c() {
        if (this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.c();
        super.clear();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        if (!(object instanceof RandomAccess)) {
            return super.equals(object);
        }
        List list = (List)object;
        int n10 = this.size();
        if (n10 == list.size()) {
            for (int i10 = 0; i10 < n10; ++i10) {
                if (this.get(i10).equals(list.get(i10))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int n10 = this.size();
        int n11 = 1;
        for (int i10 = 0; i10 < n10; ++i10) {
            n11 = n11 * 31 + this.get(i10).hashCode();
        }
        return n11;
    }

    public abstract E remove(int var1);

    public final boolean remove(Object object) {
        this.c();
        int n10 = this.indexOf(object);
        if (n10 == -1) {
            return false;
        }
        this.remove(n10);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        this.c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        this.c();
        return super.retainAll(collection);
    }
}

