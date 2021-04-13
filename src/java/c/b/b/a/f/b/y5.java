/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  c.b.b.a.f.b.f9
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import android.text.TextUtils;
import c.b.b.a.f.b.f9;
import c.b.b.a.f.b.j6;

public final class y5
implements f9 {
    public final /* synthetic */ j6 a;

    public y5(j6 j62) {
        this.a = j62;
    }

    public final void a(String string, Bundle bundle) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.a.b("auto", "_err", bundle);
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }
}

