/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.i.r.q;

import a.i.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

public class f {
    public static final String a = h.a("PackageManagerHelper");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, Class<?> class_, boolean bl) {
        String string = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, class_.getName());
            int n2 = bl ? 1 : 2;
            packageManager.setComponentEnabledSetting(componentName, n2, 1);
            h h2 = h.a();
            String string2 = a;
            Object[] arrobject = new Object[2];
            arrobject[0] = class_.getName();
            String string3 = bl ? string : "disabled";
            arrobject[1] = string3;
            h2.a(string2, String.format((String)"%s %s", (Object[])arrobject), new Throwable[0]);
            return;
        }
        catch (Exception exception) {
            h h4 = h.a();
            String string4 = a;
            Object[] arrobject = new Object[2];
            arrobject[0] = class_.getName();
            if (!bl) {
                string = "disabled";
            }
            arrobject[1] = string;
            h4.a(string4, String.format((String)"%s could not be %s", (Object[])arrobject), exception);
            return;
        }
    }
}

