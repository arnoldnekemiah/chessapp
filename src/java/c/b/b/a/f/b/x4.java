/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.text.TextUtils;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class x4 {
    public long A;
    public long B;
    public String C;
    public boolean D;
    public long E;
    public long F;
    public final i4 a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public long p;
    public boolean q;
    public String r;
    public Boolean s;
    public long t;
    public List<String> u;
    public String v;
    public long w;
    public long x;
    public long y;
    public long z;

    public x4(i4 i42, String string) {
        a.a(i42);
        a.c(string);
        this.a = i42;
        this.b = string;
        i42.d().g();
    }

    public final long a() {
        this.a.d().g();
        return this.n;
    }

    public final void a(long l10) {
        this.a.d().g();
        boolean bl = this.D;
        boolean bl2 = this.m != l10;
        this.D = bl | bl2;
        this.m = l10;
    }

    public final void a(Boolean bl) {
        this.a.d().g();
        boolean bl2 = this.D;
        Boolean bl3 = this.s;
        boolean bl4 = bl3 == null && bl == null ? true : (bl3 == null ? false : bl3.equals((Object)bl));
        this.D = bl2 | bl4 ^ true;
        this.s = bl;
    }

    public final void a(String string) {
        this.a.d().g();
        this.D |= true ^ g9.d(this.C, string);
        this.C = string;
    }

    public final void a(List<String> list) {
        this.a.d().g();
        List<String> list2 = this.u;
        if (list2 == null && list == null || list2 != null && list2.equals(list)) {
            return;
        }
        this.D = true;
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        this.u = arrayList;
    }

    public final void a(boolean bl) {
        this.a.d().g();
        boolean bl2 = this.D;
        boolean bl3 = this.o != bl;
        this.D = bl2 | bl3;
        this.o = bl;
    }

    public final long b() {
        this.a.d().g();
        return this.t;
    }

    public final void b(long l10) {
        this.a.d().g();
        boolean bl = this.D;
        boolean bl2 = this.n != l10;
        this.D = bl | bl2;
        this.n = l10;
    }

    public final void b(String string) {
        this.a.d().g();
        this.D |= true ^ g9.d(this.c, string);
        this.c = string;
    }

    public final void b(boolean bl) {
        this.a.d().g();
        boolean bl2 = this.D;
        boolean bl3 = this.q != bl;
        this.D = bl2 | bl3;
        this.q = bl;
    }

    public final void c(long l10) {
        this.a.d().g();
        boolean bl = this.D;
        boolean bl2 = this.t != l10;
        this.D = bl | bl2;
        this.t = l10;
    }

    public final void c(String string) {
        this.a.d().g();
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = null;
        }
        this.D |= true ^ g9.d(this.d, string);
        this.d = string;
    }

    public final boolean c() {
        this.a.d().g();
        return this.o;
    }

    public final long d() {
        this.a.d().g();
        return this.g;
    }

    public final void d(long l10) {
        boolean bl = true;
        boolean bl2 = l10 >= 0L;
        a.a(bl2);
        this.a.d().g();
        boolean bl3 = this.D;
        if (this.g == l10) {
            bl = false;
        }
        this.D = bl | bl3;
        this.g = l10;
    }

    public final void d(String string) {
        this.a.d().g();
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = null;
        }
        this.D |= true ^ g9.d(this.r, string);
        this.r = string;
    }

    public final long e() {
        this.a.d().g();
        return this.E;
    }

    public final void e(long l10) {
        this.a.d().g();
        boolean bl = this.D;
        boolean bl2 = this.E != l10;
        this.D = bl | bl2;
        this.E = l10;
    }

    public final void e(String string) {
        this.a.d().g();
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = null;
        }
        this.D |= true ^ g9.d(this.v, string);
        this.v = string;
    }

    public final long f() {
        this.a.d().g();
        return this.F;
    }

    public final void f(long l10) {
        this.a.d().g();
        boolean bl = this.D;
        boolean bl2 = this.F != l10;
        this.D = bl | bl2;
        this.F = l10;
    }

    public final void f(String string) {
        this.a.d().g();
        this.D |= true ^ g9.d(this.e, string);
        this.e = string;
    }

    public final void g() {
        this.a.d().g();
        long l10 = 1L + this.g;
        if (l10 > Integer.MAX_VALUE) {
            this.a.a().i.a("Bundle index overflow. appId", h3.a(this.b));
            l10 = 0L;
        }
        this.D = true;
        this.g = l10;
    }

    public final void g(long l10) {
        this.a.d().g();
        boolean bl = this.D;
        boolean bl2 = this.p != l10;
        this.D = bl | bl2;
        this.p = l10;
    }

    public final void g(String string) {
        this.a.d().g();
        this.D |= true ^ g9.d(this.f, string);
        this.f = string;
    }

    public final String h() {
        this.a.d().g();
        String string = this.C;
        this.a((String)null);
        return string;
    }

    public final void h(long l10) {
        this.a.d().g();
        boolean bl = this.D;
        boolean bl2 = this.h != l10;
        this.D = bl | bl2;
        this.h = l10;
    }

    public final void h(String string) {
        this.a.d().g();
        this.D |= true ^ g9.d(this.j, string);
        this.j = string;
    }

    public final long i() {
        this.a.d().g();
        return this.p;
    }

    public final void i(long l10) {
        this.a.d().g();
        boolean bl = this.D;
        boolean bl2 = this.i != l10;
        this.D = bl | bl2;
        this.i = l10;
    }

    public final void i(String string) {
        this.a.d().g();
        this.D |= true ^ g9.d(this.l, string);
        this.l = string;
    }

    public final void j(long l10) {
        this.a.d().g();
        boolean bl = this.D;
        boolean bl2 = this.k != l10;
        this.D = bl | bl2;
        this.k = l10;
    }

    public final boolean j() {
        this.a.d().g();
        return this.q;
    }

    public final Boolean k() {
        this.a.d().g();
        return this.s;
    }

    public final List<String> l() {
        this.a.d().g();
        return this.u;
    }

    public final String m() {
        this.a.d().g();
        return this.b;
    }

    public final String n() {
        this.a.d().g();
        return this.c;
    }

    public final String o() {
        this.a.d().g();
        return this.d;
    }

    public final String p() {
        this.a.d().g();
        return this.r;
    }

    public final String q() {
        this.a.d().g();
        return this.v;
    }

    public final String r() {
        this.a.d().g();
        return this.e;
    }

    public final String s() {
        this.a.d().g();
        return this.f;
    }

    public final long t() {
        this.a.d().g();
        return this.h;
    }

    public final long u() {
        this.a.d().g();
        return this.i;
    }

    public final String v() {
        this.a.d().g();
        return this.j;
    }

    public final long w() {
        this.a.d().g();
        return this.k;
    }

    public final String x() {
        this.a.d().g();
        return this.l;
    }

    public final long y() {
        this.a.d().g();
        return this.m;
    }
}

