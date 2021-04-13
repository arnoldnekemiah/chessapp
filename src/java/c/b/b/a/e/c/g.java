/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.c.e
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.checkerframework.checker.nullness.compatqual.NullableDecl
 */
package c.b.b.a.e.c;

import c.b.b.a.e.c.e;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class g<T>
implements e<T>,
Serializable {
    public final e<T> a;
    public volatile transient boolean b;
    @NullableDecl
    public transient T c;

    public g(e<T> e10) {
        if (e10 != null) {
            this.a = e10;
            return;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final T a() {
        if (this.b) return this.c;
        g g10 = this;
        synchronized (g10) {
            if (this.b) return this.c;
            Object object = this.a.a();
            this.c = object;
            this.b = true;
            return (T)object;
        }
    }

    public final String toString() {
        Object object;
        if (this.b) {
            String string = String.valueOf(this.c);
            StringBuilder stringBuilder = new StringBuilder(25 + string.length());
            stringBuilder.append("<supplier that returned ");
            stringBuilder.append(string);
            stringBuilder.append(">");
            object = stringBuilder.toString();
        } else {
            object = this.a;
        }
        String string = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder(19 + string.length());
        stringBuilder.append("Suppliers.memoize(");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

