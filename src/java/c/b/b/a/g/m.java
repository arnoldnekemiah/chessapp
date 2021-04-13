/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayDeque
 *  java.util.Queue
 *  javax.annotation.concurrent.GuardedBy
 */
package c.b.b.a.g;

import c.b.b.a.g.l;
import c.b.b.a.g.o;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public final class m<TResult> {
    public final Object a = new Object();
    @GuardedBy(value="mLock")
    public Queue<l<TResult>> b;
    @GuardedBy(value="mLock")
    public boolean c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(l<TResult> l10) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(l10);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(o<TResult> o10) {
        block10 : {
            Object object;
            Object object2 = object = this.a;
            synchronized (object2) {
                if (this.b != null && !this.c) {
                    this.c = true;
                    break block10;
                }
                return;
            }
        }
        do {
            Object object;
            l l10;
            Object object3 = object = this.a;
            synchronized (object3) {
                l10 = (l)this.b.poll();
                if (l10 == null) {
                    this.c = false;
                    return;
                }
            }
            l10.a(o10);
        } while (true);
    }
}

