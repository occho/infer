/*
* Copyright (c) 2013- Facebook.
* All rights reserved.
*/

package java.util.zip;

import com.facebook.infer.models.InferUndefined;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DeflaterOutputStream extends FilterOutputStream {

    public DeflaterOutputStream(OutputStream out, Deflater def, int size) {
        super(out);
    }

    public DeflaterOutputStream(OutputStream out, Deflater def) {
        super(out);
    }

    boolean usesDefaultDeflater;

    public DeflaterOutputStream(OutputStream out) {
        super(out);
    }

    public void close() throws IOException {
        super.close();
    }

    public void deflate() throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void finish() throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void flush() throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void write(byte b[], int off, int len) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void write(byte b[]) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void write(int b) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

}
