/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 */
package c.b.b.a.e.d;

import a.c.a.a;

public final class f1 {
    public static final /* synthetic */ int[] a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static {
        a.g();
        var1 = new int[7];
        f1.a = var1;
        try {
            var1[3] = 1;
        }
        catch (NoSuchFieldError v0) {}
        try {
            f1.a[4] = 2;
            ** GOTO lbl-1000
        }
        catch (NoSuchFieldError v1) {
            try lbl-1000: // 2 sources:
            {
                f1.a[2] = 3;
            }
            catch (NoSuchFieldError v2) {}
        }
        try {
            f1.a[5] = 4;
        }
        catch (NoSuchFieldError v3) {}
        try {
            f1.a[6] = 5;
            ** GOTO lbl-1000
        }
        catch (NoSuchFieldError v4) {
            try lbl-1000: // 2 sources:
            {
                f1.a[0] = 6;
                ** GOTO lbl-1000
            }
            catch (NoSuchFieldError v5) {
                try lbl-1000: // 2 sources:
                {
                    f1.a[1] = 7;
                    return;
                }
                catch (NoSuchFieldError v6) {}
            }
        }
    }
}

