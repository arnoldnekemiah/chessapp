/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  org.checkerframework.checker.nullness.compatqual.NullableDecl
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.v3;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class t3<T>
extends v3<T> {
    public static final t3<Object> a = new t3<T>();

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object object) {
        return object == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}

