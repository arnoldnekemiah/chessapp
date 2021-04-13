/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicInteger
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.y2;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class x3
extends y2 {
    public boolean b;

    public x3(i4 i42) {
        super(i42);
        i4 i43 = this.a;
        i43.F = 1 + i43.F;
    }

    public final void h() {
        if (this.b) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void i() {
        if (!this.b) {
            if (!this.j()) {
                this.a.G.incrementAndGet();
                this.b = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean j();

    public void k() {
    }
}

