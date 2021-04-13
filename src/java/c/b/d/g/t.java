/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.j.a
 *  java.lang.Object
 */
package c.b.d.g;

import c.b.d.j.a;

public class t<T>
implements a<T> {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile a<T> b;

    public t(a<T> a8) {
        this.b = a8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public T get() {
        Object object = this.a;
        if (object != c) {
            return (T)object;
        }
        t t10 = this;
        synchronized (t10) {
            Object object2 = this.a;
            if (object2 == c) {
                this.a = object2 = this.b.get();
                this.b = null;
            }
            return (T)object2;
        }
    }
}

