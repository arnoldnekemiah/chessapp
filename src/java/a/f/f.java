/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.f.d$a
 *  a.f.f$a
 *  a.f.f$e
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.util.Log
 *  androidx.room.MultiInstanceInvalidationService
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package a.f;

import a.f.d;
import a.f.e;
import a.f.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class f {
    public Context a;
    public final String b;
    public int c;
    public final a.f.e d;
    public final e.c e;
    public a.f.d f;
    public final Executor g;
    public final a.f.c h = new a(this);
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final ServiceConnection j = new ServiceConnection(){

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f = d.a.a((IBinder)iBinder);
            f f2 = f.this;
            f2.g.execute(f2.k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            f f2 = f.this;
            f2.g.execute(f2.l);
            f f4 = f.this;
            f4.f = null;
            f4.a = null;
        }
    };
    public final Runnable k = new Runnable(){

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void run() {
            a.f.d d2 = f.this.f;
            if (d2 == null) return;
            try {
                f.this.c = d2.a(f.this.h, f.this.b);
                f.this.d.a(f.this.e);
                return;
            }
            catch (RemoteException remoteException) {
                Log.w((String)"ROOM", (String)"Cannot register multi-instance invalidation callback", (Throwable)remoteException);
            }
        }
    };
    public final Runnable l = new Runnable(){

        public void run() {
            f f2 = f.this;
            f2.d.b(f2.e);
        }
    };

    public f(Context context, String string, a.f.e e2, Executor executor) {
        this.a = context.getApplicationContext();
        this.b = string;
        this.d = e2;
        this.g = executor;
        this.e = new e(this, e2.b);
        Intent intent = new Intent(this.a, MultiInstanceInvalidationService.class);
        this.a.bindService(intent, this.j, 1);
    }

}

