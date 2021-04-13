/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  c.b.b.a.b.j.c
 *  c.b.b.a.e.d.i9
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package c.b.b.a.f.b;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.i9;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.p3;
import c.b.b.a.f.b.r3;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.t3;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;

public final class m8 {
    public final /* synthetic */ n8 a;

    public m8(n8 n82) {
        this.a = n82;
    }

    public final void a() {
        this.a.g();
        u3 u32 = this.a.a.m();
        if ((c)this.a.a.n != null) {
            if (u32.a(System.currentTimeMillis())) {
                this.a.a.m().q.a(true);
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)runningAppProcessInfo);
                if (runningAppProcessInfo.importance == 100) {
                    this.a.a.a().n.a("Detected application was in foreground");
                    if ((c)this.a.a.n != null) {
                        this.b(System.currentTimeMillis(), false);
                        return;
                    }
                    throw null;
                }
            }
            return;
        }
        throw null;
    }

    public final void a(long l2, boolean bl) {
        this.a.g();
        this.a.l();
        if (this.a.a.m().a(l2)) {
            this.a.a.m().q.a(true);
        }
        this.a.a.m().t.a(l2);
        if (this.a.a.m().q.a()) {
            this.b(l2, bl);
        }
    }

    public final void b(long l2, boolean bl) {
        this.a.g();
        if (!this.a.a.i()) {
            return;
        }
        this.a.a.m().t.a(l2);
        if ((c)this.a.a.n != null) {
            String string;
            long l10 = SystemClock.elapsedRealtime();
            this.a.a.a().n.a("Session started, time", l10);
            Long l11 = l2 / 1000L;
            this.a.a.o().a("auto", "_sid", (Object)l11, l2);
            this.a.a.m().q.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", l11.longValue());
            if (this.a.a.g.c(null, u2.j0) && bl) {
                bundle.putLong("_aib", 1L);
            }
            this.a.a.o().a("auto", "_s", l2, bundle);
            i9.c();
            if (this.a.a.g.c(null, u2.o0) && !TextUtils.isEmpty((CharSequence)(string = this.a.a.m().y.a()))) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", string);
                this.a.a.o().a("auto", "_ssr", l2, bundle2);
            }
            return;
        }
        throw null;
    }
}

