/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a.g.a;

import a.g.a.d;
import a.g.a.e;

public final class a
implements e {
    public final String a;
    public final Object[] b;

    public a(String string) {
        this.a = string;
        this.b = null;
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public void a(d d6) {
        Object[] arrobject = this.b;
        if (arrobject == null) {
            return;
        }
        int n4 = arrobject.length;
        int n10 = 0;
        while (n10 < n4) {
            Object object;
            block20 : {
                long l8;
                block15 : {
                    block19 : {
                        int n11;
                        block17 : {
                            block18 : {
                                block16 : {
                                    block14 : {
                                        block13 : {
                                            double d10;
                                            block12 : {
                                                block11 : {
                                                    object = arrobject[n10];
                                                    ++n10;
                                                    if (object == null) {
                                                        d6.bindNull(n10);
                                                        continue;
                                                    }
                                                    if (object instanceof byte[]) {
                                                        d6.bindBlob(n10, (byte[])object);
                                                        continue;
                                                    }
                                                    if (!(object instanceof Float)) break block11;
                                                    d10 = ((Float)object).floatValue();
                                                    break block12;
                                                }
                                                if (!(object instanceof Double)) break block13;
                                                d10 = (Double)object;
                                            }
                                            d6.bindDouble(n10, d10);
                                            continue;
                                        }
                                        if (!(object instanceof Long)) break block14;
                                        l8 = (Long)object;
                                        break block15;
                                    }
                                    if (!(object instanceof Integer)) break block16;
                                    n11 = (Integer)object;
                                    break block17;
                                }
                                if (!(object instanceof Short)) break block18;
                                n11 = ((Short)object).shortValue();
                                break block17;
                            }
                            if (!(object instanceof Byte)) break block19;
                            n11 = ((Byte)object).byteValue();
                        }
                        l8 = n11;
                        break block15;
                    }
                    if (object instanceof String) {
                        d6.bindString(n10, (String)object);
                        continue;
                    }
                    if (!(object instanceof Boolean)) break block20;
                    l8 = (Boolean)object != false ? 1L : 0L;
                }
                d6.bindLong(n10, l8);
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot bind ");
            stringBuilder.append(object);
            stringBuilder.append(" at index ");
            stringBuilder.append(n10);
            stringBuilder.append(" Supported types: null, byte[], float, double, long, int, short, byte,");
            stringBuilder.append(" string");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

