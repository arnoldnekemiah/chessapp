/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.io.BufferedReader
 *  java.io.FileInputStream
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package c.c.b;

import android.os.Build;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public final class f {
    public static final String a;
    public static final String b;

    public static {
        String string;
        if (Build.VERSION.SDK_INT == 16) {
            a = string = "";
        } else {
            a = "<b>";
            string = "</b>";
        }
        b = string;
    }

    public static String[] a(String string) {
        String string2;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader((InputStream)new FileInputStream(string)));
        while ((string2 = bufferedReader.readLine()) != null) {
            arrayList.add((Object)string2);
        }
        bufferedReader.close();
        return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
    }

    public static final class a {
        public a(CharSequence charSequence, CharSequence charSequence2) {
        }
    }

}

