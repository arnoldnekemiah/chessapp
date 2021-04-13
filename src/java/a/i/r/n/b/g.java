/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 */
package a.i.r.n.b;

import a.i.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class g {
    public static final String f = h.a("WorkTimer");
    public final ThreadFactory a = new ThreadFactory(this){
        public int a = 0;

        public Thread newThread(Runnable runnable) {
            Thread thread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder stringBuilder = c.a.b.a.a.a("WorkManager-WorkTimer-thread-");
            stringBuilder.append(this.a);
            thread.setName(stringBuilder.toString());
            this.a = 1 + this.a;
            return thread;
        }
    };
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor((ThreadFactory)this.a);
    public final Map<String, c> c = new HashMap();
    public final Map<String, b> d = new HashMap();
    public final Object e = new Object();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(String string) {
        Object object;
        Object object2 = object = this.e;
        synchronized (object2) {
            if ((c)this.c.remove((Object)string) != null) {
                h.a().a(f, String.format((String)"Stopping timer for %s", (Object[])new Object[]{string}), new Throwable[0]);
                this.d.remove((Object)string);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(String string, long l2, b b2) {
        Object object;
        Object object2 = object = this.e;
        synchronized (object2) {
            h.a().a(f, String.format((String)"Starting timer for %s", (Object[])new Object[]{string}), new Throwable[0]);
            this.a(string);
            c c2 = new c(this, string);
            this.c.put((Object)string, (Object)c2);
            this.d.put((Object)string, (Object)b2);
            this.b.schedule((Runnable)c2, l2, TimeUnit.MILLISECONDS);
            return;
        }
    }

    public static interface b {
        public void a(String var1);
    }

    public static class c
    implements Runnable {
        public final g a;
        public final String b;

        public c(g g2, String string) {
            this.a = g2;
            this.b = string;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void run() {
            Object object;
            Object object2 = object = this.a.e;
            synchronized (object2) {
                if ((c)this.a.c.remove((Object)this.b) != null) {
                    b b2 = (b)this.a.d.remove((Object)this.b);
                    if (b2 != null) {
                        b2.a(this.b);
                    }
                } else {
                    h h2 = h.a();
                    Object[] arrobject = new Object[]{this.b};
                    h2.a("WrkTimerRunnable", String.format((String)"Timer with %s is already marked as complete.", (Object[])arrobject), new Throwable[0]);
                }
                return;
            }
        }
    }

}

