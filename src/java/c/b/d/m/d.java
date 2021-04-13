/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 */
package c.b.d.m;

import c.b.d.m.e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {
    public static volatile d b;
    public final Set<e> a = new HashSet();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d b() {
        d d10 = b;
        if (d10 != null) {
            return d10;
        }
        Class<d> class_ = d.class;
        synchronized (d.class) {
            d d11 = b;
            if (d11 == null) {
                b = d11 = new d();
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return d11;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set<e> a() {
        Set<e> set;
        Set<e> set2 = set = this.a;
        synchronized (set2) {
            return Collections.unmodifiableSet(this.a);
        }
    }
}

