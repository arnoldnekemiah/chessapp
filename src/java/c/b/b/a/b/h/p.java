/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Parcelable
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 */
package c.b.b.a.b.h;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import c.b.b.a.b.h.c;
import c.b.b.a.b.h.n;
import c.b.b.a.b.h.q;
import c.b.b.a.b.i.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class p
implements ServiceConnection,
q {
    public final Map<ServiceConnection, ServiceConnection> a;
    public int b;
    public boolean c;
    public IBinder d;
    public final c.a e;
    public ComponentName f;
    public final /* synthetic */ n g;

    public p(n n10, c.a a5) {
        this.g = n10;
        this.e = a5;
        this.a = new HashMap();
        this.b = 2;
    }

    public final void a(String string) {
        boolean bl;
        Context context;
        a a5;
        Object object;
        block9 : {
            Intent intent;
            block10 : {
                c.a a6;
                block8 : {
                    this.b = 3;
                    n n10 = this.g;
                    a5 = n10.f;
                    context = n10.d;
                    a6 = this.e;
                    if (a6.a == null) break block8;
                    boolean bl2 = a6.e;
                    object = null;
                    if (bl2) {
                        Bundle bundle;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("serviceActionBundleKey", a6.a);
                        try {
                            bundle = context.getContentResolver().call(c.a.f, "serviceIntentCall", null, bundle2);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            String string2 = String.valueOf((Object)((Object)illegalArgumentException));
                            StringBuilder stringBuilder = new StringBuilder(34 + string2.length());
                            stringBuilder.append("Dynamic intent resolution failed: ");
                            stringBuilder.append(string2);
                            Log.w((String)"ConnectionStatusConfig", (String)stringBuilder.toString());
                            bundle = null;
                        }
                        object = bundle == null ? null : (Intent)bundle.getParcelable("serviceResponseIntentKey");
                        if (object == null) {
                            String string3 = String.valueOf((Object)a6.a);
                            String string4 = string3.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(string3) : new String("Dynamic lookup for intent failed for action: ");
                            Log.w((String)"ConnectionStatusConfig", (String)string4);
                        }
                    }
                    if (object != null) break block9;
                    intent = new Intent(a6.a).setPackage(a6.b);
                    break block10;
                }
                intent = new Intent().setComponent(a6.c);
            }
            object = intent;
        }
        this.c = bl = a5.a(context, string, (Intent)object, this, this.e.d);
        if (bl) {
            Message message = this.g.e.obtainMessage(1, (Object)this.e);
            n n11 = this.g;
            n11.e.sendMessageDelayed(message, n11.h);
            return;
        }
        this.b = 2;
        try {
            this.g.f.a(this.g.d, this);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap<c.a, p> hashMap;
        HashMap<c.a, p> hashMap2 = hashMap = this.g.c;
        synchronized (hashMap2) {
            this.g.e.removeMessages(1, (Object)this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator iterator = this.a.values().iterator();
            do {
                if (!iterator.hasNext()) {
                    this.b = 1;
                    return;
                }
                ((ServiceConnection)iterator.next()).onServiceConnected(componentName, iBinder);
            } while (true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap<c.a, p> hashMap;
        HashMap<c.a, p> hashMap2 = hashMap = this.g.c;
        synchronized (hashMap2) {
            this.g.e.removeMessages(1, (Object)this.e);
            this.d = null;
            this.f = componentName;
            Iterator iterator = this.a.values().iterator();
            do {
                if (!iterator.hasNext()) {
                    this.b = 2;
                    return;
                }
                ((ServiceConnection)iterator.next()).onServiceDisconnected(componentName);
            } while (true);
        }
    }
}

