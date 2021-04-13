/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.SafeVarargs
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 */
package c.b.d.g;

import c.b.d.g.f;
import c.b.d.g.o;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class d<T> {
    public final Set<Class<? super T>> a;
    public final Set<o> b;
    public final int c;
    public final int d;
    public final f<T> e;
    public final Set<Class<?>> f;

    public /* synthetic */ d(Set set, Set set2, int n10, int n11, f f10, Set set3, a a10) {
        this.a = Collections.unmodifiableSet((Set)set);
        this.b = Collections.unmodifiableSet((Set)set2);
        this.c = n10;
        this.d = n11;
        this.e = f10;
        this.f = Collections.unmodifiableSet((Set)set3);
    }

    public static <T> b<T> a(Class<T> class_) {
        return new b(class_, new Class[0], null);
    }

    @SafeVarargs
    public static /* varargs */ <T> d<T> a(T t9, Class<T> class_, Class<? super T> ... arrclass) {
        IllegalStateException illegalStateException;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        a.c.a.a.a(class_, "Null interface");
        hashSet.add(class_);
        int n10 = arrclass.length;
        for (int i10 = 0; i10 < n10; ++i10) {
            a.c.a.a.a(arrclass[i10], "Null interface");
        }
        Collections.addAll((Collection)hashSet, (Object[])arrclass);
        c.b.d.g.b b10 = new c.b.d.g.b(t9);
        a.c.a.a.a(b10, "Null factory");
        if (true) {
            d<T> d10 = new d<T>((Set)new HashSet((Collection)hashSet), (Set)new HashSet((Collection)hashSet2), 0, 0, b10, (Set)hashSet3, null);
            return d10;
        }
        illegalStateException = new IllegalStateException("Missing required property: factory.");
        throw illegalStateException;
    }

    public boolean a() {
        return this.d == 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Component<");
        stringBuilder.append(Arrays.toString((Object[])this.a.toArray()));
        stringBuilder.append(">{");
        stringBuilder.append(this.c);
        stringBuilder.append(", type=");
        stringBuilder.append(this.d);
        stringBuilder.append(", deps=");
        stringBuilder.append(Arrays.toString((Object[])this.b.toArray()));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static class b<T> {
        public final Set<Class<? super T>> a = new HashSet();
        public final Set<o> b = new HashSet();
        public int c = 0;
        public int d = 0;
        public f<T> e;
        public Set<Class<?>> f = new HashSet();

        public /* synthetic */ b(Class class_, Class[] arrclass, a a10) {
            a.c.a.a.a(class_, "Null interface");
            this.a.add((Object)class_);
            int n10 = arrclass.length;
            for (int i10 = 0; i10 < n10; ++i10) {
                a.c.a.a.a(arrclass[i10], "Null interface");
            }
            Collections.addAll(this.a, (Object[])arrclass);
        }

        public b<T> a(f<T> f10) {
            a.c.a.a.a(f10, "Null factory");
            this.e = f10;
            return this;
        }

        public b<T> a(o o10) {
            a.c.a.a.a(o10, "Null dependency");
            Class<?> class_ = o10.a;
            if (true ^ this.a.contains(class_)) {
                this.b.add((Object)o10);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public d<T> a() {
            boolean bl = this.e != null;
            if (bl) {
                d d10 = new d((Set)new HashSet(this.a), (Set)new HashSet(this.b), this.c, this.d, this.e, this.f, null);
                return d10;
            }
            throw new IllegalStateException("Missing required property: factory.");
        }
    }

}

