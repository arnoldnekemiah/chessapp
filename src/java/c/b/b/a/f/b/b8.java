/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.app.job.JobParameters;
import c.b.b.a.f.b.d8;
import c.b.b.a.f.b.e8;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;

public final class b8
implements Runnable {
    public final e8 a;
    public final h3 b;
    public final JobParameters c;

    public b8(e8 e82, h3 h32, JobParameters jobParameters) {
        this.a = e82;
        this.b = h32;
        this.c = jobParameters;
    }

    public final void run() {
        e8 e82 = this.a;
        h3 h32 = this.b;
        JobParameters jobParameters = this.c;
        if (e82 != null) {
            h32.n.a("AppMeasurementJobService processed last upload request.");
            ((d8)e82.a).a(jobParameters, false);
            return;
        }
        throw null;
    }
}

