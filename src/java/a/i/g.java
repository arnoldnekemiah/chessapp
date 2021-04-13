/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package a.i;

import a.i.e;
import a.i.h;
import c.a.b.a.a;
import java.util.List;

public abstract class g {
    public static final String a = h.a("InputMerger");

    public static g a(String string) {
        try {
            g g2 = (g)Class.forName((String)string).newInstance();
            return g2;
        }
        catch (Exception exception) {
            h.a().b(a, a.a("Trouble instantiating + ", string), exception);
            return null;
        }
    }

    public abstract e a(List<e> var1);
}

