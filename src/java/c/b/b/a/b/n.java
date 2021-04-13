/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.util.Log
 *  c.b.b.a.b.h.u
 *  c.b.b.a.b.o
 *  c.b.b.a.b.v
 *  c.b.b.a.c.a
 *  c.b.b.a.c.b
 *  com.google.android.gms.common.zzj
 *  com.google.android.gms.dynamite.DynamiteModule
 *  com.google.android.gms.dynamite.DynamiteModule$a
 *  com.google.android.gms.dynamite.DynamiteModule$b
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 *  javax.annotation.CheckReturnValue
 */
package c.b.b.a.b;

import a.c.a.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import c.b.b.a.b.h.u;
import c.b.b.a.b.o;
import c.b.b.a.b.p;
import c.b.b.a.b.v;
import c.b.b.a.c.b;
import com.google.android.gms.common.zzj;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
public final class n {
    public static volatile c.b.b.a.b.h.v a;
    public static final Object b;
    public static Context c;

    public static {
        b = new Object();
    }

    public static v a(String string, o o2, boolean bl, boolean bl2) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        try {
            v v2 = n.b(string, o2, bl, bl2);
            return v2;
        }
        finally {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context) {
        Class<n> class_ = n.class;
        synchronized (n.class) {
            if (c == null) {
                if (context != null) {
                    c = context.getApplicationContext();
                    // ** MonitorExit[var3_1] (shouldn't be in output)
                    return;
                }
            } else {
                Log.w((String)"GoogleCertificates", (String)"GoogleCertificates has been initialized already");
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static v b(String string, o o2, boolean bl, boolean bl2) {
        block8 : {
            try {
                Object object;
                if (a != null) break block8;
                a.a(c);
                Object object2 = object = b;
                synchronized (object2) {
                    if (a != null) break block8;
                }
            }
            catch (DynamiteModule.a a2) {
                String string2;
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)a2);
                String string3 = String.valueOf((Object)a2.getMessage());
                if (string3.length() != 0) {
                    string2 = "module init: ".concat(string3);
                    return new v(false, string2, (Throwable)a2);
                }
                string2 = new String("module init: ");
                return new v(false, string2, (Throwable)a2);
            }
            {
                a = u.a((IBinder)DynamiteModule.a((Context)c, (DynamiteModule.b)DynamiteModule.k, (String)"com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
        a.a(c);
        zzj zzj2 = new zzj(string, o2, bl, bl2);
        try {
            boolean bl3 = a.a(zzj2, (c.b.b.a.c.a)new b((Object)c.getPackageManager()));
            if (!bl3) return v.a((Callable)new p(bl, string, o2));
            return v.d;
        }
        catch (RemoteException remoteException) {
            Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)remoteException);
            return new v(false, "module call", (Throwable)remoteException);
        }
    }
}

