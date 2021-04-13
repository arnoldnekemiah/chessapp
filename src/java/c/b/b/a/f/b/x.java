/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Map
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.q6;
import c.b.b.a.f.b.y6;
import c.b.b.a.f.b.z1;
import java.util.Map;

public final class x
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ z1 c;

    public x(z1 z12, String string, long l10) {
        this.c = z12;
        this.a = string;
        this.b = l10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        z1 z12 = this.c;
        String string = this.a;
        long l10 = this.b;
        z12.g();
        a.c(string);
        Integer n10 = (Integer)z12.c.get((Object)string);
        if (n10 != null) {
            q6 q62 = z12.a.u().a(false);
            int n11 = -1 + n10;
            if (n11 == 0) {
                z12.c.remove((Object)string);
                Long l11 = (Long)z12.b.get((Object)string);
                if (l11 == null) {
                    z12.a.a().f.a("First ad unit exposure time was never set");
                } else {
                    long l12 = l11;
                    z12.b.remove((Object)string);
                    z12.a(string, l10 - l12, q62);
                }
                if (!z12.c.isEmpty()) return;
                long l13 = z12.d;
                if (l13 == 0L) {
                    z12.a.a().f.a("First ad exposure time was never set");
                    return;
                }
                z12.a(l10 - l13, q62);
                z12.d = 0L;
                return;
            }
            z12.c.put((Object)string, (Object)n11);
            return;
        }
        z12.a.a().f.a("Call to endAdUnitExposure for unknown ad unit id", string);
    }
}

