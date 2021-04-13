/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONException
 */
package c.a.a.b;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c.a.a.a.l;
import c.a.a.a.n;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public final class a {
    public static int a = Runtime.getRuntime().availableProcessors();

    public static Bundle a(c.a.a.a.a a2, String string) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", string);
        String string2 = a2.a;
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            bundle.putString("developerPayload", string2);
        }
        return bundle;
    }

    public static Bundle a(boolean bl, boolean bl2, String string) {
        Bundle bundle = new Bundle();
        if (bl) {
            bundle.putString("playBillingLibraryVersion", string);
        }
        if (bl && bl2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static l a(Intent intent, String string) {
        if (intent == null) {
            a.c("BillingHelper", "Got null intent!");
            l.b b2 = l.a();
            b2.a = 6;
            b2.b = "An internal error occurred.";
            return b2.a();
        }
        l.b b3 = l.a();
        b3.a = a.b(intent.getExtras(), string);
        b3.b = a.a(intent.getExtras(), string);
        return b3.a();
    }

    public static n a(String string, String string2) {
        if (string != null && string2 != null) {
            try {
                n n2 = new n(string, string2);
                return n2;
            }
            catch (JSONException jSONException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got JSONException while parsing purchase data: ");
                stringBuilder.append((Object)jSONException);
                a.c("BillingHelper", stringBuilder.toString());
                return null;
            }
        }
        a.c("BillingHelper", "Received a bad purchase data.");
        return null;
    }

    public static String a(Bundle bundle, String string) {
        if (bundle == null) {
            a.c(string, "Unexpected null bundle received!");
            return "";
        }
        Object object = bundle.get("DEBUG_MESSAGE");
        if (object == null) {
            a.b(string, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (object instanceof String) {
            return (String)object;
        }
        StringBuilder stringBuilder = c.a.b.a.a.a("Unexpected type for debug message: ");
        stringBuilder.append(object.getClass().getName());
        a.c(string, stringBuilder.toString());
        return "";
    }

    public static List<n> a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList arrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null && arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList.size() && i2 < arrayList2.size(); ++i2) {
                n n2 = a.a((String)arrayList.get(i2), (String)arrayList2.get(i2));
                if (n2 == null) continue;
                arrayList3.add((Object)n2);
            }
        } else {
            a.c("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            n n3 = a.a(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (n3 == null) {
                a.c("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList3.add((Object)n3);
        }
        return arrayList3;
    }

    public static int b(Bundle bundle, String string) {
        String string2;
        if (bundle == null) {
            string2 = "Unexpected null bundle received!";
        } else {
            Object object = bundle.get("RESPONSE_CODE");
            if (object == null) {
                a.b(string, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            }
            if (object instanceof Integer) {
                return (Integer)object;
            }
            StringBuilder stringBuilder = c.a.b.a.a.a("Unexpected type for bundle response code: ");
            stringBuilder.append(object.getClass().getName());
            string2 = stringBuilder.toString();
        }
        a.c(string, string2);
        return 6;
    }

    public static void b(String string, String string2) {
        if (Log.isLoggable((String)string, (int)2)) {
            Log.v((String)string, (String)string2);
        }
    }

    public static void c(String string, String string2) {
        if (Log.isLoggable((String)string, (int)5)) {
            Log.w((String)string, (String)string2);
        }
    }
}

