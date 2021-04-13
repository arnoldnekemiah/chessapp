/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Thread
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package a.a.a.a;

import a.a.a.a.b;
import a.a.a.a.c;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class b
extends c {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool((int)4, (ThreadFactory)new ThreadFactory(this){
        public final java.util.concurrent.atomic.AtomicInteger a;
        {
            this.a = new java.util.concurrent.atomic.AtomicInteger(0);
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Object[] arrobject = new Object[]{this.a.getAndIncrement()};
            thread.setName(java.lang.String.format((java.lang.String)"arch_disk_io_%d", (Object[])arrobject));
            return thread;
        }
    });
    public volatile Handler c;

    @Override
    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(Runnable runnable) {
        if (this.c == null) {
            Object object;
            Object object2 = object = this.a;
            synchronized (object2) {
                if (this.c == null) {
                    this.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }
}

