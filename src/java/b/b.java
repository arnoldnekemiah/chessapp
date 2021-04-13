/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.Random
 */
package b;

import b.g;
import b.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class b {
    public static Map<Long, List<a>> b;
    public static Random c;
    public static int d = -1;
    public boolean a;

    public b(boolean bl) {
        this.a = bl;
    }

    public final int a(int n2) {
        double d2 = Math.sqrt((double)n2);
        return (int)(1.0 + 100.0 * (d2 * Math.sqrt((double)d2)));
    }

    public final void a(j j2, g g2) {
        List list = (List)b.get((Object)j2.l);
        if (list == null) {
            list = new ArrayList();
            b.put((Object)j2.l, (Object)list);
        }
        for (int i2 = 0; i2 < list.size(); ++i2) {
            a a2 = (a)list.get(i2);
            if (!a2.a.equals(g2)) continue;
            a2.b = 1 + a2.b;
            return;
        }
        list.add((Object)new a(g2));
        d = 1 + d;
    }

    public static class a {
        public g a;
        public int b;

        public a(g g2) {
            this.a = g2;
            this.b = 1;
        }
    }

}

