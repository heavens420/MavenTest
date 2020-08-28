package com.zlx.GOF.methodfacorybase;

/**
 * @Author Zhao LongLong
 * @Date 2020/8/26
 * @Version 1.0
 */
public class Product2Factory implements ProductFactory{

    @Override
    public Product createProduct() {
        return new Product2();
    }
}
