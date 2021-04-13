/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.s6;
import c.b.b.a.e.d.t6;

public final class m6
implements t6 {
    public final t6[] a;

    public /* varargs */ m6(t6 ... arrt6) {
        this.a = arrt6;
    }

    @Override
    public final boolean a(Class<?> class_) {
        t6[] arrt6 = this.a;
        for (int i10 = 0; i10 < 2; ++i10) {
            if (!arrt6[i10].a(class_)) continue;
            return true;
        }
        return false;
    }

    @Override
    public final s6 b(Class<?> class_) {
        UnsupportedOperationException unsupportedOperationException;
        t6[] arrt6 = this.a;
        for (int i10 = 0; i10 < 2; ++i10) {
            t6 t62 = arrt6[i10];
            if (!t62.a(class_)) continue;
            return t62.b(class_);
        }
        String string = class_.getName();
        String string2 = string.length() != 0 ? "No factory is available for message type: ".concat(string) : new String("No factory is available for message type: ");
        unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }
}

