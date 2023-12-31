package com.wit.xzy;

import com.wit.xzy.api.HelloObject;
import com.wit.xzy.api.HelloService;
import com.wit.xzy.socket.client.SocketClient;

public class SocketTestClient {
    public static void main(String[] args) {
        SocketClient client = new SocketClient("127.0.0.1", 9000);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }
}
