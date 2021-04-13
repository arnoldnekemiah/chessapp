/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  c.b.b.a.e.a.bg
 *  c.b.b.a.e.a.gd
 *  c.b.b.a.e.a.ng
 *  c.b.b.a.e.a.o
 *  c.b.b.a.e.a.og
 *  c.b.b.a.e.a.pg
 *  c.b.b.a.e.a.ve
 *  c.b.b.a.e.a.wc
 *  com.google.android.gms.ads.AdListener
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdSize
 *  com.google.android.gms.ads.OnPaidEventListener
 *  com.google.android.gms.ads.ResponseInfo
 *  com.google.android.gms.ads.doubleclick.AppEventListener
 *  java.lang.Deprecated
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.String
 */
package c.b.b.a.a;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.gd;
import c.b.b.a.e.a.ng;
import c.b.b.a.e.a.o;
import c.b.b.a.e.a.og;
import c.b.b.a.e.a.pg;
import c.b.b.a.e.a.ve;
import c.b.b.a.e.a.wc;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.AppEventListener;

public class a
extends ViewGroup {
    public final pg a;

    public a(Context context, int n2) {
        pg pg2;
        super(context);
        this.a = pg2 = new pg((ViewGroup)this, null, false, gd.a, n2);
    }

    public a(Context context, AttributeSet attributeSet, int n2) {
        pg pg2;
        super(context, attributeSet);
        this.a = pg2 = new pg((ViewGroup)this, attributeSet, false, gd.a, n2);
    }

    public a(Context context, AttributeSet attributeSet, int n2, int n3) {
        pg pg2;
        super(context, attributeSet, n2);
        this.a = pg2 = new pg((ViewGroup)this, attributeSet, false, gd.a, n3);
    }

    public void destroy() {
        this.a.a();
    }

    public AdListener getAdListener() {
        return this.a.f;
    }

    public AdSize getAdSize() {
        return this.a.b();
    }

    public String getAdUnitId() {
        return this.a.c();
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        return this.a.d();
    }

    public ResponseInfo getResponseInfo() {
        return this.a.e();
    }

    public boolean isLoading() {
        return this.a.f();
    }

    public void loadAd(AdRequest adRequest) {
        this.a.a(adRequest.zzds());
    }

    public void onLayout(boolean bl, int n2, int n3, int n5, int n7) {
        View view = this.getChildAt(0);
        if (view != null && view.getVisibility() != 8) {
            int n8 = view.getMeasuredWidth();
            int n9 = view.getMeasuredHeight();
            int n10 = (n5 - n2 - n8) / 2;
            int n11 = (n7 - n3 - n9) / 2;
            view.layout(n10, n11, n8 + n10, n9 + n11);
        }
    }

    public void onMeasure(int n2, int n3) {
        int n5;
        int n7 = 0;
        View view = this.getChildAt(0);
        if (view != null && view.getVisibility() != 8) {
            this.measureChild(view, n2, n3);
            n7 = view.getMeasuredWidth();
            n5 = view.getMeasuredHeight();
        } else {
            AdSize adSize = null;
            try {
                adSize = this.getAdSize();
            }
            catch (NullPointerException nullPointerException) {
                a.c.a.a.a("Unable to retrieve ad size.", nullPointerException);
            }
            if (adSize != null) {
                Context context = this.getContext();
                int n8 = adSize.getWidthInPixels(context);
                n5 = adSize.getHeightInPixels(context);
                n7 = n8;
            } else {
                n5 = 0;
            }
        }
        int n9 = Math.max((int)n7, (int)this.getSuggestedMinimumWidth());
        int n10 = Math.max((int)n5, (int)this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSize((int)n9, (int)n2), View.resolveSize((int)n10, (int)n3));
    }

    public void pause() {
        this.a.g();
    }

    public void resume() {
        this.a.i();
    }

    public void setAdListener(AdListener adListener) {
        pg pg2 = this.a;
        pg2.f = adListener;
        pg2.d.a(adListener);
        if (adListener == null) {
            this.a.a(null);
            this.a.a(null);
            return;
        }
        if (adListener instanceof wc) {
            this.a.a((wc)adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.a.a((AppEventListener)adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        pg pg2 = this.a;
        AdSize[] arradSize = new AdSize[]{adSize};
        if (pg2.g == null) {
            pg2.a(arradSize);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public void setAdUnitId(String string) {
        this.a.a(string);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        pg pg2 = this.a;
        if (pg2 != null) {
            try {
                pg2.q = onPaidEventListener;
                if (pg2.j != null) {
                    pg2.j.a((bg)new o(onPaidEventListener));
                    return;
                }
            }
            catch (RemoteException remoteException) {
                a.c.a.a.c("#008 Must be called on the main UI thread.", remoteException);
            }
            return;
        }
        throw null;
    }
}

