/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.kg
 *  com.google.android.gms.ads.VideoController
 *  com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.kg;
import com.google.android.gms.ads.VideoController;

public final class s
extends kg {
    public final VideoController.VideoLifecycleCallbacks a;

    public s(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.a = videoLifecycleCallbacks;
    }

    public final void D() {
        this.a.onVideoEnd();
    }

    public final void b(boolean bl) {
        this.a.onVideoMute(bl);
    }

    public final void onVideoPause() {
        this.a.onVideoPause();
    }

    public final void onVideoPlay() {
        this.a.onVideoPlay();
    }

    public final void onVideoStart() {
        this.a.onVideoStart();
    }
}

