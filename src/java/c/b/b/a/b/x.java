/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.b.v
 *  c.b.b.a.b.y
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 */
package c.b.b.a.b;

import c.b.b.a.b.v;
import c.b.b.a.b.y;
import java.util.concurrent.Callable;

public final class x
extends v {
    public final Callable<String> e;

    public /* synthetic */ x(Callable callable, y y3) {
        super(false, null, null);
        this.e = callable;
    }

    public final String a() {
        try {
            String string = (String)this.e.call();
            return string;
        }
        catch (Exception exception) {
            throw new RuntimeException((Throwable)exception);
        }
    }
}

