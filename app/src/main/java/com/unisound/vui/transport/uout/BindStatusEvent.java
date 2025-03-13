package com.unisound.vui.transport.uout;

public class BindStatusEvent extends OutputEvent<Boolean> {

    /**
     * 构造函数
     *
     * @param isBound 表示绑定状态的布尔值
     */
    public BindStatusEvent(Boolean isBound) {
        super(1, isBound); // 调用父类 OutputEvent 的构造函数
    }
}