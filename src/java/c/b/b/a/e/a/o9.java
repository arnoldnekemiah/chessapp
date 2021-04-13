/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.b9
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.j9
 *  com.google.android.gms.ads.reward.RewardItem
 *  com.google.android.gms.ads.reward.RewardedVideoAdListener
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.b9;
import c.b.b.a.e.a.c9;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.j9;
import c.b.b.a.e.a.l9;
import c.b.b.a.e.a.n9;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public final class o9
extends gc
implements j9 {
    public RewardedVideoAdListener a;

    public o9(RewardedVideoAdListener rewardedVideoAdListener) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        this.a = rewardedVideoAdListener;
    }

    public static j9 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        if (iInterface instanceof j9) {
            return (j9)iInterface;
        }
        return new l9(iBinder);
    }

    public final void a(b9 b92) {
        RewardedVideoAdListener rewardedVideoAdListener = this.a;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewarded((RewardItem)new n9(b92));
        }
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        switch (n10) {
            default: {
                return false;
            }
            case 8: {
                this.onRewardedVideoCompleted();
                break;
            }
            case 7: {
                this.onRewardedVideoAdFailedToLoad(parcel.readInt());
                break;
            }
            case 6: {
                this.onRewardedVideoAdLeftApplication();
                break;
            }
            case 5: {
                IInterface iInterface;
                IBinder iBinder = parcel.readStrongBinder();
                Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem")) instanceof b9 ? (b9)iInterface : new c9(iBinder));
                this.a(object);
                break;
            }
            case 4: {
                this.onRewardedVideoAdClosed();
                break;
            }
            case 3: {
                this.onRewardedVideoStarted();
                break;
            }
            case 2: {
                this.onRewardedVideoAdOpened();
                break;
            }
            case 1: {
                this.onRewardedVideoAdLoaded();
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final void onRewardedVideoAdClosed() {
        RewardedVideoAdListener rewardedVideoAdListener = this.a;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdClosed();
        }
    }

    public final void onRewardedVideoAdFailedToLoad(int n10) {
        RewardedVideoAdListener rewardedVideoAdListener = this.a;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdFailedToLoad(n10);
        }
    }

    public final void onRewardedVideoAdLeftApplication() {
        RewardedVideoAdListener rewardedVideoAdListener = this.a;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdLeftApplication();
        }
    }

    public final void onRewardedVideoAdLoaded() {
        RewardedVideoAdListener rewardedVideoAdListener = this.a;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdLoaded();
        }
    }

    public final void onRewardedVideoAdOpened() {
        RewardedVideoAdListener rewardedVideoAdListener = this.a;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdOpened();
        }
    }

    public final void onRewardedVideoCompleted() {
        RewardedVideoAdListener rewardedVideoAdListener = this.a;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoCompleted();
        }
    }

    public final void onRewardedVideoStarted() {
        RewardedVideoAdListener rewardedVideoAdListener = this.a;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoStarted();
        }
    }
}

