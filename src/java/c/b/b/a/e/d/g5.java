/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.f5;
import c.b.b.a.e.d.o5;
import c.b.b.a.e.d.s5;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class g5 {
    public static volatile g5 b;
    public static volatile g5 c;
    public static final g5 d;
    public final Map<f5, s5<?, ?>> a;

    public static {
        d = new g5(true);
    }

    public g5() {
        this.a = new HashMap();
    }

    public g5(boolean bl) {
        this.a = Collections.emptyMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static g5 a() {
        g5 g52 = b;
        if (g52 != null) {
            return g52;
        }
        Class<g5> class_ = g5.class;
        synchronized (g5.class) {
            g5 g53 = b;
            if (g53 == null) {
                b = g53 = d;
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return g53;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static g5 b() {
        g5 g52 = c;
        if (g52 != null) {
            return g52;
        }
        Class<g5> class_ = g5.class;
        synchronized (g5.class) {
            g5 g53;
            g5 g54 = c;
            if (g54 != null) {
                // ** MonitorExit[var4_1] (shouldn't be in output)
                return g54;
            }
            c = g53 = o5.a(g5.class);
            // ** MonitorExit[var4_1] (shouldn't be in output)
            return g53;
        }
    }
}

