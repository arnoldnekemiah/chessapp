/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Set
 */
package c.b.b.a.f.b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.o9;
import c.b.b.a.f.b.r3;
import c.b.b.a.f.b.t3;
import c.b.b.a.f.b.u3;
import java.util.Set;

public final class n5
implements Runnable {
    public final /* synthetic */ j6 a;

    public n5(j6 j62) {
        this.a = j62;
    }

    public final void run() {
        o9 o92 = this.a.n;
        o92.a.d().g();
        if (!o92.b()) {
            return;
        }
        if (o92.a()) {
            o92.a.m().z.a(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            o92.a.o().b("auto", "_cmpx", bundle);
        } else {
            String string = o92.a.m().z.a();
            if (TextUtils.isEmpty((CharSequence)string)) {
                o92.a.a().g.a("Cache still valid but referrer not found");
            } else {
                long l2 = 3600000L * (-1L + o92.a.m().A.a() / 3600000L);
                Uri uri = Uri.parse((String)string);
                Bundle bundle = new Bundle();
                Pair pair = new Pair((Object)uri.getPath(), (Object)bundle);
                for (String string2 : uri.getQueryParameterNames()) {
                    bundle.putString(string2, uri.getQueryParameter(string2));
                }
                ((Bundle)pair.second).putLong("_cc", l2);
                o92.a.o().b((String)pair.first, "_cmp", (Bundle)pair.second);
            }
            o92.a.m().z.a(null);
        }
        o92.a.m().A.a(0L);
    }
}

