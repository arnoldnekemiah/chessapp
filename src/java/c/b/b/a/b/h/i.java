/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  java.lang.Object
 *  java.lang.String
 *  javax.annotation.Nullable
 */
package c.b.b.a.b.h;

import a.c.a.a;
import android.content.Context;
import android.content.res.Resources;
import c.b.b.a.b.f;
import javax.annotation.Nullable;

public class i {
    public final Resources a;
    public final String b;

    public i(Context context) {
        Resources resources;
        a.a(context);
        this.a = resources = context.getResources();
        this.b = resources.getResourcePackageName(f.common_google_play_services_unknown_issue);
    }

    @Nullable
    public String a(String string) {
        int n2 = this.a.getIdentifier(string, "string", this.b);
        if (n2 == 0) {
            return null;
        }
        return this.a.getString(n2);
    }
}

