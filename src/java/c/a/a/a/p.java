/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  org.json.JSONObject
 */
package c.a.a.a;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public class p {
    public final String a;
    public final JSONObject b;

    public p(String string) {
        this.a = string;
        this.b = new JSONObject(this.a);
    }

    public String a() {
        return this.b.optString("productId");
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && p.class == object.getClass()) {
            p p2 = (p)object;
            return TextUtils.equals((CharSequence)this.a, (CharSequence)p2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = c.a.b.a.a.a("SkuDetails: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    public static class a {
        public List<p> a;
        public int b;
        public String c;

        public a(int n2, String string, List<p> list) {
            this.b = n2;
            this.c = string;
            this.a = list;
        }
    }

}

