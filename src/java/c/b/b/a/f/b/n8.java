/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  c.b.b.a.e.d.w8
 *  c.b.b.a.f.b.j8
 *  c.b.b.a.f.b.l8
 *  c.b.b.a.f.b.m8
 */
package c.b.b.a.f.b;

import android.os.Handler;
import android.os.Looper;
import c.b.b.a.e.d.w8;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j8;
import c.b.b.a.f.b.l8;
import c.b.b.a.f.b.m8;
import c.b.b.a.f.b.x3;

public final class n8
extends x3 {
    public Handler c;
    public final m8 d = new m8(this);
    public final l8 e = new l8(this);
    public final j8 f = new j8(this);

    public n8(i4 i42) {
        super(i42);
    }

    @Override
    public final boolean j() {
        return false;
    }

    public final void l() {
        this.g();
        if (this.c == null) {
            this.c = new w8(Looper.getMainLooper());
        }
    }
}

