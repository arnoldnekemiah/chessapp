/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.common.Feature
 *  com.google.android.gms.common.api.Scope
 *  com.google.android.gms.common.internal.GetServiceRequest
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.b.h;

import a.c.a.a;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

public final class l
implements Parcelable.Creator<GetServiceRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n2 = a.b(parcel);
        String string = null;
        IBinder iBinder = null;
        Scope[] arrscope = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] arrfeature = null;
        Feature[] arrfeature2 = null;
        int n3 = 0;
        int n5 = 0;
        int n7 = 0;
        boolean bl = false;
        int n8 = 0;
        block14 : while (parcel.dataPosition() < n2) {
            int n9 = parcel.readInt();
            switch (65535 & n9) {
                default: {
                    a.j(parcel, n9);
                    continue block14;
                }
                case 13: {
                    n8 = a.g(parcel, n9);
                    continue block14;
                }
                case 12: {
                    bl = a.e(parcel, n9);
                    continue block14;
                }
                case 11: {
                    arrfeature2 = (Feature[])a.b(parcel, n9, Feature.CREATOR);
                    continue block14;
                }
                case 10: {
                    arrfeature = (Feature[])a.b(parcel, n9, Feature.CREATOR);
                    continue block14;
                }
                case 8: {
                    account = (Account)a.a(parcel, n9, Account.CREATOR);
                    continue block14;
                }
                case 7: {
                    bundle = a.a(parcel, n9);
                    continue block14;
                }
                case 6: {
                    arrscope = (Scope[])a.b(parcel, n9, Scope.CREATOR);
                    continue block14;
                }
                case 5: {
                    iBinder = a.f(parcel, n9);
                    continue block14;
                }
                case 4: {
                    string = a.b(parcel, n9);
                    continue block14;
                }
                case 3: {
                    n7 = a.g(parcel, n9);
                    continue block14;
                }
                case 2: {
                    n5 = a.g(parcel, n9);
                    continue block14;
                }
                case 1: 
            }
            n3 = a.g(parcel, n9);
        }
        a.d(parcel, n2);
        GetServiceRequest getServiceRequest = new GetServiceRequest(n3, n5, n7, string, iBinder, arrscope, bundle, account, arrfeature, arrfeature2, bl, n8);
        return getServiceRequest;
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        return new GetServiceRequest[n2];
    }
}

