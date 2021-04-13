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

public final class t3 {
    public final String a;
    public boolean b;
    public String c;
    public final /* synthetic */ u3 d;

    public t3(u3 u32, String string) {
        this.d = u32;
        a.c(string);
        this.a = string;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.n().getString(this.a, null);
        }
        return this.c;
    }

    public final void a(String string) {
        SharedPreferences.Editor editor = this.d.n().edit();
        editor.putString(this.a, string);
        editor.apply();
        this.c = string;
    }
}

