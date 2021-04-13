/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.o2
 *  c.b.b.a.e.a.o7
 *  c.b.b.a.e.a.r7
 *  com.google.android.gms.ads.nativead.NativeCustomFormatAd
 *  com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomClickListener
 *  java.lang.String
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.o2;
import c.b.b.a.e.a.o7;
import c.b.b.a.e.a.r7;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

public final class q7
extends o2 {
    public final /* synthetic */ o7 a;

    public /* synthetic */ q7(o7 o72, r7 r72) {
        this.a = o72;
    }

    public final void a(f2 f22, String string) {
        o7 o72 = this.a;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener = o72.b;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener.onCustomClick(o72.a(f22), string);
    }
}

