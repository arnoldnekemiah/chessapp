/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClientImpl
 *  com.android.billingclient.api.BillingClientImpl$c
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.a.a.a;

import c.a.a.a.b;
import c.a.a.a.l;
import com.android.billingclient.api.BillingClientImpl;

public class g
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ BillingClientImpl.c c;

    public g(BillingClientImpl.c c2, int n2, String string) {
        this.c = c2;
        this.a = n2;
        this.b = string;
    }

    public void run() {
        b b2 = this.c.b;
        l.b b3 = l.a();
        b3.a = this.a;
        b3.b = this.b;
        b2.a(b3.a());
    }
}

