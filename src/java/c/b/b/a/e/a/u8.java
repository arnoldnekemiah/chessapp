/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  c.b.b.a.e.a.o8
 *  com.google.android.gms.ads.query.UpdateImpressionUrlsCallback
 *  java.lang.String
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.net.Uri;
import c.b.b.a.e.a.o8;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

public final class u8
extends o8 {
    public final /* synthetic */ UpdateImpressionUrlsCallback a;

    public u8(UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.a = updateImpressionUrlsCallback;
    }

    public final void b(List<Uri> list) {
        this.a.onSuccess(list);
    }

    public final void i(String string) {
        this.a.onFailure(string);
    }
}

