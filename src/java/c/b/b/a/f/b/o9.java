/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.text.TextUtils
 *  c.b.b.a.b.j.c
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Set
 */
package c.b.b.a.f.b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.r3;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.t3;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;
import java.util.Set;

public final class o9 {
    public final i4 a;

    public o9(i4 i42) {
        this.a = i42;
    }

    public final void a(String string, Bundle bundle) {
        this.a.d().g();
        if (!this.a.i()) {
            String string2;
            if (bundle.isEmpty()) {
                string2 = null;
            } else {
                if (string.isEmpty()) {
                    string = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(string);
                for (String string3 : bundle.keySet()) {
                    builder.appendQueryParameter(string3, bundle.getString(string3));
                }
                string2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(string2)) {
                this.a.m().z.a(string2);
                r3 r32 = this.a.m().A;
                if ((c)this.a.n != null) {
                    r32.a(System.currentTimeMillis());
                    return;
                }
                throw null;
            }
        }
    }

    public final boolean a() {
        if (!this.b()) {
            return false;
        }
        if ((c)this.a.n != null) {
            return System.currentTimeMillis() - this.a.m().A.a() > this.a.g.a(null, u2.R);
        }
        throw null;
    }

    public final boolean b() {
        return this.a.m().A.a() > 0L;
    }
}

