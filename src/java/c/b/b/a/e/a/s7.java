/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.l1
 *  com.google.android.gms.ads.VideoController
 *  com.google.android.gms.ads.nativead.MediaView
 *  com.google.android.gms.ads.nativead.NativeAd
 *  com.google.android.gms.ads.nativead.NativeAd$Image
 *  com.google.android.gms.ads.nativead.NativeCustomFormatAd
 *  com.google.android.gms.ads.nativead.NativeCustomFormatAd$DisplayOpenMeasurement
 *  java.lang.CharSequence
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.content.Context;
import android.os.RemoteException;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.m7;
import c.b.b.a.e.a.n7;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

public final class s7
implements NativeCustomFormatAd {
    public final f2 a;
    public final MediaView b;
    public final VideoController c;
    public NativeCustomFormatAd.DisplayOpenMeasurement d;

    public s7(f2 f22) {
        Context context;
        block6 : {
            void var2_5;
            this.c = new VideoController();
            this.a = f22;
            try {
                context = (Context)b.K(f22.Q());
                break block6;
            }
            catch (RemoteException remoteException) {
            }
            catch (NullPointerException nullPointerException) {
                // empty catch block
            }
            a.c.a.a.a("", (Throwable)var2_5);
            context = null;
        }
        MediaView mediaView = null;
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                boolean bl = this.a.H(new b<MediaView>(mediaView2));
                mediaView = !bl ? null : mediaView2;
            }
            catch (RemoteException remoteException) {
                a.c.a.a.a("", remoteException);
            }
        }
        this.b = mediaView;
    }

    public final void destroy() {
        try {
            this.a.destroy();
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
            return;
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            List list = this.a.getAvailableAssetNames();
            return list;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            String string = this.a.getCustomTemplateId();
            return string;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
            return null;
        }
    }

    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.d == null && this.a.A0()) {
                this.d = new n7(this.a);
            }
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
        }
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final NativeAd.Image getImage(String string) {
        l1 l12 = this.a.e(string);
        if (l12 == null) return null;
        try {
            return new m7(l12);
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
        }
        return null;
    }

    public final CharSequence getText(String string) {
        try {
            String string2 = this.a.o(string);
            return string2;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final VideoController getVideoController() {
        gg gg2 = this.a.getVideoController();
        if (gg2 == null) return this.c;
        try {
            this.c.zza(gg2);
            return this.c;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("Exception occurred while getting video controller", remoteException);
        }
        return this.c;
    }

    public final MediaView getVideoMediaView() {
        return this.b;
    }

    public final void performClick(String string) {
        try {
            this.a.performClick(string);
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
            return;
        }
    }

    public final void recordImpression() {
        try {
            this.a.recordImpression();
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
            return;
        }
    }
}

