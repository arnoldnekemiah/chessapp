/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  sun.misc.Unsafe
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.d8;
import c.b.b.a.e.d.e8;
import java.lang.reflect.Method;
import sun.misc.Unsafe;

public final class c8
extends d8 {
    public c8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override
    public final byte a(Object object, long l10) {
        return this.a.getByte(object, l10);
    }

    @Override
    public final void a(Object object, long l10, byte by) {
        this.a.putByte(object, l10, by);
    }

    @Override
    public final void a(Object object, long l10, double d10) {
        this.a.putDouble(object, l10, d10);
    }

    @Override
    public final void a(Object object, long l10, float f10) {
        this.a.putFloat(object, l10, f10);
    }

    @Override
    public final void a(Object object, long l10, boolean bl) {
        this.a.putBoolean(object, l10, bl);
    }

    @Override
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        try {
            Class class_ = this.a.getClass();
            Class[] arrclass = new Class[]{Object.class, Long.TYPE};
            class_.getMethod("getByte", arrclass);
            Class[] arrclass2 = new Class[]{Object.class, Long.TYPE, Byte.TYPE};
            class_.getMethod("putByte", arrclass2);
            Class[] arrclass3 = new Class[]{Object.class, Long.TYPE};
            class_.getMethod("getBoolean", arrclass3);
            Class[] arrclass4 = new Class[]{Object.class, Long.TYPE, Boolean.TYPE};
            class_.getMethod("putBoolean", arrclass4);
            Class[] arrclass5 = new Class[]{Object.class, Long.TYPE};
            class_.getMethod("getFloat", arrclass5);
            Class[] arrclass6 = new Class[]{Object.class, Long.TYPE, Float.TYPE};
            class_.getMethod("putFloat", arrclass6);
            Class[] arrclass7 = new Class[]{Object.class, Long.TYPE};
            class_.getMethod("getDouble", arrclass7);
            Class[] arrclass8 = new Class[]{Object.class, Long.TYPE, Double.TYPE};
            class_.getMethod("putDouble", arrclass8);
            return true;
        }
        catch (Throwable throwable) {
            e8.a(throwable);
            return false;
        }
    }

    @Override
    public final boolean b() {
        if (!super.b()) {
            return false;
        }
        try {
            Class class_ = this.a.getClass();
            Class[] arrclass = new Class[]{Long.TYPE};
            class_.getMethod("getByte", arrclass);
            Class[] arrclass2 = new Class[]{Long.TYPE, Byte.TYPE};
            class_.getMethod("putByte", arrclass2);
            Class[] arrclass3 = new Class[]{Long.TYPE};
            class_.getMethod("getInt", arrclass3);
            Class[] arrclass4 = new Class[]{Long.TYPE, Integer.TYPE};
            class_.getMethod("putInt", arrclass4);
            Class[] arrclass5 = new Class[]{Long.TYPE};
            class_.getMethod("getLong", arrclass5);
            Class[] arrclass6 = new Class[]{Long.TYPE, Long.TYPE};
            class_.getMethod("putLong", arrclass6);
            Class[] arrclass7 = new Class[]{Long.TYPE, Long.TYPE, Long.TYPE};
            class_.getMethod("copyMemory", arrclass7);
            Class[] arrclass8 = new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE};
            class_.getMethod("copyMemory", arrclass8);
            return true;
        }
        catch (Throwable throwable) {
            e8.a(throwable);
            return false;
        }
    }

    @Override
    public final boolean b(Object object, long l10) {
        return this.a.getBoolean(object, l10);
    }

    @Override
    public final float c(Object object, long l10) {
        return this.a.getFloat(object, l10);
    }

    @Override
    public final double d(Object object, long l10) {
        return this.a.getDouble(object, l10);
    }
}

