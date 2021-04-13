/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.RemoteException
 *  c.b.b.a.e.a.e1
 *  c.b.b.a.e.a.l1
 *  com.google.android.gms.ads.nativead.NativeAd
 *  com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo
 *  com.google.android.gms.ads.nativead.NativeAd$Image
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.IBinder;
import android.os.RemoteException;
import c.b.b.a.e.a.a1;
import c.b.b.a.e.a.e1;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.m7;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class l7
extends NativeAd.AdChoicesInfo {
    public final List<NativeAd.Image> a = new ArrayList();
    public String b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public l7(e1 e12) {
        try {
            this.b = e12.d0();
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            this.b = "";
        }
        try {
            Iterator iterator = e12.u0().iterator();
            do {
                if (!iterator.hasNext()) {
                    return;
                }
                Object object = iterator.next();
                l1 l12 = object instanceof IBinder ? a1.a((IBinder)object) : null;
                if (l12 == null) continue;
                this.a.add((Object)new m7(l12));
            } while (true);
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.a;
    }

    public final CharSequence getText() {
        return this.b;
    }
}

