/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  c.b.b.a.b.j.c
 *  c.b.b.a.e.d.ea
 *  c.b.b.a.e.d.s8
 *  c.b.b.a.e.d.t8
 *  c.b.b.a.e.d.zb
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.f5
 *  c.b.b.a.f.b.f9
 *  c.b.b.a.f.b.g5
 *  c.b.b.a.f.b.h5
 *  c.b.b.a.f.b.i3
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.u2
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzaq
 *  com.google.android.gms.measurement.internal.zzas
 *  com.google.android.gms.measurement.internal.zzkg
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.security.MessageDigest
 *  java.security.SecureRandom
 *  java.security.cert.Certificate
 *  java.security.cert.CertificateException
 *  java.security.cert.CertificateFactory
 *  java.security.cert.X509Certificate
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Random
 *  java.util.Set
 *  java.util.TreeSet
 *  java.util.concurrent.atomic.AtomicLong
 *  javax.security.auth.x500.X500Principal
 *  org.checkerframework.checker.nullness.qual.EnsuresNonNull
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import c.b.b.a.b.d;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.ea;
import c.b.b.a.e.d.s8;
import c.b.b.a.e.d.t8;
import c.b.b.a.e.d.zb;
import c.b.b.a.f.b.c3;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f5;
import c.b.b.a.f.b.f9;
import c.b.b.a.f.b.g5;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.h5;
import c.b.b.a.f.b.i3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkg;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class g9
extends d5 {
    public static final String[] g = new String[]{"firebase_", "google_", "ga_"};
    public static final String[] h = new String[]{"_err"};
    public SecureRandom c;
    public final AtomicLong d = new AtomicLong(0L);
    public int e;
    public Integer f = null;

    public g9(i4 i42) {
        super(i42);
    }

    public static long a(byte[] arrby) {
        IllegalStateException illegalStateException;
        a.a(arrby);
        int n7 = arrby.length;
        int n9 = 0;
        boolean bl = n7 > 0;
        if (bl) {
            long l6 = 0L;
            for (int i6 = n7 - 1; i6 >= 0 && i6 >= -8 + arrby.length; --i6) {
                l6 += (255L & (long)arrby[i6]) << n9;
                n9 += 8;
            }
            return l6;
        }
        illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public static ArrayList<Bundle> a(List<zzaa> list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (zzaa zzaa2 : list) {
            zzas zzas2;
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzaa2.a);
            bundle.putString("origin", zzaa2.b);
            bundle.putLong("creation_timestamp", zzaa2.d);
            bundle.putString("name", zzaa2.c.b);
            a.a(bundle, zzaa2.c.a());
            bundle.putBoolean("active", zzaa2.e);
            String string = zzaa2.f;
            if (string != null) {
                bundle.putString("trigger_event_name", string);
            }
            if ((zzas2 = zzaa2.g) != null) {
                bundle.putString("timed_out_event_name", zzas2.a);
                zzaq zzaq2 = zzaa2.g.b;
                if (zzaq2 != null) {
                    bundle.putBundle("timed_out_event_params", zzaq2.d());
                }
            }
            bundle.putLong("trigger_timeout", zzaa2.h);
            zzas zzas3 = zzaa2.i;
            if (zzas3 != null) {
                bundle.putString("triggered_event_name", zzas3.a);
                zzaq zzaq3 = zzaa2.i.b;
                if (zzaq3 != null) {
                    bundle.putBundle("triggered_event_params", zzaq3.d());
                }
            }
            bundle.putLong("triggered_timestamp", zzaa2.c.c);
            bundle.putLong("time_to_live", zzaa2.j);
            zzas zzas4 = zzaa2.k;
            if (zzas4 != null) {
                bundle.putString("expired_event_name", zzas4.a);
                zzaq zzaq4 = zzaa2.k.b;
                if (zzaq4 != null) {
                    bundle.putBundle("expired_event_params", zzaq4.d());
                }
            }
            arrayList.add((Object)bundle);
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Context context) {
        String string;
        a.a(context);
        if (Build.VERSION.SDK_INT >= 24) {
            string = "com.google.android.gms.measurement.AppMeasurementJobService";
            do {
                return g9.b(context, string);
                break;
            } while (true);
        }
        string = "com.google.android.gms.measurement.AppMeasurementService";
        return g9.b(context, string);
    }

    public static final boolean a(Bundle bundle, int n7) {
        if (bundle.getLong("_err") == 0L) {
            bundle.putLong("_err", (long)n7);
            return true;
        }
        return false;
    }

    public static boolean a(String string, String[] arrstring) {
        a.a(arrstring);
        int n7 = arrstring.length;
        for (int i6 = 0; i6 < n7; ++i6) {
            if (!g9.d(string, arrstring[i6])) continue;
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public static boolean b(Context var0, String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl26.1 : ICONST_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static boolean d(String string, String string2) {
        if (string == null && string2 == null) {
            return true;
        }
        if (string == null) {
            return false;
        }
        return string.equals((Object)string2);
    }

    public static boolean h(String string) {
        return !TextUtils.isEmpty((CharSequence)string) && string.startsWith("_");
    }

    public static boolean i(String string) {
        a.c(string);
        return string.charAt(0) != '_' || string.equals((Object)"_ep");
        {
        }
    }

    /*
     * Exception decompiling
     */
    public static MessageDigest q() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl14.1 : IINC : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int a(String var1_1, String var2_2, String var3_3, Object var4_4, Bundle var5_5, List<String> var6_6, boolean var7_7, boolean var8_8) {
        block20 : {
            block19 : {
                this.g();
                if (!this.a(var4_4)) ** GOTO lbl-1000
                if (var8_8 == false) return 21;
                if (!g9.a(var3_3, g5.c)) {
                    return 20;
                }
                var24_9 = this.a.v();
                var24_9.g();
                var24_9.h();
                if (var24_9.n() && var24_9.a.p().n() < 200900) {
                    return 25;
                }
                var26_10 = var4_4 instanceof Parcelable[];
                if (!var26_10) break block19;
                var27_11 = ((Parcelable[])var4_4).length;
                break block20;
            }
            if (!(var4_4 instanceof ArrayList)) ** GOTO lbl-1000
            var27_11 = ((ArrayList)var4_4).size();
        }
        if (var27_11 > 200) {
            this.a.a().k.a("Parameter array is too long; discarded. Value kind, name, array length", (Object)"param", (Object)var3_3, (Object)var27_11);
            if (var26_10) {
                var30_12 = (Parcelable[])var4_4;
                if (var30_12.length > 200) {
                    var5_5.putParcelableArray(var3_3, (Parcelable[])Arrays.copyOf((Object[])var30_12, (int)200));
                }
            } else if (var4_4 instanceof ArrayList && (var29_13 = (ArrayList)var4_4).size() > 200) {
                var5_5.putParcelableArrayList(var3_3, new ArrayList((Collection)var29_13.subList(0, 200)));
            }
            var9_14 = 17;
        } else lbl-1000: // 3 sources:
        {
            var9_14 = 0;
        }
        var11_15 = this.a.g.c(var1_1, (t2<Boolean>)u2.S) != false && g9.h(var2_2) != false || g9.h(var3_3) != false ? 256 : 100;
        if (this.a("param", var3_3, var11_15, var4_4)) {
            return var9_14;
        }
        if (var8_8 == false) return 4;
        if (var4_4 instanceof Bundle) {
            this.a(var1_1, var2_2, var3_3, (Bundle)var4_4, var6_6, var7_7);
            return var9_14;
        }
        if (var4_4 instanceof Parcelable[]) {
            block18 : {
                var19_16 = (Parcelable[])var4_4;
                var20_17 = var19_16.length;
                var21_18 = 0;
                while (var21_18 < var20_17) {
                    var22_19 = var19_16[var21_18];
                    if (!(var22_19 instanceof Bundle)) {
                        var16_20 = this.a.a().k;
                        var17_21 = var22_19.getClass();
                        var18_26 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                        break block18;
                    }
                    this.a(var1_1, var2_2, var3_3, (Bundle)var22_19, var6_6, var7_7);
                    ++var21_18;
                }
                return var9_14;
            }
lbl54: // 2 sources:
            do {
                var16_20.a(var18_26, (Object)var17_22, (Object)var3_3);
                return 4;
                break;
            } while (true);
        }
        if (var4_4 instanceof ArrayList == false) return 4;
        var12_27 = (ArrayList)var4_4;
        var13_28 = var12_27.size();
        var14_29 = 0;
        while (var14_29 < var13_28) {
            var15_30 = var12_27.get(var14_29);
            if (!(var15_30 instanceof Bundle)) {
                var16_20 = this.a.a().k;
                if (var15_30 != null) {
                    var17_23 = var15_30.getClass();
                } else {
                    var17_24 = "null";
                }
                var18_26 = "All ArrayList elements must be of type Bundle. Value type, name";
                ** continue;
            }
            this.a(var1_1, var2_2, var3_3, (Bundle)var15_30, var6_6, var7_7);
            ++var14_29;
        }
        return var9_14;
    }

    public final long a(long l6, long l7) {
        return (l6 + l7 * 60000L) / 86400000L;
    }

    public final Bundle a(Uri uri) {
        if (uri != null) {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            block15 : {
                block14 : {
                    boolean bl = uri.isHierarchical();
                    if (!bl) break block14;
                    try {
                        string6 = uri.getQueryParameter("utm_campaign");
                        string9 = uri.getQueryParameter("utm_source");
                        string2 = uri.getQueryParameter("utm_medium");
                        string3 = uri.getQueryParameter("gclid");
                        break block15;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        this.a.a().i.a("Install referrer url isn't a hierarchical URI", (Object)unsupportedOperationException);
                    }
                }
                string6 = null;
                string9 = null;
                string2 = null;
                string3 = null;
            }
            if (TextUtils.isEmpty((CharSequence)string6) && TextUtils.isEmpty((CharSequence)string9) && TextUtils.isEmpty((CharSequence)string2) && TextUtils.isEmpty((CharSequence)string3)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty((CharSequence)string6)) {
                bundle.putString("campaign", string6);
            }
            if (!TextUtils.isEmpty((CharSequence)string9)) {
                bundle.putString("source", string9);
            }
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                bundle.putString("medium", string2);
            }
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                bundle.putString("gclid", string3);
            }
            if (!TextUtils.isEmpty((CharSequence)(string4 = uri.getQueryParameter("utm_term")))) {
                bundle.putString("term", string4);
            }
            if (!TextUtils.isEmpty((CharSequence)(string8 = uri.getQueryParameter("utm_content")))) {
                bundle.putString("content", string8);
            }
            if (!TextUtils.isEmpty((CharSequence)(string = uri.getQueryParameter("aclid")))) {
                bundle.putString("aclid", string);
            }
            if (!TextUtils.isEmpty((CharSequence)(string7 = uri.getQueryParameter("cp1")))) {
                bundle.putString("cp1", string7);
            }
            if (!TextUtils.isEmpty((CharSequence)(string5 = uri.getQueryParameter("anid")))) {
                bundle.putString("anid", string5);
            }
            return bundle;
        }
        return null;
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String string : bundle.keySet()) {
                Object object = this.a(string, bundle.get(string));
                if (object == null) {
                    this.a.a().k.a("Param value can't be null", (Object)this.a.q().b(string));
                    continue;
                }
                this.a(bundle2, string, object);
            }
        }
        return bundle2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final Bundle a(String var1_1, String var2_2, Bundle var3_3, List<String> var4_4, boolean var5_5) {
        var6_6 = var4_4;
        var7_7 = g9.a(var2_2, f5.d);
        var8_8 = new Bundle(var3_3);
        var9_9 = this.a.g.h();
        if (this.a.g.c(var1_1, (t2<Boolean>)u2.Y)) {
            var10_10 = new TreeSet((Collection)var3_3.keySet());
        } else {
            var10_11 = var3_3.keySet();
        }
        var11_13 = var10_12.iterator();
        var12_14 = 0;
        while (var11_13.hasNext() != false) {
            block11 : {
                block12 : {
                    block10 : {
                        var13_15 = (String)var11_13.next();
                        if (var6_6 != null && var6_6.contains((Object)var13_15)) {
                            var14_16 = 0;
                        } else {
                            var14_16 = var5_5 != false ? this.f(var13_15) : 0;
                            if (var14_16 == 0) {
                                var14_16 = this.g(var13_15);
                            }
                        }
                        if (var14_16 == 0) break block10;
                        var24_22 = var14_16 == 3 ? var13_15 : null;
                        this.a(var8_8, var14_16, var13_15, (Object)var24_22);
                        var8_8.remove(var13_15);
                        break block11;
                    }
                    var15_17 = this.a(var1_1, var2_2, var13_15, var3_3.get(var13_15), var8_8, var4_4, var5_5, var7_7);
                    if (var15_17 != 17) break block12;
                    this.a(var8_8, 17, var13_15, (Object)false);
                    ** GOTO lbl-1000
                }
                if (var15_17 != 0 && !"_ev".equals((Object)var13_15)) {
                    var23_21 = var15_17 == 21 ? var2_2 : var13_15;
                    this.a(var8_8, var15_17, var23_21, var3_3.get(var13_15));
                    var8_8.remove(var13_15);
                } else if (g9.i(var13_15)) {
                    var16_18 = var12_14 + 1;
                    if (var16_18 > var9_9) {
                        var17_19 = new StringBuilder(48);
                        var17_19.append("Event can't contain more than ");
                        var17_19.append(var9_9);
                        var17_19.append(" params");
                        var21_20 = var17_19.toString();
                        this.a.a().h.a(var21_20, (Object)this.a.q().a(var2_2), (Object)this.a.q().a(var3_3));
                        g9.a(var8_8, 5);
                        var8_8.remove(var13_15);
                    }
                    var6_6 = var4_4;
                    var12_14 = var16_18;
                    continue;
                }
            }
            var6_6 = var4_4;
        }
        return var8_8;
    }

    /*
     * Exception decompiling
     */
    public final zzas a(String var1, String var2, Bundle var3, String var4, long var5, boolean var7, boolean var8) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1560)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1816)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:332)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public final Object a(int n7, Object object, boolean bl, boolean bl2) {
        if (object == null) {
            return null;
        }
        if (!(object instanceof Long)) {
            if (object instanceof Double) {
                return object;
            }
            if (object instanceof Integer) {
                return (long)((Integer)object).intValue();
            }
            if (object instanceof Byte) {
                return (long)((Byte)object).byteValue();
            }
            if (object instanceof Short) {
                return (long)((Short)object).shortValue();
            }
            if (object instanceof Boolean) {
                long l6 = true != (Boolean)object ? 0L : 1L;
                return l6;
            }
            if (object instanceof Float) {
                return ((Float)object).doubleValue();
            }
            if (!(object instanceof String || object instanceof Character || object instanceof CharSequence)) {
                if (bl2 && (object instanceof Bundle[] || object instanceof Parcelable[])) {
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[])object) {
                        Bundle bundle;
                        if (!(parcelable instanceof Bundle) || (bundle = this.a((Bundle)parcelable)).isEmpty()) continue;
                        arrayList.add((Object)bundle);
                    }
                    return arrayList.toArray((Object[])new Bundle[arrayList.size()]);
                }
                return null;
            }
            return this.a(String.valueOf((Object)object), n7, bl);
        }
        return object;
    }

    public final Object a(String string, Object object) {
        boolean bl = "_ev".equals((Object)string);
        int n7 = 256;
        if (bl) {
            return this.a(n7, object, true, true);
        }
        if (!g9.h(string)) {
            n7 = 100;
        }
        return this.a(n7, object, false, true);
    }

    public final String a(String string, int n7, boolean bl) {
        if (string == null) {
            return null;
        }
        if (string.codePointCount(0, string.length()) > n7) {
            if (bl) {
                return String.valueOf((Object)string.substring(0, string.offsetByCodePoints(0, n7))).concat("...");
            }
            return null;
        }
        return string;
    }

    public final void a(Bundle bundle, int n7, String string, Object object) {
        if (g9.a(bundle, n7)) {
            bundle.putString("_ev", this.a(string, 40, true));
            if (object != null) {
                a.a(bundle);
                if (object instanceof String || object instanceof CharSequence) {
                    bundle.putLong("_el", (long)String.valueOf((Object)object).length());
                }
            }
        }
    }

    public final void a(Bundle bundle, long l6) {
        long l7 = bundle.getLong("_et");
        if (l7 != 0L) {
            this.a.a().i.a("Params already contained engagement", (Object)l7);
        }
        bundle.putLong("_et", l6 + l7);
    }

    public final void a(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String string : bundle2.keySet()) {
            if (bundle.containsKey(string)) continue;
            this.a.p().a(bundle, string, bundle2.get(string));
        }
    }

    public final void a(Bundle bundle, String string, Object object) {
        if (bundle == null) {
            return;
        }
        if (object instanceof Long) {
            bundle.putLong(string, ((Long)object).longValue());
            return;
        }
        if (object instanceof String) {
            bundle.putString(string, String.valueOf((Object)object));
            return;
        }
        if (object instanceof Double) {
            bundle.putDouble(string, ((Double)object).doubleValue());
            return;
        }
        if (object instanceof Bundle[]) {
            bundle.putParcelableArray(string, (Parcelable[])((Bundle[])object));
            return;
        }
        if (string != null) {
            String string2 = object != null ? object.getClass().getSimpleName() : null;
            this.a.a().k.a("Not putting event parameter. Invalid value type. name, type", (Object)this.a.q().b(string), (Object)string2);
        }
    }

    public final void a(zb zb2, int n7) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", n7);
        try {
            zb2.zzb(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.a().i.a("Error returning int value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void a(zb zb2, long l6) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", l6);
        try {
            zb2.zzb(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.a().i.a("Error returning long value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void a(zb zb2, Bundle bundle) {
        try {
            zb2.zzb(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.a().i.a("Error returning bundle value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void a(zb zb2, String string) {
        Bundle bundle = new Bundle();
        bundle.putString("r", string);
        try {
            zb2.zzb(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.a().i.a("Error returning string value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void a(zb zb2, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zb2.zzb(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.a().i.a("Error returning bundle list to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void a(zb zb2, boolean bl) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", bl);
        try {
            zb2.zzb(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.a().i.a("Error returning boolean value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void a(zb zb2, byte[] arrby) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", arrby);
        try {
            zb2.zzb(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.a().i.a("Error returning byte array to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void a(f9 f92, String string, int n7, String string2, String string3, int n9) {
        Bundle bundle = new Bundle();
        g9.a(bundle, n7);
        if (!TextUtils.isEmpty((CharSequence)string2) && !TextUtils.isEmpty((CharSequence)string3)) {
            bundle.putString(string2, string3);
        }
        if (n7 == 6 || n7 == 7 || n7 == 2) {
            bundle.putLong("_el", (long)n9);
        }
        s8.b.b().a();
        if (this.a.g.c(null, (t2<Boolean>)u2.A0)) {
            f92.a(string, bundle);
            return;
        }
        i4 i42 = this.a;
        i42.o().b("auto", "_err", bundle);
    }

    public final void a(i3 i32, int n7) {
        Iterator iterator = new TreeSet((Collection)i32.d.keySet()).iterator();
        int n9 = 0;
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            if (!g9.i(string) || ++n9 <= n7) continue;
            StringBuilder stringBuilder = new StringBuilder(48);
            stringBuilder.append("Event can't contain more than ");
            stringBuilder.append(n7);
            stringBuilder.append(" params");
            String string2 = stringBuilder.toString();
            this.a.a().h.a(string2, (Object)this.a.q().a(i32.a), (Object)this.a.q().a(i32.d));
            g9.a(i32.d, 5);
            i32.d.remove(string);
        }
    }

    public final void a(String string, String string2, String string3, Bundle bundle, List<String> list, boolean bl) {
        if (bundle == null) {
            return;
        }
        Iterator iterator = new TreeSet((Collection)bundle.keySet()).iterator();
        int n7 = 0;
        while (iterator.hasNext()) {
            int n9;
            String string4;
            int n10;
            String string5 = (String)iterator.next();
            if (list != null && list.contains((Object)string5)) {
                n9 = 0;
            } else {
                n9 = bl ? this.f(string5) : 0;
                if (n9 == 0) {
                    n9 = this.g(string5);
                }
            }
            if (n9 != 0) {
                String string6 = n9 == 3 ? string5 : null;
                this.a(bundle, n9, string5, (Object)string6);
                bundle.remove(string5);
                continue;
            }
            if (this.a(bundle.get(string5))) {
                this.a.a().k.a("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", (Object)string2, (Object)string3, (Object)string5);
                n10 = 22;
                string4 = string5;
            } else {
                Object object = bundle.get(string5);
                string4 = string5;
                n10 = this.a(string, string2, string5, object, bundle, list, bl, false);
            }
            if (n10 != 0 && !"_ev".equals((Object)string4)) {
                this.a(bundle, n10, string4, bundle.get(string4));
            } else {
                if (!g9.i(string4) || g9.a(string4, g5.d) || ++n7 <= 0) continue;
                this.a.a().h.a("Item cannot contain custom parameters", (Object)this.a.q().a(string2), (Object)this.a.q().a(bundle));
                g9.a(bundle, 23);
            }
            bundle.remove(string4);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(Context context, String string) {
        void var4_9;
        String string2;
        f3 f32;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        PackageInfo packageInfo = c.b.b.a.b.k.b.b((Context)context).a.getPackageManager().getPackageInfo(string, 64);
        if (packageInfo == null) return true;
        try {
            if (packageInfo.signatures == null) return true;
            if (packageInfo.signatures.length <= 0) return true;
            Signature signature = packageInfo.signatures[0];
            return ((X509Certificate)CertificateFactory.getInstance((String)"X.509").generateCertificate((InputStream)new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals((Object)x500Principal);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            f32 = this.a.a().f;
            string2 = "Package name not found";
        }
        catch (CertificateException certificateException) {
            f32 = this.a.a().f;
            string2 = "Error obtaining certificate";
        }
        f32.a(string2, (Object)var4_9);
        return true;
    }

    public final boolean a(Object object) {
        return object instanceof Parcelable[] || object instanceof ArrayList || object instanceof Bundle;
        {
        }
    }

    public final boolean a(String string) {
        this.g();
        if (c.b.b.a.b.k.b.b((Context)this.a.a).a.checkCallingOrSelfPermission(string) == 0) {
            return true;
        }
        this.a.a().m.a("Permission not granted", (Object)string);
        return false;
    }

    public final boolean a(String string, int n7, String string2) {
        if (string2 == null) {
            this.a.a().h.a("Name is required and can't be null. Type", (Object)string);
            return false;
        }
        if (string2.codePointCount(0, string2.length()) > n7) {
            this.a.a().h.a("Name is too long. Type, maximum supported length, name", (Object)string, (Object)n7, (Object)string2);
            return false;
        }
        return true;
    }

    public final boolean a(String string, String string2, int n7, Object object) {
        if (object == null) {
            return true;
        }
        if (!(object instanceof Long || object instanceof Float || object instanceof Integer || object instanceof Byte || object instanceof Short || object instanceof Boolean)) {
            if (object instanceof Double) {
                return true;
            }
            if (!(object instanceof String || object instanceof Character || object instanceof CharSequence)) {
                return false;
            }
            String string3 = String.valueOf((Object)object);
            if (string3.codePointCount(0, string3.length()) > n7) {
                this.a.a().k.a("Value is too long; discarded. Value kind, name, value length", (Object)string, (Object)string2, (Object)string3.length());
                return false;
            }
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(String string, String string2, String string3) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            a.a(string);
            if (string.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) return true;
            if (!this.a.t()) return false;
            this.a.a().h.a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", h3.a(string));
            return false;
        }
        ea.c();
        if (this.a.g.c(null, (t2<Boolean>)u2.i0) && !TextUtils.isEmpty((CharSequence)string3)) return true;
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            a.a(string2);
            if (string2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) return true;
            this.a.a().h.a("Invalid admob_app_id. Analytics disabled.", h3.a(string2));
            return false;
        }
        if (!this.a.t()) return false;
        this.a.a().h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        return false;
    }

    public final boolean a(String string, String string2, String string3, String string4) {
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl && !bl2) {
            a.a(string);
            return !string.equals((Object)string2);
        }
        if (bl && bl2) {
            if (!TextUtils.isEmpty((CharSequence)string3) && !TextUtils.isEmpty((CharSequence)string4)) {
                return !string3.equals((Object)string4);
            }
            return !TextUtils.isEmpty((CharSequence)string4);
        }
        if (!bl) {
            if (TextUtils.isEmpty((CharSequence)string4)) {
                return false;
            }
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                return !string3.equals((Object)string4);
            }
            return true;
        }
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            return !string3.equals((Object)string4);
        }
        return true;
    }

    public final boolean a(String string, String[] arrstring, String[] arrstring2, String string2) {
        if (string2 == null) {
            this.a.a().h.a("Name is required and can't be null. Type", (Object)string);
            return false;
        }
        a.a(string2);
        String[] arrstring3 = g;
        for (int i6 = 0; i6 < 3; ++i6) {
            if (!string2.startsWith(arrstring3[i6])) continue;
            this.a.a().h.a("Name starts with reserved prefix. Type, name", (Object)string, (Object)string2);
            return false;
        }
        if (arrstring != null && g9.a(string2, arrstring) && (arrstring2 == null || !g9.a(string2, arrstring2))) {
            this.a.a().h.a("Name is reserved. Type, name", (Object)string, (Object)string2);
            return false;
        }
        return true;
    }

    public final byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcel = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcel, 0);
            byte[] arrby = parcel.marshall();
            return arrby;
        }
        finally {
            parcel.recycle();
        }
    }

    public final int b(String string, Object object) {
        int n7;
        String string2;
        if ("_ldl".equals((Object)string)) {
            n7 = this.c(string);
            string2 = "user property referrer";
        } else {
            n7 = this.c(string);
            string2 = "user property";
        }
        if (this.a(string2, string, n7, object)) {
            return 0;
        }
        return 7;
    }

    public final boolean b(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return false;
        }
        String string2 = this.a.g.b("debug.firebase.analytics.app", "");
        return string2.equals((Object)string);
    }

    public final boolean b(String string, String string2) {
        int n7;
        if (string2 == null) {
            this.a.a().h.a("Name is required and can't be null. Type", (Object)string);
            return false;
        }
        if (string2.length() == 0) {
            this.a.a().h.a("Name is required and can't be empty. Type", (Object)string);
            return false;
        }
        int n9 = string2.codePointAt(0);
        if (!Character.isLetter((int)n9)) {
            this.a.a().h.a("Name must start with a letter. Type, name", (Object)string, (Object)string2);
            return false;
        }
        int n10 = string2.length();
        for (int i6 = Character.charCount((int)n9); i6 < n10; i6 += Character.charCount((int)n7)) {
            n7 = string2.codePointAt(i6);
            if (n7 == 95 || Character.isLetterOrDigit((int)n7)) continue;
            this.a.a().h.a("Name must consist of letters, digits or _ (underscores). Type, name", (Object)string, (Object)string2);
            return false;
        }
        return true;
    }

    public final int c(String string) {
        if ("_ldl".equals((Object)string)) {
            return 2048;
        }
        if (!"_id".equals((Object)string)) {
            if (this.a.g.c(null, (t2<Boolean>)u2.g0) && "_lgclid".equals((Object)string)) {
                return 100;
            }
            return 36;
        }
        return 256;
    }

    public final Object c(String string, Object object) {
        boolean bl = "_ldl".equals((Object)string);
        int n7 = this.c(string);
        if (bl) {
            return this.a(n7, object, true, false);
        }
        return this.a(n7, object, false, false);
    }

    public final boolean c(String string, String string2) {
        int n7;
        if (string2 == null) {
            this.a.a().h.a("Name is required and can't be null. Type", (Object)string);
            return false;
        }
        if (string2.length() == 0) {
            this.a.a().h.a("Name is required and can't be empty. Type", (Object)string);
            return false;
        }
        int n9 = string2.codePointAt(0);
        if (!Character.isLetter((int)n9)) {
            if (n9 == 95) {
                n9 = 95;
            } else {
                this.a.a().h.a("Name must start with a letter or _ (underscore). Type, name", (Object)string, (Object)string2);
                return false;
            }
        }
        int n10 = string2.length();
        for (int i6 = Character.charCount((int)n9); i6 < n10; i6 += Character.charCount((int)n7)) {
            n7 = string2.codePointAt(i6);
            if (n7 == 95 || Character.isLetterOrDigit((int)n7)) continue;
            this.a.a().h.a("Name must consist of letters, digits or _ (underscores). Type, name", (Object)string, (Object)string2);
            return false;
        }
        return true;
    }

    public final int d(String string) {
        if (!this.c("event", string)) {
            return 2;
        }
        if (!this.a("event", f5.a, f5.b, string)) {
            return 13;
        }
        if (!this.a("event", 40, string)) {
            return 2;
        }
        return 0;
    }

    public final int e(String string) {
        if (!this.c("user property", string)) {
            return 6;
        }
        if (!this.a("user property", h5.a, null, string)) {
            return 15;
        }
        if (!this.a("user property", 24, string)) {
            return 6;
        }
        return 0;
    }

    public final int f(String string) {
        if (!this.b("event param", string)) {
            return 3;
        }
        if (!this.a("event param", (String[])null, (String[])null, string)) {
            return 14;
        }
        if (!this.a("event param", 40, string)) {
            return 3;
        }
        return 0;
    }

    public final int g(String string) {
        if (!this.c("event param", string)) {
            return 3;
        }
        if (!this.a("event param", (String[])null, (String[])null, string)) {
            return 14;
        }
        if (!this.a("event param", 40, string)) {
            return 3;
        }
        return 0;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i() {
        this.g();
        SecureRandom secureRandom = new SecureRandom();
        long l6 = secureRandom.nextLong();
        if (l6 == 0L && (l6 = secureRandom.nextLong()) == 0L) {
            this.a.a().i.a("Utils falling back to Random for random id");
        }
        this.d.set(l6);
    }

    @EnsuresNonNull(value={"this.apkVersion"})
    public final int n() {
        if (this.f == null) {
            c.b.b.a.b.b b6 = c.b.b.a.b.b.b;
            Context context = this.a.a;
            if (b6 != null) {
                this.f = d.a(context) / 1000;
            } else {
                throw null;
            }
        }
        return this.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long o() {
        AtomicLong atomicLong;
        long l6 = this.d.get() LCMP 0L;
        AtomicLong atomicLong2 = atomicLong = this.d;
        synchronized (atomicLong2) {
            if (l6 != false) {
                this.d.compareAndSet(-1L, 1L);
                return this.d.getAndIncrement();
            }
            try {
                int n7;
                long l7 = System.nanoTime();
                if ((c)this.a.n == null) throw null;
                long l10 = new Random(l7 ^ System.currentTimeMillis()).nextLong();
                this.e = n7 = 1 + this.e;
                return l10 + (long)n7;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @EnsuresNonNull(value={"this.secureRandom"})
    public final SecureRandom p() {
        this.g();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }
}

