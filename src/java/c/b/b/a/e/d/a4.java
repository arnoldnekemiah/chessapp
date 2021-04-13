/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  org.checkerframework.checker.nullness.compatqual.NullableDecl
 */
package c.b.b.a.e.d;

import c.a.b.a.a;
import c.b.b.a.e.d.x3;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class a4<T>
implements Serializable,
x3 {
    @NullableDecl
    public final T a;

    public a4(@NullableDecl T t4) {
        this.a = t4;
    }

    @Override
    public final T a() {
        return this.a;
    }

    public final boolean equals(@NullableDecl Object object) {
        if (object instanceof a4) {
            a4 a42 = (a4)object;
            T t4 = this.a;
            T t8 = a42.a;
            return t4 == t8 || t4.equals(t8);
            {
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] arrobject = new Object[]{this.a};
        return Arrays.hashCode((Object[])arrobject);
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        return a.a(new StringBuilder(22 + string.length()), "Suppliers.ofInstance(", string, ")");
    }
}

