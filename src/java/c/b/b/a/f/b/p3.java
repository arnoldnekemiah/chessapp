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

public final class p3 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ u3 e;

    public p3(u3 u32, String string, boolean bl) {
        this.e = u32;
        a.c(string);
        this.a = string;
        this.b = bl;
    }

    public final void a(boolean bl) {
        SharedPreferences.Editor editor = this.e.n().edit();
        editor.putBoolean(this.a, bl);
        editor.apply();
        this.d = bl;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.n().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}

