/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 *  sun.misc.Unsafe
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.d8;
import c.b.b.a.e.d.e8;
import sun.misc.Unsafe;

public final class b8
extends d8 {
    public b8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override
    public final byte a(Object object, long l10) {
        if (e8.i) {
            return e8.a(object, l10);
        }
        return e8.b(object, l10);
    }

    @Override
    public final void a(Object object, long l10, byte by) {
        if (e8.i) {
            e8.a(object, l10, by);
            return;
        }
        e8.b(object, l10, by);
    }

    @Override
    public final void a(Object object, long l10, double d10) {
        this.a(object, l10, Double.doubleToLongBits((double)d10));
    }

    @Override
    public final void a(Object object, long l10, float f10) {
        this.a(object, l10, Float.floatToIntBits((float)f10));
    }

    @Override
    public final void a(Object object, long l10, boolean bl) {
        if (e8.i) {
            e8.a(object, l10, (byte)bl);
            return;
        }
        e8.b(object, l10, (byte)bl);
    }

    @Override
    public final boolean b(Object object, long l10) {
        if (e8.i) {
            byte by = e8.a(object, l10);
            boolean bl = false;
            if (by != 0) {
                bl = true;
            }
            return bl;
        }
        byte by = e8.b(object, l10);
        boolean bl = false;
        if (by != 0) {
            bl = true;
        }
        return bl;
    }

    @Override
    public final float c(Object object, long l10) {
        return Float.intBitsToFloat((int)this.e(object, l10));
    }

    @Override
    public final double d(Object object, long l10) {
        return Double.longBitsToDouble((long)this.f(object, l10));
    }
}

