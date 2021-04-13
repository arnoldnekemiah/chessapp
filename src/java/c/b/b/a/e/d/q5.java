/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.c6
 *  c.b.b.a.e.d.c7
 *  c.b.b.a.e.d.f7
 *  c.b.b.a.e.d.g5
 *  c.b.b.a.e.d.j4
 *  c.b.b.a.e.d.n4
 *  c.b.b.a.e.d.r7
 *  c.b.b.a.e.d.u6
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.c6;
import c.b.b.a.e.d.c7;
import c.b.b.a.e.d.f7;
import c.b.b.a.e.d.g5;
import c.b.b.a.e.d.j4;
import c.b.b.a.e.d.n4;
import c.b.b.a.e.d.r7;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import java.io.IOException;

public class q5<MessageType extends t5<MessageType, BuilderType>, BuilderType extends q5<MessageType, BuilderType>>
extends j4<MessageType, BuilderType> {
    public final MessageType a;
    public MessageType b;
    public boolean c;

    public q5(MessageType MessageType) {
        this.a = MessageType;
        this.b = (t5)((t5)MessageType).a(4, null, null);
        this.c = false;
    }

    public final BuilderType a(MessageType MessageType) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        MessageType MessageType2 = this.b;
        c7.c.a(MessageType2.getClass()).b(MessageType2, MessageType);
        return (BuilderType)((Object)this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final BuilderType a(byte[] arrby, int n7, int n9, g5 g52) {
        if (this.c) {
            this.g();
            this.c = false;
        }
        try {
            c7.c.a(this.b.getClass()).a(this.b, arrby, 0, n9, new n4(g52));
        }
        catch (IOException iOException) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", (Throwable)iOException);
        }
        catch (c6 c62) {
            throw c62;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw c6.a();
        }
        return (BuilderType)((Object)this);
    }

    public final MessageType f() {
        MessageType MessageType = this.i();
        boolean bl = Boolean.TRUE;
        byte by = 1;
        byte by2 = (Byte)((t5)MessageType).a(by, null, null);
        if (by2 != by) {
            if (by2 == 0) {
                by = 0;
            } else {
                byte by3 = c7.c.a(MessageType.getClass()).a(MessageType);
                if (bl) {
                    Object var6_6 = by != by3 ? null : MessageType;
                    ((t5)MessageType).a(2, var6_6, null);
                }
                by = by3;
            }
        }
        if (by != 0) {
            return MessageType;
        }
        throw new r7();
    }

    public void g() {
        t5 t52 = (t5)((t5)this.b).a(4, null, null);
        MessageType MessageType = this.b;
        c7.c.a(t52.getClass()).b((Object)t52, MessageType);
        this.b = t52;
    }

    public final BuilderType h() {
        q5 q52 = (q5)((Object)((t5)this.a).a(5, null, null));
        q52.a(this.i());
        return (BuilderType)((Object)q52);
    }

    public MessageType i() {
        if (this.c) {
            return this.b;
        }
        MessageType MessageType = this.b;
        c7.c.a(MessageType.getClass()).d(MessageType);
        this.c = true;
        return this.b;
    }
}

