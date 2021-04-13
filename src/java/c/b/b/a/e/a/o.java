/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.ag
 *  com.google.android.gms.ads.AdValue
 *  com.google.android.gms.ads.OnPaidEventListener
 *  com.google.android.gms.internal.ads.zzvu
 *  java.lang.String
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.ag;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.internal.ads.zzvu;

public final class o
extends ag {
    public final OnPaidEventListener a;

    public o(OnPaidEventListener onPaidEventListener) {
        this.a = onPaidEventListener;
    }

    public final void a(zzvu zzvu2) {
        if (this.a != null) {
            AdValue adValue = AdValue.zza((int)zzvu2.b, (String)zzvu2.c, (long)zzvu2.d);
            this.a.onPaidEvent(adValue);
        }
    }
}

