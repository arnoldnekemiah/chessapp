/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Log
 *  android.util.SparseArray
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a.d.a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
public abstract class a
extends BroadcastReceiver {
    public static final SparseArray<PowerManager.WakeLock> a = new SparseArray();
    public static int b = 1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray;
        int n2 = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (n2 == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = sparseArray = a;
        synchronized (sparseArray2) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock)a.get(n2);
            if (wakeLock != null) {
                wakeLock.release();
                a.remove(n2);
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No active wake lock id #");
            stringBuilder.append(n2);
            Log.w((String)"WakefulBroadcastReceiv.", (String)stringBuilder.toString());
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ComponentName b(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray;
        SparseArray<PowerManager.WakeLock> sparseArray2 = sparseArray = a;
        synchronized (sparseArray2) {
            int n2;
            int n3 = b;
            b = n2 = 1 + b;
            if (n2 <= 0) {
                b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", n3);
            ComponentName componentName = context.startService(intent);
            if (componentName == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager)context.getSystemService("power");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("androidx.core:wake:");
            stringBuilder.append(componentName.flattenToShortString());
            PowerManager.WakeLock wakeLock = powerManager.newWakeLock(1, stringBuilder.toString());
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(60000L);
            a.put(n3, (Object)wakeLock);
            return componentName;
        }
    }
}

