/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package c.b.d;

import a.c.a.a;
import android.content.Context;
import android.text.TextUtils;
import c.b.b.a.b.h.h;
import c.b.b.a.b.h.i;
import c.b.b.a.b.j.f;
import java.util.Arrays;

public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public e(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        a.b(true ^ f.a(string), (Object)"ApplicationId must be set.");
        this.b = string;
        this.a = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = string6;
        this.g = string7;
    }

    public static e a(Context context) {
        i i10 = new i(context);
        String string = i10.a("google_app_id");
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        e e10 = new e(string, i10.a("google_api_key"), i10.a("firebase_database_url"), i10.a("ga_trackingId"), i10.a("gcm_defaultSenderId"), i10.a("google_storage_bucket"), i10.a("project_id"));
        return e10;
    }

    public boolean equals(Object object) {
        if (!(object instanceof e)) {
            return false;
        }
        e e10 = (e)object;
        boolean bl = a.b((Object)this.b, (Object)e10.b);
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = a.b((Object)this.a, (Object)e10.a);
            bl2 = false;
            if (bl3) {
                boolean bl4 = a.b((Object)this.c, (Object)e10.c);
                bl2 = false;
                if (bl4) {
                    boolean bl5 = a.b((Object)this.d, (Object)e10.d);
                    bl2 = false;
                    if (bl5) {
                        boolean bl6 = a.b((Object)this.e, (Object)e10.e);
                        bl2 = false;
                        if (bl6) {
                            boolean bl7 = a.b((Object)this.f, (Object)e10.f);
                            bl2 = false;
                            if (bl7) {
                                boolean bl8 = a.b((Object)this.g, (Object)e10.g);
                                bl2 = false;
                                if (bl8) {
                                    bl2 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bl2;
    }

    public int hashCode() {
        Object[] arrobject = new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g};
        return Arrays.hashCode((Object[])arrobject);
    }

    public String toString() {
        h h10 = a.b(this);
        h10.a("applicationId", this.b);
        h10.a("apiKey", this.a);
        h10.a("databaseUrl", this.c);
        h10.a("gcmSenderId", this.e);
        h10.a("storageBucket", this.f);
        h10.a("projectId", this.g);
        return h10.toString();
    }
}

