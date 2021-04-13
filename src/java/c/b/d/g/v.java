/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.d.g.d
 *  c.b.d.g.e
 *  c.b.d.g.o
 *  c.b.d.h.c
 *  c.b.d.j.a
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 */
package c.b.d.g;

import c.b.d.g.d;
import c.b.d.g.e;
import c.b.d.g.o;
import c.b.d.h.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class v
extends c.b.d.g.a {
    public final Set<Class<?>> a;
    public final Set<Class<?>> b;
    public final Set<Class<?>> c;
    public final Set<Class<?>> d;
    public final Set<Class<?>> e;
    public final e f;

    public v(d<?> d6, e e10) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (o o10 : d6.b) {
            boolean bl = o10.c == 0;
            if (bl) {
                if (o10.a()) {
                    hashSet3.add((Object)o10.a);
                    continue;
                }
                hashSet.add((Object)o10.a);
                continue;
            }
            if (o10.a()) {
                hashSet4.add((Object)o10.a);
                continue;
            }
            hashSet2.add((Object)o10.a);
        }
        if (!d6.f.isEmpty()) {
            hashSet.add(c.class);
        }
        this.a = Collections.unmodifiableSet((Set)hashSet);
        this.b = Collections.unmodifiableSet((Set)hashSet2);
        this.c = Collections.unmodifiableSet((Set)hashSet3);
        this.d = Collections.unmodifiableSet((Set)hashSet4);
        this.e = d6.f;
        this.f = e10;
    }

    @Override
    public <T> T a(Class<T> class_) {
        if (this.a.contains(class_)) {
            Object object = this.f.a(class_);
            if (!class_.equals(c.class)) {
                return (T)object;
            }
            return (T)new a(this.e, (c)object);
        }
        throw new IllegalArgumentException(String.format((String)"Attempting to request an undeclared dependency %s.", (Object[])new Object[]{class_}));
    }

    public <T> c.b.d.j.a<T> b(Class<T> class_) {
        if (this.b.contains(class_)) {
            return this.f.b(class_);
        }
        throw new IllegalArgumentException(String.format((String)"Attempting to request an undeclared dependency Provider<%s>.", (Object[])new Object[]{class_}));
    }

    @Override
    public <T> Set<T> c(Class<T> class_) {
        if (this.c.contains(class_)) {
            return this.f.c(class_);
        }
        throw new IllegalArgumentException(String.format((String)"Attempting to request an undeclared dependency Set<%s>.", (Object[])new Object[]{class_}));
    }

    public <T> c.b.d.j.a<Set<T>> d(Class<T> class_) {
        if (this.d.contains(class_)) {
            return this.f.d(class_);
        }
        throw new IllegalArgumentException(String.format((String)"Attempting to request an undeclared dependency Provider<Set<%s>>.", (Object[])new Object[]{class_}));
    }

    public static class a
    implements c {
        public a(Set<Class<?>> set, c c8) {
        }
    }

}

