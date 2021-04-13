/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobInfo$TriggerContentUri
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.PersistableBundle
 *  androidx.work.impl.WorkDatabase
 *  androidx.work.impl.background.systemjob.SystemJobService
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Set
 */
package a.i.r.n.c;

import a.i.a;
import a.i.c;
import a.i.d;
import a.i.h;
import a.i.i;
import a.i.n;
import a.i.r.j;
import a.i.r.p.e;
import a.i.r.p.f;
import a.i.r.p.k;
import a.i.r.p.l;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class b
implements a.i.r.d {
    public static final String f = h.a("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final j c;
    public final a.i.r.q.e d;
    public final a.i.r.n.c.a e;

    public b(Context context, j j2) {
        JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        a.i.r.n.c.a a5 = new a.i.r.n.c.a(context);
        this.a = context;
        this.c = j2;
        this.b = jobScheduler;
        this.d = new a.i.r.q.e(context);
        this.e = a5;
    }

    public static List<JobInfo> a(Context context, JobScheduler jobScheduler) {
        List list;
        try {
            list = jobScheduler.getAllPendingJobs();
        }
        catch (Throwable throwable) {
            h.a().b(f, "getAllPendingJobs() is not reliable on this device.", throwable);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (!componentName.equals((Object)jobInfo.getService())) continue;
            arrayList.add((Object)jobInfo);
        }
        return arrayList;
    }

    public static List<Integer> a(Context context, JobScheduler jobScheduler, String string) {
        List<JobInfo> list = b.a(context, jobScheduler);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : list) {
            PersistableBundle persistableBundle = jobInfo.getExtras();
            if (persistableBundle == null || !persistableBundle.containsKey("EXTRA_WORK_SPEC_ID") || !string.equals((Object)persistableBundle.getString("EXTRA_WORK_SPEC_ID"))) continue;
            arrayList.add((Object)jobInfo.getId());
        }
        return arrayList;
    }

    public static void a(JobScheduler jobScheduler, int n4) {
        try {
            jobScheduler.cancel(n4);
            return;
        }
        catch (Throwable throwable) {
            h h4 = h.a();
            String string = f;
            Locale locale = Locale.getDefault();
            Object[] arrobject = new Object[]{n4};
            h4.b(string, String.format((Locale)locale, (String)"Exception while trying to cancel job (%d)", (Object[])arrobject), throwable);
            return;
        }
    }

    public static void a(Context context) {
        List<JobInfo> list;
        JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        if (jobScheduler != null && (list = b.a(context, jobScheduler)) != null && !list.isEmpty()) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                b.a(jobScheduler, ((JobInfo)iterator.next()).getId());
            }
        }
    }

    public static void b(Context context) {
        List<JobInfo> list;
        JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        if (jobScheduler != null && (list = b.a(context, jobScheduler)) != null && !list.isEmpty()) {
            for (JobInfo jobInfo : list) {
                PersistableBundle persistableBundle = jobInfo.getExtras();
                if (persistableBundle != null && persistableBundle.containsKey("EXTRA_WORK_SPEC_ID")) continue;
                b.a(jobScheduler, jobInfo.getId());
            }
        }
    }

    public void a(a.i.r.p.j j2, int n4) {
        block8 : {
            int n10;
            a.i.r.n.c.a a5;
            c c2;
            boolean bl;
            block14 : {
                block9 : {
                    block10 : {
                        block11 : {
                            i i10;
                            block13 : {
                                block12 : {
                                    a5 = this.e;
                                    if (a5 == null) break block8;
                                    c2 = j2.j;
                                    i10 = c2.a;
                                    int n11 = i10.ordinal();
                                    if (n11 == 0) break block9;
                                    if (n11 == 1) break block10;
                                    if (n11 == 2) break block11;
                                    if (n11 == 3) break block12;
                                    n10 = 4;
                                    if (n11 != n10 || Build.VERSION.SDK_INT < 26) break block13;
                                    break block14;
                                }
                                if (Build.VERSION.SDK_INT < 24) break block13;
                                n10 = 3;
                                break block14;
                            }
                            h.a().a(a.i.r.n.c.a.b, String.format((String)"API version too low. Cannot convert network type value %s", (Object[])new Object[]{i10}), new Throwable[0]);
                            break block10;
                        }
                        n10 = 2;
                        break block14;
                    }
                    n10 = 1;
                    break block14;
                }
                n10 = 0;
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("EXTRA_WORK_SPEC_ID", j2.a);
            persistableBundle.putBoolean("EXTRA_IS_PERIODIC", j2.d());
            JobInfo.Builder builder = new JobInfo.Builder(n4, a5.a).setRequiredNetworkType(n10).setRequiresCharging(c2.b).setRequiresDeviceIdle(c2.c).setExtras(persistableBundle);
            if (!c2.c) {
                int n12 = j2.l == a.b ? 0 : 1;
                builder.setBackoffCriteria(j2.m, n12);
            }
            builder.setMinimumLatency(Math.max((long)(j2.a() - System.currentTimeMillis()), (long)0L));
            if (Build.VERSION.SDK_INT >= 24 && (bl = c2.h.a() > 0)) {
                for (d.a a6 : c2.h.a) {
                    int n13 = a6.b;
                    builder.addTriggerContentUri(new JobInfo.TriggerContentUri(a6.a, n13));
                }
                builder.setTriggerContentUpdateDelay(c2.f);
                builder.setTriggerContentMaxDelay(c2.g);
            }
            builder.setPersisted(false);
            if (Build.VERSION.SDK_INT >= 26) {
                builder.setRequiresBatteryNotLow(c2.d);
                builder.setRequiresStorageNotLow(c2.e);
            }
            JobInfo jobInfo = builder.build();
            h h4 = h.a();
            String string = f;
            Object[] arrobject = new Object[]{j2.a, n4};
            h4.a(string, String.format((String)"Scheduling work ID %s Job ID %s", (Object[])arrobject), new Throwable[0]);
            try {
                this.b.schedule(jobInfo);
                return;
            }
            catch (Throwable throwable) {
                h.a().b(f, String.format((String)"Unable to schedule %s", (Object[])new Object[]{j2}), throwable);
                return;
            }
            catch (IllegalStateException illegalStateException) {
                List<JobInfo> list = b.a(this.a, this.b);
                int n14 = list != null ? list.size() : 0;
                Locale locale = Locale.getDefault();
                Object[] arrobject2 = new Object[3];
                arrobject2[0] = n14;
                arrobject2[1] = ((ArrayList)((l)this.c.c.k()).c()).size();
                a.i.b b2 = this.c.b;
                int n15 = Build.VERSION.SDK_INT;
                int n16 = b2.g;
                if (n15 == 23) {
                    n16 /= 2;
                }
                arrobject2[2] = n16;
                String string2 = String.format((Locale)locale, (String)"JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", (Object[])arrobject2);
                h.a().b(f, string2, new Throwable[0]);
                throw new IllegalStateException(string2, (Throwable)illegalStateException);
            }
        }
        throw null;
    }

    @Override
    public void a(String string) {
        List<Integer> list = b.a(this.a, this.b, string);
        if (list != null && !list.isEmpty()) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                int n4 = (Integer)iterator.next();
                b.a(this.b, n4);
            }
            ((f)this.c.c.i()).b(string);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public /* varargs */ void a(a.i.r.p.j ... var1_1) {
        var2_2 = this.c.c;
        var3_3 = var1_1.length;
        var4_4 = 0;
        while (var4_4 < var3_3) {
            block10 : {
                block9 : {
                    var5_5 = var1_1[var4_4];
                    var2_2.c();
                    var7_6 = var2_2.k();
                    var8_7 = var5_5.a;
                    var9_8 = (l)var7_6;
                    var10_9 = var9_8.d(var8_7);
                    if (var10_9 != null) break block9;
                    var29_24 = h.a();
                    var30_25 = b.f;
                    var31_26 = new StringBuilder();
                    var31_26.append("Skipping scheduling ");
                    var31_26.append(var5_5.a);
                    var31_26.append(" because it's no longer in the DB");
                    var29_24.d(var30_25, var31_26.toString(), new Throwable[0]);
                    ** GOTO lbl52
                }
                if (var10_9.b == n.a) break block10;
                var23_21 = h.a();
                var24_22 = b.f;
                var25_23 = new StringBuilder();
                var25_23.append("Skipping scheduling ");
                var25_23.append(var5_5.a);
                var25_23.append(" because it is no longer enqueued");
                var23_21.d(var24_22, var25_23.toString(), new Throwable[0]);
                ** GOTO lbl52
            }
            var11_10 = var2_2.i();
            var12_11 = var5_5.a;
            var13_12 = (f)var11_10;
            var14_13 = var13_12.a(var12_11);
            var15_14 = var14_13 != null ? var14_13.b : this.d.a(this.c.b.e, this.c.b.f);
            if (var14_13 != null) ** GOTO lbl45
            var16_15 = new a.i.r.p.d(var5_5.a, var15_14);
            var17_16 = this.c.c.i();
            var18_17 = (f)var17_16;
            var18_17.a(var16_15);
lbl45: // 2 sources:
            this.a(var5_5, var15_14);
            if (Build.VERSION.SDK_INT == 23 && (var19_18 = b.a(this.a, this.b, var5_5.a)) != null) {
                var20_19 = var19_18.indexOf((Object)var15_14);
                if (var20_19 >= 0) {
                    var19_18.remove(var20_19);
                }
                var22_20 = var19_18.isEmpty() == false ? ((Integer)var19_18.get(0)).intValue() : this.d.a(this.c.b.e, this.c.b.f);
                this.a(var5_5, var22_20);
            }
lbl52: // 5 sources:
            var2_2.g();
            ++var4_4;
        }
        return;
        catch (Throwable var6_27) {
            throw var6_27;
        }
        finally {
            var2_2.d();
        }
    }
}

