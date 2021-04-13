/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.j
 *  a.i.r.n.b.b
 *  a.i.r.p.f
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  androidx.work.impl.WorkDatabase
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.i.r.n.b;

import a.i.h;
import a.i.r.j;
import a.i.r.n.b.b;
import a.i.r.p.d;
import a.i.r.p.e;
import a.i.r.p.f;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;

public class a {
    public static final String a = h.a("Alarms");

    public static void a(Context context, j j2, String string) {
        f f2 = (f)j2.c.i();
        d d2 = f2.a(string);
        if (d2 != null) {
            a.a(context, string, d2.b);
            h.a().a(a, String.format((String)"Removing SystemIdInfo for workSpecId (%s)", (Object[])new Object[]{string}), new Throwable[0]);
            f2.b(string);
        }
    }

    public static void a(Context context, j j2, String string, long l2) {
        f f2 = (f)j2.c.i();
        d d2 = f2.a(string);
        if (d2 != null) {
            a.a(context, string, d2.b);
            a.a(context, string, d2.b, l2);
            return;
        }
        int n2 = new a.i.r.q.e(context).b();
        f2.a(new d(string, n2));
        a.a(context, string, n2, l2);
    }

    public static void a(Context context, String string, int n2) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        PendingIntent pendingIntent = PendingIntent.getService((Context)context, (int)n2, (Intent)b.a((Context)context, (String)string), (int)536870912);
        if (pendingIntent != null && alarmManager != null) {
            h h2 = h.a();
            String string2 = a;
            Object[] arrobject = new Object[]{string, n2};
            h2.a(string2, String.format((String)"Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", (Object[])arrobject), new Throwable[0]);
            alarmManager.cancel(pendingIntent);
        }
    }

    public static void a(Context context, String string, int n2, long l2) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        PendingIntent pendingIntent = PendingIntent.getService((Context)context, (int)n2, (Intent)b.a((Context)context, (String)string), (int)1073741824);
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, l2, pendingIntent);
                return;
            }
            alarmManager.set(0, l2, pendingIntent);
        }
    }
}

