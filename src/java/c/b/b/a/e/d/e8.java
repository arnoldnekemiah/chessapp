/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a8
 *  c.b.b.a.e.d.b8
 *  c.b.b.a.e.d.c8
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  java.nio.ByteOrder
 *  java.security.AccessController
 *  java.security.PrivilegedExceptionAction
 *  java.util.logging.Level
 *  java.util.logging.Logger
 *  sun.misc.Unsafe
 */
package c.b.b.a.e.d;

import c.a.b.a.a;
import c.b.b.a.e.d.a8;
import c.b.b.a.e.d.b8;
import c.b.b.a.e.d.c8;
import c.b.b.a.e.d.d8;
import c.b.b.a.e.d.m4;
import c.b.b.a.e.d.z7;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class e8 {
    public static final Unsafe a;
    public static final Class<?> b;
    public static final boolean c;
    public static final boolean d;
    public static final d8 e;
    public static final boolean f;
    public static final boolean g;
    public static final long h;
    public static final boolean i;

    public static {
        c8 c82;
        d8 d82;
        a = e8.b();
        b = m4.a;
        c = e8.c(Long.TYPE);
        d = e8.c(Integer.TYPE);
        if (a == null) {
            c82 = null;
        } else if (m4.a()) {
            if (c) {
                c82 = new b8(a);
            } else {
                boolean bl = d;
                c82 = null;
                if (bl) {
                    c82 = new a8(a);
                }
            }
        } else {
            c82 = new c8(a);
        }
        e = c82;
        boolean bl = c82 == null ? false : c82.b();
        f = bl;
        d8 d83 = e;
        boolean bl2 = d83 == null ? false : d83.a();
        g = bl2;
        h = e8.a(byte[].class);
        e8.a(boolean[].class);
        e8.b(boolean[].class);
        e8.a(int[].class);
        e8.b(int[].class);
        e8.a(long[].class);
        e8.b(long[].class);
        e8.a(float[].class);
        e8.b(float[].class);
        e8.a(double[].class);
        e8.b(double[].class);
        e8.a(Object[].class);
        e8.b(Object[].class);
        Field field = e8.a();
        if (field != null && (d82 = e) != null) {
            d82.a(field);
        }
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        boolean bl3 = false;
        if (byteOrder == byteOrder2) {
            bl3 = true;
        }
        i = bl3;
    }

    public static byte a(Object object, long l2) {
        return (byte)(255 & e.e(object, -4L & l2) >>> (int)((3L & (l2 ^ -1L)) << 3));
    }

    public static byte a(byte[] arrby, long l2) {
        return e.a(arrby, l2 + h);
    }

    public static int a(Class<?> class_) {
        if (g) {
            return e.a(class_);
        }
        return -1;
    }

    /*
     * Exception decompiling
     */
    public static Field a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl22 : ALOAD_0 : trying to set 1 previously set to 0
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

    public static void a(Object object, long l2, byte by) {
        long l10 = -4L & l2;
        int n2 = e.e(object, l10);
        int n6 = (3 & (-1 ^ (int)l2)) << 3;
        e.a(object, l10, n2 & (-1 ^ 255 << n6) | (by & 255) << n6);
    }

    public static void a(Object object, long l2, double d2) {
        e.a(object, l2, d2);
    }

    public static void a(Object object, long l2, long l10) {
        e.a(object, l2, l10);
    }

    public static /* synthetic */ void a(Throwable throwable) {
        Logger logger = Logger.getLogger((String)e8.class.getName());
        Level level = Level.WARNING;
        String string = String.valueOf((Object)throwable);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", a.a(new StringBuilder(71 + string.length()), "platform method missing - proto runtime falling back to safer methods: ", string));
    }

    public static void a(byte[] arrby, long l2, byte by) {
        e.a((Object)arrby, l2 + h, by);
    }

    public static byte b(Object object, long l2) {
        return (byte)(255 & e.e(object, -4L & l2) >>> (int)((l2 & 3L) << 3));
    }

    public static int b(Class<?> class_) {
        if (g) {
            return e.b(class_);
        }
        return -1;
    }

    public static Unsafe b() {
        try {
            Unsafe unsafe = (Unsafe)AccessController.doPrivileged((PrivilegedExceptionAction)new z7());
            return unsafe;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void b(Object object, long l2, byte by) {
        long l10 = -4L & l2;
        int n2 = e.e(object, l10);
        int n6 = (3 & (int)l2) << 3;
        e.a(object, l10, n2 & (-1 ^ 255 << n6) | (by & 255) << n6);
    }

    public static int c(Object object, long l2) {
        return e.e(object, l2);
    }

    public static boolean c(Class<?> class_) {
        if (!m4.a()) {
            return false;
        }
        try {
            Class<?> class_2 = b;
            Class[] arrclass = new Class[]{class_, Boolean.TYPE};
            class_2.getMethod("peekLong", arrclass);
            Class[] arrclass2 = new Class[]{class_, Long.TYPE, Boolean.TYPE};
            class_2.getMethod("pokeLong", arrclass2);
            Class[] arrclass3 = new Class[]{class_, Integer.TYPE, Boolean.TYPE};
            class_2.getMethod("pokeInt", arrclass3);
            Class[] arrclass4 = new Class[]{class_, Boolean.TYPE};
            class_2.getMethod("peekInt", arrclass4);
            Class[] arrclass5 = new Class[]{class_, Byte.TYPE};
            class_2.getMethod("pokeByte", arrclass5);
            class_2.getMethod("peekByte", new Class[]{class_});
            Class[] arrclass6 = new Class[]{class_, byte[].class, Integer.TYPE, Integer.TYPE};
            class_2.getMethod("pokeByteArray", arrclass6);
            Class[] arrclass7 = new Class[]{class_, byte[].class, Integer.TYPE, Integer.TYPE};
            class_2.getMethod("peekByteArray", arrclass7);
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    public static long d(Object object, long l2) {
        return e.f(object, l2);
    }

    public static <T> T d(Class<T> class_) {
        Object object;
        try {
            object = a.allocateInstance(class_);
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException((Throwable)instantiationException);
        }
        return (T)object;
    }

    public static boolean e(Object object, long l2) {
        return e.b(object, l2);
    }

    public static float f(Object object, long l2) {
        return e.c(object, l2);
    }

    public static double g(Object object, long l2) {
        return e.d(object, l2);
    }

    public static Object h(Object object, long l2) {
        return e.g(object, l2);
    }
}

