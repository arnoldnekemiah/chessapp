/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.b.a
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.text.TextUtils
 *  c.b.b.a.e.d.c6
 *  c.b.b.a.e.d.z5
 *  c.b.b.a.f.b.a9
 *  c.b.b.a.f.b.d
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.f5
 *  c.b.b.a.f.b.g5
 *  c.b.b.a.f.b.h5
 *  c.b.b.a.f.b.p6
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.u2
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.Map
 */
package c.b.b.a.f.b;

import a.b.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import c.b.b.a.e.d.a1;
import c.b.b.a.e.d.b1;
import c.b.b.a.e.d.c1;
import c.b.b.a.e.d.c6;
import c.b.b.a.e.d.e1;
import c.b.b.a.e.d.h0;
import c.b.b.a.e.d.i0;
import c.b.b.a.e.d.j0;
import c.b.b.a.e.d.k0;
import c.b.b.a.e.d.l0;
import c.b.b.a.e.d.m0;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.s0;
import c.b.b.a.e.d.t0;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.z0;
import c.b.b.a.e.d.z5;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.c9;
import c.b.b.a.f.b.d;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f5;
import c.b.b.a.f.b.g5;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.h5;
import c.b.b.a.f.b.i;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.p6;
import c.b.b.a.f.b.r8;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class b4
extends r8
implements d {
    public final Map<String, Map<String, String>> d = new a();
    public final Map<String, Map<String, Boolean>> e = new a();
    public final Map<String, Map<String, Boolean>> f = new a();
    public final Map<String, c1> g = new a();
    public final Map<String, Map<String, Integer>> h = new a();
    public final Map<String, String> i = new a();

    public b4(a9 a92) {
        super(a92);
    }

    public static final Map<String, String> a(c1 c12) {
        a a4 = new a();
        if (c12 != null) {
            for (e1 e12 : c12.zzh) {
                a4.put(e12.zze, e12.zzf);
            }
        }
        return a4;
    }

    public final c1 a(String string) {
        this.h();
        this.g();
        a.c.a.a.c(string);
        this.e(string);
        return (c1)this.g.get((Object)string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final c1 a(String var1_1, byte[] var2_2) {
        block5 : {
            block4 : {
                if (var2_2 == null) return c1.zzn;
                try {
                    var4_3 = (c1)c9.a((b1)c1.zzn.g(), var2_2).f();
                    var5_4 = this.a.a().n;
                    var6_5 = var4_3.zza;
                    var7_6 = 1;
                    var8_7 = (var6_5 & var7_6) != 0;
                    var9_8 = var8_7 != false ? Long.valueOf((long)var4_3.zze) : null;
                    if ((2 & var4_3.zza) == 0) break block4;
                    break block5;
                }
                catch (RuntimeException var3_10) {}
                ** GOTO lbl-1000
                catch (c6 var3_12) {}
lbl-1000: // 2 sources:
                {
                    this.a.a().i.a("Unable to merge remote config. appId", h3.a(var1_1), (Object)var3_11);
                    return c1.zzn;
                }
            }
            var7_6 = 0;
        }
        var10_9 = null;
        if (var7_6 != 0) {
            var10_9 = var4_3.zzf;
        }
        var5_4.a("Parsed config. version, gmp_app_id", (Object)var9_8, (Object)var10_9);
        return var4_3;
    }

    public final String a(String string, String string2) {
        this.g();
        this.e(string);
        Map map = (Map)this.d.get((Object)string);
        if (map != null) {
            return (String)map.get((Object)string2);
        }
        return null;
    }

    public final void a(String string, b1 b12) {
        a a4 = new a();
        a a8 = new a();
        a a10 = new a();
        if (b12 != null) {
            for (int i3 = 0; i3 < ((c1)b12.b).zzi.size(); ++i3) {
                z0 z02 = (z0)((Object)((a1)((c1)b12.b).zzi.get(i3)).h());
                if (TextUtils.isEmpty((CharSequence)z02.j())) {
                    this.a.a().i.a("EventConfig contained null event name");
                    continue;
                }
                String string2 = z02.j();
                String string3 = p6.a((String)z02.j(), (String[])f5.a, (String[])f5.c);
                if (!TextUtils.isEmpty((CharSequence)string3)) {
                    if (z02.c) {
                        z02.g();
                        z02.c = false;
                    }
                    a1.a((a1)z02.b, string3);
                    if (b12.c) {
                        b12.g();
                        b12.c = false;
                    }
                    c1.a((c1)b12.b, i3, (a1)z02.f());
                }
                a4.put(string2, ((a1)z02.b).zzf);
                a8.put(z02.j(), ((a1)z02.b).zzg);
                boolean bl = (8 & ((a1)z02.b).zza) != 0;
                if (!bl) continue;
                if (z02.k() >= 2 && z02.k() <= 65535) {
                    a10.put(z02.j(), z02.k());
                    continue;
                }
                this.a.a().i.a("Invalid sampling rate. Event name, sample rate", (Object)z02.j(), (Object)z02.k());
            }
        }
        this.e.put((Object)string, (Object)a4);
        this.f.put((Object)string, (Object)a8);
        this.h.put((Object)string, (Object)a10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean a(String var1_1, byte[] var2_2, String var3_3) {
        block48 : {
            this.h();
            this.g();
            a.c.a.a.c(var1_1);
            var5_4 = (b1)this.a(var1_1, var2_2).h();
            if (var5_4 == null) {
                return false;
            }
            this.a(var1_1, var5_4);
            this.g.put((Object)var1_1, (Object)((c1)var5_4.f()));
            this.i.put((Object)var1_1, (Object)var3_3);
            this.d.put((Object)var1_1, b4.a((c1)var5_4.f()));
            var9_5 = this.b.n();
            var10_6 = new ArrayList((Collection)Collections.unmodifiableList(((c1)var5_4.b).zzj));
            if (var9_5 == null) throw null;
            var11_7 = "app_id=? and audience_id=?";
            var12_8 = "event_filters";
            a.c.a.a.a(var10_6);
            var14_9 = 0;
            do {
                block52 : {
                    block51 : {
                        block49 : {
                            block50 : {
                                if (var14_9 >= var10_6.size()) break block49;
                                var118_32 = (h0)((i0)var10_6.get(var14_9)).h();
                                if (((i0)var118_32.b).zzg.size() == 0) break block50;
                                var122_36 = var118_32;
                                break block51;
                            }
                            var119_33 = var5_4;
                            var120_34 = var11_7;
                            var121_35 = var12_8;
                            var122_36 = var118_32;
                            break block52;
                        }
                        var15_42 = var5_4;
                        var16_43 = var11_7;
                        var17_44 = var12_8;
                        var9_5.h();
                        var9_5.g();
                        a.c.a.a.c(var1_1);
                        a.c.a.a.a(var10_6);
                        var20_45 = var9_5.o();
                        var20_45.beginTransaction();
                        var9_5.h();
                        var9_5.g();
                        a.c.a.a.c(var1_1);
                        var23_46 = var9_5.o();
                        var23_46.delete("property_filters", "app_id=?", new String[]{var1_1});
                        var23_46.delete(var17_44, "app_id=?", new String[]{var1_1});
                        var26_47 = var10_6.iterator();
                        break;
                    }
                    for (var129_10 = 0; var129_10 < ((i0)var122_36.b).zzg.size(); ++var129_10) {
                        var130_11 = (j0)((k0)((i0)var122_36.b).zzg.get(var129_10)).h();
                        var131_12 = (j0)var130_11.h();
                        var132_13 = ((k0)var130_11.b).zzf;
                        var133_14 = f5.a;
                        var134_15 = var5_4;
                        var135_16 = p6.a((String)var132_13, (String[])var133_14, (String[])f5.c);
                        if (var135_16 != null) {
                            if (var131_12.c) {
                                var131_12.g();
                                var131_12.c = false;
                            }
                            var151_31 = (k0)var131_12.b;
                            var151_31.zza = 2 | var151_31.zza;
                            var151_31.zzf = var135_16;
                            var136_17 = true;
                        } else {
                            var136_17 = false;
                        }
                        for (var137_18 = 0; var137_18 < ((k0)var130_11.b).zzg.size(); ++var137_18) {
                            var141_21 = (m0)((k0)var130_11.b).zzg.get(var137_18);
                            var142_22 = var130_11;
                            var143_23 = var141_21.zzh;
                            var144_24 = var11_7;
                            var145_25 = g5.a;
                            var146_26 = var12_8;
                            var147_27 = p6.a((String)var143_23, (String[])var145_25, (String[])g5.b);
                            if (var147_27 != null) {
                                var148_28 = (l0)var141_21.h();
                                if (var148_28.c) {
                                    var148_28.g();
                                    var148_28.c = false;
                                }
                                var149_29 = (m0)var148_28.b;
                                var149_29.zza = 8 | var149_29.zza;
                                var149_29.zzh = var147_27;
                                var150_30 = (m0)var148_28.f();
                                if (var131_12.c) {
                                    var131_12.g();
                                    var131_12.c = false;
                                }
                                k0.a((k0)var131_12.b, var137_18, var150_30);
                                var136_17 = true;
                            }
                            var130_11 = var142_22;
                            var11_7 = var144_24;
                            var12_8 = var146_26;
                        }
                        var138_19 = var11_7;
                        var139_20 = var12_8;
                        if (var136_17) {
                            if (var122_36.c) {
                                var122_36.g();
                                var122_36.c = false;
                            }
                            i0.a((i0)var122_36.b, var129_10, (k0)var131_12.f());
                            var10_6.set(var14_9, (Object)((i0)var118_32.f()));
                            var122_36 = var118_32;
                        }
                        var5_4 = var134_15;
                        var11_7 = var138_19;
                        var12_8 = var139_20;
                    }
                    var119_33 = var5_4;
                    var120_34 = var11_7;
                    var121_35 = var12_8;
                }
                if (((i0)var122_36.b).zzf.size() != 0) {
                    for (var123_37 = 0; var123_37 < ((i0)var122_36.b).zzf.size(); ++var123_37) {
                        var124_38 = (t0)((i0)var122_36.b).zzf.get(var123_37);
                        var125_39 = p6.a((String)var124_38.zzf, (String[])h5.a, (String[])h5.b);
                        if (var125_39 == null) continue;
                        var126_40 = (s0)var124_38.h();
                        if (var126_40.c) {
                            var126_40.g();
                            var126_40.c = false;
                        }
                        var127_41 = (t0)var126_40.b;
                        var127_41.zza = 2 | var127_41.zza;
                        var127_41.zzf = var125_39;
                        if (var122_36.c) {
                            var122_36.g();
                            var122_36.c = false;
                        }
                        i0.a((i0)var122_36.b, var123_37, (t0)var126_40.f());
                        var10_6.set(var14_9, (Object)((i0)var118_32.f()));
                        var122_36 = var118_32;
                    }
                }
                ++var14_9;
                var5_4 = var119_33;
                var11_7 = var120_34;
                var12_8 = var121_35;
            } while (true);
            block18 : do {
                block46 : {
                    block54 : {
                        block53 : {
                            if (!var26_47.hasNext()) break block53;
                            var64_48 = (i0)var26_47.next();
                            var9_5.h();
                            var9_5.g();
                            a.c.a.a.c(var1_1);
                            a.c.a.a.a(var64_48);
                            var67_49 = (1 & var64_48.zza) != 0;
                            if (!var67_49) {
                                var9_5.a.a().i.a("Audience with no ID. appId", h3.a(var1_1));
                                continue;
                            }
                            var68_50 = var64_48.zze;
                            var69_51 = var64_48.zzg.iterator();
                            while (var69_51.hasNext()) {
                                if (((k0)var69_51.next()).i()) continue;
                                var114_91 = var9_5.a.a().i;
                                var115_92 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                var116_93 = h3.a(var1_1);
                                ** GOTO lbl161
                            }
                            var70_52 = var64_48.zzf.iterator();
                            while (var70_52.hasNext()) {
                                if (((t0)var70_52.next()).i()) continue;
                                var114_91 = var9_5.a.a().i;
                                var115_92 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                var116_93 = h3.a(var1_1);
lbl161: // 2 sources:
                                var117_94 = var68_50;
                                var114_91.a(var115_92, var116_93, (Object)var117_94);
                                continue block18;
                            }
                            break block54;
                        }
                        var27_95 = new ArrayList();
                        var28_96 = var10_6.iterator();
                        break;
                    }
                    var71_53 = var64_48.zzg.iterator();
                    block21 : do {
                        block55 : {
                            var72_54 = var71_53.hasNext();
                            var73_55 = "filter_id";
                            var74_56 = var26_47;
                            if (!var72_54) ** GOTO lbl211
                            var101_80 = (k0)var71_53.next();
                            var9_5.h();
                            var9_5.g();
                            a.c.a.a.c(var1_1);
                            a.c.a.a.a(var101_80);
                            if (!TextUtils.isEmpty((CharSequence)var101_80.zzf)) break block55;
                            var110_87 = var9_5.a.a().i;
                            var111_88 = h3.a(var1_1);
                            var112_89 = var68_50;
                            var113_90 = var101_80.i() != false ? Integer.valueOf((int)var101_80.zze) : null;
                            var110_87.a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", var111_88, (Object)var112_89, (Object)String.valueOf((Object)var113_90));
                            ** GOTO lbl258
                        }
                        var104_81 = var101_80.f();
                        var105_82 = var71_53;
                        var106_83 = new ContentValues();
                        var106_83.put("app_id", var1_1);
                        var106_83.put("audience_id", Integer.valueOf((int)var68_50));
                        var107_84 = var101_80.i() != false ? Integer.valueOf((int)var101_80.zze) : null;
                        var106_83.put(var73_55, var107_84);
                        var106_83.put("event_name", var101_80.zzf);
                        var108_85 = (64 & var101_80.zza) != 0;
                        var109_86 = var108_85 != false ? Boolean.valueOf((boolean)var101_80.zzl) : null;
                        var106_83.put("session_scoped", var109_86);
                        var106_83.put("data", var104_81);
                        try {
                            if (var9_5.o().insertWithOnConflict(var17_44, null, var106_83, 5) == -1L) {
                                var9_5.a.a().f.a("Failed to insert event filter (got -1). appId", h3.a(var1_1));
                            }
                            var26_47 = var74_56;
                            var71_53 = var105_82;
                        }
                        catch (SQLiteException var86_67) {
                            block56 : {
                                var87_69 = var9_5.a.a().f;
                                var88_70 = "Error storing event filter. appId";
                                break block56;
lbl211: // 1 sources:
                                var75_57 = var64_48.zzf.iterator();
                                break block46;
                            }
lbl214: // 2 sources:
                            do {
                                var89_71 = h3.a(var1_1);
                                break block21;
                                break;
                            } while (true);
                        }
                    } while (true);
                    var87_69.a(var88_70, var89_71, (Object)var86_66);
                    ** GOTO lbl258
                }
                while (var75_57.hasNext()) {
                    block47 : {
                        var76_58 = (t0)var75_57.next();
                        var9_5.h();
                        var9_5.g();
                        a.c.a.a.c(var1_1);
                        a.c.a.a.a(var76_58);
                        if (TextUtils.isEmpty((CharSequence)var76_58.zzf)) {
                            var97_76 = var9_5.a.a().i;
                            var98_77 = h3.a(var1_1);
                            var99_78 = var68_50;
                            var100_79 = var76_58.i() != false ? Integer.valueOf((int)var76_58.zze) : null;
                            var97_76.a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", var98_77, (Object)var99_78, (Object)String.valueOf((Object)var100_79));
                        } else {
                            var79_59 = var76_58.f();
                            var80_60 = new ContentValues();
                            var80_60.put("app_id", var1_1);
                            var81_61 = var75_57;
                            var80_60.put("audience_id", Integer.valueOf((int)var68_50));
                            var82_62 = var76_58.i() != false ? Integer.valueOf((int)var76_58.zze) : null;
                            var80_60.put(var73_55, var82_62);
                            var83_63 = var73_55;
                            var80_60.put("property_name", var76_58.zzf);
                            var84_64 = (32 & var76_58.zza) != 0;
                            var85_65 = var84_64 != false ? Boolean.valueOf((boolean)var76_58.zzj) : null;
                            var80_60.put("session_scoped", var85_65);
                            var80_60.put("data", var79_59);
                            try {
                                if (var9_5.o().insertWithOnConflict("property_filters", null, var80_60, 5) == -1L) {
                                    var9_5.a.a().f.a("Failed to insert property filter (got -1). appId", h3.a(var1_1));
                                    break block47;
                                }
                                var75_57 = var81_61;
                                var73_55 = var83_63;
                                continue;
                            }
                            catch (SQLiteException var86_68) {
                                var87_69 = var9_5.a.a().f;
                                var88_70 = "Error storing property filter. appId";
                                ** continue;
                            }
                        }
                    }
                    var9_5.h();
                    var9_5.g();
                    a.c.a.a.c(var1_1);
                    var91_72 = var9_5.o();
                    var92_73 = new String[]{var1_1, String.valueOf((int)var68_50)};
                    var93_74 = var16_43;
                    var91_72.delete("property_filters", var93_74, var92_73);
                    var95_75 = new String[]{var1_1, String.valueOf((int)var68_50)};
                    var91_72.delete(var17_44, var93_74, var95_75);
                    var16_43 = var93_74;
                    break;
                }
                var26_47 = var74_56;
            } while (true);
            while (var28_96.hasNext()) {
                var60_97 = (i0)var28_96.next();
                var61_98 = (1 & var60_97.zza) != 0;
                var62_99 = var61_98 != false ? Integer.valueOf((int)var60_97.zze) : null;
                var27_95.add((Object)var62_99);
            }
            a.c.a.a.c(var1_1);
            var9_5.h();
            var9_5.g();
            var30_100 = var9_5.o();
            try {
                var40_101 = var9_5.a("select count(1) from audience_filter_values where app_id=?", new String[]{var1_1});
            }
            catch (SQLiteException var31_112) {
                var9_5.a.a().f.a("Database error querying filters. appId", h3.a(var1_1), (Object)var31_112);
                break block48;
            }
            var42_102 = Math.max((int)0, (int)Math.min((int)2000, (int)var9_5.a.g.b(var1_1, (t2<Integer>)u2.F)));
            if (var40_101 <= (long)var42_102) break block48;
            var43_103 = new ArrayList();
            for (var44_104 = 0; var44_104 < var27_95.size(); ++var44_104) {
                var58_105 = (Integer)var27_95.get(var44_104);
                if (var58_105 != null) {
                    var43_103.add((Object)Integer.toString((int)var58_105));
                    continue;
                }
                break block48;
            }
            var45_106 = TextUtils.join((CharSequence)",", (Iterable)var43_103);
            var46_107 = new StringBuilder(2 + String.valueOf((Object)var45_106).length());
            var46_107.append("(");
            var46_107.append(var45_106);
            var46_107.append(")");
            var50_108 = var46_107.toString();
            var51_109 = new StringBuilder(140 + String.valueOf((Object)var50_108).length());
            var51_109.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            var51_109.append(var50_108);
            var51_109.append(" order by rowid desc limit -1 offset ?)");
            var55_110 = var51_109.toString();
            var56_111 = new String[]{var1_1, Integer.toString((int)var42_102)};
            var30_100.delete("audience_filter_values", var55_110, var56_111);
        }
        var20_45.setTransactionSuccessful();
        try {
            if (var15_42.c) {
                var15_42.g();
                var15_42.c = false;
            }
            c1.a((c1)var15_42.b);
            var34_113 = ((c1)var15_42.f()).f();
            var33_114 = this;
        }
        catch (RuntimeException var32_115) {
            var33_114 = this;
            var33_114.a.a().i.a("Unable to serialize reduced-size config. Storing full config instead. appId", h3.a(var1_1), (Object)var32_115);
            var34_113 = var2_2;
        }
        var35_116 = var33_114.b.n();
        a.c.a.a.c(var1_1);
        var35_116.g();
        var35_116.h();
        var37_117 = new ContentValues();
        var37_117.put("remote_config", var34_113);
        try {
            if ((long)var35_116.o().update("apps", var37_117, "app_id = ?", new String[]{var1_1}) == 0L) {
                var35_116.a.a().f.a("Failed to update remote config (got 0). appId", h3.a(var1_1));
            }
        }
        catch (SQLiteException var38_118) {
            var35_116.a.a().f.a("Error storing remote config. appId", h3.a(var1_1), (Object)var38_118);
        }
        var33_114.g.put((Object)var1_1, (Object)((c1)var15_42.f()));
        return true;
    }

    public final boolean b(String string) {
        this.g();
        c1 c12 = this.a(string);
        if (c12 == null) {
            return false;
        }
        return c12.zzl;
    }

    public final boolean b(String string, String string2) {
        this.g();
        this.e(string);
        if ("1".equals((Object)this.a(string, "measurement.upload.blacklist_internal")) && g9.h(string2)) {
            return true;
        }
        if ("1".equals((Object)this.a(string, "measurement.upload.blacklist_public")) && g9.i(string2)) {
            return true;
        }
        Map map = (Map)this.e.get((Object)string);
        if (map != null) {
            Boolean bl = (Boolean)map.get((Object)string2);
            if (bl == null) {
                return false;
            }
            return bl;
        }
        return false;
    }

    public final boolean c(String string) {
        return "1".equals((Object)this.a(string, "measurement.upload.blacklist_internal"));
    }

    public final boolean c(String string, String string2) {
        this.g();
        this.e(string);
        if ("ecommerce_purchase".equals((Object)string2)) {
            return true;
        }
        if (!"purchase".equals((Object)string2)) {
            if ("refund".equals((Object)string2)) {
                return true;
            }
            Map map = (Map)this.f.get((Object)string);
            if (map != null) {
                Boolean bl = (Boolean)map.get((Object)string2);
                if (bl == null) {
                    return false;
                }
                return bl;
            }
            return false;
        }
        return true;
    }

    public final int d(String string, String string2) {
        this.g();
        this.e(string);
        Map map = (Map)this.h.get((Object)string);
        if (map != null) {
            Integer n7 = (Integer)map.get((Object)string2);
            if (n7 == null) {
                return 1;
            }
            return n7;
        }
        return 1;
    }

    public final boolean d(String string) {
        return "1".equals((Object)this.a(string, "measurement.upload.blacklist_public"));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void e(String string) {
        void var8_9;
        Cursor cursor;
        block12 : {
            Map<String, String> map;
            byte[] arrby;
            block14 : {
                block13 : {
                    Cursor cursor2;
                    block9 : {
                        SQLiteException sQLiteException;
                        i i6;
                        block11 : {
                            block10 : {
                                this.h();
                                this.g();
                                a.c.a.a.c(string);
                                if (this.g.get((Object)string) != null) return;
                                i6 = this.b.n();
                                a.c.a.a.c(string);
                                i6.g();
                                i6.h();
                                cursor2 = i6.o().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{string}, null, null, null);
                                try {
                                    if (!cursor2.moveToFirst()) break block9;
                                    arrby = cursor2.getBlob(0);
                                    if (!cursor2.moveToNext()) break block10;
                                    i6.a.a().f.a("Got multiple records for app config, expected one. appId", h3.a(string));
                                }
                                catch (SQLiteException sQLiteException2) {
                                    break block11;
                                }
                            }
                            cursor2.close();
                            break block14;
                            catch (Throwable throwable) {
                                cursor = null;
                                break block12;
                            }
                            catch (SQLiteException sQLiteException3) {
                                sQLiteException = sQLiteException3;
                                cursor2 = null;
                            }
                        }
                        try {
                            i6.a.a().f.a("Error querying remote config. appId", h3.a(string), (Object)sQLiteException);
                            if (cursor2 == null) break block13;
                        }
                        catch (Throwable throwable) {
                            cursor = cursor2;
                        }
                    }
                    cursor2.close();
                }
                arrby = null;
            }
            if (arrby == null) {
                this.d.put((Object)string, null);
                this.e.put((Object)string, null);
                this.f.put((Object)string, null);
                this.g.put((Object)string, null);
                this.i.put((Object)string, null);
                map = this.h;
            } else {
                b1 b12 = (b1)((Object)this.a(string, arrby).h());
                this.a(string, b12);
                this.d.put((Object)string, b4.a((c1)b12.f()));
                this.g.put((Object)string, (Object)((c1)b12.f()));
                map = this.i;
            }
            map.put((Object)string, null);
            return;
        }
        if (cursor == null) throw var8_9;
        cursor.close();
        throw var8_9;
    }

    @Override
    public final boolean j() {
        return false;
    }
}

