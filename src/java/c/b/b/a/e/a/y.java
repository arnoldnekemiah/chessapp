/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  c.b.b.a.e.a.u
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package c.b.b.a.e.a;

import android.content.SharedPreferences;
import android.os.Bundle;
import c.b.b.a.e.a.u;
import c.b.b.a.e.a.w;
import org.json.JSONObject;

public final class y
extends u<Long> {
    public y(String string, Long l10) {
        super(1, string, (Object)l10, null);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getLong(this.b, ((Long)this.c).longValue());
    }

    public final /* synthetic */ Object a(Bundle bundle) {
        String string = String.valueOf((Object)this.b);
        String string2 = string.length() != 0 ? "com.google.android.gms.ads.flag.".concat(string) : new String("com.google.android.gms.ads.flag.");
        if (bundle.containsKey(string2)) {
            String string3 = String.valueOf((Object)this.b);
            String string4 = string3.length() != 0 ? "com.google.android.gms.ads.flag.".concat(string3) : new String("com.google.android.gms.ads.flag.");
            return bundle.getLong(string4);
        }
        return (Long)this.c;
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optLong(this.b, ((Long)this.c).longValue());
    }
}

