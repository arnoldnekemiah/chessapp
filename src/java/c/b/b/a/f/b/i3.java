/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.google.android.gms.measurement.internal.zzaq
 *  com.google.android.gms.measurement.internal.zzas
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import c.a.b.a.a;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;

public final class i3 {
    public final String a;
    public final String b;
    public final long c;
    public final Bundle d;

    public i3(String string, String string2, Bundle bundle, long l2) {
        this.a = string;
        this.b = string2;
        this.d = bundle;
        this.c = l2;
    }

    public static i3 a(zzas zzas2) {
        i3 i32 = new i3(zzas2.a, zzas2.c, zzas2.b.d(), zzas2.d);
        return i32;
    }

    public final zzas a() {
        zzas zzas2 = new zzas(this.a, new zzaq(new Bundle(this.d)), this.b, this.c);
        return zzas2;
    }

    public final String toString() {
        String string = this.b;
        String string2 = this.a;
        String string3 = String.valueOf((Object)this.d);
        int n2 = String.valueOf((Object)string).length();
        int n10 = String.valueOf((Object)string2).length();
        StringBuilder stringBuilder = new StringBuilder(string3.length() + (n10 + (n2 + 21)));
        stringBuilder.append("origin=");
        stringBuilder.append(string);
        stringBuilder.append(",name=");
        stringBuilder.append(string2);
        return a.a(stringBuilder, ",params=", string3);
    }
}

