/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.Object
 *  java.util.List
 */
package c.a.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c.a.a.a.l;
import c.a.a.a.n;
import c.a.a.a.o;
import java.util.List;

public class c {
    public final Context a;
    public final b b;

    public c(Context context, o o2) {
        this.a = context;
        this.b = new b(o2, null);
    }

    public class b
    extends BroadcastReceiver {
        public final o a;
        public boolean b;

        public /* synthetic */ b(o o2, a a2) {
            this.a = o2;
        }

        public void onReceive(Context context, Intent intent) {
            l l2 = c.a.a.b.a.a(intent, "BillingBroadcastManager");
            List<n> list = c.a.a.b.a.a(intent.getExtras());
            this.a.a(l2, list);
        }
    }

}

