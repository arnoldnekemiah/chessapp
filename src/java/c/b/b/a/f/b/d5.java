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
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d5
extends c5 {
    public boolean b;

    public d5(i4 i42) {
        super(i42);
        i4 i43 = this.a;
        i43.F = 1 + i43.F;
    }

    public abstract boolean h();

    public void i() {
    }

    public final boolean j() {
        return this.b;
    }

    public final void k() {
        if (this.j()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void l() {
        if (!this.b) {
            if (!this.h()) {
                this.a.G.incrementAndGet();
                this.b = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void m() {
        if (!this.b) {
            this.i();
            this.a.G.incrementAndGet();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}

