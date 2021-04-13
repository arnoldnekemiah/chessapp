/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  c.b.b.a.e.d.b3
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 */
package c.b.b.a.e.d;

import a.b.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import c.b.b.a.e.d.b3;
import c.b.b.a.e.d.u2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class r3
implements b3 {
    public static final Map<String, r3> b = new a<String, r3>();
    public final SharedPreferences a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static r3 a(Context context, String string) {
        if (u2.a()) {
            throw null;
        }
        Class<r3> class_ = r3.class;
        synchronized (r3.class) {
            r3 r32 = (r3)b.get(null);
            if (r32 != null) {
                // ** MonitorExit[var6_2] (shouldn't be in output)
                return r32;
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            }
            catch (Throwable throwable) {
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                throw throwable;
            }
        }
    }

    public static void a() {
        Class<r3> class_ = r3.class;
        synchronized (r3.class) {
            Iterator iterator = b.values().iterator();
            if (!iterator.hasNext()) {
                b.clear();
                // ** MonitorExit[var3] (shouldn't be in output)
                return;
            }
            throw null;
        }
    }

    public final Object a(String string) {
        throw null;
    }
}

