/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package a.i.r;

import a.i.h;
import a.i.k;
import a.i.m;
import a.i.p;
import a.i.r.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class f
extends m {
    public static final String j = h.a("WorkContinuationImpl");
    public final j a;
    public final String b;
    public final a.i.f c;
    public final List<? extends p> d;
    public final List<String> e;
    public final List<String> f;
    public final List<f> g;
    public boolean h;
    public k i;

    public f(j j2, List<? extends p> list) {
        a.i.f f2 = a.i.f.b;
        this.a = j2;
        this.b = null;
        this.c = f2;
        this.d = list;
        this.g = null;
        this.e = new ArrayList(this.d.size());
        this.f = new ArrayList();
        for (int i10 = 0; i10 < list.size(); ++i10) {
            String string = ((p)list.get(i10)).a();
            this.e.add((Object)string);
            this.f.add((Object)string);
        }
    }

    public static Set<String> a(f f2) {
        HashSet hashSet = new HashSet();
        List<f> list = f2.g;
        if (list != null && !list.isEmpty()) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                hashSet.addAll(((f)iterator.next()).e);
            }
        }
        return hashSet;
    }

    public static boolean a(f f2, Set<String> set) {
        set.addAll(f2.e);
        Set<String> set2 = f.a(f2);
        for (String string : set) {
            if (!((HashSet)set2).contains((Object)string)) continue;
            return true;
        }
        List<f> list = f2.g;
        if (list != null && !list.isEmpty()) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!f.a((f)iterator.next(), set)) continue;
                return true;
            }
        }
        set.removeAll(f2.e);
        return false;
    }
}

