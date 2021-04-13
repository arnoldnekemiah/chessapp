/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  com.google.android.gms.measurement.internal.zzaq
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.Set
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.Bundle;
import android.text.TextUtils;
import c.b.b.a.f.b.c3;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import com.google.android.gms.measurement.internal.zzaq;
import java.util.Iterator;
import java.util.Set;

public final class m {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzaq f;

    /*
     * Enabled aggressive block sorting
     */
    public m(i4 i42, String string, String string2, String string3, long l2, long l10, Bundle bundle) {
        zzaq zzaq2;
        block7 : {
            block6 : {
                a.c(string2);
                a.c(string3);
                this.a = string2;
                this.b = string3;
                if (TextUtils.isEmpty((CharSequence)string)) {
                    string = null;
                }
                this.c = string;
                this.d = l2;
                this.e = l10;
                if (l10 != 0L && l10 > l2) {
                    i42.a().i.a("Event created with reverse previous/current timestamps. appId", h3.a(string2));
                }
                if (bundle != null && !bundle.isEmpty()) break block6;
                zzaq2 = new zzaq(new Bundle());
                break block7;
            }
            Bundle bundle2 = new Bundle(bundle);
            Iterator iterator = bundle2.keySet().iterator();
            while (iterator.hasNext()) {
                String string4;
                Object object;
                block10 : {
                    block9 : {
                        block8 : {
                            string4 = (String)iterator.next();
                            if (string4 != null) break block8;
                            i42.a().f.a("Param name can't be null");
                            break block9;
                        }
                        object = i42.p().a(string4, bundle2.get(string4));
                        if (object != null) break block10;
                        i42.a().i.a("Param value can't be null", i42.q().b(string4));
                    }
                    iterator.remove();
                    continue;
                }
                i42.p().a(bundle2, string4, object);
            }
            zzaq2 = new zzaq(bundle2);
        }
        this.f = zzaq2;
    }

    public m(i4 i42, String string, String string2, String string3, long l2, long l10, zzaq zzaq2) {
        a.c(string2);
        a.c(string3);
        a.a(zzaq2);
        this.a = string2;
        this.b = string3;
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = null;
        }
        this.c = string;
        this.d = l2;
        this.e = l10;
        if (l10 != 0L && l10 > l2) {
            i42.a().i.a("Event created with reverse previous/current timestamps. appId, name", h3.a(string2), h3.a(string3));
        }
        this.f = zzaq2;
    }

    public final m a(i4 i42, long l2) {
        m m2 = new m(i42, this.c, this.a, this.b, this.d, l2, this.f);
        return m2;
    }

    public final String toString() {
        String string = this.a;
        String string2 = this.b;
        String string3 = String.valueOf((Object)this.f);
        int n2 = String.valueOf((Object)string).length();
        int n10 = String.valueOf((Object)string2).length();
        StringBuilder stringBuilder = new StringBuilder(string3.length() + (n10 + (n2 + 33)));
        stringBuilder.append("Event{appId='");
        stringBuilder.append(string);
        stringBuilder.append("', name='");
        stringBuilder.append(string2);
        stringBuilder.append("', params=");
        stringBuilder.append(string3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

