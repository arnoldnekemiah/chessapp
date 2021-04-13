/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.h$a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package a.i;

import a.i.h;

/*
 * Exception performing whole class analysis.
 */
public abstract class h {
    public static h a;

    public static h a() {
        Class<h> class_ = h.class;
        synchronized (h.class) {
            if (a == null) {
                a = new /* Unavailable Anonymous Inner Class!! */;
            }
            h h2 = a;
            // ** MonitorExit[var2] (shouldn't be in output)
            return h2;
        }
    }

    public static String a(String string) {
        int n2 = string.length();
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append("WM-");
        if (n2 >= 20) {
            string = string.substring(0, 20);
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static void a(h h2) {
        Class<h> class_ = h.class;
        synchronized (h.class) {
            a = h2;
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return;
        }
    }

    public /* varargs */ abstract void a(String var1, String var2, Throwable ... var3);

    public /* varargs */ abstract void b(String var1, String var2, Throwable ... var3);

    public /* varargs */ abstract void c(String var1, String var2, Throwable ... var3);

    public /* varargs */ abstract void d(String var1, String var2, Throwable ... var3);
}

