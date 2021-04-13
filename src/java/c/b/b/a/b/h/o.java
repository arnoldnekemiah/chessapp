/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.Log
 *  c.b.b.a.b.h.n
 *  c.b.b.a.b.h.p
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 */
package c.b.b.a.b.h;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import c.b.b.a.b.h.c;
import c.b.b.a.b.h.m;
import c.b.b.a.b.h.n;
import c.b.b.a.b.h.p;
import c.b.b.a.b.i.a;
import java.util.HashMap;
import java.util.Map;

public final class o
implements Handler.Callback {
    public final /* synthetic */ n a;

    public /* synthetic */ o(n n2, m m2) {
        this.a = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        int n2 = message.what;
        if (n2 != 0) {
            HashMap hashMap2;
            if (n2 != 1) {
                return false;
            }
            HashMap hashMap3 = hashMap2 = this.a.c;
            synchronized (hashMap3) {
                c.a a2 = (c.a)message.obj;
                p p2 = (p)this.a.c.get((Object)a2);
                if (p2 != null && p2.b == 3) {
                    String string = String.valueOf((Object)a2);
                    StringBuilder stringBuilder = new StringBuilder(47 + string.length());
                    stringBuilder.append("Timeout waiting for ServiceConnection callback ");
                    stringBuilder.append(string);
                    Log.e((String)"GmsClientSupervisor", (String)stringBuilder.toString(), (Throwable)new Exception());
                    ComponentName componentName = p2.f;
                    if (componentName == null) {
                        componentName = a2.c;
                    }
                    if (componentName == null) {
                        String string2 = a2.b;
                        a.c.a.a.a(string2);
                        componentName = new ComponentName(string2, "unknown");
                    }
                    p2.onServiceDisconnected(componentName);
                }
                return true;
            }
        }
        HashMap hashMap4 = hashMap = this.a.c;
        synchronized (hashMap4) {
            c.a a4 = (c.a)message.obj;
            p p3 = (p)this.a.c.get((Object)a4);
            if (p3 != null && p3.a.isEmpty()) {
                if (p3.c) {
                    p3.g.e.removeMessages(1, (Object)p3.e);
                    n n3 = p3.g;
                    n3.f.a(n3.d, (ServiceConnection)p3);
                    p3.c = false;
                    p3.b = 2;
                }
                this.a.c.remove((Object)a4);
            }
            return true;
        }
    }
}

