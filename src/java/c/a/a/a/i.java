/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClientImpl
 *  com.android.billingclient.api.BillingClientImpl$i
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.a.a.a;

import c.a.a.a.j;
import c.a.a.a.l;
import com.android.billingclient.api.BillingClientImpl;

public class i
implements Runnable {
    public final /* synthetic */ l a;
    public final /* synthetic */ BillingClientImpl.i b;

    public i(BillingClientImpl.i i2, l l2) {
        this.b = i2;
        this.a = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Object object;
        Object object2 = object = this.b.a;
        synchronized (object2) {
            if (this.b.c != null) {
                this.b.c.a(this.a);
            }
            return;
        }
    }
}

