/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.SecureRandom
 */
package c.b.b.a.f.b;

import android.content.SharedPreferences;
import android.util.Log;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.s3;
import c.b.b.a.f.b.u3;
import java.security.SecureRandom;

public final class e3
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ h3 f;

    public e3(h3 h32, int n2, String string, Object object, Object object2, Object object3) {
        this.f = h32;
        this.a = n2;
        this.b = string;
        this.c = object;
        this.d = object2;
        this.e = object3;
    }

    public final void run() {
        u3 u32 = this.f.a.m();
        if (u32.j()) {
            s3 s32;
            h3 h32 = this.f;
            if (h32.c == '\u0000') {
                h3 h33;
                int n2;
                if (h32.a.g.j()) {
                    h33 = this.f;
                    n2 = 67;
                } else {
                    h33 = this.f;
                    n2 = 99;
                }
                h33.c = (char)n2;
            }
            h3 h34 = this.f;
            if (h34.d < 0L) {
                h34.a.g.i();
                h34.d = 39000L;
            }
            char c2 = "01VDIWEA?".charAt(this.a);
            h3 h35 = this.f;
            char c9 = h35.c;
            long l2 = h35.d;
            String string = h3.a(true, this.b, this.c, this.d, this.e);
            StringBuilder stringBuilder = new StringBuilder(24 + String.valueOf((Object)string).length());
            stringBuilder.append("2");
            stringBuilder.append(c2);
            stringBuilder.append(c9);
            stringBuilder.append(l2);
            stringBuilder.append(":");
            stringBuilder.append(string);
            String string2 = stringBuilder.toString();
            if (string2.length() > 1024) {
                string2 = this.b.substring(0, 1024);
            }
            if ((s32 = u32.d) != null) {
                long l10;
                s32.e.g();
                if (s32.e.n().getLong(s32.a, 0L) == 0L) {
                    s32.a();
                }
                if (string2 == null) {
                    string2 = "";
                }
                if ((l10 = s32.e.n().getLong(s32.b, 0L)) <= 0L) {
                    SharedPreferences.Editor editor = s32.e.n().edit();
                    editor.putString(s32.c, string2);
                    editor.putLong(s32.b, 1L);
                    editor.apply();
                    return;
                }
                long l11 = s32.e.a.p().p().nextLong();
                long l12 = l10 + 1L;
                long l13 = Long.MAX_VALUE / l12;
                SharedPreferences.Editor editor = s32.e.n().edit();
                if ((l11 & Long.MAX_VALUE) < l13) {
                    editor.putString(s32.c, string2);
                }
                editor.putLong(s32.b, l12);
                editor.apply();
            }
            return;
        }
        Log.println((int)6, (String)this.f.s(), (String)"Persisted config not initialized. Not logging error/warn");
    }
}

