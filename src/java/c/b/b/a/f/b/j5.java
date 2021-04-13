/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  com.google.android.gms.internal.measurement.zzy
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzy;

public final class j5 {
    public final Context a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public long f;
    public zzy g;
    public boolean h = true;
    public final Long i;
    public String j;

    public j5(Context context, zzy zzy2, Long l2) {
        a.a(context);
        Context context2 = context.getApplicationContext();
        a.a(context2);
        this.a = context2;
        this.i = l2;
        if (zzy2 != null) {
            this.g = zzy2;
            this.b = zzy2.f;
            this.c = zzy2.e;
            this.d = zzy2.d;
            this.h = zzy2.c;
            this.f = zzy2.b;
            this.j = zzy2.h;
            Bundle bundle = zzy2.g;
            if (bundle != null) {
                this.e = bundle.getBoolean("dataCollectionDefaultEnabled", true);
            }
        }
    }
}

