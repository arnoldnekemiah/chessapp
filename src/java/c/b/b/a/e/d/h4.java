/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.b4
 *  c.b.b.a.e.d.e4
 *  c.b.b.a.e.d.f4
 *  c.b.b.a.e.d.g4
 *  java.io.PrintStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.b4;
import c.b.b.a.e.d.e4;
import c.b.b.a.e.d.f4;
import c.b.b.a.e.d.g4;
import java.io.PrintStream;
import java.lang.reflect.Field;

public final class h4 {
    public static final b4 a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static {
        Object object;
        Integer n2;
        block5 : {
            n2 = null;
            try {
                try {
                    Integer n6;
                    n2 = n6 = (Integer)Class.forName((String)"android.os.Build$VERSION").getField("SDK_INT").get(null);
                }
                catch (Exception exception) {
                    System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                    exception.printStackTrace(System.err);
                }
                object = n2 != null && n2 >= 19 ? new g4() : (!Boolean.getBoolean((String)"com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new e4() : new f4());
                break block5;
            }
            catch (Throwable throwable2) {}
            PrintStream printStream = System.err;
            String string = f4.class.getName();
            StringBuilder stringBuilder = new StringBuilder(133 + string.length());
            stringBuilder.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            stringBuilder.append(string);
            stringBuilder.append("will be used. The error is: ");
            printStream.println(stringBuilder.toString());
            throwable2.printStackTrace(System.err);
            object = new f4();
        }
        a = object;
        if (n2 == null) {
            return;
        }
        n2.intValue();
    }
}

