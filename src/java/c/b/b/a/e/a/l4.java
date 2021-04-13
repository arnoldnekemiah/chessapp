/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.h1
 *  c.b.b.a.e.a.h4
 *  com.google.android.gms.ads.MediaContent
 *  com.google.android.gms.ads.VideoController
 *  com.google.android.gms.ads.instream.InstreamAd
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.h1;
import c.b.b.a.e.a.h4;
import c.b.b.a.e.a.xg;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.instream.InstreamAd;

public final class l4
extends InstreamAd {
    public final h4 a;
    public VideoController b;
    public MediaContent c;

    public l4(h4 h42) {
        xg xg2;
        block5 : {
            block4 : {
                this.a = h42;
                VideoController videoController = new VideoController();
                try {
                    videoController.zza(this.a.getVideoController());
                }
                catch (RemoteException remoteException) {
                    a.c("#007 Could not call remote method.", remoteException);
                }
                this.b = videoController;
                try {
                    if (this.a.z() == null) break block4;
                    xg2 = new xg(this.a.z());
                    break block5;
                }
                catch (RemoteException remoteException) {
                    a.c("#007 Could not call remote method.", remoteException);
                }
            }
            xg2 = null;
        }
        this.c = xg2;
    }

    public final void destroy() {
        try {
            this.a.destroy();
            this.b = null;
            this.c = null;
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final float getAspectRatio() {
        VideoController videoController = this.b;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getAspectRatio();
    }

    public final MediaContent getMediaContent() {
        return this.c;
    }

    public final VideoController getVideoController() {
        return this.b;
    }

    public final float getVideoCurrentTime() {
        VideoController videoController = this.b;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoCurrentTime();
    }

    public final float getVideoDuration() {
        VideoController videoController = this.b;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoDuration();
    }
}

