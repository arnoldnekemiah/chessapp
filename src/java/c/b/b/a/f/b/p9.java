/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.b.a
 *  c.b.b.a.e.d.l9
 *  c.b.b.a.e.d.y5
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.BitSet
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package c.b.b.a.f.b;

import a.b.a;
import c.b.b.a.e.d.b2;
import c.b.b.a.e.d.c2;
import c.b.b.a.e.d.d2;
import c.b.b.a.e.d.e2;
import c.b.b.a.e.d.i1;
import c.b.b.a.e.d.j1;
import c.b.b.a.e.d.k1;
import c.b.b.a.e.d.k4;
import c.b.b.a.e.d.l1;
import c.b.b.a.e.d.l9;
import c.b.b.a.e.d.q5;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.y5;
import c.b.b.a.e.d.z5;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.c9;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.s9;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u9;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class p9 {
    public String a;
    public boolean b;
    public c2 c;
    public BitSet d;
    public BitSet e;
    public Map<Integer, Long> f;
    public Map<Integer, List<Long>> g;
    public final /* synthetic */ u9 h;

    public /* synthetic */ p9(u9 u92, String string) {
        this.h = u92;
        this.a = string;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new a();
        this.g = new a();
    }

    public /* synthetic */ p9(u9 u92, String string, c2 c22, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.h = u92;
        this.a = string;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new a();
        for (Integer n2 : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Object)((Long)map2.get((Object)n2)));
            this.g.put((Object)n2, (Object)arrayList);
        }
        this.b = false;
        this.c = c22;
    }

    public final j1 a(int n2) {
        Map<Integer, List<Long>> map;
        ArrayList arrayList;
        List list;
        i1 i12 = (i1)j1.zzi.g();
        if (i12.c) {
            i12.g();
            i12.c = false;
        }
        j1 j12 = (j1)i12.b;
        j12.zza = 1 | j12.zza;
        j12.zze = n2;
        boolean bl = this.b;
        if (i12.c) {
            i12.g();
            i12.c = false;
        }
        j1 j13 = (j1)i12.b;
        j13.zza = 8 | j13.zza;
        j13.zzh = bl;
        c2 c22 = this.c;
        if (c22 != null) {
            if (i12.c) {
                i12.g();
                i12.c = false;
            }
            j1 j14 = (j1)i12.b;
            j14.zzg = c22;
            j14.zza = 4 | j14.zza;
        }
        b2 b22 = (b2)c2.zzh.g();
        b22.b((Iterable<? extends Long>)c9.a(this.d));
        b22.a((Iterable<? extends Long>)c9.a(this.e));
        Map<Integer, Long> map2 = this.f;
        if (map2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map2.size());
            Iterator iterator = this.f.keySet().iterator();
            while (iterator.hasNext()) {
                int n10 = (Integer)iterator.next();
                Long l2 = (Long)this.f.get((Object)n10);
                if (l2 == null) continue;
                k1 k12 = (k1)l1.zzg.g();
                if (k12.c) {
                    k12.g();
                    k12.c = false;
                }
                l1 l12 = (l1)k12.b;
                l12.zza = 1 | l12.zza;
                l12.zze = n10;
                long l10 = l2;
                if (k12.c) {
                    k12.g();
                    k12.c = false;
                }
                l1 l13 = (l1)k12.b;
                l13.zza = 2 | l13.zza;
                l13.zzf = l10;
                arrayList2.add((Object)((l1)k12.f()));
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            if (b22.c) {
                b22.g();
                b22.c = false;
            }
            c2 c23 = (c2)b22.b;
            z5<l1> z52 = c23.zzf;
            if (!z52.a()) {
                c23.zzf = t5.a(z52);
            }
            k4.a(arrayList, c23.zzf);
        }
        if ((map = this.g) == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map.size());
            for (Integer n11 : this.g.keySet()) {
                d2 d22 = (d2)e2.zzg.g();
                int n12 = n11;
                if (d22.c) {
                    d22.g();
                    d22.c = false;
                }
                e2 e22 = (e2)d22.b;
                e22.zza = 1 | e22.zza;
                e22.zze = n12;
                List list2 = (List)this.g.get((Object)n11);
                if (list2 != null) {
                    Collections.sort((List)list2);
                    if (d22.c) {
                        d22.g();
                        d22.c = false;
                    }
                    e2 e23 = (e2)d22.b;
                    y5 y52 = e23.zzf;
                    if (!y52.a()) {
                        e23.zzf = t5.a(y52);
                    }
                    k4.a(list2, e23.zzf);
                }
                arrayList3.add((Object)((e2)d22.f()));
            }
            list = arrayList3;
        }
        if (b22.c) {
            b22.g();
            b22.c = false;
        }
        c2 c24 = (c2)b22.b;
        z5<e2> z53 = c24.zzg;
        if (!z53.a()) {
            c24.zzg = t5.a(z53);
        }
        k4.a(list, c24.zzg);
        if (i12.c) {
            i12.g();
            i12.c = false;
        }
        j1.a((j1)i12.b, (c2)b22.f());
        return (j1)i12.f();
    }

    public final void a(s9 s92) {
        Boolean bl;
        int n2 = s92.a();
        Boolean bl2 = s92.c;
        if (bl2 != null) {
            this.e.set(n2, bl2.booleanValue());
        }
        if ((bl = s92.d) != null) {
            this.d.set(n2, bl.booleanValue());
        }
        if (s92.e != null) {
            Map<Integer, Long> map = this.f;
            Integer n10 = n2;
            Long l2 = (Long)map.get((Object)n10);
            long l10 = s92.e / 1000L;
            if (l2 == null || l10 > l2) {
                this.f.put((Object)n10, (Object)l10);
            }
        }
        if (s92.f != null) {
            Map<Integer, List<Long>> map = this.g;
            Integer n11 = n2;
            List list = (List)map.get((Object)n11);
            if (list == null) {
                list = new ArrayList();
                this.g.put((Object)n11, (Object)list);
            }
            if (s92.b()) {
                list.clear();
            }
            l9.c();
            if (this.h.a.g.c(this.a, u2.b0) && s92.c()) {
                list.clear();
            }
            l9.c();
            boolean bl3 = this.h.a.g.c(this.a, u2.b0);
            Long l11 = s92.f / 1000L;
            if (bl3) {
                if (!list.contains((Object)l11)) {
                    list.add((Object)l11);
                    return;
                }
            } else {
                list.add((Object)l11);
            }
        }
    }
}

