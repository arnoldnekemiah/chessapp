/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  org.json.JSONObject
 */
package c.a.a.a;

import android.text.TextUtils;
import c.a.a.a.l;
import java.util.List;
import org.json.JSONObject;

public class n {
    public final String a;
    public final String b;
    public final JSONObject c;

    public n(String string, String string2) {
        this.a = string;
        this.b = string2;
        this.c = new JSONObject(this.a);
    }

    public String a() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof n)) {
            return false;
        }
        n n2 = (n)object;
        return TextUtils.equals((CharSequence)this.a, (CharSequence)n2.a) && TextUtils.equals((CharSequence)this.b, (CharSequence)n2.b);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = c.a.b.a.a.a("Purchase. Json: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    public static class a {
        public List<n> a;

        public a(l l2, List<n> list) {
            this.a = list;
        }
    }

}

