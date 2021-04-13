/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 */
package a.e;

import a.e.b;
import a.e.c;
import a.e.g;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class e
extends Service
implements c {
    public final g a = new g(this);

    public IBinder onBind(Intent intent) {
        g g5 = this.a;
        if (g5 != null) {
            g5.a(b.a.ON_START);
            return null;
        }
        throw null;
    }

    public void onCreate() {
        g g5 = this.a;
        if (g5 != null) {
            g5.a(b.a.ON_CREATE);
            super.onCreate();
            return;
        }
        throw null;
    }

    public void onDestroy() {
        g g5 = this.a;
        if (g5 != null) {
            g5.a(b.a.ON_STOP);
            g5.a(b.a.ON_DESTROY);
            super.onDestroy();
            return;
        }
        throw null;
    }

    public void onStart(Intent intent, int n4) {
        g g5 = this.a;
        if (g5 != null) {
            g5.a(b.a.ON_START);
            super.onStart(intent, n4);
            return;
        }
        throw null;
    }

    public int onStartCommand(Intent intent, int n4, int n10) {
        return super.onStartCommand(intent, n4, n10);
    }
}

