/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Cloneable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeMap
 */
package c.c.b.h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class f
implements Serializable,
Cloneable {
    public ArrayList<String> a = new ArrayList();
    public Map<String, d> b = new TreeMap();

    public Object clone() {
        ArrayList arrayList;
        f f10 = new f();
        f10.a = arrayList = new ArrayList();
        arrayList.addAll(this.a);
        f10.b = new TreeMap();
        for (Map.Entry entry : this.b.entrySet()) {
            f10.b.put(entry.getKey(), (Object)((d)entry.getValue()).clone());
        }
        return f10;
    }

    /*
     * Duplicate member names - consider using --renamedupmembers true
     */
    public static abstract class d
    implements Serializable,
    Cloneable {
        public String a;
        public g b;

        public d clone() {
            return (d)super.clone();
        }

        public Object clone() {
            return (d)super.clone();
        }
    }

    public static final class g
    extends Enum<g> {
        public static final /* enum */ g a;
        public static final /* enum */ g b;
        public static final /* enum */ g c;
        public static final /* enum */ g d;
        public static final /* enum */ g e;
        public static final /* synthetic */ g[] f;

        public static {
            g g10;
            a = new g();
            b = new g();
            c = new g();
            d = new g();
            e = g10 = new g();
            g[] arrg = new g[]{a, b, c, d, g10};
            f = arrg;
        }

        public static g valueOf(String string) {
            return (g)Enum.valueOf(g.class, (String)string);
        }

        public static g[] values() {
            return (g[])f.clone();
        }
    }

}

