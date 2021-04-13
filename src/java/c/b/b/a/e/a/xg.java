/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.h1
 *  com.google.android.gms.ads.MediaContent
 *  com.google.android.gms.ads.VideoController
 *  java.lang.Object
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import c.b.b.a.c.b;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.h1;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;

public final class xg
implements MediaContent {
    public final h1 a;
    public final VideoController b = new VideoController();

    public xg(h1 h12) {
        this.a = h12;
    }

    public final float getAspectRatio() {
        try {
            float f10 = this.a.getAspectRatio();
            return f10;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return 0.0f;
        }
    }

    public final float getCurrentTime() {
        try {
            float f10 = this.a.getCurrentTime();
            return f10;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return 0.0f;
        }
    }

    public final float getDuration() {
        try {
            float f10 = this.a.getDuration();
            return f10;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return 0.0f;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Drawable getMainImage() {
        c.b.b.a.c.a a6 = this.a.b0();
        if (a6 == null) return null;
        try {
            return (Drawable)b.K(a6);
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
        }
        return null;
    }

    public final VideoController getVideoController() {
        try {
            if (this.a.getVideoController() != null) {
                this.b.zza(this.a.getVideoController());
            }
        }
        catch (RemoteException remoteException) {
            a.a("Exception occurred while getting video controller", remoteException);
        }
        return this.b;
    }

    public final boolean hasVideoContent() {
        try {
            boolean bl = this.a.hasVideoContent();
            return bl;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return false;
        }
    }

    public final void setMainImage(Drawable drawable) {
        try {
            this.a.t(new b<Drawable>(drawable));
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }
}

