/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.job.JobInfo
 *  android.app.job.JobScheduler
 *  android.content.Context
 *  android.os.UserHandle
 *  android.util.Log
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package c.b.b.a.e.d;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(value=24)
public final class i4 {
    public static final Method b;
    public static final Method c;
    public final JobScheduler a;

    /*
     * Exception decompiling
     */
    public static {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl67 : ALOAD_2 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public i4(JobScheduler jobScheduler) {
        this.a = jobScheduler;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(Context context, JobInfo jobInfo, String string, String string2) {
        i4 i42;
        void var10_20;
        int n2;
        block11 : {
            block10 : {
                JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
                if (jobScheduler == null) throw null;
                if (b == null) return jobScheduler.schedule(jobInfo);
                if (context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) return jobScheduler.schedule(jobInfo);
                i42 = new i4(jobScheduler);
                Method method = c;
                if (method != null) {
                    Integer n6 = (Integer)method.invoke(UserHandle.class, new Object[0]);
                    if (n6 == null) break block10;
                    try {
                        n2 = n6;
                        break block11;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        // empty catch block
                    }
                    if (Log.isLoggable((String)"JobSchedulerCompat", (int)6)) {
                        void var16_11;
                        Log.e((String)"JobSchedulerCompat", (String)"myUserId invocation illegal", (Throwable)var16_11);
                    }
                }
            }
            n2 = 0;
        }
        Method method = b;
        if (method == null) return i42.a.schedule(jobInfo);
        JobScheduler jobScheduler = i42.a;
        Object[] arrobject = new Object[]{jobInfo, "com.google.android.gms", n2, "UploadAlarm"};
        Integer n10 = (Integer)method.invoke((Object)jobScheduler, arrobject);
        int n11 = 0;
        if (n10 == null) return n11;
        try {
            return n10;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        Log.e((String)"UploadAlarm", (String)"error calling scheduleAsPackage", (Throwable)var10_20);
        return i42.a.schedule(jobInfo);
    }
}

