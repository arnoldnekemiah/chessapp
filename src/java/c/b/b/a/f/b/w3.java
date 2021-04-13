/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  c.b.b.a.e.d.l2
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import c.b.b.a.e.d.j3;
import c.b.b.a.e.d.l2;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.v3;
import c.b.b.a.f.b.y3;

public final class w3
implements ServiceConnection {
    public final String a;
    public final /* synthetic */ y3 b;

    public w3(y3 y32, String string) {
        this.b = y32;
        this.a = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.a().i.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            j3 j32 = l2.a((IBinder)iBinder);
            if (j32 == null) {
                this.b.a.a().i.a("Install Referrer Service implementation was not found");
                return;
            }
            this.b.a.a().n.a("Install Referrer Service connected");
            this.b.a.d().a(new v3(this, j32, this));
            return;
        }
        catch (Exception exception) {
            this.b.a.a().i.a("Exception occurred while calling Install Referrer API", (Object)exception);
            return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.a().n.a("Install Referrer Service disconnected");
    }
}

