/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.i.r.n.b;

import a.i.h;
import a.i.r.d;
import a.i.r.n.b.b;
import a.i.r.p.j;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class f
implements d {
    public static final String b = h.a("SystemAlarmScheduler");
    public final Context a;

    public f(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override
    public void a(String string) {
        Intent intent = b.c(this.a, string);
        this.a.startService(intent);
    }

    @Override
    public /* varargs */ void a(j ... arrj) {
        for (j j2 : arrj) {
            h h4 = h.a();
            String string = b;
            Object[] arrobject = new Object[]{j2.a};
            h4.a(string, String.format((String)"Scheduling work with workSpecId %s", (Object[])arrobject), new Throwable[0]);
            Intent intent = b.b(this.a, j2.a);
            this.a.startService(intent);
        }
    }
}

