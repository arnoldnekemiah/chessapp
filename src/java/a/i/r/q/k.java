/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.WeakHashMap
 */
package a.i.r.q;

import a.i.h;
import android.content.Context;
import android.os.PowerManager;
import c.a.b.a.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class k {
    public static final String a = h.a("WakeLocks");
    public static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PowerManager.WakeLock a(Context context, String string) {
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap;
        PowerManager powerManager = (PowerManager)context.getApplicationContext().getSystemService("power");
        String string2 = a.a("WorkManager: ", string);
        PowerManager.WakeLock wakeLock = powerManager.newWakeLock(1, string2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap2 = weakHashMap = b;
        synchronized (weakHashMap2) {
            b.put((Object)wakeLock, (Object)string2);
            return wakeLock;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void a() {
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap2 = weakHashMap = b;
        // MONITORENTER : weakHashMap2
        hashMap.putAll(b);
        // MONITOREXIT : weakHashMap2
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock)iterator.next();
            if (wakeLock == null || !wakeLock.isHeld()) continue;
            Object[] arrobject = new Object[]{hashMap.get((Object)wakeLock)};
            String string = String.format((String)"WakeLock held for %s", (Object[])arrobject);
            h.a().d(a, string, new Throwable[0]);
        }
        return;
        {
            catch (Throwable throwable) {}
            {
                // MONITOREXIT : weakHashMap2
                throw throwable;
            }
        }
    }
}

