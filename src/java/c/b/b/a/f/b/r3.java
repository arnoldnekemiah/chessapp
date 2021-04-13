/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.SharedPreferences;
import c.b.b.a.f.b.u3;

public final class r3 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ u3 e;

    public r3(u3 u32, String string, long l2) {
        this.e = u32;
        a.c(string);
        this.a = string;
        this.b = l2;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.n().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void a(long l2) {
        SharedPreferences.Editor editor = this.e.n().edit();
        editor.putLong(this.a, l2);
        editor.apply();
        this.d = l2;
    }
}

