/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package c.b.b.a.b.k;

import android.content.Context;
import c.b.b.a.b.k.a;

public class b {
    public static b b = new b();
    public a a = null;

    public static a b(Context context) {
        return b.a(context);
    }

    public final a a(Context context) {
        b b2 = this;
        synchronized (b2) {
            if (this.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.a = new a(context);
            }
            a a2 = this.a;
            return a2;
        }
    }
}

