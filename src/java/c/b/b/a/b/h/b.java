/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Message
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.util.Log
 *  c.b.b.a.b.h.b$d
 *  c.b.b.a.b.h.b$f
 *  c.b.b.a.b.h.b$i
 *  c.b.b.a.b.h.b$j
 *  c.b.b.a.b.h.b$k
 *  c.b.b.a.b.h.f
 *  com.google.android.gms.common.ConnectionResult
 *  com.google.android.gms.common.Feature
 *  com.google.android.gms.common.api.Scope
 *  com.google.android.gms.common.internal.GetServiceRequest
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicInteger
 *  javax.annotation.concurrent.GuardedBy
 */
package c.b.b.a.b.h;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c.b.b.a.b.h.b;
import c.b.b.a.b.h.c;
import c.b.b.a.b.h.e;
import c.b.b.a.b.h.r;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/*
 * Exception performing whole class analysis.
 */
public abstract class b<T extends IInterface> {
    public static final Feature[] u;
    public r a;
    public final Context b;
    public final c.b.b.a.b.h.c c;
    public final c.b.b.a.b.b d;
    public final Handler e;
    public final Object f;
    public final Object g;
    @GuardedBy(value="mServiceBrokerLock")
    public c.b.b.a.b.h.g h;
    public c i;
    @GuardedBy(value="mLock")
    public T j;
    public final ArrayList<g<?>> k;
    @GuardedBy(value="mLock")
    public h l;
    @GuardedBy(value="mLock")
    public int m;
    public final a n;
    public final b o;
    public final int p;
    public final String q;
    public ConnectionResult r;
    public boolean s;
    public AtomicInteger t;

    public static {
        u = new Feature[0];
    }

    public b(Context context, Looper looper, int n2, a a2, b b2, String string) {
        c.b.b.a.b.h.c c2 = c.b.b.a.b.h.c.a(context);
        c.b.b.a.b.b b3 = c.b.b.a.b.b.b;
        a.c.a.a.a(a2);
        a a4 = a2;
        a.c.a.a.a(b2);
        b b4 = b2;
        this.f = new Object();
        this.g = new Object();
        this.k = new ArrayList();
        this.m = 1;
        this.r = null;
        this.s = false;
        this.t = new AtomicInteger(0);
        a.c.a.a.a(context, (Object)"Context must not be null");
        this.b = context;
        a.c.a.a.a(looper, (Object)"Looper must not be null");
        a.c.a.a.a(c2, (Object)"Supervisor must not be null");
        this.c = c2;
        a.c.a.a.a(b3, (Object)"API availability must not be null");
        this.d = b3;
        this.e = new /* Unavailable Anonymous Inner Class!! */;
        this.p = n2;
        this.n = a4;
        this.o = b4;
        this.q = string;
    }

    public static /* synthetic */ void a(b b2) {
        int n2;
        if (b2.g()) {
            n2 = 5;
            b2.s = true;
        } else {
            n2 = 4;
        }
        Handler handler = b2.e;
        handler.sendMessage(handler.obtainMessage(n2, b2.t.get(), 16));
    }

    public static /* synthetic */ boolean b(b b2) {
        boolean bl;
        boolean bl2 = b2.s;
        bl = false;
        if (bl2) {
            return false;
        }
        if (TextUtils.isEmpty((CharSequence)"com.google.android.gms.measurement.internal.IMeasurementService")) {
            return false;
        }
        if (TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName((String)"com.google.android.gms.measurement.internal.IMeasurementService");
            bl = true;
        }
        catch (ClassNotFoundException classNotFoundException) {}
        return bl;
    }

