/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.y7
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.ListIterator
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.g6;
import c.b.b.a.e.d.y7;
import java.util.ListIterator;

public final class v7
implements ListIterator<String> {
    public final ListIterator<String> a;
    public final /* synthetic */ int b;
    public final /* synthetic */ y7 c;

    public v7(y7 y72, int n2) {
        this.c = y72;
        this.b = n2;
        this.a = this.c.a.listIterator(this.b);
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    public final int nextIndex() {
        return this.a.nextIndex();
    }

    public final int previousIndex() {
        return this.a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

