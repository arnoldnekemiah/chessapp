/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  b.i$b
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.TreeMap
 */
package b;

import b.i;
import java.util.Map;
import java.util.TreeMap;

/*
 * Exception performing whole class analysis.
 */
public class i {
    public static final i b;
    public Map<String, a> a;

    public static {
        b = new i();
    }

    public i() {
        this.a = new TreeMap();
        b b2 = new /* Unavailable Anonymous Inner Class!! */;
        this.a.put((Object)b2.a.toLowerCase(), (Object)b2);
        b b3 = new /* Unavailable Anonymous Inner Class!! */;
        this.a.put((Object)b3.a.toLowerCase(), (Object)b3);
        b b4 = new /* Unavailable Anonymous Inner Class!! */;
        this.a.put((Object)b4.a.toLowerCase(), (Object)b4);
        b b5 = new /* Unavailable Anonymous Inner Class!! */;
        this.a.put((Object)b5.a.toLowerCase(), (Object)b5);
        b b6 = new /* Unavailable Anonymous Inner Class!! */;
        this.a.put((Object)b6.a.toLowerCase(), (Object)b6);
    }

    public static i a() {
        return b;
    }

    public final int a(String string) {
        return (this.a.get((Object)string.toLowerCase())).b;
    }

    public static class a {
        public String a;
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a;
        public static final /* enum */ c b;
        public static final /* enum */ c c;
        public static final /* enum */ c d;
        public static final /* enum */ c e;
        public static final /* synthetic */ c[] f;

        public static {
            c c2;
            a = new c();
            b = new c();
            c = new c();
            d = new c();
            e = c2 = new c();
            c[] arrc = new c[]{a, b, c, d, c2};
            f = arrc;
        }

        public static c valueOf(String string) {
            return (c)Enum.valueOf(c.class, (String)string);
        }

        public static c[] values() {
            return (c[])f.clone();
        }
    }

}

