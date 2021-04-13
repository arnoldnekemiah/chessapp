/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package a.i.r.q;

import android.content.Context;
import android.content.SharedPreferences;

public class e {
    public final Context a;
    public SharedPreferences b;
    public boolean c;

    public e(Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int a(int n2, int n3) {
        Class<e> class_ = e.class;
        synchronized (e.class) {
            this.a();
            int n5 = this.a("next_job_scheduler_id");
            if (n5 >= n2) {
                if (n5 <= n3) return n5;
            }
            int n7 = n2 + 1;
            this.b.edit().putInt("next_job_scheduler_id", n7).apply();
            // ** MonitorExit[var6_3] (shouldn't be in output)
            return n2;
        }
    }

    public final int a(String string) {
        int n2 = this.b.getInt(string, 0);
        int n3 = n2 == Integer.MAX_VALUE ? 0 : n2 + 1;
        this.b.edit().putInt(string, n3).apply();
        return n2;
    }

    public final void a() {
        if (!this.c) {
            this.b = this.a.getSharedPreferences("androidx.work.util.id", 0);
            this.c = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int b() {
        Class<e> class_ = e.class;
        synchronized (e.class) {
            this.a();
            return this.a("next_alarm_manager_id");
        }
    }
}

