/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  c.b.b.a.f.b.f5
 *  c.b.b.a.f.b.g5
 *  c.b.b.a.f.b.h5
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicReference
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import android.util.Log;
import c.a.b.a.a;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d5;
import c.b.b.a.f.b.f5;
import c.b.b.a.f.b.g5;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.h5;
import c.b.b.a.f.b.i4;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class c3
extends d5 {
    public static final AtomicReference<String[]> c = new AtomicReference();
    public static final AtomicReference<String[]> d = new AtomicReference();
    public static final AtomicReference<String[]> e = new AtomicReference();

    public c3(i4 i42) {
        super(i42);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String a(String string, String[] arrstring, String[] arrstring2, AtomicReference<String[]> atomicReference) {
        a.c.a.a.a(arrstring);
        a.c.a.a.a(arrstring2);
        a.c.a.a.a(atomicReference);
        int n7 = arrstring.length;
        int n9 = arrstring2.length;
        int n10 = 0;
        boolean bl = n7 == n9;
        a.c.a.a.a(bl);
        while (n10 < arrstring.length) {
            if (g9.d(string, arrstring[n10])) {
                AtomicReference<String[]> atomicReference2 = atomicReference;
                synchronized (atomicReference2) {
                    String string2;
                    String[] arrstring3 = (String[])atomicReference.get();
                    if (arrstring3 == null) {
                        arrstring3 = new String[arrstring2.length];
                        atomicReference.set((Object)arrstring3);
                    }
                    if ((string2 = arrstring3[n10]) == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(arrstring2[n10]);
                        stringBuilder.append("(");
                        stringBuilder.append(arrstring[n10]);
                        stringBuilder.append(")");
                        arrstring3[n10] = string2 = stringBuilder.toString();
                    }
                    return string2;
                }
            }
            ++n10;
        }
        return string;
    }

    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.n()) {
            return bundle.toString();
        }
        StringBuilder stringBuilder = a.a("Bundle[{");
        for (String string : bundle.keySet()) {
            if (stringBuilder.length() != 8) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.b(string));
            stringBuilder.append("=");
            Object object = bundle.get(string);
            String string2 = object instanceof Bundle ? this.a(new Object[]{object}) : (object instanceof Object[] ? this.a((Object[])object) : (object instanceof ArrayList ? this.a(((ArrayList)object).toArray()) : String.valueOf((Object)object)));
            stringBuilder.append(string2);
        }
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }

    public final String a(String string) {
        if (string == null) {
            return null;
        }
        if (!this.n()) {
            return string;
        }
        return c3.a(string, f5.c, f5.a, c);
    }

    public final String a(Object[] arrobject) {
        if (arrobject == null) {
            return "[]";
        }
        StringBuilder stringBuilder = a.a("[");
        for (Object object : arrobject) {
            String string = object instanceof Bundle ? this.a((Bundle)object) : String.valueOf((Object)object);
            if (string == null) continue;
            if (stringBuilder.length() != 1) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(string);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final String b(String string) {
        if (string == null) {
            return null;
        }
        if (!this.n()) {
            return string;
        }
        return c3.a(string, g5.b, g5.a, d);
    }

    public final String c(String string) {
        if (string == null) {
            return null;
        }
        if (!this.n()) {
            return string;
        }
        if (string.startsWith("_exp_")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("experiment_id(");
            stringBuilder.append(string);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        return c3.a(string, h5.b, h5.a, e);
    }

    @Override
    public final boolean h() {
        return false;
    }

    public final boolean n() {
        i4 i42 = this.a;
        return i42.t() && Log.isLoggable((String)this.a.a().s(), (int)3);
    }
}

