/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.j
 *  a.i.r.n.b.f
 *  a.i.r.n.c.b
 *  a.i.r.p.l
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  androidx.work.impl.WorkDatabase
 *  androidx.work.impl.background.systemalarm.SystemAlarmService
 *  androidx.work.impl.background.systemjob.SystemJobService
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package a.i.r;

import a.i.b;
import a.i.h;
import a.i.r.d;
import a.i.r.p.j;
import a.i.r.p.k;
import a.i.r.p.l;
import a.i.r.q.f;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e {
    public static final String a = h.a("Schedulers");

    public static d a(Context context, a.i.r.j j2) {
        d d2;
        if (Build.VERSION.SDK_INT >= 23) {
            a.i.r.n.c.b b2 = new a.i.r.n.c.b(context, j2);
            f.a(context, SystemJobService.class, true);
            h.a().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return b2;
        }
        try {
            d2 = (d)Class.forName((String)"androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            h.a().a(a, String.format((String)"Created %s", (Object[])new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
        }
        catch (Throwable throwable) {
            h.a().a(a, "Unable to create GCM Scheduler", throwable);
            d2 = null;
        }
        d d3 = d2;
        if (d3 == null) {
            d3 = new a.i.r.n.b.f(context);
            f.a(context, SystemAlarmService.class, true);
            h.a().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
        }
        return d3;
    }

    public static void a(b b2, WorkDatabase workDatabase, List<d> list) {
        if (list != null) {
            block10 : {
                if (list.size() == 0) {
                    return;
                }
                k k2 = workDatabase.k();
                workDatabase.c();
                int n2 = Build.VERSION.SDK_INT == 23 ? b2.g / 2 : b2.g;
                l l2 = (l)k2;
                List list2 = l2.a(n2);
                ArrayList arrayList = (ArrayList)list2;
                try {
                    if (arrayList.size() > 0) {
                        long l3 = System.currentTimeMillis();
                        Iterator iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            l2.a(((j)iterator.next()).a, l3);
                        }
                    }
                    workDatabase.g();
                    if (arrayList.size() <= 0) break block10;
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
                finally {
                    workDatabase.d();
                }
                j[] arrj = (j[])arrayList.toArray((Object[])new j[0]);
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((d)iterator.next()).a(arrj);
                }
            }
            return;
        }
    }
}

