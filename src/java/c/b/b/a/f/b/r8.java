/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  c.b.b.a.f.b.e5
 *  java.lang.IllegalStateException
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e5;
import c.b.b.a.f.b.i4;

public abstract class r8
extends c5
implements e5 {
    public final a9 b;
    public boolean c;

    public r8(a9 a92) {
        super(a92.j);
        a.a(a92);
        this.b = a92;
        a92.o = 1 + a92.o;
    }

    public final void h() {
        if (this.c) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void i() {
        if (!this.c) {
            this.j();
            a9 a92 = this.b;
            a92.p = 1 + a92.p;
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean j();
}

