/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.ComponentCallbacks
 *  android.content.ComponentCallbacks2
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.concurrent.atomic.AtomicBoolean
 *  javax.annotation.concurrent.GuardedBy
 */
package c.b.b.a.b.g.a;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

public final class a
implements Application.ActivityLifecycleCallbacks,
ComponentCallbacks2 {
    public static final a e = new a();
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean();
    @GuardedBy(value="sInstance")
    public final ArrayList<a> c = new ArrayList();
    @GuardedBy(value="sInstance")
    public boolean d = false;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Application application) {
        a a2;
        a a4 = a2 = e;
        synchronized (a4) {
            if (!a.e.d) {
                application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)e);
                application.registerComponentCallbacks((ComponentCallbacks)e);
                a.e.d = true;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(a a2) {
        a a4;
        a a5 = a4 = e;
        synchronized (a5) {
            this.c.add((Object)a2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl) {
        a a2;
        a a4 = a2 = e;
        synchronized (a4) {
            ArrayList<a> arrayList = this.c;
            int n2 = arrayList.size();
            int n3 = 0;
            while (n3 < n2) {
                Object object = arrayList.get(n3);
                ++n3;
                ((a)object).a(bl);
            }
            return;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean bl = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (bl) {
            this.a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean bl = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (bl) {
            this.a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int n2) {
        if (n2 == 20 && this.a.compareAndSet(false, true)) {
            this.b.set(true);
            this.a(true);
        }
    }

    public static interface a {
        public void a(boolean var1);
    }

}

