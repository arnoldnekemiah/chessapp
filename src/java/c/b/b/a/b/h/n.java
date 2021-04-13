/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Message
 *  c.b.b.a.e.c.d
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  javax.annotation.concurrent.GuardedBy
 */
package c.b.b.a.b.h;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import c.b.b.a.b.h.c;
import c.b.b.a.b.h.m;
import c.b.b.a.b.h.o;
import c.b.b.a.b.h.p;
import c.b.b.a.b.i.a;
import c.b.b.a.e.c.d;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public final class n
extends c {
    @GuardedBy(value="connectionStatus")
    public final HashMap<c.a, p> c = new HashMap();
    public final Context d;
    public final Handler e;
    public final a f;
    public final long g;
    public final long h;

    public n(Context context) {
        this.d = context.getApplicationContext();
        this.e = new d(context.getMainLooper(), (Handler.Callback)new o(this, null));
        this.f = a.a();
        this.g = 5000L;
        this.h = 300000L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a(c.a a5, ServiceConnection serviceConnection, String string) {
        HashMap<c.a, p> hashMap;
        a.c.a.a.a(serviceConnection, (Object)"ServiceConnection must not be null");
        HashMap<c.a, p> hashMap2 = hashMap = this.c;
        synchronized (hashMap2) {
            p p3 = (p)this.c.get((Object)a5);
            if (p3 == null) {
                p3 = new p(this, a5);
                p3.a.put((Object)serviceConnection, (Object)serviceConnection);
                p3.a(string);
                this.c.put((Object)a5, (Object)p3);
                return p3.c;
            } else {
                this.e.removeMessages(0, (Object)a5);
                if (p3.a.containsKey((Object)serviceConnection)) {
                    String string2 = String.valueOf((Object)a5);
                    StringBuilder stringBuilder = new StringBuilder(81 + string2.length());
                    stringBuilder.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    stringBuilder.append(string2);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                p3.a.put((Object)serviceConnection, (Object)serviceConnection);
                int n10 = p3.b;
                if (n10 != 1) {
                    if (n10 != 2) return p3.c;
                    {
                        p3.a(string);
                        return p3.c;
                    }
                } else {
                    serviceConnection.onServiceConnected(p3.f, p3.d);
                }
            }
            return p3.c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(c.a a5, ServiceConnection serviceConnection, String string) {
        HashMap<c.a, p> hashMap;
        a.c.a.a.a(serviceConnection, (Object)"ServiceConnection must not be null");
        HashMap<c.a, p> hashMap2 = hashMap = this.c;
        synchronized (hashMap2) {
            p p3 = (p)this.c.get((Object)a5);
            if (p3 == null) {
                String string2 = String.valueOf((Object)a5);
                StringBuilder stringBuilder = new StringBuilder(50 + string2.length());
                stringBuilder.append("Nonexistent connection status for service config: ");
                stringBuilder.append(string2);
                throw new IllegalStateException(stringBuilder.toString());
            }
            if (!p3.a.containsKey((Object)serviceConnection)) {
                String string3 = String.valueOf((Object)a5);
                StringBuilder stringBuilder = new StringBuilder(76 + string3.length());
                stringBuilder.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                stringBuilder.append(string3);
                throw new IllegalStateException(stringBuilder.toString());
            }
            p3.a.remove((Object)serviceConnection);
            if (p3.a.isEmpty()) {
                Message message = this.e.obtainMessage(0, (Object)a5);
                this.e.sendMessageDelayed(message, this.g);
            }
            return;
        }
    }
}

