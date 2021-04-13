/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Binder
 *  android.os.Process
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.b.k;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;

public class a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public ApplicationInfo a(String string, int n2) {
        return this.a.getPackageManager().getApplicationInfo(string, n2);
    }

    public boolean a() {
        String string;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.c.a.a.a(this.a);
        }
        if (a.c.a.a.b() && (string = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return this.a.getPackageManager().isInstantApp(string);
        }
        return false;
    }

    public PackageInfo b(String string, int n2) {
        return this.a.getPackageManager().getPackageInfo(string, n2);
    }
}

