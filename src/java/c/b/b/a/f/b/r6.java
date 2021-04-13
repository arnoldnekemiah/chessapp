/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.y6;
import java.util.List;

public final class r6
implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ q6 b;
    public final /* synthetic */ q6 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ y6 e;

    public r6(y6 y62, Bundle bundle, q6 q62, q6 q63, long l2) {
        this.e = y62;
        this.a = bundle;
        this.b = q62;
        this.c = q63;
        this.d = l2;
    }

    public final void run() {
        y6 y62 = this.e;
        Bundle bundle = this.a;
        q6 q62 = this.b;
        q6 q63 = this.c;
        long l2 = this.d;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        y62.a(q62, q63, l2, true, y62.a.p().a(null, "screen_view", bundle, null, true));
    }
}

