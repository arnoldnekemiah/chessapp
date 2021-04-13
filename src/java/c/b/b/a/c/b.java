/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  c.b.b.a.c.a
 *  c.b.b.a.c.a$a
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 */
package c.b.b.a.c;

import android.os.IBinder;
import c.b.b.a.c.a;
import java.lang.reflect.Field;

public final class b<T>
extends a.a {
    public final T a;

    public b(T t2) {
        this.a = t2;
    }

    public static <T> T K(a a3) {
        IllegalArgumentException illegalArgumentException;
        if (a3 instanceof b) {
            return ((b)a3).a;
        }
        IBinder iBinder = a3.asBinder();
        Field[] arrfield = iBinder.getClass().getDeclaredFields();
        Field field = null;
        int n7 = arrfield.length;
        int n9 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            Field field2 = arrfield[i3];
            if (field2.isSynthetic()) continue;
            ++n9;
            field = field2;
        }
        if (n9 == 1) {
            if (!field.isAccessible()) {
                Object object;
                field.setAccessible(true);
                try {
                    object = field.get((Object)iBinder);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", (Throwable)illegalAccessException);
                }
                catch (NullPointerException nullPointerException) {
                    throw new IllegalArgumentException("Binder object is null.", (Throwable)nullPointerException);
                }
                return (T)object;
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int n10 = arrfield.length;
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("Unexpected number of IObjectWrapper declared fields: ");
        stringBuilder.append(n10);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }
}

