/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.c4
 *  c.b.b.a.f.b.d4
 *  c.b.b.a.f.b.e4
 *  c.b.b.a.f.b.f3
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Future
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.PriorityBlockingQueue
 *  java.util.concurrent.Semaphore
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.concurrent.atomic.AtomicReference
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.c4;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d4;
import c.b.b.a.f.b.d5;
import c.b.b.a.f.b.e4;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class f4
extends d5 {
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    public e4 c;
    public e4 d;
    public final PriorityBlockingQueue<d4<?>> e = new PriorityBlockingQueue();
    public final BlockingQueue<d4<?>> f = new LinkedBlockingQueue();
    public final Thread.UncaughtExceptionHandler g = new c4(this, "Thread death: Uncaught exception on worker thread");
    public final Thread.UncaughtExceptionHandler h = new c4(this, "Thread death: Uncaught exception on network thread");
    public final Object i = new Object();
    public final Semaphore j = new Semaphore(2);
    public volatile boolean k;

    public f4(i4 i42) {
        super(i42);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final <T> T a(AtomicReference<T> atomicReference, long l6, String string, Runnable runnable) {
        AtomicReference<T> atomicReference2 = atomicReference;
        // MONITORENTER : atomicReference2
        this.a.d().a(runnable);
        try {
            atomicReference.wait(l6);
            // MONITOREXIT : atomicReference2
        }
        catch (InterruptedException interruptedException) {
            f3 f33 = this.a.a().i;
            String string3 = string.length() != 0 ? "Interrupted waiting for ".concat(string) : new String("Interrupted waiting for ");
            f33.a(string3);
            // MONITOREXIT : atomicReference2
            return null;
        }
        Object object = atomicReference.get();
        if (object != null) return (T)object;
        f3 f32 = this.a.a().i;
        String string2 = string.length() != 0 ? "Timed out waiting for ".concat(string) : new String("Timed out waiting for ");
        f32.a(string2);
        return (T)object;
    }

    public final <V> Future<V> a(Callable<V> callable) {
        this.k();
        a.a(callable);
        d4 d42 = new d4(this, callable, false);
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                this.a.a().i.a("Callable skipped the worker queue.");
            }
            d42.run();
            return d42;
        }
        this.a(d42);
        return d42;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(d4<?> d42) {
        Object object;
        Object object2 = object = this.i;
        synchronized (object2) {
            this.e.add(d42);
            e4 e42 = this.c;
            if (e42 == null) {
                e4 e43;
                this.c = e43 = new e4(this, "Measurement Worker", this.e);
                e43.setUncaughtExceptionHandler(this.g);
                this.c.start();
            } else {
                e42.a();
            }
            return;
        }
    }

    public final void a(Runnable runnable) {
        this.k();
        a.a(runnable);
        this.a(new d4(this, runnable, false, "Task exception on worker thread"));
    }

    public final void b(Runnable runnable) {
        this.k();
        a.a(runnable);
        this.a(new d4(this, runnable, true, "Task exception on worker thread"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Runnable runnable) {
        Object object;
        this.k();
        a.a(runnable);
        d4 d42 = new d4(this, runnable, false, "Task exception on network thread");
        Object object2 = object = this.i;
        synchronized (object2) {
            this.f.add((Object)d42);
            e4 e42 = this.d;
            if (e42 == null) {
                e4 e43;
                this.d = e43 = new e4(this, "Measurement Network", this.f);
                e43.setUncaughtExceptionHandler(this.h);
                this.d.start();
            } else {
                e42.a();
            }
            return;
        }
    }

    @Override
    public final void f() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    @Override
    public final void g() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override
    public final boolean h() {
        return false;
    }

    public final boolean n() {
        return Thread.currentThread() == this.c;
    }
}

