/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package c.b.b.a.f.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import c.b.b.a.b.i.a;
import c.b.b.a.b.k.b;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.w3;
import java.util.List;

public final class y3 {
    public final i4 a;

    public y3(i4 i42) {
        this.a = i42;
    }

    public final void a(String string) {
        if (string != null && !string.isEmpty()) {
            this.a.d().g();
            if (!this.a()) {
                this.a.a().l.a("Install Referrer Reporter is not available");
                return;
            }
            w3 w32 = new w3(this, string);
            this.a.d().g();
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            PackageManager packageManager = this.a.a.getPackageManager();
            if (packageManager == null) {
                this.a.a().j.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                return;
            }
            List list = packageManager.queryIntentServices(intent, 0);
            if (list != null && !list.isEmpty()) {
                ServiceInfo serviceInfo = ((ResolveInfo)list.get((int)0)).serviceInfo;
                if (serviceInfo != null) {
                    String string2 = serviceInfo.packageName;
                    if (serviceInfo.name != null && "com.android.vending".equals((Object)string2) && this.a()) {
                        String string3;
                        f3 f32;
                        Intent intent2 = new Intent(intent);
                        try {
                            boolean bl = a.a().a(this.a.a, intent2, w32, 1);
                            f32 = this.a.a().n;
                            string3 = true != bl ? "not available" : "available";
                        }
                        catch (Exception exception) {
                            this.a.a().f.a("Exception occurred while binding to Install Referrer Service", exception.getMessage());
                            return;
                        }
                        f32.a("Install Referrer Service is", string3);
                        return;
                    }
                    this.a.a().i.a("Play Store version 8.3.73 or higher required for Install Referrer");
                }
                return;
            }
            this.a.a().l.a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        this.a.a().j.a("Install Referrer Reporter was called with invalid app package name");
    }

    public final boolean a() {
        c.b.b.a.b.k.a a10;
        block5 : {
            try {
                a10 = b.b(this.a.a);
                if (a10 != null) break block5;
            }
            catch (Exception exception) {
                this.a.a().n.a("Failed to retrieve Play Store version for Install Referrer", (Object)exception);
                return false;
            }
            this.a.a().n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        }
        int n10 = a10.a.getPackageManager().getPackageInfo((String)"com.android.vending", (int)128).versionCode;
        boolean bl = false;
        if (n10 >= 80837300) {
            bl = true;
        }
        return bl;
    }
}

