/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.b7
 *  c.b.b.a.e.d.c5
 *  c.b.b.a.e.d.g6
 *  c.b.b.a.e.d.j4
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v4
 *  c.b.b.a.e.d.x4
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package c.b.b.a.e.d;

import c.a.b.a.a;
import c.b.b.a.e.d.a6;
import c.b.b.a.e.d.b7;
import c.b.b.a.e.d.c5;
import c.b.b.a.e.d.g6;
import c.b.b.a.e.d.j4;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v4;
import c.b.b.a.e.d.x4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class k4<MessageType extends k4<MessageType, BuilderType>, BuilderType extends j4<MessageType, BuilderType>>
implements u6 {
    public int zzb = 0;

    public static <T> void a(Iterable<T> iterable, List<? super T> list) {
        block11 : {
            block10 : {
                block9 : {
                    a6.a(iterable);
                    if (!(iterable instanceof g6)) break block9;
                    List list2 = ((g6)iterable).e();
                    g6 g62 = (g6)list;
                    int n7 = list.size();
                    for (Object object : list2) {
                        if (object == null) {
                            int n9 = g62.size();
                            StringBuilder stringBuilder = new StringBuilder(37);
                            stringBuilder.append("Element at index ");
                            stringBuilder.append(n9 - n7);
                            stringBuilder.append(" is null.");
                            String string = stringBuilder.toString();
                            int n10 = g62.size();
                            while (--n10 >= n7) {
                                g62.remove(n10);
                            }
                            throw new NullPointerException(string);
                        }
                        if (object instanceof x4) {
                            g62.a((x4)object);
                            continue;
                        }
                        g62.add((Object)((String)object));
                    }
                    break block10;
                }
                if (!(iterable instanceof b7)) {
                    if (list instanceof ArrayList && iterable instanceof Collection) {
                        ((ArrayList)list).ensureCapacity(list.size() + iterable.size());
                    }
                    int n11 = list.size();
                    for (Object object : iterable) {
                        if (object == null) {
                            int n12 = list.size();
                            StringBuilder stringBuilder = new StringBuilder(37);
                            stringBuilder.append("Element at index ");
                            stringBuilder.append(n12 - n11);
                            stringBuilder.append(" is null.");
                            String string = stringBuilder.toString();
                            int n13 = list.size();
                            while (--n13 >= n11) {
                                list.remove(n13);
                            }
                            throw new NullPointerException(string);
                        }
                        list.add(object);
                    }
                }
                break block11;
            }
            return;
        }
        list.addAll(iterable);
    }

    public final x4 b() {
        try {
            int n7 = this.c();
            byte[] arrby = new byte[n7];
            c5 c52 = c5.a((byte[])arrby);
            this.a(c52);
            c52.a();
            v4 v42 = new v4(arrby);
            return v42;
        }
        catch (IOException iOException) {
            String string = this.getClass().getName();
            throw new RuntimeException(a.a(new StringBuilder(72 + string.length()), "Serializing ", string, " to a ByteString threw an IOException (should never happen)."), (Throwable)iOException);
        }
    }

    public final byte[] f() {
        try {
            byte[] arrby = new byte[this.c()];
            c5 c52 = c5.a((byte[])arrby);
            this.a(c52);
            c52.a();
            return arrby;
        }
        catch (IOException iOException) {
            String string = this.getClass().getName();
            throw new RuntimeException(a.a(new StringBuilder(72 + string.length()), "Serializing ", string, " to a byte array threw an IOException (should never happen)."), (Throwable)iOException);
        }
    }
}

