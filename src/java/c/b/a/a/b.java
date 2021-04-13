/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.google.ads.mediation.AbstractAdViewAdapter
 *  com.google.android.gms.ads.reward.AdMetadataListener
 */
package c.b.a.a;

import android.os.Bundle;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.reward.AdMetadataListener;

public final class b
extends AdMetadataListener {
    public final /* synthetic */ AbstractAdViewAdapter a;

    public b(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.a = abstractAdViewAdapter;
    }

    public final void onAdMetadataChanged() {
        if (AbstractAdViewAdapter.zzb((AbstractAdViewAdapter)this.a) != null && AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a) != null) {
            Bundle bundle = AbstractAdViewAdapter.zzb((AbstractAdViewAdapter)this.a).getAdMetadata();
            AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a).zzb(bundle);
        }
    }
}

