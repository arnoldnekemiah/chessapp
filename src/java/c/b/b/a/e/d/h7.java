/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.c5
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.u7
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.RandomAccess
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.a5;
import c.b.b.a.e.d.c5;
import c.b.b.a.e.d.d5;
import c.b.b.a.e.d.d8;
import c.b.b.a.e.d.e6;
import c.b.b.a.e.d.e8;
import c.b.b.a.e.d.f7;
import c.b.b.a.e.d.g6;
import c.b.b.a.e.d.k6;
import c.b.b.a.e.d.q6;
import c.b.b.a.e.d.s7;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.t7;
import c.b.b.a.e.d.u5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.u7;
import c.b.b.a.e.d.w5;
import c.b.b.a.e.d.x4;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class h7 {
    public static final Class<?> a;
    public static final s7<?, ?> b;
    public static final s7<?, ?> c;
    public static final s7<?, ?> d;

    /*
     * Exception decompiling
     */
    public static {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl7 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static int a(int n2, Object object, f7 f72) {
        if (object instanceof e6) {
            e6 e62 = (e6)object;
            int n6 = c5.f((int)(n2 << 3));
            int n10 = e62.a();
            return n6 + (n10 + c5.f((int)n10));
        }
        u6 u62 = (u6)object;
        return c5.f((int)(n2 << 3)) + c5.a((u6)u62, (f7)f72);
    }

    public static int a(int n2, List<Long> list, boolean bl) {
        if (list.size() == 0) {
            return 0;
        }
        return h7.a(list) + list.size() * c5.d((int)n2);
    }

    public static int a(int n2, List<?> list, f7 f72) {
        int n6 = list.size();
        if (n6 == 0) {
            return 0;
        }
        int n10 = n6 * c5.d((int)n2);
        for (int i2 = 0; i2 < n6; ++i2) {
            Object object = list.get(i2);
            if (object instanceof e6) {
                int n11 = ((e6)object).a();
                n10 += n11 + c5.f((int)n11);
                continue;
            }
            n10 += c5.a((u6)((u6)object), (f7)f72);
        }
        return n10;
    }

    public static int a(int n2, List<Long> list, boolean bl) {
        int n6 = list.size();
        if (n6 == 0) {
            return 0;
        }
        return h7.b(list) + n6 * c5.d((int)n2);
    }

    public static int a(List<Long> list) {
        int n2;
        int n6;
        int n10 = list.size();
        if (n10 == 0) {
            return 0;
        }
        if (list instanceof k6) {
            k6 k62 = (k6)list;
            n2 = 0;
            for (n6 = 0; n6 < n10; ++n6) {
                n2 += c5.c((long)k62.c(n6));
            }
        } else {
            n2 = 0;
            while (n6 < n10) {
                n2 += c5.c((long)((Long)list.get(n6)));
                ++n6;
            }
        }
        return n2;
    }

    /*
     * Exception decompiling
     */
    public static s7<?, ?> a(boolean var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl7 : ALOAD_1 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static <UT, UB> UB a(int n2, int n6, UB object, s7<UT, UB> s72) {
        if (object == null) {
            if ((u7)s72 != null) {
                object = t7.b();
            } else {
                throw null;
            }
        }
        long l2 = n6;
        if ((u7)s72 != null) {
            Long l10 = l2;
            ((t7)object).a(n2 << 3, (Object)l10);
            return object;
        }
        throw null;
    }

    public static <UT, UB> UB a(int n2, List<Integer> list, w5 w52, UB UB, s7<UT, UB> s72) {
        if (w52 == null) {
            return UB;
        }
        if (list instanceof RandomAccess) {
            int n6 = list.size();
            int n10 = 0;
            for (int i2 = 0; i2 < n6; ++i2) {
                int n11 = (Integer)list.get(i2);
                if (w52.a(n11)) {
                    if (i2 != n10) {
                        list.set(n10, (Object)n11);
                    }
                    ++n10;
                    continue;
                }
                UB = h7.a(n2, n11, UB, s72);
            }
            if (n10 == n6) {
                return UB;
            }
            list.subList(n10, n6).clear();
            return UB;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            int n12 = (Integer)iterator.next();
            if (w52.a(n12)) continue;
            UB = h7.a(n2, n12, UB, s72);
            iterator.remove();
        }
        return UB;
    }

    public static void a(int n2, List<String> list, d5 d52) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                boolean bl = list instanceof g6;
                if (bl) {
                    g6 g62 = (g6)list;
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        Object object = g62.b(n6);
                        if (object instanceof String) {
                            d52.a.a(n2, (String)object);
                            continue;
                        }
                        d52.a.a(n2, (x4)object);
                    }
                } else {
                    while (n6 < list.size()) {
                        d52.a.a(n2, (String)list.get(n6));
                        ++n6;
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static void a(int n2, List<?> list, d5 d52, f7 f72) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                d52.a(n2, list.get(i2), f72);
            }
        }
    }

    public static void a(int n2, List<Double> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        ((Double)list.get(i2)).doubleValue();
                        n10 += 8;
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.b(Double.doubleToRawLongBits((double)((Double)list.get(n6))));
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c52 = d52.a;
                        long l2 = Double.doubleToRawLongBits((double)((Double)list.get(n6)));
                        a5 a52 = (a5)c52;
                        a52.b(1 | n2 << 3);
                        a52.b(l2);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static <T, UT, UB> void a(s7<UT, UB> s72, T t9, T t10) {
        if ((u7)s72 != null) {
            t5 t52 = (t5)t9;
            t7 t72 = t52.zzc;
            t7 t73 = ((t5)t10).zzc;
            if (!t73.equals(t7.f)) {
                int n2 = t72.a + t73.a;
                int[] arrn = Arrays.copyOf((int[])t72.b, (int)n2);
                System.arraycopy((Object)t73.b, (int)0, (Object)arrn, (int)t72.a, (int)t73.a);
                Object[] arrobject = Arrays.copyOf((Object[])t72.c, (int)n2);
                System.arraycopy((Object)t73.c, (int)0, (Object)arrobject, (int)t72.a, (int)t73.a);
                t72 = new t7(n2, arrn, arrobject, true);
            }
            t52.zzc = t72;
            return;
        }
        throw null;
    }

    public static void a(Class<?> class_) {
        Class<?> class_2;
        if (!t5.class.isAssignableFrom(class_) && (class_2 = a) != null) {
            if (class_2.isAssignableFrom(class_)) {
                return;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static <T> void a(q6 q62, T t9, T t10, long l2) {
        Object object = q6.a(e8.h(q62, t10), e8.h(t9, t10));
        e8.e.a((Object)q62, (long)t10, object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Object object, Object object2) {
        if (object == object2) return true;
        boolean bl = false;
        if (object == null) return bl;
        if (!object.equals(object2)) return false;
        return true;
    }

    public static int b(int n2, List<?> list, boolean bl) {
        bl = list.size();
        if (!bl) {
            return 0;
        }
        return bl * (4 + c5.f((int)(n2 << 3)));
    }

    public static int b(int n2, List<u6> list, f7 f72) {
        int n6 = list.size();
        if (n6 != 0) {
            int n10 = 0;
            for (int i2 = 0; i2 < n6; ++i2) {
                n10 += c5.a((int)n2, (u6)((u6)list.get(i2)), (f7)f72);
            }
            return n10;
        }
        return 0;
    }

    public static int b(int n2, List<Long> list, boolean bl) {
        int n6 = list.size();
        if (n6 == 0) {
            return 0;
        }
        return h7.c(list) + n6 * c5.d((int)n2);
    }

    public static int b(List<Long> list) {
        int n2;
        int n6;
        int n10 = list.size();
        if (n10 == 0) {
            return 0;
        }
        if (list instanceof k6) {
            k6 k62 = (k6)list;
            n2 = 0;
            for (n6 = 0; n6 < n10; ++n6) {
                n2 += c5.c((long)k62.c(n6));
            }
        } else {
            n2 = 0;
            while (n6 < n10) {
                n2 += c5.c((long)((Long)list.get(n6)));
                ++n6;
            }
        }
        return n2;
    }

    public static void b(int n2, List<x4> list, d5 d52) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    d52.a.a(n2, (x4)list.get(i2));
                }
                return;
            }
            throw null;
        }
    }

    public static void b(int n2, List<?> list, d5 d52, f7 f72) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                d52.b(n2, list.get(i2), f72);
            }
        }
    }

    public static void b(int n2, List<Float> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        ((Float)list.get(i2)).floatValue();
                        n10 += 4;
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.c(Float.floatToRawIntBits((float)((Float)list.get(n6)).floatValue()));
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c52 = d52.a;
                        int n11 = Float.floatToRawIntBits((float)((Float)list.get(n6)).floatValue());
                        a5 a52 = (a5)c52;
                        a52.b(5 | n2 << 3);
                        a52.c(n11);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static int c(int n2, List<?> list, boolean bl) {
        bl = list.size();
        if (!bl) {
            return 0;
        }
        return bl * (8 + c5.f((int)(n2 << 3)));
    }

    public static int c(int n2, List<Integer> list, boolean bl) {
        int n6 = list.size();
        if (n6 == 0) {
            return 0;
        }
        return h7.d(list) + n6 * c5.d((int)n2);
    }

    public static int c(List<Long> list) {
        int n2;
        int n6;
        int n10 = list.size();
        if (n10 == 0) {
            return 0;
        }
        if (list instanceof k6) {
            k6 k62 = (k6)list;
            n2 = 0;
            for (n6 = 0; n6 < n10; ++n6) {
                long l2 = k62.c(n6);
                n2 += c5.c((long)(l2 + l2 ^ l2 >> 63));
            }
        } else {
            n2 = 0;
            while (n6 < n10) {
                long l10 = (Long)list.get(n6);
                n2 += c5.c((long)(l10 + l10 ^ l10 >> 63));
                ++n6;
            }
        }
        return n2;
    }

    public static void c(int n2, List<Long> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        n10 += c5.c((long)((Long)list.get(i2)));
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.a(((Long)list.get(n6)).longValue());
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c52 = d52.a;
                        long l2 = (Long)list.get(n6);
                        a5 a52 = (a5)c52;
                        a52.b(n2 << 3);
                        a52.a(l2);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static int d(int n2, List<?> list, boolean bl) {
        bl = list.size();
        if (!bl) {
            return 0;
        }
        return bl * (1 + c5.f((int)(n2 << 3)));
    }

    public static int d(int n2, List<Integer> list, boolean bl) {
        int n6 = list.size();
        if (n6 == 0) {
            return 0;
        }
        return h7.e(list) + n6 * c5.d((int)n2);
    }

    public static int d(List<Integer> list) {
        int n2;
        int n6;
        int n10 = list.size();
        if (n10 == 0) {
            return 0;
        }
        if (list instanceof u5) {
            u5 u52 = (u5)list;
            n2 = 0;
            for (n6 = 0; n6 < n10; ++n6) {
                n2 += c5.e((int)u52.b(n6));
            }
        } else {
            n2 = 0;
            while (n6 < n10) {
                n2 += c5.e((int)((Integer)list.get(n6)));
                ++n6;
            }
        }
        return n2;
    }

    public static void d(int n2, List<Long> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        n10 += c5.c((long)((Long)list.get(i2)));
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.a(((Long)list.get(n6)).longValue());
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c52 = d52.a;
                        long l2 = (Long)list.get(n6);
                        a5 a52 = (a5)c52;
                        a52.b(n2 << 3);
                        a52.a(l2);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static int e(int n2, List<?> list) {
        int n6;
        int n10;
        int n11 = list.size();
        if (n11 == 0) {
            return 0;
        }
        n6 = n11 * c5.d((int)n2);
        boolean bl = list instanceof g6;
        if (bl) {
            g6 g62 = (g6)list;
            for (n10 = 0; n10 < n11; ++n10) {
                Object object = g62.b(n10);
                int n12 = object instanceof x4 ? c5.a((x4)((x4)object)) : c5.a((String)((String)object));
                n6 = n12 + n6;
            }
        } else {
            while (n10 < n11) {
                Object object = list.get(n10);
                int n13 = object instanceof x4 ? c5.a((x4)((x4)object)) : c5.a((String)((String)object));
                n6 = n13 + n6;
                ++n10;
            }
        }
        return n6;
    }

    public static int e(int n2, List<Integer> list, boolean bl) {
        int n6 = list.size();
        if (n6 == 0) {
            return 0;
        }
        return h7.f(list) + n6 * c5.d((int)n2);
    }

    public static int e(List<Integer> list) {
        int n2;
        int n6;
        int n10 = list.size();
        if (n10 == 0) {
            return 0;
        }
        if (list instanceof u5) {
            u5 u52 = (u5)list;
            n2 = 0;
            for (n6 = 0; n6 < n10; ++n6) {
                n2 += c5.e((int)u52.b(n6));
            }
        } else {
            n2 = 0;
            while (n6 < n10) {
                n2 += c5.e((int)((Integer)list.get(n6)));
                ++n6;
            }
        }
        return n2;
    }

    public static void e(int n2, List<Long> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        long l2 = (Long)list.get(i2);
                        n10 += c5.c((long)(l2 + l2 ^ l2 >> 63));
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        c5 c52 = d52.a;
                        long l10 = (Long)list.get(n6);
                        c52.a(l10 + l10 ^ l10 >> 63);
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c53 = d52.a;
                        long l11 = (Long)list.get(n6);
                        long l12 = l11 + l11 ^ l11 >> 63;
                        a5 a52 = (a5)c53;
                        a52.b(n2 << 3);
                        a52.a(l12);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static int f(int n2, List<x4> list) {
        int n6 = list.size();
        if (n6 == 0) {
            return 0;
        }
        int n10 = n6 * c5.d((int)n2);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            n10 += c5.a((x4)((x4)list.get(i2)));
        }
        return n10;
    }

    public static int f(int n2, List<Integer> list, boolean bl) {
        int n6 = list.size();
        if (n6 == 0) {
            return 0;
        }
        return h7.g(list) + n6 * c5.d((int)n2);
    }

    public static int f(List<Integer> list) {
        int n2;
        int n6;
        int n10 = list.size();
        if (n10 == 0) {
            return 0;
        }
        if (list instanceof u5) {
            u5 u52 = (u5)list;
            n2 = 0;
            for (n6 = 0; n6 < n10; ++n6) {
                n2 += c5.f((int)u52.b(n6));
            }
        } else {
            n2 = 0;
            while (n6 < n10) {
                n2 += c5.f((int)((Integer)list.get(n6)));
                ++n6;
            }
        }
        return n2;
    }

    public static void f(int n2, List<Long> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        ((Long)list.get(i2)).longValue();
                        n10 += 8;
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.b(((Long)list.get(n6)).longValue());
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c52 = d52.a;
                        long l2 = (Long)list.get(n6);
                        a5 a52 = (a5)c52;
                        a52.b(1 | n2 << 3);
                        a52.b(l2);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static int g(List<Integer> list) {
        int n2;
        int n6;
        int n10 = list.size();
        if (n10 == 0) {
            return 0;
        }
        if (list instanceof u5) {
            u5 u52 = (u5)list;
            n2 = 0;
            for (n6 = 0; n6 < n10; ++n6) {
                int n11 = u52.b(n6);
                n2 += c5.f((int)(n11 + n11 ^ n11 >> 31));
            }
        } else {
            n2 = 0;
            while (n6 < n10) {
                int n12 = (Integer)list.get(n6);
                n2 += c5.f((int)(n12 + n12 ^ n12 >> 31));
                ++n6;
            }
        }
        return n2;
    }

    public static void g(int n2, List<Long> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        ((Long)list.get(i2)).longValue();
                        n10 += 8;
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.b(((Long)list.get(n6)).longValue());
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c52 = d52.a;
                        long l2 = (Long)list.get(n6);
                        a5 a52 = (a5)c52;
                        a52.b(1 | n2 << 3);
                        a52.b(l2);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static int h(List<?> list) {
        return 4 * list.size();
    }

    public static void h(int n2, List<Integer> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        n10 += c5.e((int)((Integer)list.get(i2)));
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.a(((Integer)list.get(n6)).intValue());
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        d52.a.a(n2, ((Integer)list.get(n6)).intValue());
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static int i(List<?> list) {
        return 8 * list.size();
    }

    public static void i(int n2, List<Integer> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        n10 += c5.f((int)((Integer)list.get(i2)));
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.b(((Integer)list.get(n6)).intValue());
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c52 = d52.a;
                        int n11 = (Integer)list.get(n6);
                        a5 a52 = (a5)c52;
                        a52.b(n2 << 3);
                        a52.b(n11);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static int j(List<?> list) {
        return list.size();
    }

    public static void j(int n2, List<Integer> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        int n11 = (Integer)list.get(i2);
                        n10 += c5.f((int)(n11 + n11 ^ n11 >> 31));
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        c5 c52 = d52.a;
                        int n12 = (Integer)list.get(n6);
                        c52.b(n12 + n12 ^ n12 >> 31);
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c53 = d52.a;
                        int n13 = (Integer)list.get(n6);
                        int n14 = n13 + n13 ^ n13 >> 31;
                        a5 a52 = (a5)c53;
                        a52.b(n2 << 3);
                        a52.b(n14);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static void k(int n2, List<Integer> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        ((Integer)list.get(i2)).intValue();
                        n10 += 4;
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.c(((Integer)list.get(n6)).intValue());
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c52 = d52.a;
                        int n11 = (Integer)list.get(n6);
                        a5 a52 = (a5)c52;
                        a52.b(5 | n2 << 3);
                        a52.c(n11);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static void l(int n2, List<Integer> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        ((Integer)list.get(i2)).intValue();
                        n10 += 4;
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.c(((Integer)list.get(n6)).intValue());
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c52 = d52.a;
                        int n11 = (Integer)list.get(n6);
                        a5 a52 = (a5)c52;
                        a52.b(5 | n2 << 3);
                        a52.c(n11);
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static void m(int n2, List<Integer> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        n10 += c5.e((int)((Integer)list.get(i2)));
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.a(((Integer)list.get(n6)).intValue());
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        d52.a.a(n2, ((Integer)list.get(n6)).intValue());
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static void n(int n2, List<Boolean> list, d5 d52, boolean bl) {
        if (list != null && !list.isEmpty()) {
            if (d52 != null) {
                int n6;
                if (bl) {
                    ((a5)d52.a).b(2 | n2 << 3);
                    int n10 = 0;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        ((Boolean)list.get(i2)).booleanValue();
                        ++n10;
                    }
                    d52.a.b(n10);
                    while (n6 < list.size()) {
                        d52.a.a((byte)((Boolean)list.get(n6)).booleanValue());
                        ++n6;
                    }
                } else {
                    for (n6 = 0; n6 < list.size(); ++n6) {
                        c5 c52 = d52.a;
                        byte by = ((Boolean)list.get(n6)).booleanValue();
                        a5 a52 = (a5)c52;
                        a52.b(n2 << 3);
                        a52.a(by);
                    }
                }
                return;
            }
            throw null;
        }
    }
}

