package com.wf.gts.common.serizlize;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public interface NettyTransferSerialize {

    void serialize(OutputStream output, Object object) throws IOException;

    Object deserialize(InputStream input) throws IOException;
}
