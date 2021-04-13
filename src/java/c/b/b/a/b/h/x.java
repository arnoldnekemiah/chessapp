/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  javax.annotation.concurrent.GuardedBy
 */
package c.b.b.a.b.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import c.b.b.a.b.k.a;
import c.b.b.a.b.k.b;
import javax.annotation.concurrent.GuardedBy;

public final class x {
    public static Object a = new Object();
    @GuardedBy(value="sLock")
    public static boolean b;
    public static int c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context) {
        Object object;
        Object object2 = object = a;
        synchronized (object2) {
            Bundle bundle;
            block6 : {
                if (b) {
                    return;
                }
                b = true;
                String string = context.getPackageName();
                a a2 = b.b(context);
                bundle = a2.a((String)string, (int)128).metaData;
                if (bundle != null) break block6;
                return;
            }
            try {
                bundle.getString("com.google.app.id");
                c = bundle.getInt("com.google.android.gms.version");
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                Log.wtf((String)"MetadataValueReader", (String)"This should never happen.", (Throwable)nameNotFoundException);
            }
            return;
        }
    }
}

