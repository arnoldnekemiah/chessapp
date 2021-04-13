/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.SystemClock
 *  c.b.b.a.b.j.c
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
package c.b.b.a.f.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.f8;
import c.b.b.a.f.b.g8;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.h6;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.y6;
import java.util.Map;

@TargetApi(value=14)
public final class i6
implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ j6 a;

    public /* synthetic */ i6(j6 j62) {
        this.a = j62;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        block5 : {
            boolean bl;
            Uri uri;
            String string;
            String string2;
            block7 : {
                block6 : {
                    Throwable throwable2;
                    block9 : {
                        Exception exception2;
                        try {
                            boolean bl2;
                            this.a.a.a().n.a("onActivityCreated");
                            Intent intent = activity.getIntent();
                            if (intent == null) break block5;
                            uri = intent.getData();
                            if (uri == null || !uri.isHierarchical()) break block5;
                            this.a.a.p();
                            String string3 = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            boolean bl3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals((Object)string3);
                            bl = true;
                            boolean bl4 = bl3 || "https://www.google.com".equals((Object)string3) || (bl2 = "android-app://com.google.appcrawler".equals((Object)string3));
                            String string4 = bl != bl4 ? "auto" : "gs";
                            string = string4;
                            string2 = uri.getQueryParameter("referrer");
                            if (bundle != null) break block6;
                            break block7;
                        }
                        catch (Exception exception2) {
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                        this.a.a.a().f.a("Throwable caught in onActivityCreated", (Object)exception2);
                        break block5;
                    }
                    this.a.a.u().a(activity, bundle);
                    throw throwable2;
                }
                bl = false;
            }
            f4 f42 = this.a.a.d();
            h6 h62 = new h6(this, bl, uri, string, string2);
            f42.a(h62);
        }
        this.a.a.u().a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.a.a.u().d(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.a.a.u().c(activity);
        n8 n82 = this.a.a.n();
        if ((c)n82.a.n != null) {
            long l2 = SystemClock.elapsedRealtime();
            n82.a.d().a(new g8(n82, l2));
            return;
        }
        throw null;
    }

    public final void onActivityResumed(Activity activity) {
        n8 n82 = this.a.a.n();
        if ((c)n82.a.n != null) {
            long l2 = SystemClock.elapsedRealtime();
            n82.a.d().a(new f8(n82, l2));
            this.a.a.u().b(activity);
            return;
        }
        throw null;
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        y6 y62 = this.a.a.u();
        if (!y62.a.g.n()) {
            return;
        }
        if (bundle == null) {
            return;
        }
        q6 q62 = (q6)y62.f.get((Object)activity);
        if (q62 == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", q62.c);
        bundle2.putString("name", q62.a);
        bundle2.putString("referrer_name", q62.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}

