/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package a.i.r.q;

import android.content.Context;
import android.content.SharedPreferences;

public class g {
    public Context a;
    public SharedPreferences b;

    public g(Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final SharedPreferences a() {
        Class<g> class_ = g.class;
        synchronized (g.class) {
            if (this.b != null) return this.b;
            this.b = this.a.getSharedPreferences("androidx.work.util.preferences", 0);
            return this.b;
        }
    }
}

