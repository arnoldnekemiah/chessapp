/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.content.Intent;
import c.b.b.a.f.b.d8;
import c.b.b.a.f.b.e8;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;

public final class a8
implements Runnable {
    public final e8 a;
    public final int b;
    public final h3 c;
    public final Intent d;

    public a8(e8 e82, int n2, h3 h32, Intent intent) {
        this.a = e82;
        this.b = n2;
        this.c = h32;
        this.d = intent;
    }

    public final void run() {
        e8 e82 = this.a;
        int n2 = this.b;
        h3 h32 = this.c;
        Intent intent = this.d;
        if (((d8)e82.a).a(n2)) {
            h32.n.a("Local AppMeasurementService processed last upload request. StartId", n2);
            e82.a().n.a("Completed wakeful intent.");
            ((d8)e82.a).a(intent);
        }
    }
}

