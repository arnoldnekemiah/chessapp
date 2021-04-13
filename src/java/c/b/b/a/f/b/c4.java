/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;

public final class c4
implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ f4 b;

    public c4(f4 f42, String string) {
        this.b = f42;
        a.a(string);
        this.a = string;
    }

    public final void uncaughtException(Thread thread, Throwable throwable) {
        c4 c42 = this;
        synchronized (c42) {
            this.b.a.a().f.a(this.a, (Object)throwable);
            return;
        }
    }
}

