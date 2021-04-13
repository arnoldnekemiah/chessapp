/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.g.e
 *  c.b.d.j.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Set
 */
package c.b.d.g;

import c.b.d.g.e;
import java.util.Set;

public abstract class a
implements e {
    public <T> T a(Class<T> class_) {
        c.b.d.j.a a8 = this.b(class_);
        if (a8 == null) {
            return null;
        }
        return (T)a8.get();
    }

    public <T> Set<T> c(Class<T> class_) {
        return (Set)this.d(class_).get();
    }
}

