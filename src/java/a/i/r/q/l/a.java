/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Locale
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Future
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 *  java.util.concurrent.locks.LockSupport
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package a.i.r.q.l;

import a.i.r.q.l.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a<V>
implements c.b.c.a.a.a<V> {
    public static final boolean d;
    public static final Logger e;
    public static final b f;
    public static final Object g;
    public volatile Object a;
    public volatile e b;
    public volatile i c;

    public static {
        Object var0_6;
        b b2;
        d = Boolean.parseBoolean((String)System.getProperty((String)"guava.concurrent.generate_cancellation_cause", (String)"false"));
        e = Logger.getLogger((String)a.class.getName());
        try {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, (String)"a");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, (String)"b");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, (String)"c");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, (String)"b");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5 = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, (String)"a");
            b2 = new f((AtomicReferenceFieldUpdater<i, Thread>)atomicReferenceFieldUpdater, (AtomicReferenceFieldUpdater<i, i>)atomicReferenceFieldUpdater2, (AtomicReferenceFieldUpdater<a, i>)atomicReferenceFieldUpdater3, (AtomicReferenceFieldUpdater<a, e>)atomicReferenceFieldUpdater4, (AtomicReferenceFieldUpdater<a, Object>)atomicReferenceFieldUpdater5);
            var0_6 = null;
        }
        catch (Throwable throwable) {
            b2 = new h();
        }
        f = b2;
        if (var0_6 != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", (Throwable)var0_6);
        }
        g = new Object();
    }

    public static Object a(c.b.c.a.a.a<?> a5) {
        Object object;
        block11 : {
            if (a5 instanceof a) {
                Object object2 = ((a)a5).a;
                if (object2 instanceof c) {
                    c c2 = object2;
                    if (c2.a) {
                        if (c2.b != null) {
                            return new Object(false, c2.b){
                                public static final c c;
                                public static final c d;
                                public final boolean a;
                                public final Throwable b;

                                public static {
                                    if (a.d) {
                                        d = null;
                                        c = null;
                                    } else {
                                        d = new /* invalid duplicate definition of identical inner class */;
                                        c = new /* invalid duplicate definition of identical inner class */;
                                    }
                                }
                                {
                                    this.a = bl;
                                    this.b = throwable;
                                }
                            };
                        }
                        object2 = c.d;
                    }
                }
                return object2;
            }
            boolean bl = a5.isCancelled();
            if (bl & (true ^ d)) {
                return c.d;
            }
            object = a.a(a5);
            if (object != null) break block11;
            try {
                object = g;
            }
            catch (Throwable throwable) {
                return new Object(throwable){
                    public static final d b = new /* invalid duplicate definition of identical inner class */;
                    public final Throwable a;
                    {
                        a.b(throwable);
                        this.a = throwable;
                    }

                };
            }
            catch (CancellationException cancellationException) {
                if (!bl) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    stringBuilder.append(a5);
                    return new /* invalid duplicate definition of identical inner class */;
                }
                return new /* invalid duplicate definition of identical inner class */;
            }
            catch (ExecutionException executionException) {
                return new /* invalid duplicate definition of identical inner class */;
            }
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    public static <V> V a(Future<V> var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl3 : FAKE_TRY : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static void a(a<?> a5) {
        e e6 = null;
        block0 : do {
            e e10;
            e e11;
            i i10;
            if (!f.a(a5, i10 = a5.c, i.c)) {
                continue;
            }
            while (i10 != null) {
                Thread thread = i10.a;
                if (thread != null) {
                    i10.a = null;
                    LockSupport.unpark((Thread)thread);
                }
                i10 = i10.b;
            }
            while (!f.a(a5, e11 = a5.b, e.d)) {
            }
            do {
                e10 = e6;
                e6 = e11;
                if (e6 == null) break;
                e11 = e6.c;
                e6.c = e10;
            } while (true);
            while (e10 != null) {
                e6 = e10.c;
                Runnable runnable = e10.a;
                if (runnable instanceof g) {
                    Object object;
                    g g5 = runnable;
                    a5 = g5.a;
                    if (a5.a == g5 && f.a(a5, g5, object = a.a(g5.b))) {
                        continue block0;
                    }
                } else {
                    a.b(runnable, e10.b);
                }
                e10 = e6;
            }
            break;
        } while (true);
    }

    public static <T> T b(T t4) {
        if (t4 != null) {
            return t4;
        }
        throw null;
    }

    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
            return;
        }
        catch (RuntimeException runtimeException) {
            Logger logger = e;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append((Object)runnable);
            stringBuilder.append(" with executor ");
            stringBuilder.append((Object)executor);
            logger.log(level, stringBuilder.toString(), (Throwable)runtimeException);
            return;
        }
    }

    public final V a(Object object) {
        if (!(object instanceof c)) {
            if (!(object instanceof d)) {
                if (object == g) {
                    object = null;
                }
                return (V)object;
            }
            throw new ExecutionException((object).a);
        }
        Throwable throwable = (object).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(throwable);
        throw cancellationException;
    }

    public String a() {
        Object object = this.a;
        if (object instanceof g) {
            StringBuilder stringBuilder = c.a.b.a.a.a("setFuture=[");
            c.b.c.a.a.a a5 = (object).b;
            String string = a5 == this ? "this future" : String.valueOf(a5);
            return c.a.b.a.a.a(stringBuilder, string, "]");
        }
        if (this instanceof ScheduledFuture) {
            StringBuilder stringBuilder = c.a.b.a.a.a("remaining delay=[");
            stringBuilder.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
            stringBuilder.append(" ms]");
            return stringBuilder.toString();
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(i var1_1) {
        var1_1.a = null;
        block0 : do {
            if ((var2_2 = this.c) == i.c) {
                return;
            }
            var3_3 = null;
            while (var2_2 != null) {
                var4_4 = var2_2.b;
                if (var2_2.a != null) {
                    var3_3 = var2_2;
                } else if (var3_3 != null) {
                    var3_3.b = var4_4;
                    if (var3_3.a == null) {
                        continue block0;
                    }
                } else {
                    if (a.f.a(this, var2_2, var4_4)) ** break;
                    continue block0;
                }
                var2_2 = var4_4;
            }
            return;
            break;
        } while (true);
    }

    public final void a(Runnable runnable, Executor executor) {
        if (runnable != null) {
            if (executor != null) {
                e e6 = this.b;
                if (e6 != e.d) {
                    Object object = new Object(runnable, executor){
                        public static final e d = new /* invalid duplicate definition of identical inner class */;
                        public final Runnable a;
                        public final Executor b;
                        public e c;
                        {
                            this.a = runnable;
                            this.b = executor;
                        }
                    };
                    do {
                        object.c = e6;
                        if (!f.a(this, e6, object)) continue;
                        return;
                    } while ((e6 = this.b) != e.d);
                }
                a.b(runnable, executor);
                return;
            }
            throw null;
        }
        throw null;
    }

    /*
     * Exception decompiling
     */
    public final void a(StringBuilder var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl54 : ALOAD_1 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public final boolean cancel(boolean bl) {
        boolean bl2;
        block5 : {
            Object object = this.a;
            bl2 = true;
            boolean bl3 = object == null;
            if (bl3 | object instanceof g) {
                Object object2 = d ? new /* invalid duplicate definition of identical inner class */ : (bl ? c.c : c.d);
                boolean bl4 = false;
                a a5 = this;
                do {
                    if (f.a(a5, object, object2)) {
                        a.a(a5);
                        if (!(object instanceof g)) break block5;
                        c.b.c.a.a.a a6 = (object).b;
                        if (a6 instanceof a) {
                            a5 = (a)a6;
                            object = a5.a;
                            boolean bl5 = object == null;
                            if (bl5 | object instanceof g) {
                                bl4 = true;
                                continue;
                            }
                            break block5;
                        }
                        a6.cancel(bl);
                        return bl2;
                    }
                    object = a5.a;
                    if (!(object instanceof g)) break;
                } while (true);
                return bl4;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final V get() {
        InterruptedException interruptedException;
        if (!Thread.interrupted()) {
            Object object = this.a;
            boolean bl = object != null;
            if (bl & (true ^ object instanceof g)) {
                return this.a(object);
            }
            i i10 = this.c;
            if (i10 != i.c) {
                Object object2 = new Object(){
                    public static final i c = new /* invalid duplicate definition of identical inner class */;
                    public volatile Thread a;
                    public volatile i b;
                    {
                        a.f.a(this, Thread.currentThread());
                    }
                };
                do {
                    block5 : {
                        boolean bl2;
                        Object object3;
                        f.a(object2, i10);
                        if (!f.a(this, i10, object2)) continue;
                        do {
                            LockSupport.park((Object)this);
                            if (Thread.interrupted()) break block5;
                        } while (!((bl2 = (object3 = this.a) != null) & (true ^ object3 instanceof g)));
                        return this.a(object3);
                    }
                    this.a(object2);
                    throw new InterruptedException();
                } while ((i10 = this.c) != i.c);
            }
            return this.a(this.a);
        }
        interruptedException = new InterruptedException();
        throw interruptedException;
    }

    public final V get(long l8, TimeUnit timeUnit) {
        InterruptedException interruptedException;
        long l10 = timeUnit.toNanos(l8);
        if (!Thread.interrupted()) {
            long l11;
            block15 : {
                Object object = this.a;
                boolean bl = object != null;
                if (bl & (true ^ object instanceof g)) {
                    return this.a(object);
                }
                l11 = l10 > 0L ? l10 + System.nanoTime() : 0L;
                if (l10 >= 1000L) {
                    i i10 = this.c;
                    if (i10 != i.c) {
                        Object object2 = new /* invalid duplicate definition of identical inner class */;
                        do {
                            block14 : {
                                f.a(object2, i10);
                                if (!f.a(this, i10, object2)) continue;
                                do {
                                    LockSupport.parkNanos((Object)this, (long)l10);
                                    if (Thread.interrupted()) break block14;
                                    Object object3 = this.a;
                                    boolean bl2 = object3 != null;
                                    if (!(bl2 & (true ^ object3 instanceof g))) continue;
                                    return this.a(object3);
                                } while ((l10 = l11 - System.nanoTime()) >= 1000L);
                                this.a(object2);
                                break block15;
                            }
                            this.a(object2);
                            throw new InterruptedException();
                        } while ((i10 = this.c) != i.c);
                    }
                    return this.a(this.a);
                }
            }
            while (l10 > 0L) {
                Object object = this.a;
                boolean bl = object != null;
                if (bl & (true ^ object instanceof g)) {
                    return this.a(object);
                }
                if (!Thread.interrupted()) {
                    l10 = l11 - System.nanoTime();
                    continue;
                }
                throw new InterruptedException();
            }
            String string = this.toString();
            String string2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Waited ");
            stringBuilder.append(l8);
            stringBuilder.append(" ");
            stringBuilder.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String string3 = stringBuilder.toString();
            if (l10 + 1000L < 0L) {
                String string4 = c.a.b.a.a.a(string3, " (plus ");
                long l12 = -l10;
                long l13 = timeUnit.convert(l12, TimeUnit.NANOSECONDS);
                long l14 = l12 - timeUnit.toNanos(l13);
                boolean bl = l13 == 0L || l14 > 1000L;
                if (l13 > 0L) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string4);
                    stringBuilder2.append(l13);
                    stringBuilder2.append(" ");
                    stringBuilder2.append(string2);
                    String string5 = stringBuilder2.toString();
                    if (bl) {
                        string5 = c.a.b.a.a.a(string5, ",");
                    }
                    string4 = c.a.b.a.a.a(string5, " ");
                }
                if (bl) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(string4);
                    stringBuilder3.append(l14);
                    stringBuilder3.append(" nanoseconds ");
                    string4 = stringBuilder3.toString();
                }
                string3 = c.a.b.a.a.a(string4, "delay)");
            }
            if (this.isDone()) {
                throw new TimeoutException(c.a.b.a.a.a(string3, " but future completed as timeout expired"));
            }
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(string3);
            stringBuilder4.append(" for ");
            stringBuilder4.append(string);
            throw new TimeoutException(stringBuilder4.toString());
        }
        interruptedException = new InterruptedException();
        throw interruptedException;
    }

    public final boolean isCancelled() {
        return this.a instanceof c;
    }

    public final boolean isDone() {
        Object object = this.a;
        boolean bl = object != null;
        return bl & (true ^ object instanceof g);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public String toString() {
        block6 : {
            var1_1 = new StringBuilder();
            var1_1.append(super.toString());
            var1_1.append("[status=");
            if (!(this.a instanceof c)) break block6;
            var8_2 = "CANCELLED";
            ** GOTO lbl25
        }
        if (this.isDone()) ** GOTO lbl-1000
        try {
            var7_3 = this.a();
        }
        catch (RuntimeException var4_4) {
            var5_5 = c.a.b.a.a.a("Exception thrown from implementation: ");
            var5_5.append((Object)var4_4.getClass());
            var7_3 = var5_5.toString();
        }
        if (var7_3 != null && !var7_3.isEmpty()) {
            var1_1.append("PENDING, info=[");
            var1_1.append(var7_3);
            var1_1.append("]");
        } else if (this.isDone()) lbl-1000: // 2 sources:
        {
            this.a(var1_1);
        } else {
            var8_2 = "PENDING";
lbl25: // 2 sources:
            var1_1.append(var8_2);
        }
        var1_1.append("]");
        return var1_1.toString();
    }

    public static final class f
    extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> a;
        public final AtomicReferenceFieldUpdater<i, i> b;
        public final AtomicReferenceFieldUpdater<a, i> c;
        public final AtomicReferenceFieldUpdater<a, e> d;
        public final AtomicReferenceFieldUpdater<a, Object> e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override
        public void a(i i10, i i11) {
            this.b.lazySet((Object)i10, (Object)i11);
        }

        @Override
        public void a(i i10, Thread thread) {
            this.a.lazySet((Object)i10, (Object)thread);
        }

        @Override
        public boolean a(a<?> a5, e e6, e e10) {
            return this.d.compareAndSet(a5, (Object)e6, (Object)e10);
        }

        @Override
        public boolean a(a<?> a5, i i10, i i11) {
            return this.c.compareAndSet(a5, (Object)i10, (Object)i11);
        }

        @Override
        public boolean a(a<?> a5, Object object, Object object2) {
            return this.e.compareAndSet(a5, object, object2);
        }
    }

    public static final class h
    extends b {
        public h() {
            super(null);
        }

        @Override
        public void a(i i10, i i11) {
            i10.b = i11;
        }

        @Override
        public void a(i i10, Thread thread) {
            i10.a = thread;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public boolean a(a<?> a5, e e6, e e10) {
            a<?> a6 = a5;
            synchronized (a6) {
                if (a5.b == e6) {
                    a5.b = e10;
                    return true;
                }
                return false;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public boolean a(a<?> a5, i i10, i i11) {
            a<?> a6 = a5;
            synchronized (a6) {
                if (a5.c == i10) {
                    a5.c = i11;
                    return true;
                }
                return false;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public boolean a(a<?> a5, Object object, Object object2) {
            a<?> a6 = a5;
            synchronized (a6) {
                if (a5.a == object) {
                    a5.a = object2;
                    return true;
                }
                return false;
            }
        }
    }

}

