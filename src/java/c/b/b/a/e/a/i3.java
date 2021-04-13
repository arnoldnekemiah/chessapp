/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.c.c
 *  c.b.b.a.e.a.x1
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.c.c;
import c.b.b.a.e.a.w1;
import c.b.b.a.e.a.x1;

public final class i3
extends c<x1> {
    public i3() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (iInterface instanceof x1) {
            return (x1)iInterface;
        }
        return new w1(iBinder);
    }
}

