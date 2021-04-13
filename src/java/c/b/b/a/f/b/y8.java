/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  c.b.b.a.f.b.a9
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.f9
 *  c.b.b.a.f.b.x8
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import android.text.TextUtils;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.f9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.x8;

public final class y8
implements f9 {
    public final /* synthetic */ a9 a;

    public y8(a9 a92) {
        this.a = a92;
    }

    public final void a(String string, Bundle bundle) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.a.j.a().f.a("AppId not known when logging error event");
            return;
        }
        this.a.d().a((Runnable)new x8(this, string, bundle));
    }
}

