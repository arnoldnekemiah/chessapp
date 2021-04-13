/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  c.b.b.a.e.a.e1
 *  c.b.b.a.e.a.l1
 *  com.google.android.gms.ads.formats.NativeAd
 *  com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo
 *  com.google.android.gms.ads.formats.NativeAd$Image
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
import android.os.IInterface;
import android.os.RemoteException;
import c.b.b.a.e.a.e1;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.m1;
import c.b.b.a.e.a.n1;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f1
extends NativeAd.AdChoicesInfo {
    public final e1 a;
    public final List<NativeAd.Image> b = new ArrayList();
    public String c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f1(e1 e12) {
        this.a = e12;
        try {
            this.c = e12.d0();
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            this.c = "";
        }
        try {
            Iterator iterator = e12.u0().iterator();
            do {
                IBinder iBinder;
                IInterface iInterface;
                if (!iterator.hasNext()) {
                    return;
                }
                Object object = iterator.next();
                Object object2 = object instanceof IBinder && (iBinder = (IBinder)object) != null ? ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage")) instanceof l1 ? (l1)iInterface : new n1(iBinder)) : null;
                if (object2 == null) continue;
                this.b.add((Object)new m1((l1)object2));
            } while (true);
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.b;
    }

    public final CharSequence getText() {
        return this.c;
    }
}

