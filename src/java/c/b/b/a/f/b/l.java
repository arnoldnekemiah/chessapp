/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.AccountManager
 *  android.accounts.AccountManagerCallback
 *  android.accounts.AccountManagerFuture
 *  android.accounts.AuthenticatorException
 *  android.accounts.OperationCanceledException
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Process
 *  c.b.b.a.b.j.c
 *  c.b.b.a.f.b.f3
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Calendar
 *  java.util.Locale
 *  java.util.concurrent.TimeUnit
 */
package c.b.b.a.f.b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Handler;
import android.os.Process;
import c.a.b.a.a;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class l
extends d5 {
    public long c;
    public String d;
    public AccountManager e;
    public Boolean f;
    public long g;

    public l(i4 i42) {
        super(i42);
    }

    @Override
    public final boolean h() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long)(calendar.get(15) + calendar.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String string = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String string2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        int n7 = String.valueOf((Object)string).length();
        this.d = a.a(new StringBuilder(String.valueOf((Object)string2).length() + (n7 + 1)), string, "-", string2);
        return false;
    }

    public final long n() {
        this.k();
        return this.c;
    }

    public final String o() {
        this.k();
        return this.d;
    }

    public final long p() {
        this.g();
        return this.g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean q() {
        long l6;
        block12 : {
            Boolean bl;
            this.g();
            if ((c)this.a.n == null) {
                throw null;
            }
            l6 = System.currentTimeMillis();
            if (l6 - this.g > 86400000L) {
                this.f = null;
            }
            if ((bl = this.f) != null) {
                return bl;
            }
            if (this.a.a.checkPermission("android.permission.GET_ACCOUNTS", Process.myPid(), Process.myUid()) != 0) {
                this.a.a().j.a("Permission error checking for dasher/unicorn accounts");
            } else {
                void var4_8;
                if (this.e == null) {
                    this.e = AccountManager.get((Context)this.a.a);
                }
                try {
                    Account[] arraccount = (Account[])this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                    if (arraccount != null && arraccount.length > 0) {
                        this.f = true;
                        this.g = l6;
                        return true;
                    }
                    Account[] arraccount2 = (Account[])this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                    if (arraccount2 != null && arraccount2.length > 0) {
                        this.f = true;
                        this.g = l6;
                        return true;
                    }
                    break block12;
                }
                catch (OperationCanceledException operationCanceledException) {
                }
                catch (IOException iOException) {
                }
                catch (AuthenticatorException authenticatorException) {
                    // empty catch block
                }
                this.a.a().g.a("Exception checking account types", (Object)var4_8);
            }
        }
        this.g = l6;
        this.f = false;
        return false;
    }
}

