/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  c.b.b.a.e.a.u
 *  java.lang.Float
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

public final class x
extends u<Float> {
    public x(String string, Float f10) {
        super(1, string, (Object)f10, null);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Float.valueOf((float)sharedPreferences.getFloat(this.b, ((Float)this.c).floatValue()));
    }

    public final /* synthetic */ Object a(Bundle bundle) {
        String string = String.valueOf((Object)this.b);
        String string2 = string.length() != 0 ? "com.google.android.gms.ads.flag.".concat(string) : new String("com.google.android.gms.ads.flag.");
        if (bundle.containsKey(string2)) {
            String string3 = String.valueOf((Object)this.b);
            String string4 = string3.length() != 0 ? "com.google.android.gms.ads.flag.".concat(string3) : new String("com.google.android.gms.ads.flag.");
            return Float.valueOf((float)bundle.getFloat(string4));
        }
        return (Float)this.c;
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float)((float)jSONObject.optDouble(this.b, (double)((Float)this.c).floatValue())));
    }
}

