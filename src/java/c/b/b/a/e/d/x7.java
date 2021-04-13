/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.y7
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.g6;
import c.b.b.a.e.d.y7;
import java.util.Iterator;

public final class x7
implements Iterator<String> {
    public final Iterator<String> a;
    public final /* synthetic */ y7 b;

    public x7(y7 y72) {
        this.b = y72;
        this.a = this.b.a.iterator();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

