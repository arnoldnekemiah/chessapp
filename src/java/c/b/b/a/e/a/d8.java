/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.c.c
 *  c.b.b.a.e.a.h8
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.c.c;
import c.b.b.a.e.a.g8;
import c.b.b.a.e.a.h8;

public final class d8
extends c<h8> {
    public d8() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (iInterface instanceof h8) {
            return (h8)iInterface;
        }
        return new g8(iBinder);
    }
}

