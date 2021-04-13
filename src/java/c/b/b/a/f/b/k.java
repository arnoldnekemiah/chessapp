/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  c.b.b.a.b.j.c
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.w8;
import c.b.b.a.f.b.e5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.j;

public abstract class k {
    public static volatile Handler d;
    public final e5 a;
    public final Runnable b;
    public volatile long c;

    public k(e5 e52) {
        a.a(e52);
        this.a = e52;
        this.b = new j(this, e52);
    }

    public abstract void a();

    public final void a(long l2) {
        this.b();
        if (l2 >= 0L) {
            if ((c)this.a.b() != null) {
                this.c = System.currentTimeMillis();
                if (!this.c().postDelayed(this.b, l2)) {
                    this.a.a().f.a("Failed to schedule delayed post. time", l2);
                    return;
                }
            } else {
                throw null;
            }
        }
    }

    public final void b() {
        this.c = 0L;
        this.c().removeCallbacks(this.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Handler c() {
        if (d != null) {
            return d;
        }
        Class<k> class_ = k.class;
        synchronized (k.class) {
            if (d != null) return d;
            d = new w8(this.a.e().getMainLooper());
            return d;
        }
    }
}

