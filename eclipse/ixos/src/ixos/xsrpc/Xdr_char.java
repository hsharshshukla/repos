/*
 * Decompiled with CFR 0_123.
 */
package ixos.xsrpc;

import ixos.xsrpc.Xdr;
import ixos.xsrpc.XdrData;
import ixos.xsrpc.XdrProc;

class Xdr_char
extends XdrProc {
    Xdr_char() {
    }

    @Override
    public boolean xdrproc(Xdr xdr, XdrData xdrData) {
        return xdr.xdr_char(xdrData);
    }
}

