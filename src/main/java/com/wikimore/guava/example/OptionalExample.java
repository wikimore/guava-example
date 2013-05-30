/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wikimore.guava.example;

import org.junit.Test;

import com.google.common.base.Optional;

/**
 * @author ted created at 2013-5-30
 * @version 1.0
 */
public class OptionalExample {

    @Test
    public void optionalTest() {
        // 加载一个不为null的对象
        Optional<Long> ol = Optional.of(5L);
        long param = 11;
        // 14.0.1 源代码给我比较大的困惑，感觉这个方法就是check param 是否为null，如果为null产生异常
        // 不是null 返回ol内部装载的值，感觉没有实际作用
        ol.or(param);
        // 获得值
        ol.get();
        Optional<Long> ol2 = Optional.fromNullable(null);// 加载一个为null的对象
        ol2.or(param);
        // 当加载的对象为null，获取时就会报错，从而避免了NullPointException
        ol2.get();
    }
}
