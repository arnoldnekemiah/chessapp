/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  c.b.b.a.b.j.c
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.System
 */
package c.b.b.a.e.d;

import android.os.SystemClock;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.f0;

public abstract class w
implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ f0 d;

    public w(f0 f02, boolean bl) {
        this.d = f02;
        if ((c)f02.b != null) {
            this.a = System.currentTimeMillis();
            if ((c)f02.b != null) {
                this.b = SystemClock.elapsedRealtime();
                this.c = bl;
                return;
            }
            throw null;
        }
        throw null;
    }

    public abstract void a();

    public void b() {
    }

    public final void run() {
        if (this.d.f) {
            this.b();
            return;
        }
        try {
            this.a();
            return;
        }
        catch (Exception exception) {
            this.d.a(exception, false, this.c);
            this.b();
            return;
        }
    }
}

