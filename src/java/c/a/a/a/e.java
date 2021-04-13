/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClientImpl
 *  com.android.billingclient.api.BillingClientImpl$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 */
package c.a.a.a;

import c.a.a.a.l;
import c.a.a.a.p;
import c.a.a.a.r;
import com.android.billingclient.api.BillingClientImpl;
import java.util.List;

public class e
implements Runnable {
    public final /* synthetic */ p.a a;
    public final /* synthetic */ BillingClientImpl.a b;

    public e(BillingClientImpl.a a2, p.a a4) {
        this.b = a2;
        this.a = a4;
    }

    public void run() {
        r r2 = this.b.c;
        l.b b2 = l.a();
        p.a a2 = this.a;
        b2.a = a2.b;
        b2.b = a2.c;
        r2.a(b2.a(), this.a.a);
    }
}

