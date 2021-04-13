/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.b.o
 *  c.b.b.a.b.v
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package c.b.b.a.b;

import c.b.b.a.b.n;
import c.b.b.a.b.o;
import c.b.b.a.b.v;
import java.util.concurrent.Callable;

public final class p
implements Callable {
    public final boolean a;
    public final String b;
    public final o c;

    public p(boolean bl, String string, o o2) {
        this.a = bl;
        this.b = string;
        this.c = o2;
    }

    public final Object call() {
        boolean bl = this.a;
        String string = this.b;
        o o2 = this.c;
        boolean bl2 = true;
        if (bl || !n.b((String)string, (o)o2, (boolean)bl2, (boolean)false).a) {
            bl2 = false;
        }
        return v.a((String)string, (o)o2, (boolean)bl, (boolean)bl2);
    }
}

