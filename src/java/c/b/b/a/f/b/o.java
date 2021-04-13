/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.google.android.gms.measurement.internal.zzaq
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.Set
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzaq;
import java.util.Iterator;
import java.util.Set;

public final class o
implements Iterator<String> {
    public final Iterator<String> a;
    public final /* synthetic */ zzaq b;

    public o(zzaq zzaq2) {
        this.b = zzaq2;
        this.a = this.b.a.keySet().iterator();
    }

    public final String a() {
        return (String)this.a.next();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

