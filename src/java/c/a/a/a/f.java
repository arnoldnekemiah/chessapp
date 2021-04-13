/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClientImpl
 *  com.android.billingclient.api.BillingClientImpl$c
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.a.a.a;

import c.a.a.a.b;
import c.a.a.a.l;
import c.a.a.a.m;
import c.a.b.a.a;
import com.android.billingclient.api.BillingClientImpl;

public class f
implements Runnable {
    public final /* synthetic */ Exception a;
    public final /* synthetic */ BillingClientImpl.c b;

    public f(BillingClientImpl.c c2, Exception exception) {
        this.b = c2;
        this.a = exception;
    }

    public void run() {
        StringBuilder stringBuilder = a.a("Error acknowledge purchase; ex: ");
        stringBuilder.append((Object)this.a);
        c.a.a.b.a.c("BillingClient", stringBuilder.toString());
        this.b.b.a(m.m);
    }
}

