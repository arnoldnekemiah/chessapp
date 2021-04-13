/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.util.NoSuchElementException
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.r4;
import c.b.b.a.e.d.x4;
import java.util.NoSuchElementException;

public final class q4
extends r4 {
    public int a = 0;
    public final int b = this.c.c();
    public final /* synthetic */ x4 c;

    public q4(x4 x42) {
        this.c = x42;
    }

    @Override
    public final byte a() {
        int n10 = this.a;
        if (n10 < this.b) {
            this.a = n10 + 1;
            return this.c.d(n10);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }
}

