/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Map
 */
package a.b;

import a.b.c;
import a.b.e;
import java.util.Map;

public class b
extends e<E, E> {
    public final /* synthetic */ c d;

    public b(c c2) {
        this.d = c2;
    }

    @Override
    public int a(Object object) {
        return this.d.indexOf(object);
    }

    @Override
    public Object a(int n4, int n10) {
        return this.d.b[n4];
    }

    @Override
    public E a(int n4, E e6) {
        throw new UnsupportedOperationException("not a map");
    }

    @Override
    public void a() {
        this.d.clear();
    }

    @Override
    public void a(int n4) {
        this.d.d(n4);
    }

    @Override
    public void a(E e6, E e10) {
        this.d.add(e6);
    }

    @Override
    public int b(Object object) {
        return this.d.indexOf(object);
    }

    @Override
    public Map<E, E> b() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override
    public int c() {
        return this.d.c;
    }
}

