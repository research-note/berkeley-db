/*
 * Automatically generated by jrpcgen 0.95.1 on 8/2/05 1:49 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package com.sleepycat.db.rpcserver;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class __db_key_range_msg implements XdrAble {
    public int dbpcl_id;
    public int txnpcl_id;
    public int keydlen;
    public int keydoff;
    public int keyulen;
    public int keyflags;
    public byte [] keydata;
    public int flags;

    public __db_key_range_msg() {
    }

    public __db_key_range_msg(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(dbpcl_id);
        xdr.xdrEncodeInt(txnpcl_id);
        xdr.xdrEncodeInt(keydlen);
        xdr.xdrEncodeInt(keydoff);
        xdr.xdrEncodeInt(keyulen);
        xdr.xdrEncodeInt(keyflags);
        xdr.xdrEncodeDynamicOpaque(keydata);
        xdr.xdrEncodeInt(flags);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        dbpcl_id = xdr.xdrDecodeInt();
        txnpcl_id = xdr.xdrDecodeInt();
        keydlen = xdr.xdrDecodeInt();
        keydoff = xdr.xdrDecodeInt();
        keyulen = xdr.xdrDecodeInt();
        keyflags = xdr.xdrDecodeInt();
        keydata = xdr.xdrDecodeDynamicOpaque();
        flags = xdr.xdrDecodeInt();
    }

}
// End of __db_key_range_msg.java
