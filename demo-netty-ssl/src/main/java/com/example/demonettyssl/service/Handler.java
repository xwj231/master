package com.example.demonettyssl.service;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.concurrent.TimeUnit;

/**
 * @author xuj231
 * @description
 * @date 2019/11/29 17:28
 */
public class Handler extends SimpleChannelInboundHandler<String> {

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        Channel incoming = ctx.channel();
        ChannelFuture channelFuture = ctx.writeAndFlush("[SERVER] - " + incoming.remoteAddress() + " 加入\n");
        System.out.println("连接成功消息发送到客户端结果："+channelFuture.isSuccess());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String s) throws Exception {
        Channel incoming = ctx.channel();
        System.out.println("收到消息" + s);
        TimeUnit.SECONDS.sleep(2);
        ChannelFuture result = incoming.writeAndFlush("server 发送\n");
        System.out.println("发送结果:"+result.isSuccess());
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel incoming = ctx.channel();
        System.out.println(incoming.remoteAddress() + "在线");
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        Channel incoming = ctx.channel();
        ctx.writeAndFlush("[SERVER] - " + incoming.remoteAddress() + " 离开\n");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel incoming = ctx.channel();
        System.out.println(incoming.remoteAddress() + "掉线");
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        Channel incoming = ctx.channel();
        System.out.println(incoming.remoteAddress() + "异常");
        // 当出现异常就关闭连接
        cause.printStackTrace();
        ctx.close();
    }
}