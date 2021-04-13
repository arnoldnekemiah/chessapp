/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  androidx.work.impl.background.systemjob.SystemJobService
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package a.i.r.n.c;

import a.i.h;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

public class a {
    public static final String b = h.a("SystemJobInfoConverter");
    public final ComponentName a;

    public a(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}

