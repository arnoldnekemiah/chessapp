/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 *  c.b.b.a.e.d.a0
 *  c.b.b.a.e.d.b0
 *  c.b.b.a.e.d.c0
 *  c.b.b.a.e.d.d0
 *  c.b.b.a.e.d.x
 *  c.b.b.a.e.d.y
 *  c.b.b.a.e.d.z
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.ExecutorService
 */
package c.b.b.a.e.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import c.b.b.a.e.d.a0;
import c.b.b.a.e.d.b0;
import c.b.b.a.e.d.c0;
import c.b.b.a.e.d.d0;
import c.b.b.a.e.d.f0;
import c.b.b.a.e.d.x;
import c.b.b.a.e.d.x9;
import c.b.b.a.e.d.y;
import c.b.b.a.e.d.z;
import java.util.concurrent.ExecutorService;

public final class e0
implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ f0 a;

    public e0(f0 f02) {
        this.a = f02;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f0 f02 = this.a;
        x x9 = new x(this, bundle, activity);
        f02.c.execute((Runnable)x9);
    }

    public final void onActivityDestroyed(Activity activity) {
        f0 f02 = this.a;
        d0 d02 = new d0(this, activity);
        f02.c.execute((Runnable)d02);
    }

    public final void onActivityPaused(Activity activity) {
        f0 f02 = this.a;
        a0 a02 = new a0(this, activity);
        f02.c.execute((Runnable)a02);
    }

    public final void onActivityResumed(Activity activity) {
        f0 f02 = this.a;
        z z10 = new z(this, activity);
        f02.c.execute((Runnable)z10);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        x9 x92 = new x9();
        f0 f02 = this.a;
        c0 c02 = new c0(this, activity, x92);
        f02.c.execute((Runnable)c02);
        Bundle bundle2 = x92.b(50L);
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
        f0 f02 = this.a;
        y y2 = new y(this, activity);
        f02.c.execute((Runnable)y2);
    }

    public final void onActivityStopped(Activity activity) {
        f0 f02 = this.a;
        b0 b02 = new b0(this, activity);
        f02.c.execute((Runnable)b02);
    }
}

