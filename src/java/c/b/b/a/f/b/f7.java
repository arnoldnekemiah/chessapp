/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.content.Context;
import android.os.RemoteException;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.x2;
import c.b.b.a.f.b.y7;

public final class f7
implements Runnable {
    public final /* synthetic */ q6 a;
    public final /* synthetic */ y7 b;

    public f7(y7 y72, q6 q62) {
        this.b = y72;
        this.a = q62;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        y7 y72 = this.b;
        x2 x22 = y72.d;
        if (x22 == null) {
            y72.a.a().f.a("Failed to send current screen to service");
            return;
        }
        try {
            q6 q62 = this.a;
            if (q62 == null) {
                x22.a(0L, null, null, y72.a.a.getPackageName());
            } else {
                x22.a(q62.c, q62.a, q62.b, y72.a.a.getPackageName());
            }
            this.b.r();
            return;
        }
        catch (RemoteException remoteException) {
            this.b.a.a().f.a("Failed to send current screen to the service", (Object)remoteException);
            return;
        }
    }
}

