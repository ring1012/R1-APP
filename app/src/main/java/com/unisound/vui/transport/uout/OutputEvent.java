package com.unisound.vui.transport.uout;

public class OutputEvent<T> {

    // 实例字段
    private T data; // 泛型数据
    private int type; // 类型标识

    /**
     * 构造函数 1：仅初始化类型
     *
     * @param type 类型标识
     */
    public OutputEvent(int type) {
        this.type = type;
    }

    /**
     * 构造函数 2：初始化类型和数据
     *
     * @param type 类型标识
     * @param data 泛型数据
     */
    public OutputEvent(int type, T data) {
        this.type = type;
        this.data = data;
    }

    /**
     * 获取数据
     *
     * @return 泛型数据
     */
    public T getData() {
        return data;
    }

    /**
     * 设置数据
     *
     * @param data 泛型数据
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * 获取类型标识
     *
     * @return 类型标识
     */
    public int getType() {
        return type;
    }

    /**
     * 设置类型标识
     *
     * @param type 类型标识
     */
    public void setType(int type) {
        this.type = type;
    }
}