package com.example.protocol;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

public abstract class AbstractMinaHandler extends IoHandlerAdapter {

    private final Logger log = LoggerFactory.getLogger(AbstractMinaHandler.class);

    @Override
    public void sessionCreated(IoSession session) {
        InetSocketAddress address = (InetSocketAddress)session.getRemoteAddress();
        log.info("remote hostName=" + address.getHostName() + " address=" + address.getAddress() + " port=" + address.getPort()  );
    }
}
