/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.b7
 *  c.b.b.a.e.d.y7
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.b7;
import c.b.b.a.e.d.d8;
import c.b.b.a.e.d.e8;
import c.b.b.a.e.d.f6;
import c.b.b.a.e.d.g6;
import c.b.b.a.e.d.j6;
import c.b.b.a.e.d.y7;
import c.b.b.a.e.d.z5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class h6
extends j6 {
    public static final Class<?> c = Collections.unmodifiableList((List)Collections.emptyList()).getClass();

    @Override
    public final void a(Object object, long l10) {
        g6 g62;
        List list = (List)e8.h(object, l10);
        if (list instanceof g6) {
            g62 = ((g6)list).f();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if (list instanceof b7 && list instanceof z5) {
                z5 z52 = (z5)list;
                if (z52.a()) {
                    z52.b();
                }
                return;
            }
            g62 = Collections.unmodifiableList((List)list);
        }
        e8.e.a(object, l10, g62);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final <E> void a(Object object, Object object2, long l10) {
        List list;
        void var7_13;
        block14 : {
            void var7_10;
            block10 : {
                z5 z52;
                List list2;
                int n10;
                block13 : {
                    Object object3;
                    block12 : {
                        block11 : {
                            block9 : {
                                list = (List)e8.h(object2, l10);
                                n10 = list.size();
                                list2 = (List)e8.h(object, l10);
                                if (!list2.isEmpty()) break block9;
                                if (list2 instanceof g6) {
                                    f6 f62 = new f6(n10);
                                } else if (list2 instanceof b7 && list2 instanceof z5) {
                                    z5 z53 = ((z5)list2).a(n10);
                                } else {
                                    ArrayList arrayList = new ArrayList(n10);
                                }
                                break block10;
                            }
                            if (!c.isAssignableFrom(list2.getClass())) break block11;
                            object3 = new ArrayList(n10 + list2.size());
                            object3.addAll((Collection)list2);
                            break block12;
                        }
                        if (!(list2 instanceof y7)) break block13;
                        object3 = new f6(n10 + list2.size());
                        y7 y72 = (y7)list2;
                        ((f6)object3).addAll(((f6)object3).size(), (Collection<? extends String>)y72);
                    }
                    e8.e.a(object, l10, object3);
                    Object object4 = object3;
                    break block14;
                }
                if (!(list2 instanceof b7) || !(list2 instanceof z5) || (z52 = (z5)list2).a()) break block14;
                z5 z54 = z52.a(n10 + list2.size());
            }
            e8.e.a(object, l10, var7_10);
        }
        int n11 = var7_13.size();
        int n12 = list.size();
        if (n11 > 0 && n12 > 0) {
            var7_13.addAll((Collection)list);
        }
        if (n11 > 0) {
            list = var7_13;
        }
        e8.e.a(object, l10, (Object)list);
    }
}