    public void a() {
        int n2 = this.d.a(this.b, 12451000);
        if (n2 != 0) {
            this.a(1, null);
            d d2 = new /* Unavailable Anonymous Inner Class!! */;
            a.c.a.a.a(d2, (Object)"Connection progress callbacks cannot be null.");
            this.i = d2;
            Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(3, this.t.get(), n2, null));
            return;
        }
        d d3 = new /* Unavailable Anonymous Inner Class!! */;
        a.c.a.a.a(d3, (Object)"Connection progress callbacks cannot be null.");
        this.i = d3;
        this.a(2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n2, T t2) {
        Object object;
        boolean bl = n2 == 4;
        boolean bl2 = t2 != null;
        boolean bl3 = false;
        if (bl == bl2) {
            bl3 = true;
        }
        a.c.a.a.a(bl3);
        Object object2 = object = this.f;
        synchronized (object2) {
            this.m = n2;
            this.j = t2;
            if (n2 != 1) {
                if (n2 != 2 && n2 != 3) {
                    if (n2 == 4) {
                        System.currentTimeMillis();
                    }
                } else {
                    r r2;
                    if (this.l != null && this.a != null) {
                        String string = this.a.a;
                        String string2 = this.a.b;
                        StringBuilder stringBuilder = new StringBuilder(70 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length());
                        stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
                        stringBuilder.append(string);
                        stringBuilder.append(" on ");
                        stringBuilder.append(string2);
                        Log.e((String)"GmsClient", (String)stringBuilder.toString());
                        c.b.b.a.b.h.c c2 = this.c;
                        String string3 = this.a.a;
                        String string4 = this.a.b;
                        int n3 = this.a.c;
                        h h2 = this.l;
                        String string5 = this.f();
                        boolean bl4 = this.a.d;
                        if (c2 == null) throw null;
                        c2.b(new c.a(string3, string4, n3, bl4), h2, string5);
                        this.t.incrementAndGet();
                    }
                    this.l = new h(this, this.t.get());
                    c.b.b.a.b.h.c.a();
                    this.a = r2 = new r("com.google.android.gms", "com.google.android.gms.measurement.START", false, 129, false);
                    if (r2.d) {
                        String string;
                        String string6 = String.valueOf((Object)this.a.a);
                        if (string6.length() != 0) {
                            string = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(string6);
                            throw new IllegalStateException(string);
                        }
                        string = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                        throw new IllegalStateException(string);
                    }
                    c.b.b.a.b.h.c c3 = this.c;
                    String string = r2.a;
                    String string7 = r2.b;
                    int n5 = r2.c;
                    h h4 = this.l;
                    String string8 = this.f();
                    if (c3.a(new c.a(string, string7, n5, this.a.d), h4, string8)) return;
                    String string9 = this.a.a;
                    String string10 = this.a.b;
                    StringBuilder stringBuilder = new StringBuilder(34 + String.valueOf((Object)string9).length() + String.valueOf((Object)string10).length());
                    stringBuilder.append("unable to connect to service: ");
                    stringBuilder.append(string9);
                    stringBuilder.append(" on ");
                    stringBuilder.append(string10);
                    Log.e((String)"GmsClient", (String)stringBuilder.toString());
                    int n7 = this.t.get();
                    Handler handler = this.e;
                    handler.sendMessage(handler.obtainMessage(7, n7, -1, (Object)new /* Unavailable Anonymous Inner Class!! */));
                }
            } else {
                if (this.l == null) return;
                c.b.b.a.b.h.c c4 = this.c;
                String string = this.a.a;
                String string11 = this.a.b;
                int n8 = this.a.c;
                h h5 = this.l;
                String string12 = this.f();
                boolean bl5 = this.a.d;
                if (c4 == null) throw null;
                c4.b(new c.a(string, string11, n8, bl5), h5, string12);
                this.l = null;
            }
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(c.b.b.a.b.h.d d2, Set<Scope> set) {
        void var11_10;
        block9 : {
            Bundle bundle = new Bundle();
            GetServiceRequest getServiceRequest = new GetServiceRequest(this.p);
            getServiceRequest.d = this.b.getPackageName();
            getServiceRequest.g = bundle;
            if (set != null) {
                getServiceRequest.f = (Scope[])set.toArray((Object[])new Scope[set.size()]);
            }
            Feature[] arrfeature = u;
            getServiceRequest.i = arrfeature;
            getServiceRequest.j = arrfeature;
            try {
                Object object;
                Object object2 = object = this.g;
                // MONITORENTER : object2
                if (this.h == null) break block9;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (RemoteException remoteException) {
                // empty catch block
            }
            this.h.a((e)new /* Unavailable Anonymous Inner Class!! */, getServiceRequest);
            return;
        }
        Log.w((String)"GmsClient", (String)"mServiceBroker is null, client disconnected");
        // MONITOREXIT : object2
        return;
        Log.w((String)"GmsClient", (String)"IGmsServiceBroker.getService failed", (Throwable)var11_10);
        int n2 = this.t.get();
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(1, n2, -1, (Object)new /* Unavailable Anonymous Inner Class!! */));
        return;
        catch (SecurityException securityException) {
            throw securityException;
        }
        catch (DeadObjectException deadObjectException) {
            Log.w((String)"GmsClient", (String)"IGmsServiceBroker.getService failed", (Throwable)deadObjectException);
            Handler handler2 = this.e;
            handler2.sendMessage(handler2.obtainMessage(6, this.t.get(), 3));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(int n2, int n3, T t2) {
        Object object;
        Object object2 = object = this.f;
        synchronized (object2) {
            if (this.m != n2) {
                return false;
            }
            this.a(n3, t2);
            return true;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void b() {
        ArrayList<g<?>> arrayList;
        Object object;
        this.t.incrementAndGet();
        ArrayList<g<?>> arrayList2 = arrayList = this.k;
        // MONITORENTER : arrayList2
        int n2 = this.k.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((g)this.k.get(i2)).c();
        }
        this.k.clear();
        // MONITOREXIT : arrayList2
        Object object2 = object = this.g;
        this.h = null;
        this.a(1, null);
        return;
        finally {
            // MONITORENTER : object2
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final T c() {
        Object object;
        Object object2 = object = this.f;
        synchronized (object2) {
            if (this.m == 5) {
                throw new DeadObjectException();
            }
            if (!this.d()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            boolean bl = this.j != null;
            a.c.a.a.b(bl, (Object)"Client is connected but service is null");
            T t2 = this.j;
            return t2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean d() {
        Object object;
        Object object2 = object = this.f;
        synchronized (object2) {
            if (this.m != 4) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean e() {
        Object object;
        Object object2 = object = this.f;
        synchronized (object2) {
            if (this.m == 2) return true;
            if (this.m != 3) return false;
            return true;
        }
    }

    public final String f() {
        String string = this.q;
        if (string == null) {
            string = this.b.getClass().getName();
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean g() {
        Object object;
        Object object2 = object = this.f;
        synchronized (object2) {
            if (this.m != 3) return false;
            return true;
        }
    }

    public static interface a {
        public void a(int var1);

        public void a(Bundle var1);
    }

    public static interface b {
        public void a(ConnectionResult var1);
    }

    public static interface c {
        public void a(ConnectionResult var1);
    }

    public abstract class g<TListener> {
        public TListener a;
        public boolean b;

        public g(TListener TListener) {
            this.a = TListener;
            this.b = false;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public final void a() {
            g g2 = this;
            // MONITORENTER : g2
            TListener TListener = this.a;
            if (this.b) {
                String string = String.valueOf((Object)this);
                StringBuilder stringBuilder = new StringBuilder(47 + string.length());
                stringBuilder.append("Callback proxy ");
                stringBuilder.append(string);
                stringBuilder.append(" being reused. This is not safe.");
                Log.w((String)"GmsClient", (String)stringBuilder.toString());
            }
            // MONITOREXIT : g2
            if (TListener != null) {
                this.a(TListener);
            }
            g2 = this;
            // MONITORENTER : g2
            this.b = true;
            // MONITOREXIT : g2
            this.b();
        }

        public abstract void a(TListener var1);

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void b() {
            ArrayList<g<?>> arrayList;
            this.c();
            ArrayList<g<?>> arrayList2 = arrayList = b.this.k;
            synchronized (arrayList2) {
                b.this.k.remove((Object)this);
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void c() {
            g g2 = this;
            synchronized (g2) {
                this.a = null;
                return;
            }
        }
    }

    /*
     * Exception performing whole class analysis.
     */
    public final class h
    implements ServiceConnection {
        public final int a;
        public final /* synthetic */ b b;

        public h(b b2, int n2) {
            this.b = b2;
            this.a = n2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Object object;
            b b2 = this.b;
            if (iBinder == null) {
                b.a(b2);
                return;
            }
            Object object2 = object = b2.g;
            synchronized (object2) {
                b b3 = this.b;
                IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                Object object3 = iInterface != null && iInterface instanceof c.b.b.a.b.h.g ? (c.b.b.a.b.h.g)iInterface : new c.b.b.a.b.h.f(iBinder);
                b3.h = object3;
            }
            b b4 = this.b;
            int n2 = this.a;
            Handler handler = b4.e;
            handler.sendMessage(handler.obtainMessage(7, n2, -1, (Object)new /* Unavailable Anonymous Inner Class!! */));
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void onServiceDisconnected(ComponentName componentName) {
            Object object;
            Object object2 = object = this.b.g;
            synchronized (object2) {
                this.b.h = null;
            }
            Handler handler = this.b.e;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

}

