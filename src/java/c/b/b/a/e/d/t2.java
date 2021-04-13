/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.database.Cursor
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.regex.Pattern
 */
package c.b.b.a.e.d;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import c.b.b.a.e.d.s2;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class t2 {
    public static final Uri a = Uri.parse((String)"content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse((String)"content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile((String)"^(1|true|t|on|yes|y)$", (int)2);
    public static final Pattern d = Pattern.compile((String)"^(0|false|f|off|no|n)$", (int)2);
    public static final AtomicBoolean e = new AtomicBoolean();
    public static HashMap<String, String> f;
    public static final HashMap<String, Boolean> g;
    public static final HashMap<String, Integer> h;
    public static final HashMap<String, Long> i;
    public static final HashMap<String, Float> j;
    public static Object k;
    public static boolean l;
    public static final String[] m;

    public static {
        g = new HashMap();
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        m = new String[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(ContentResolver contentResolver, String string, String string2) {
        Class<t2> class_ = t2.class;
        synchronized (t2.class) {
            if (f == null) {
                e.set(false);
                f = new HashMap();
                k = new Object();
                l = false;
                contentResolver.registerContentObserver(a, true, (ContentObserver)new s2());
            } else if (e.getAndSet(false)) {
                f.clear();
                g.clear();
                h.clear();
                i.clear();
                j.clear();
                k = new Object();
                l = false;
            }
            Object object = k;
            if (f.containsKey((Object)string)) {
                String string3 = (String)f.get((Object)string);
                if (string3 != null) return string3;
                return null;
            }
            m.length;
            // ** MonitorExit[var12_3] (shouldn't be in output)
            Cursor cursor = contentResolver.query(a, null, null, new String[]{string}, null);
            if (cursor == null) {
                return null;
            }
            try {
                if (!cursor.moveToFirst()) {
                    t2.a(object, string, null);
                    return null;
                }
                String string4 = cursor.getString(1);
                if (string4 != null && string4.equals(null)) {
                    string4 = null;
                }
                t2.a(object, string, string4);
                String string5 = string4 == null ? null : string4;
                return string5;
            }
            finally {
                cursor.close();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Object object, String string, String string2) {
        Class<t2> class_ = t2.class;
        synchronized (t2.class) {
            if (object == k) {
                f.put((Object)string, (Object)string2);
            }
            // ** MonitorExit[var5_3] (shouldn't be in output)
            return;
        }
    }
}

