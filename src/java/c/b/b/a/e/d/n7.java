/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.m7;
import c.b.b.a.e.d.p7;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class n7
implements Iterator<Map.Entry> {
    public int a = -1;
    public boolean b;
    public Iterator<Map.Entry> c;
    public final /* synthetic */ p7 d;

    public /* synthetic */ n7(p7 p72) {
        this.d = p72;
    }

    public final Iterator<Map.Entry> a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext() {
        int n2 = this.a;
        boolean bl = true;
        if (n2 + bl >= this.d.b.size()) {
            if (!this.d.c.isEmpty()) {
                if (this.a().hasNext()) {
                    return bl;
                }
                return false;
            }
            bl = false;
        }
        return bl;
    }

    public final Object next() {
        int n2;
        this.b = true;
        this.a = n2 = 1 + this.a;
        Object object = n2 < this.d.b.size() ? this.d.b.get(this.a) : this.a().next();
        return (Map.Entry)object;
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            p7.a(this.d);
            if (this.a < this.d.b.size()) {
                p7 p72 = this.d;
                int n2 = this.a;
                this.a = n2 - 1;
                p72.b(n2);
                return;
            }
            this.a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

