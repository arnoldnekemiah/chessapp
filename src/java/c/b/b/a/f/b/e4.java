/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  java.lang.Boolean
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Semaphore
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.Process;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d4;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public final class e4
extends Thread {
    public final Object a;
    public final BlockingQueue<d4<?>> b;
    public boolean c = false;
    public final /* synthetic */ f4 d;

    public e4(String string, BlockingQueue<d4<?>> blockingQueue) {
        this.d = var1_1;
        a.a(string);
        a.a(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        this.setName(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            this.a.notifyAll();
            return;
        }
    }

    public final void a(InterruptedException interruptedException) {
        this.d.a.a().i.a(String.valueOf((Object)this.getName()).concat(" was interrupted"), (Object)interruptedException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Object object;
        Object object2 = object = this.d.i;
        synchronized (object2) {
            if (!this.c) {
                this.d.j.release();
                this.d.i.notifyAll();
                if (this == this.d.c) {
                    this.d.c = null;
                } else if (this == this.d.d) {
                    this.d.d = null;
                } else {
                    this.d.a.a().f.a("Current scheduler thread is neither worker nor network");
                }
                this.c = true;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        var1_1 = false;
        while (!var1_1) {
            try {
                this.d.j.acquire();
                var1_1 = true;
            }
            catch (InterruptedException var12_2) {
                this.a(var12_2);
            }
        }
        try {
            var3_3 = Process.getThreadPriority((int)Process.myTid());
            do lbl-1000: // 3 sources:
            {
                if ((var4_4 = (d4)this.b.poll()) != null) {
                    var5_5 = true != var4_4.b ? 10 : var3_3;
                    Process.setThreadPriority((int)var5_5);
                    var4_4.run();
                    continue;
                }
                var13_9 = var6_6 = this.a;
                // MONITORENTER : var13_9
                break;
            } while (true);
        }
        catch (Throwable var2_11) {
            this.b();
            throw var2_11;
        }
        {
            if (this.b.peek() == null) {
                try {
                    this.a.wait(30000L);
                }
                catch (InterruptedException var11_8) {
                    this.a(var11_8);
                }
            }
            // MONITOREXIT : var13_9
            var14_10 = var8_7 = this.d.i;
            // MONITORENTER : var14_10
            if (this.b.peek() == null) {
                if (this.d.a.g.c(null, u2.q0)) {
                    this.b();
                }
                // MONITOREXIT : var14_10
                this.b();
                return;
            }
            // MONITOREXIT : var14_10
            ** while (true)
        }
    }
}

