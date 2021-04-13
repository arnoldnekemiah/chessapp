/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  c.b.b.a.b.j.c
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.SharedPreferences;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.u3;

public final class s3 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ u3 e;

    public /* synthetic */ s3(u3 u32, long l2) {
        this.e = u32;
        a.c("health_monitor");
        boolean bl = l2 > 0L;
        a.a(bl);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = l2;
    }

    public final void a() {
        this.e.g();
        if ((c)this.e.a.n != null) {
            long l2 = System.currentTimeMillis();
            SharedPreferences.Editor editor = this.e.n().edit();
            editor.remove(this.b);
            editor.remove(this.c);
            editor.putLong(this.a, l2);
            editor.apply();
            return;
        }
        throw null;
    }
}

