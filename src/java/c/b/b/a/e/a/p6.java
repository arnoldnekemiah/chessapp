/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.View
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.a1
 *  c.b.b.a.e.a.e1
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.l1
 *  c.b.b.a.e.a.m1
 *  c.b.b.a.e.a.n5
 *  com.google.android.gms.ads.VideoController
 *  com.google.android.gms.ads.formats.NativeAd
 *  com.google.android.gms.ads.formats.NativeAd$Image
 *  com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package c.b.b.a.e.a;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.a1;
import c.b.b.a.e.a.e1;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.m1;
import c.b.b.a.e.a.n5;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class p6
extends n5 {
    public final UnifiedNativeAdMapper a;

    public p6(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.a = unifiedNativeAdMapper;
    }

    public final float H() {
        return this.a.getDuration();
    }

    public final float J0() {
        return this.a.getCurrentTime();
    }

    public final void a(a a4) {
        this.a.handleClick((View)b.K(a4));
    }

    public final void a(a a4, a a8, a a9) {
        HashMap hashMap = (HashMap)b.K(a8);
        HashMap hashMap2 = (HashMap)b.K(a9);
        this.a.trackViews((View)b.K(a4), (Map)hashMap, (Map)hashMap2);
    }

    public final void b(a a4) {
        this.a.untrackView((View)b.K(a4));
    }

    public final String d() {
        return this.a.getCallToAction();
    }

    public final String e() {
        return this.a.getHeadline();
    }

    public final Bundle f() {
        return this.a.getExtras();
    }

    public final e1 g() {
        return null;
    }

    public final gg getVideoController() {
        if (this.a.getVideoController() != null) {
            return this.a.getVideoController().zzdw();
        }
        return null;
    }

    public final String h() {
        return this.a.getBody();
    }

    public final List i() {
        List list = this.a.getImages();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (NativeAd.Image image : list) {
                Drawable drawable = ((m1)image).b;
                m1 m12 = (m1)image;
                a1 a12 = new a1(drawable, m12.c, m12.d, m12.e, m12.f);
                arrayList.add((Object)a12);
            }
        }
        return arrayList;
    }

    public final double k() {
        if (this.a.getStarRating() != null) {
            return this.a.getStarRating();
        }
        return -1.0;
    }

    public final a l() {
        Object object = this.a.zzjw();
        if (object == null) {
            return null;
        }
        return new b<Object>(object);
    }

    public final l1 m() {
        NativeAd.Image image = this.a.getIcon();
        if (image != null) {
            m1 m12 = (m1)image;
            a1 a12 = new a1(m12.b, m12.c, m12.d, m12.e, m12.f);
            return a12;
        }
        return null;
    }

    public final float m0() {
        return this.a.getMediaContentAspectRatio();
    }

    public final String n() {
        return this.a.getAdvertiser();
    }

    public final String o() {
        return this.a.getStore();
    }

    public final String q() {
        return this.a.getPrice();
    }

    public final a r() {
        View view = this.a.getAdChoicesContent();
        if (view == null) {
            return null;
        }
        return new b<View>(view);
    }

    public final void recordImpression() {
        this.a.recordImpression();
    }

    public final boolean s() {
        return this.a.getOverrideImpressionRecording();
    }

    public final boolean t() {
        return this.a.getOverrideClickHandling();
    }

    public final a u() {
        View view = this.a.zzaet();
        if (view == null) {
            return null;
        }
        return new b<View>(view);
    }
}

