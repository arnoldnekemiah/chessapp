/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.dynamite.DynamiteModule
 *  com.google.android.gms.dynamite.DynamiteModule$b
 *  com.google.android.gms.dynamite.DynamiteModule$b$a
 *  com.google.android.gms.dynamite.DynamiteModule$b$b
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.d;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class d
implements DynamiteModule.b {
    public final DynamiteModule.b.a a(Context context, String string, DynamiteModule.b.b b2) {
        int n10;
        DynamiteModule.b.a a5 = new DynamiteModule.b.a();
        a5.a = n10 = b2.a(context, string);
        int n11 = n10 != 0 ? b2.a(context, string, false) : b2.a(context, string, true);
        a5.b = n11;
        if (a5.a == 0 && a5.b == 0) {
            a5.c = 0;
            return a5;
        }
        if (a5.a >= a5.b) {
            a5.c = -1;
            return a5;
        }
        a5.c = 1;
        return a5;
    }
}

