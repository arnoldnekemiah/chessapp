/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  c.b.b.a.e.a.u
 *  java.lang.Integer
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

public final class v
extends u<Integer> {
    public v(String string, Integer n10) {
        super(1, string, (Object)n10, null);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getInt(this.b, ((Integer)this.c).intValue());
    }

    public final /* synthetic */ Object a(Bundle bundle) {
        String string = String.valueOf((Object)this.b);
        String string2 = string.length() != 0 ? "com.google.android.gms.ads.flag.".concat(string) : new String("com.google.android.gms.ads.flag.");
        if (bundle.containsKey(string2)) {
            String string3 = String.valueOf((Object)this.b);
            String string4 = string3.length() != 0 ? "com.google.android.gms.ads.flag.".concat(string3) : new String("com.google.android.gms.ads.flag.");
            return bundle.getInt(string4);
        }
        return (Integer)this.c;
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optInt(this.b, ((Integer)this.c).intValue());
    }
}

