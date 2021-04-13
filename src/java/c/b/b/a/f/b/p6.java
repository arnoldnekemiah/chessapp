/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import c.b.b.a.b.f;

public final class p6 {
    @Deprecated
    public static String a(Context context, String string) {
        String string2;
        int n2;
        Resources resources;
        block3 : {
            string2 = null;
            try {
                a.a(context);
                resources = context.getResources();
                n2 = resources.getIdentifier("google_app_id", "string", resources.getResourcePackageName(f.common_google_play_services_unknown_issue));
                if (n2 != 0) break block3;
                return null;
            }
            catch (Resources.NotFoundException notFoundException) {}
        }
        string2 = resources.getString(n2);
        return string2;
    }

    public static String a(Context context, String string, String string2) {
        a.a(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string2 = a.b(context);
        }
        return a.a("google_app_id", resources, string2);
    }

    public static String a(String string, String[] arrstring, String[] arrstring2) {
        a.a(arrstring);
        a.a(arrstring2);
        int n2 = Math.min((int)arrstring.length, (int)arrstring2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = arrstring[i2];
            if ((string != null || string2 != null) && (string == null || !string.equals((Object)string2))) continue;
            return arrstring2[i2];
        }
        return null;
    }
}

