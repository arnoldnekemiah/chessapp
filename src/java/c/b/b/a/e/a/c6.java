/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.RemoteException
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.b6
 *  c.b.b.a.e.a.d6
 *  c.b.b.a.e.a.e6
 *  c.b.b.a.e.a.f6
 *  c.b.b.a.e.a.g6
 *  c.b.b.a.e.a.gb
 *  c.b.b.a.e.a.h6
 *  c.b.b.a.e.a.i6
 *  c.b.b.a.e.a.j6
 *  c.b.b.a.e.a.k6
 *  c.b.b.a.e.a.l6
 *  c.b.b.a.e.a.m6
 *  com.google.ads.AdRequest
 *  com.google.ads.AdRequest$ErrorCode
 *  com.google.ads.mediation.MediationBannerAdapter
 *  com.google.ads.mediation.MediationBannerListener
 *  com.google.ads.mediation.MediationInterstitialAdapter
 *  com.google.ads.mediation.MediationInterstitialListener
 *  com.google.ads.mediation.MediationServerParameters
 *  com.google.ads.mediation.NetworkExtras
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.Handler;
import android.os.RemoteException;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.b6;
import c.b.b.a.e.a.d6;
import c.b.b.a.e.a.e6;
import c.b.b.a.e.a.f6;
import c.b.b.a.e.a.g6;
import c.b.b.a.e.a.gb;
import c.b.b.a.e.a.h6;
import c.b.b.a.e.a.i6;
import c.b.b.a.e.a.j6;
import c.b.b.a.e.a.k6;
import c.b.b.a.e.a.l6;
import c.b.b.a.e.a.m6;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

public final class c6<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters>
implements MediationBannerListener,
MediationInterstitialListener {
    public final b5 a;

    public c6(b5 b52) {
        this.a = b52;
    }

    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        a.g("Adapter called onClick.");
        if (!gb.b()) {
            a.c("#008 Must be called on the main UI thread.", null);
            gb.a.post((Runnable)new b6(this));
            return;
        }
        try {
            this.a.onAdClicked();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        a.g("Adapter called onDismissScreen.");
        if (!gb.b()) {
            a.i("#008 Must be called on the main UI thread.");
            gb.a.post((Runnable)new g6(this));
            return;
        }
        try {
            this.a.onAdClosed();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        a.g("Adapter called onDismissScreen.");
        if (!gb.b()) {
            a.c("#008 Must be called on the main UI thread.", null);
            gb.a.post((Runnable)new j6(this));
            return;
        }
        try {
            this.a.onAdClosed();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, AdRequest.ErrorCode errorCode) {
        String string = String.valueOf((Object)errorCode);
        StringBuilder stringBuilder = new StringBuilder(47 + string.length());
        stringBuilder.append("Adapter called onFailedToReceiveAd with error. ");
        stringBuilder.append(string);
        a.g(stringBuilder.toString());
        if (!gb.b()) {
            a.c("#008 Must be called on the main UI thread.", null);
            gb.a.post((Runnable)new f6(this, errorCode));
            return;
        }
        try {
            this.a.onAdFailedToLoad(a.a(errorCode));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, AdRequest.ErrorCode errorCode) {
        String string = String.valueOf((Object)errorCode);
        StringBuilder stringBuilder = new StringBuilder(47 + string.length());
        stringBuilder.append("Adapter called onFailedToReceiveAd with error ");
        stringBuilder.append(string);
        stringBuilder.append(".");
        a.g(stringBuilder.toString());
        if (!gb.b()) {
            a.c("#008 Must be called on the main UI thread.", null);
            gb.a.post((Runnable)new m6(this, errorCode));
            return;
        }
        try {
            this.a.onAdFailedToLoad(a.a(errorCode));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        a.g("Adapter called onLeaveApplication.");
        if (!gb.b()) {
            a.c("#008 Must be called on the main UI thread.", null);
            gb.a.post((Runnable)new i6(this));
            return;
        }
        try {
            this.a.onAdLeftApplication();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        a.g("Adapter called onLeaveApplication.");
        if (!gb.b()) {
            a.c("#008 Must be called on the main UI thread.", null);
            gb.a.post((Runnable)new l6(this));
            return;
        }
        try {
            this.a.onAdLeftApplication();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        a.g("Adapter called onPresentScreen.");
        if (!gb.b()) {
            a.c("#008 Must be called on the main UI thread.", null);
            gb.a.post((Runnable)new h6(this));
            return;
        }
        try {
            this.a.onAdOpened();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        a.g("Adapter called onPresentScreen.");
        if (!gb.b()) {
            a.c("#008 Must be called on the main UI thread.", null);
            gb.a.post((Runnable)new e6(this));
            return;
        }
        try {
            this.a.onAdOpened();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        a.g("Adapter called onReceivedAd.");
        if (!gb.b()) {
            a.c("#008 Must be called on the main UI thread.", null);
            gb.a.post((Runnable)new k6(this));
            return;
        }
        try {
            this.a.onAdLoaded();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        a.g("Adapter called onReceivedAd.");
        if (!gb.b()) {
            a.c("#008 Must be called on the main UI thread.", null);
            gb.a.post((Runnable)new d6(this));
            return;
        }
        try {
            this.a.onAdLoaded();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}

