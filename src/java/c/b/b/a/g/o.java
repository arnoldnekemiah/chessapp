/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Throwable
 *  javax.annotation.concurrent.GuardedBy
 */
package c.b.b.a.g;

import a.c.a.a;
import c.b.b.a.g.m;
import javax.annotation.concurrent.GuardedBy;

public final class o<TResult>
extends o<TResult> {
    public final Object a = new Object();
    public final m<TResult> b = new m();
    @GuardedBy(value="mLock")
    public boolean c;
    @GuardedBy(value="mLock")
    public TResult d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Exception a() {
        Object object;
        Object object2 = object = this.a;
        // MONITORENTER : object2
        // MONITOREXIT : object2
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(TResult TResult) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = TResult;
        }
        this.b.a(this);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final TResult b() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            try {
                a.b(this.c, (Object)"Task is not yet complete");
                TResult TResult = this.d;
                return TResult;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            return this.c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (!this.c) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (!this.c) {
                return;
            }
        }
        this.b.a(this);
    }
}

