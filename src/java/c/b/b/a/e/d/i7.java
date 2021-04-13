/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.k5;
import c.b.b.a.e.d.l7;
import c.b.b.a.e.d.p7;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i7
extends p7 {
    public i7(int n10) {
        super(n10);
    }

    @Override
    public final void a() {
        if (!this.d) {
            for (int i10 = 0; i10 < this.b(); ++i10) {
                Map.Entry entry = this.a(i10);
                if (!((k5)entry.getKey()).c()) continue;
                entry.setValue((Object)Collections.unmodifiableList((List)((List)entry.getValue())));
            }
            Set set = this.c.isEmpty() ? l7.b : this.c.entrySet();
            for (Map.Entry entry : set) {
                if (!((k5)entry.getKey()).c()) continue;
                entry.setValue((Object)Collections.unmodifiableList((List)((List)entry.getValue())));
            }
        }
        super.a();
    }
}

