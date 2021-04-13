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

public final class e
implements DynamiteModule.b {
    public final DynamiteModule.b.a a(Context context, String string, DynamiteModule.b.b b2) {
        int n10;
        int n11;
        DynamiteModule.b.a a5 = new DynamiteModule.b.a();
        a5.a = b2.a(context, string);
        a5.b = n10 = b2.a(context, string, true);
        if (a5.a == 0 && n10 == 0) {
            n11 = 0;
        } else {
            if (a5.b >= a5.a) {
                a5.c = 1;
                return a5;
            }
            n11 = -1;
        }
        a5.c = n11;
        return a5;
    }
}

