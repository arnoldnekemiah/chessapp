/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  c.b.b.a.f.b.a9
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.m3;
import c.b.b.a.f.b.n3;

public final class o3
extends BroadcastReceiver {
    public final a9 a;
    public boolean b;
    public boolean c;

    public o3(a9 a92) {
        a.a(a92);
        this.a = a92;
    }

    public final void a() {
        this.a.t();
        this.a.d().g();
        this.a.d().g();
        if (this.b) {
            this.a.a().n.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            Context context = this.a.j.a;
            try {
                context.unregisterReceiver((BroadcastReceiver)this);
                return;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.a.a().f.a("Failed to unregister the network broadcast receiver", (Object)illegalArgumentException);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.t();
        String string = intent.getAction();
        this.a.a().n.a("NetworkBroadcastReceiver received action", string);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals((Object)string)) {
            boolean bl = this.a.m().k();
            if (this.c != bl) {
                this.c = bl;
                this.a.d().a(new n3(this, bl));
            }
            return;
        }
        this.a.a().i.a("NetworkBroadcastReceiver received unknown action", string);
    }
}

