/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.content.ComponentName;
import android.content.Context;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.x7;
import c.b.b.a.f.b.y7;

public final class u7
implements Runnable {
    public final /* synthetic */ x7 a;

    public u7(x7 x72) {
        this.a = x72;
    }

    public final void run() {
        y7 y72 = this.a.c;
        Context context = y72.a.a;
        y7.a(y72, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}

