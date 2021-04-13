/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.b.a
 *  android.net.Uri
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import a.b.a;
import android.net.Uri;

public final class g3 {
    public static final a<String, Uri> a = new a();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri a(String string) {
        Class<g3> class_ = g3.class;
        synchronized (g3.class) {
            Uri uri = (Uri)a.get("com.google.android.gms.measurement");
            if (uri == null) {
                String string2 = String.valueOf((Object)Uri.encode((String)"com.google.android.gms.measurement"));
                String string3 = string2.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(string2) : new String("content://com.google.android.gms.phenotype/");
                uri = Uri.parse((String)string3);
                a.put("com.google.android.gms.measurement", uri);
            }
            // ** MonitorExit[var6_1] (shouldn't be in output)
            return uri;
        }
    }
}

