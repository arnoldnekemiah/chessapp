/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  c.b.b.a.e.a.o8
 *  com.google.android.gms.ads.query.UpdateClickUrlCallback
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.net.Uri;
import c.b.b.a.e.a.o8;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

public final class t8
extends o8 {
    public final /* synthetic */ UpdateClickUrlCallback a;

    public t8(UpdateClickUrlCallback updateClickUrlCallback) {
        this.a = updateClickUrlCallback;
    }

    public final void b(List<Uri> list) {
        this.a.onSuccess((Uri)list.get(0));
    }

    public final void i(String string) {
        this.a.onFailure(string);
    }
}

