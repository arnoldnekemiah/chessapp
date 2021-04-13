/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  sun.misc.Unsafe
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.e8;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import sun.misc.Unsafe;

public abstract class d8 {
    public final Unsafe a;

    public d8(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(Object var1, long var2);

    public final int a(Class<?> class_) {
        return this.a.arrayBaseOffset(class_);
    }

    public final long a(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void a(Object var1, long var2, byte var4);

    public abstract void a(Object var1, long var2, double var4);

    public abstract void a(Object var1, long var2, float var4);

    public final void a(Object object, long l2, int n2) {
        this.a.putInt(object, l2, n2);
    }

    public final void a(Object object, long l2, long l10) {
        this.a.putLong(object, l2, l10);
    }

    public final void a(Object object, long l2, Object object2) {
        this.a.putObject(object, l2, object2);
    }

    public abstract void a(Object var1, long var2, boolean var4);

    public boolean a() {
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class class_ = unsafe.getClass();
                class_.getMethod("objectFieldOffset", new Class[]{Field.class});
                class_.getMethod("arrayBaseOffset", new Class[]{Class.class});
                class_.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class[] arrclass = new Class[]{Object.class, Long.TYPE};
                class_.getMethod("getInt", arrclass);
                Class[] arrclass2 = new Class[]{Object.class, Long.TYPE, Integer.TYPE};
                class_.getMethod("putInt", arrclass2);
                Class[] arrclass3 = new Class[]{Object.class, Long.TYPE};
                class_.getMethod("getLong", arrclass3);
                Class[] arrclass4 = new Class[]{Object.class, Long.TYPE, Long.TYPE};
                class_.getMethod("putLong", arrclass4);
                Class[] arrclass5 = new Class[]{Object.class, Long.TYPE};
                class_.getMethod("getObject", arrclass5);
                Class[] arrclass6 = new Class[]{Object.class, Long.TYPE, Object.class};
                class_.getMethod("putObject", arrclass6);
                return true;
            }
            catch (Throwable throwable) {
                e8.a(throwable);
            }
        }
        return false;
    }

    public final int b(Class<?> class_) {
        return this.a.arrayIndexScale(class_);
    }

    public boolean b() {
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class class_ = unsafe.getClass();
                class_.getMethod("objectFieldOffset", new Class[]{Field.class});
                Class[] arrclass = new Class[]{Object.class, Long.TYPE};
                class_.getMethod("getLong", arrclass);
                Field field = e8.a();
                return field != null;
            }
            catch (Throwable throwable) {
                e8.a(throwable);
            }
        }
        return false;
    }

    public abstract boolean b(Object var1, long var2);

    public abstract float c(Object var1, long var2);

    public abstract double d(Object var1, long var2);

    public final int e(Object object, long l2) {
        return this.a.getInt(object, l2);
    }

    public final long f(Object object, long l2) {
        return this.a.getLong(object, l2);
    }

    public final Object g(Object object, long l2) {
        return this.a.getObject(object, l2);
    }
}

