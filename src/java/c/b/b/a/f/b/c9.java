/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  c.b.b.a.b.j.c
 *  c.b.b.a.e.d.g5
 *  c.b.b.a.e.d.j4
 *  c.b.b.a.e.d.q0
 *  c.b.b.a.e.d.w0
 *  c.b.b.a.e.d.y5
 *  c.b.b.a.e.d.z5
 *  c.b.b.a.f.b.a9
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.m
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.u2
 *  com.google.android.gms.measurement.internal.zzaq
 *  com.google.android.gms.measurement.internal.zzas
 *  com.google.android.gms.measurement.internal.zzp
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.util.ArrayList
 *  java.util.BitSet
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.zip.GZIPOutputStream
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.c2;
import c.b.b.a.e.d.e2;
import c.b.b.a.e.d.f2;
import c.b.b.a.e.d.g2;
import c.b.b.a.e.d.g5;
import c.b.b.a.e.d.j1;
import c.b.b.a.e.d.j4;
import c.b.b.a.e.d.l1;
import c.b.b.a.e.d.m0;
import c.b.b.a.e.d.n1;
import c.b.b.a.e.d.o1;
import c.b.b.a.e.d.q0;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.r0;
import c.b.b.a.e.d.r1;
import c.b.b.a.e.d.s1;
import c.b.b.a.e.d.t0;
import c.b.b.a.e.d.u1;
import c.b.b.a.e.d.v1;
import c.b.b.a.e.d.w0;
import c.b.b.a.e.d.w1;
import c.b.b.a.e.d.x0;
import c.b.b.a.e.d.y5;
import c.b.b.a.e.d.z5;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.c3;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.m;
import c.b.b.a.f.b.r8;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

