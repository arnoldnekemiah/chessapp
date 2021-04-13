/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.reflect.Field
 *  java.security.PrivilegedExceptionAction
 *  sun.misc.Unsafe
 */
package c.b.b.a.e.d;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

public final class z7
implements PrivilegedExceptionAction<Unsafe> {
    public static final Unsafe a() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object object = field.get(null);
            if (!Unsafe.class.isInstance(object)) continue;
            return (Unsafe)Unsafe.class.cast(object);
        }
        return null;
    }
}

