/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageManager
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package c.b.b.a.f.b;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g4;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.m6;
import c.b.b.a.f.b.p3;
import c.b.b.a.f.b.u3;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class l6
implements Runnable {
    public final m6 a;
    public final int b;
    public final Exception c;
    public final byte[] d;
    public final Map e;

    public l6(m6 m62, int n2, Exception exception, byte[] arrby, Map map) {
        this.a = m62;
        this.b = n2;
        this.c = exception;
        this.d = arrby;
        this.e = map;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        block8 : {
            block9 : {
                block6 : {
                    block7 : {
                        var1_1 = this.a;
                        var2_2 = this.b;
                        var3_3 = this.c;
                        var4_4 = this.d;
                        var5_5 = var1_1.d.a;
                        if (var2_2 == 200 || var2_2 == 204) break block7;
                        if (var2_2 != 304) break block8;
                        var2_2 = 304;
                    }
                    if (var3_3 != null) break block8;
                    var5_5.m().w.a(true);
                    if (var4_4 == null || var4_4.length == 0) break block9;
                    var6_6 = new String(var4_4);
                    try {
                        var7_7 = new JSONObject(var6_6);
                        var9_8 = var7_7.optString("deeplink", "");
                        var10_9 = var7_7.optString("gclid", "");
                        var11_10 = var7_7.optDouble("timestamp", 0.0);
                        if (TextUtils.isEmpty((CharSequence)var9_8)) {
                            var5_5.a().m.a("Deferred Deep Link is empty.");
                            return;
                        }
                        var13_11 = var5_5.p();
                        if (TextUtils.isEmpty((CharSequence)var9_8) || (var15_12 = var13_11.a.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse((String)var9_8)), 0)) == null || var15_12.isEmpty()) ** GOTO lbl49
                        var16_13 = new Bundle();
                        var16_13.putString("gclid", var10_9);
                        var16_13.putString("_cis", "ddp");
                        var5_5.p.b("auto", "_cmp", var16_13);
                        var17_14 = var5_5.p();
                        var18_15 = TextUtils.isEmpty((CharSequence)var9_8);
                        if (!var18_15) break block6;
                        return;
                    }
                    catch (JSONException var8_20) {
                        var5_5.a().f.a("Failed to parse the Deferred Deep Link response. exception", (Object)var8_20);
                        return;
                    }
                }
                var20_16 = var17_14.a.a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                var20_16.putString("deeplink", var9_8);
                var20_16.putLong("timestamp", Double.doubleToRawLongBits((double)var11_10));
                var23_17 = var20_16.commit();
                if (var23_17 == false) return;
                {
                    catch (Exception var19_19) {
                        var17_14.a.a().f.a("Failed to persist Deferred Deep Link. exception", (Object)var19_19);
                        return;
                    }
                }
                var24_18 = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                var17_14.a.a.sendBroadcast(var24_18);
                return;
lbl49: // 1 sources:
                var5_5.a().i.a("Deferred Deep Link validation failed. gclid, deep link", var10_9, var9_8);
                return;
            }
            var5_5.a().m.a("Deferred Deep Link response empty.");
            return;
        }
        var5_5.a().i.a("Network Request for Deferred Deep Link failed. response, exception", var2_2, (Object)var3_3);
    }
}