public final class c9
extends r8 {
    public c9(a9 a92) {
        super(a92);
    }

    public static int a(v1 v12, String string) {
        for (int i6 = 0; i6 < ((w1)v12.b).zzi.size(); ++i6) {
            if (!string.equals((Object)((g2)((w1)v12.b).zzi.get((int)i6)).zzf)) continue;
            return i6;
        }
        return -1;
    }

    public static <Builder extends j4> Builder a(Builder Builder, byte[] arrby) {
        g5 g52 = g5.b();
        if (g52 != null) {
            if (Builder != null) {
                int n7 = arrby.length;
                q5 q52 = (q5)((Object)Builder);
                q52.a(arrby, 0, n7, g52);
                return (Builder)((Object)q52);
            }
            throw null;
        }
        if (Builder != null) {
            int n9 = arrby.length;
            q5 q53 = (q5)((Object)Builder);
            q53.a(arrby, 0, n9, g5.a());
            return (Builder)((Object)q53);
        }
        throw null;
    }

    public static final Object a(o1 o12, String string) {
        s1 s12 = c9.b(o12, string);
        if (s12 != null) {
            if (s12.j()) {
                return s12.zzf;
            }
            if (s12.l()) {
                return s12.zzg;
            }
            if (s12.n()) {
                return s12.zzi;
            }
            if (s12.o() > 0) {
                z5<s1> z52 = s12.zzj;
                ArrayList arrayList = new ArrayList();
                for (s1 s13 : z52) {
                    if (s13 == null) continue;
                    Bundle bundle = new Bundle();
                    for (s1 s14 : s13.zzj) {
                        if (s14.j()) {
                            bundle.putString(s14.zze, s14.zzf);
                            continue;
                        }
                        if (s14.l()) {
                            bundle.putLong(s14.zze, s14.zzg);
                            continue;
                        }
                        if (!s14.n()) continue;
                        bundle.putDouble(s14.zze, s14.zzi);
                    }
                    if (bundle.isEmpty()) continue;
                    arrayList.add((Object)bundle);
                }
                return (Bundle[])arrayList.toArray((Object[])new Bundle[arrayList.size()]);
            }
        }
        return null;
    }

    public static final String a(boolean bl, boolean bl2, boolean bl3) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            stringBuilder.append("Dynamic ");
        }
        if (bl2) {
            stringBuilder.append("Sequence ");
        }
        if (bl3) {
            stringBuilder.append("Session-Scoped ");
        }
        return stringBuilder.toString();
    }

    public static List<Long> a(BitSet bitSet) {
        int n7 = (63 + bitSet.length()) / 64;
        ArrayList arrayList = new ArrayList(n7);
        for (int i6 = 0; i6 < n7; ++i6) {
            int n9;
            long l6 = 0L;
            for (int i9 = 0; i9 < 64 && (n9 = i9 + i6 * 64) < bitSet.length(); ++i9) {
                if (!bitSet.get(n9)) continue;
                l6 |= 1L << i9;
            }
            arrayList.add((Object)l6);
        }
        return arrayList;
    }

    public static List<s1> a(Bundle[] arrbundle) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : arrbundle) {
            if (bundle == null) continue;
            r1 r12 = s1.p();
            for (String string : bundle.keySet()) {
                r1 r13 = s1.p();
                r13.a(string);
                Object object = bundle.get(string);
                if (object instanceof Long) {
                    r13.a((Long)object);
                } else if (object instanceof String) {
                    r13.b((String)object);
                } else {
                    if (!(object instanceof Double)) continue;
                    r13.a((Double)object);
                }
                if (r12.c) {
                    r12.g();
                    r12.c = false;
                }
                s1.a((s1)r12.b, (s1)r13.f());
            }
            if (((s1)r12.b).o() <= 0) continue;
            arrayList.add((Object)((s1)r12.f()));
        }
        return arrayList;
    }

    public static final void a(n1 n12, String string, Object object) {
        int n7;
        block11 : {
            List<s1> list = n12.j();
            for (n7 = 0; n7 < list.size(); ++n7) {
                if (!string.equals((Object)((s1)list.get((int)n7)).zze)) {
                    continue;
                }
                break block11;
            }
            n7 = -1;
        }
        r1 r12 = s1.p();
        r12.a(string);
        if (object instanceof Long) {
            r12.a((Long)object);
        } else if (object instanceof String) {
            r12.b((String)object);
        } else if (object instanceof Double) {
            r12.a((Double)object);
        } else if (object instanceof Bundle[]) {
            r12.a((Iterable<? extends s1>)c9.a((Bundle[])object));
        }
        if (n7 >= 0) {
            if (n12.c) {
                n12.g();
                n12.c = false;
            }
            o1.a((o1)n12.b, n7, (s1)r12.f());
            return;
        }
        n12.a(r12);
    }

    public static final void a(StringBuilder stringBuilder, int n7) {
        for (int i6 = 0; i6 < n7; ++i6) {
            stringBuilder.append("  ");
        }
    }

    public static final void a(StringBuilder stringBuilder, int n7, String string, c2 c22, String string2) {
        if (c22 == null) {
            return;
        }
        c9.a(stringBuilder, 3);
        stringBuilder.append(string);
        stringBuilder.append(" {\n");
        if (c22.zze.size() != 0) {
            c9.a(stringBuilder, 4);
            stringBuilder.append("results: ");
            Iterator iterator = c22.zze.iterator();
            int n9 = 0;
            while (iterator.hasNext()) {
                Long l6 = (Long)iterator.next();
                int n10 = n9 + 1;
                if (n9 != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append((Object)l6);
                n9 = n10;
            }
            stringBuilder.append('\n');
        }
        if (c22.zza.size() != 0) {
            c9.a(stringBuilder, 4);
            stringBuilder.append("status: ");
            Iterator iterator = c22.zza.iterator();
            int n11 = 0;
            while (iterator.hasNext()) {
                Long l7 = (Long)iterator.next();
                int n12 = n11 + 1;
                if (n11 != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append((Object)l7);
                n11 = n12;
            }
            stringBuilder.append('\n');
        }
        if (c22.m() != 0) {
            c9.a(stringBuilder, 4);
            stringBuilder.append("dynamic_filter_timestamps: {");
            Iterator iterator = c22.zzf.iterator();
            int n13 = 0;
            while (iterator.hasNext()) {
                l1 l12 = (l1)iterator.next();
                int n14 = n13 + 1;
                if (n13 != 0) {
                    stringBuilder.append(", ");
                }
                boolean bl = (1 & l12.zza) != 0;
                Integer n15 = bl ? Integer.valueOf((int)l12.zze) : null;
                stringBuilder.append((Object)n15);
                stringBuilder.append(":");
                boolean bl2 = (2 & l12.zza) != 0;
                Long l9 = bl2 ? Long.valueOf((long)l12.zzf) : null;
                stringBuilder.append((Object)l9);
                n13 = n14;
            }
            stringBuilder.append("}\n");
        }
        if (c22.o() != 0) {
            c9.a(stringBuilder, 4);
            stringBuilder.append("sequence_filter_timestamps: {");
            Iterator iterator = c22.zzg.iterator();
            int n16 = 0;
            while (iterator.hasNext()) {
                e2 e22 = (e2)iterator.next();
                int n17 = n16 + 1;
                if (n16 != 0) {
                    stringBuilder.append(", ");
                }
                boolean bl = (1 & e22.zza) != 0;
                Integer n18 = bl ? Integer.valueOf((int)e22.zze) : null;
                stringBuilder.append((Object)n18);
                stringBuilder.append(": [");
                Iterator iterator2 = e22.zzf.iterator();
                int n19 = 0;
                while (iterator2.hasNext()) {
                    long l10 = (Long)iterator2.next();
                    int n20 = n19 + 1;
                    if (n19 != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(l10);
                    n19 = n20;
                }
                stringBuilder.append("]");
                n16 = n17;
            }
            stringBuilder.append("}\n");
        }
        c9.a(stringBuilder, 3);
        stringBuilder.append("}\n");
    }

    public static final void a(StringBuilder stringBuilder, int n7, String string, r0 r02) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        if (r02 == null) {
            return;
        }
        c9.a(stringBuilder, n7);
        stringBuilder.append(string);
        stringBuilder.append(" {\n");
        int n9 = r02.zza;
        int n10 = 1;
        boolean bl4 = (n9 & n10) != 0;
        if (bl4) {
            c9.a(stringBuilder, n7, "comparison_type", r02.i().name());
        }
        if (bl3 = (2 & r02.zza) != 0) {
            c9.a(stringBuilder, n7, "match_as_float", r02.zzf);
        }
        if (bl2 = (4 & r02.zza) != 0) {
            c9.a(stringBuilder, n7, "comparison_value", r02.zzg);
        }
        if (bl = (8 & r02.zza) != 0) {
            c9.a(stringBuilder, n7, "min_comparison_value", r02.zzh);
        }
        if ((16 & r02.zza) == 0) {
            n10 = 0;
        }
        if (n10 != 0) {
            c9.a(stringBuilder, n7, "max_comparison_value", r02.zzi);
        }
        c9.a(stringBuilder, n7);
        stringBuilder.append("}\n");
    }

    public static final void a(StringBuilder stringBuilder, int n7, String string, Object object) {
        if (object == null) {
            return;
        }
        c9.a(stringBuilder, n7 + 1);
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append(object);
        stringBuilder.append('\n');
    }

    public static final boolean a(zzas zzas2, zzp zzp2) {
        a.a(zzas2);
        a.a(zzp2);
        return !TextUtils.isEmpty((CharSequence)zzp2.b) || !TextUtils.isEmpty((CharSequence)zzp2.q);
    }

    public static boolean a(String string) {
        return string != null && string.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && string.length() <= 310;
    }

    public static boolean a(List<Long> list, int n7) {
        return n7 < 64 * list.size() && ((Long)list.get(n7 / 64) & 1L << n7 % 64) != 0L;
    }

    public static final s1 b(o1 o12, String string) {
        for (s1 s12 : o12.zze) {
            if (!s12.zze.equals((Object)string)) continue;
            return s12;
        }
        return null;
    }

    public final long a(byte[] arrby) {
        a.a(arrby);
        this.a.p().g();
        MessageDigest messageDigest = g9.q();
        if (messageDigest == null) {
            this.a.a().f.a("Failed to get MD5");
            return 0L;
        }
        return g9.a(messageDigest.digest(arrby));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final <T extends Parcelable> T a(byte[] arrby, Parcelable.Creator<T> creator) {
        Throwable throwable2222;
        if (arrby == null) {
            return null;
        }
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(arrby, 0, arrby.length);
        parcel.setDataPosition(0);
        Parcelable parcelable = (Parcelable)creator.createFromParcel(parcel);
        parcel.recycle();
        return (T)parcelable;
        {
            catch (Throwable throwable2222) {
            }
            catch (c.b.b.a.b.h.j.a a4) {}
            {
                this.a.a().f.a("Failed to load parcelable from buffer");
            }
            parcel.recycle();
            return null;
        }
        parcel.recycle();
        throw throwable2222;
    }

    public final o1 a(m m6) {
        n1 n12 = o1.n();
        n12.b(m6.e);
        for (String string : m6.f.a.keySet()) {
            r1 r12 = s1.p();
            r12.a(string);
            Object object = m6.f.a(string);
            a.a(object);
            this.a(r12, object);
            n12.a(r12);
        }
        return (o1)n12.f();
    }

    public final String a(t0 t02) {
        m0 m02;
        if (t02 == null) {
            return "null";
        }
        StringBuilder stringBuilder = c.a.b.a.a.a("\nproperty_filter {\n");
        if (t02.i()) {
            c9.a(stringBuilder, 0, "filter_id", t02.zze);
        }
        c9.a(stringBuilder, 0, "property_name", this.a.q().c(t02.zzf));
        String string = c9.a(t02.zzh, t02.zzi, t02.zzj);
        if (!string.isEmpty()) {
            c9.a(stringBuilder, 0, "filter_type", string);
        }
        if ((m02 = t02.zzg) == null) {
            m02 = m0.zzi;
        }
        this.a(stringBuilder, 1, m02);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    public final String a(u1 u12) {
        if (u12 == null) {
            return "";
        }
        StringBuilder stringBuilder = c.a.b.a.a.a("\nbatch {\n");
        for (w1 w12 : u12.zza) {
            boolean bl;
            boolean bl2;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            boolean bl6;
            boolean bl7;
            long l6;
            boolean bl8;
            boolean bl9;
            boolean bl10;
            z5<g2> z52;
            boolean bl11;
            boolean bl12;
            if (w12 == null) continue;
            c9.a(stringBuilder, 1);
            stringBuilder.append("bundle {\n");
            boolean bl13 = (1 & w12.zze) != 0;
            if (bl13) {
                c9.a(stringBuilder, 1, "protocol_version", w12.zzg);
            }
            c9.a(stringBuilder, 1, "platform", w12.zzo);
            boolean bl14 = (16384 & w12.zze) != 0;
            if (bl14) {
                c9.a(stringBuilder, 1, "gmp_version", w12.zzw);
            }
            if (bl12 = (32768 & w12.zze) != 0) {
                c9.a(stringBuilder, 1, "uploading_gmp_version", w12.zzx);
            }
            if (bl9 = (16 & w12.zzf) != 0) {
                c9.a(stringBuilder, 1, "dynamite_version", w12.zzU);
            }
            if (bl3 = (536870912 & w12.zze) != 0) {
                c9.a(stringBuilder, 1, "config_version", w12.zzM);
            }
            c9.a(stringBuilder, 1, "gmp_app_id", w12.zzE);
            c9.a(stringBuilder, 1, "admob_app_id", w12.zzR);
            c9.a(stringBuilder, 1, "app_id", w12.zzu);
            c9.a(stringBuilder, 1, "app_version", w12.zzv);
            boolean bl15 = (33554432 & w12.zze) != 0;
            if (bl15) {
                c9.a(stringBuilder, 1, "app_version_major", w12.zzI);
            }
            c9.a(stringBuilder, 1, "firebase_instance_id", w12.zzH);
            boolean bl16 = (524288 & w12.zze) != 0;
            if (bl16) {
                c9.a(stringBuilder, 1, "dev_cert_hash", w12.zzB);
            }
            c9.a(stringBuilder, 1, "app_store", w12.zzt);
            boolean bl17 = (2 & w12.zze) != 0;
            if (bl17) {
                c9.a(stringBuilder, 1, "upload_timestamp_millis", w12.zzj);
            }
            if (bl8 = (4 & w12.zze) != 0) {
                c9.a(stringBuilder, 1, "start_timestamp_millis", w12.zzk);
            }
            if (bl5 = (8 & w12.zze) != 0) {
                c9.a(stringBuilder, 1, "end_timestamp_millis", w12.zzl);
            }
            if (bl7 = (16 & w12.zze) != 0) {
                c9.a(stringBuilder, 1, "previous_bundle_start_timestamp_millis", w12.zzm);
            }
            if (bl10 = (32 & w12.zze) != 0) {
                c9.a(stringBuilder, 1, "previous_bundle_end_timestamp_millis", w12.zzn);
            }
            c9.a(stringBuilder, 1, "app_instance_id", w12.zzA);
            c9.a(stringBuilder, 1, "resettable_device_id", w12.zzy);
            c9.a(stringBuilder, 1, "ds_id", w12.zzO);
            boolean bl18 = (131072 & w12.zze) != 0;
            if (bl18) {
                c9.a(stringBuilder, 1, "limited_ad_tracking", w12.zzz);
            }
            c9.a(stringBuilder, 1, "os_version", w12.zzp);
            c9.a(stringBuilder, 1, "device_model", w12.zzq);
            c9.a(stringBuilder, 1, "user_default_language", w12.zzr);
            boolean bl19 = (1024 & w12.zze) != 0;
            if (bl19) {
                c9.a(stringBuilder, 1, "time_zone_offset_minutes", w12.zzs);
            }
            if (bl2 = (1048576 & w12.zze) != 0) {
                c9.a(stringBuilder, 1, "bundle_sequential_index", w12.zzC);
            }
            if (bl = (8388608 & w12.zze) != 0) {
                c9.a(stringBuilder, 1, "service_upload", w12.zzF);
            }
            c9.a(stringBuilder, 1, "health_monitor", w12.zzD);
            if (!this.a.g.c(null, (t2<Boolean>)u2.v0) && (bl4 = (1073741824 & w12.zze) != 0) && (l6 = w12.zzN) != 0L) {
                c9.a(stringBuilder, 1, "android_id", l6);
            }
            if (bl11 = (2 & w12.zzf) != 0) {
                c9.a(stringBuilder, 1, "retry_counter", w12.zzQ);
            }
            if (bl6 = (128 & w12.zzf) != 0) {
                c9.a(stringBuilder, 1, "consent_signals", w12.zzX);
            }
            if ((z52 = w12.zzi) != null) {
                for (g2 g22 : z52) {
                    if (g22 == null) continue;
                    c9.a(stringBuilder, 2);
                    stringBuilder.append("user_property {\n");
                    boolean bl20 = (1 & g22.zza) != 0;
                    Long l7 = bl20 ? Long.valueOf((long)g22.zze) : null;
                    c9.a(stringBuilder, 2, "set_timestamp_millis", (Object)l7);
                    c9.a(stringBuilder, 2, "name", this.a.q().c(g22.zzf));
                    c9.a(stringBuilder, 2, "string_value", g22.zzg);
                    boolean bl21 = (8 & g22.zza) != 0;
                    Long l9 = bl21 ? Long.valueOf((long)g22.zzh) : null;
                    c9.a(stringBuilder, 2, "int_value", (Object)l9);
                    boolean bl22 = (32 & g22.zza) != 0;
                    Double d6 = bl22 ? Double.valueOf((double)g22.zzj) : null;
                    c9.a(stringBuilder, 2, "double_value", (Object)d6);
                    c9.a(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            z5<j1> z53 = w12.zzG;
            String string = w12.zzu;
            if (z53 != null) {
                for (j1 j12 : z53) {
                    boolean bl23;
                    c2 c22;
                    if (j12 == null) continue;
                    c9.a(stringBuilder, 2);
                    stringBuilder.append("audience_membership {\n");
                    boolean bl24 = (1 & j12.zza) != 0;
                    if (bl24) {
                        c9.a(stringBuilder, 2, "audience_id", j12.zze);
                    }
                    if (bl23 = (8 & j12.zza) != 0) {
                        c9.a(stringBuilder, 2, "new_audience", j12.zzh);
                    }
                    if ((c22 = j12.zzf) == null) {
                        c22 = c2.zzh;
                    }
                    c9.a(stringBuilder, 2, "current_data", c22, string);
                    boolean bl25 = (4 & j12.zza) != 0;
                    if (bl25) {
                        c2 c23 = j12.zzg;
                        if (c23 == null) {
                            c23 = c2.zzh;
                        }
                        c9.a(stringBuilder, 2, "previous_data", c23, string);
                    }
                    c9.a(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            z5<o1> z54 = w12.zzh;
            if (z54 != null) {
                for (o1 o12 : z54) {
                    boolean bl26;
                    boolean bl27;
                    if (o12 == null) continue;
                    c9.a(stringBuilder, 2);
                    stringBuilder.append("event {\n");
                    c9.a(stringBuilder, 2, "name", this.a.q().a(o12.zzf));
                    if (o12.k()) {
                        c9.a(stringBuilder, 2, "timestamp_millis", o12.zzg);
                    }
                    if (bl27 = (4 & o12.zza) != 0) {
                        c9.a(stringBuilder, 2, "previous_timestamp_millis", o12.zzh);
                    }
                    if (bl26 = (8 & o12.zza) != 0) {
                        c9.a(stringBuilder, 2, "count", o12.zzi);
                    }
                    if (o12.zze.size() != 0) {
                        this.a(stringBuilder, 2, (List<s1>)o12.zze);
                    }
                    c9.a(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            c9.a(stringBuilder, 1);
            stringBuilder.append("}\n");
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    public final List<Long> a(List<Long> list, List<Integer> list2) {
        int n7;
        ArrayList arrayList = new ArrayList(list);
        for (Integer n9 : list2) {
            if (n9 < 0) {
                this.a.a().i.a("Ignoring negative bit index to be cleared", (Object)n9);
                continue;
            }
            int n10 = n9 / 64;
            if (n10 >= arrayList.size()) {
                this.a.a().i.a("Ignoring bit index greater than bitSet size", (Object)n9, (Object)arrayList.size());
                continue;
            }
            arrayList.set(n10, (Object)((Long)arrayList.get(n10) & (-1L ^ 1L << n9 % 64)));
        }
        int n11 = arrayList.size();
        int n12 = -1 + arrayList.size();
        do {
            int n13 = n12;
            n7 = n11;
            n11 = n13;
            if (n11 < 0 || (Long)arrayList.get(n11) != 0L) break;
            n12 = n11 - 1;
        } while (true);
        return arrayList.subList(0, n7);
    }

    public final void a(f2 f22, Object object) {
        a.a(object);
        if (f22.c) {
            f22.g();
            f22.c = false;
        }
        g2 g22 = (g2)f22.b;
        g22.zza = -5 & g22.zza;
        g22.zzg = g2.zzk.zzg;
        if (f22.c) {
            f22.g();
            f22.c = false;
        }
        g2 g23 = (g2)f22.b;
        g23.zza = -9 & g23.zza;
        g23.zzh = 0L;
        if (f22.c) {
            f22.g();
            f22.c = false;
        }
        g2 g24 = (g2)f22.b;
        g24.zza = -33 & g24.zza;
        g24.zzj = 0.0;
        if (object instanceof String) {
            String string = (String)object;
            if (f22.c) {
                f22.g();
                f22.c = false;
            }
            g2.b((g2)f22.b, string);
            return;
        }
        if (object instanceof Long) {
            f22.b((Long)object);
            return;
        }
        if (object instanceof Double) {
            double d6 = (Double)object;
            if (f22.c) {
                f22.g();
                f22.c = false;
            }
            g2 g25 = (g2)f22.b;
            g25.zza = 32 | g25.zza;
            g25.zzj = d6;
            return;
        }
        this.a.a().f.a("Ignoring invalid (type) user attribute value", object);
    }

    public final void a(r1 r12, Object object) {
        a.a(object);
        if (r12.c) {
            r12.g();
            r12.c = false;
        }
        s1 s12 = (s1)r12.b;
        s12.zza = -3 & s12.zza;
        s12.zzf = s1.zzk.zzf;
        if (r12.c) {
            r12.g();
            r12.c = false;
        }
        s1 s13 = (s1)r12.b;
        s13.zza = -5 & s13.zza;
        s13.zzg = 0L;
        if (r12.c) {
            r12.g();
            r12.c = false;
        }
        s1 s14 = (s1)r12.b;
        s14.zza = -17 & s14.zza;
        s14.zzi = 0.0;
        if (r12.c) {
            r12.g();
            r12.c = false;
        }
        s1.a((s1)r12.b);
        if (object instanceof String) {
            r12.b((String)object);
            return;
        }
        if (object instanceof Long) {
            r12.a((Long)object);
            return;
        }
        if (object instanceof Double) {
            r12.a((Double)object);
            return;
        }
        if (object instanceof Bundle[]) {
            r12.a((Iterable<? extends s1>)c9.a((Bundle[])object));
            return;
        }
        this.a.a().f.a("Ignoring invalid (type) event param value", object);
    }

    public final void a(StringBuilder stringBuilder, int n7, m0 m02) {
        boolean bl;
        if (m02 == null) {
            return;
        }
        c9.a(stringBuilder, n7);
        stringBuilder.append("filter {\n");
        boolean bl2 = (4 & m02.zza) != 0;
        if (bl2) {
            c9.a(stringBuilder, n7, "complement", m02.zzg);
        }
        if (bl = (8 & m02.zza) != 0) {
            c9.a(stringBuilder, n7, "param_name", this.a.q().b(m02.zzh));
        }
        if (m02.i()) {
            int n9 = n7 + 1;
            x0 x02 = m02.j();
            if (x02 != null) {
                boolean bl3;
                c9.a(stringBuilder, n9);
                stringBuilder.append("string_filter {\n");
                boolean bl4 = (1 & x02.zza) != 0;
                if (bl4) {
                    c9.a(stringBuilder, n9, "match_type", x02.i().name());
                }
                if (bl3 = (2 & x02.zza) != 0) {
                    c9.a(stringBuilder, n9, "expression", x02.zzf);
                }
                int n10 = 4 & x02.zza;
                boolean bl5 = false;
                if (n10 != 0) {
                    bl5 = true;
                }
                if (bl5) {
                    c9.a(stringBuilder, n9, "case_sensitive", x02.zzg);
                }
                if (x02.j() > 0) {
                    c9.a(stringBuilder, n9 + 1);
                    stringBuilder.append("expression_list {\n");
                    for (String string : x02.zzh) {
                        c9.a(stringBuilder, n9 + 2);
                        stringBuilder.append(string);
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append("}\n");
                }
                c9.a(stringBuilder, n9);
                stringBuilder.append("}\n");
            }
        }
        if (m02.k()) {
            c9.a(stringBuilder, n7 + 1, "number_filter", m02.l());
        }
        c9.a(stringBuilder, n7);
        stringBuilder.append("}\n");
    }

    public final void a(StringBuilder stringBuilder, int n7, List<s1> list) {
        if (list == null) {
            return;
        }
        int n9 = n7 + 1;
        for (s1 s12 : list) {
            if (s12 == null) continue;
            c9.a(stringBuilder, n9);
            stringBuilder.append("param {\n");
            boolean bl = (1 & s12.zza) != 0;
            String string = bl ? this.a.q().b(s12.zze) : null;
            c9.a(stringBuilder, n9, "name", string);
            String string2 = s12.j() ? s12.zzf : null;
            c9.a(stringBuilder, n9, "string_value", string2);
            Long l6 = s12.l() ? Long.valueOf((long)s12.zzg) : null;
            c9.a(stringBuilder, n9, "int_value", (Object)l6);
            boolean bl2 = s12.n();
            Double d6 = null;
            if (bl2) {
                d6 = s12.zzi;
            }
            c9.a(stringBuilder, n9, "double_value", (Object)d6);
            if (s12.o() > 0) {
                this.a(stringBuilder, n9, (List<s1>)s12.zzj);
            }
            c9.a(stringBuilder, n9);
            stringBuilder.append("}\n");
        }
    }

    public final boolean a(long l6, long l7) {
        if (l6 != 0L && l7 > 0L) {
            if ((c)this.a.n != null) {
                if (Math.abs((long)(System.currentTimeMillis() - l6)) <= l7) {
                    return false;
                }
            } else {
                throw null;
            }
        }
        return true;
    }

    public final byte[] b(byte[] arrby) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream((OutputStream)byteArrayOutputStream);
            gZIPOutputStream.write(arrby);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] arrby2 = byteArrayOutputStream.toByteArray();
            return arrby2;
        }
        catch (IOException iOException) {
            this.a.a().f.a("Failed to gzip content", (Object)iOException);
            throw iOException;
        }
    }

    @Override
    public final boolean j() {
        return false;
    }
}

