/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.s6;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.t6;

public final class p5
implements t6 {
    public static final p5 a = new p5();

    @Override
    public final boolean a(Class<?> class_) {
        return t5.class.isAssignableFrom(class_);
    }

    @Override
    public final s6 b(Class<?> class_) {
        if (!t5.class.isAssignableFrom(class_)) {
            String string = class_.getName();
            String string2 = string.length() != 0 ? "Unsupported message type: ".concat(string) : new String("Unsupported message type: ");
            throw new IllegalArgumentException(string2);
        }
        try {
            s6 s62 = (s6)((t5)t5.a(class_.asSubclass(t5.class))).a(3, null, null);
            return s62;
        }
        catch (Exception exception) {
            String string = class_.getName();
            String string3 = string.length() != 0 ? "Unable to get message info for ".concat(string) : new String("Unable to get message info for ");
            throw new RuntimeException(string3, (Throwable)exception);
        }
    }
}

