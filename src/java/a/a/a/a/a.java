/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package a.a.a.a;

import a.a.a.a.a;
import a.a.a.a.b;
import a.a.a.a.c;
import java.util.concurrent.Executor;

public class a
extends c {
    public static volatile a c;
    public static final Executor d;
    public c a;
    public c b;

    public static {
        d = new Executor(){

            public void execute(Runnable runnable) {
                a.b().a.a(runnable);
            }
        };
    }

    public a() {
        b b2 = new b();
        this.b = b2;
        this.a = b2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a b() {
        if (c != null) {
            return c;
        }
        Class<a> class_ = a.class;
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            // ** MonitorExit[var1] (shouldn't be in output)
            return c;
        }
    }

    @Override
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override
    public boolean a() {
        return this.a.a();
    }

    @Override
    public void b(Runnable runnable) {
        this.a.b(runnable);
    }
}

