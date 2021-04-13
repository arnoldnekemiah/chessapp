/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.app.job.JobScheduler
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  c.b.b.a.f.b.a9
 *  c.b.b.a.f.b.e5
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.k
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.k;
import c.b.b.a.f.b.p8;
import c.b.b.a.f.b.r8;

public final class q8
extends r8 {
    public final AlarmManager d;
    public k e;
    public Integer f;

    public q8(a9 a92) {
        super(a92);
        this.d = (AlarmManager)this.a.a.getSystemService("alarm");
    }

    @Override
    public final boolean j() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(this.o());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.m();
        }
        return false;
    }

    public final void k() {
        this.h();
        this.a.a().n.a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(this.o());
        }
        this.l().b();
        if (Build.VERSION.SDK_INT >= 24) {
            this.m();
        }
    }

    public final k l() {
        if (this.e == null) {
            this.e = new p8(this, this.b.j);
        }
        return this.e;
    }

    @TargetApi(value=24)
    public final void m() {
        JobScheduler jobScheduler = (JobScheduler)this.a.a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(this.n());
        }
    }

    public final int n() {
        if (this.f == null) {
            String string = String.valueOf((Object)this.a.a.getPackageName());
            String string2 = string.length() != 0 ? "measurement".concat(string) : new String("measurement");
            this.f = string2.hashCode();
        }
        return this.f;
    }

    public final PendingIntent o() {
        Context context = this.a.a;
        return PendingIntent.getBroadcast((Context)context, (int)0, (Intent)new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), (int)0);
    }
}

