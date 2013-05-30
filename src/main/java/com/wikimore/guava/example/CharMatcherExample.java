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

import com.google.common.base.CharMatcher;

/**
 * @author ted created at 2013-5-30
 */
public class CharMatcherExample {
    @Test
    public void charMatcherTest() {
        String v1 = CharMatcher.BREAKING_WHITESPACE.replaceFrom("1 21  212 12 ", "3");
        System.out.println(v1);
        String v2 = CharMatcher.BREAKING_WHITESPACE.removeFrom("1 21  212 12 ");
        System.out.println(v2);
        String v3 = CharMatcher.is('2').retainFrom("1 21  212 12 ");
        System.out.println(v3);
        String v4 = CharMatcher.anyOf("1234").retainFrom("1dfdsfasd5dd2fdf6df4dfdf2f3");
        System.out.println(v4);
        CharMatcher.BREAKING_WHITESPACE.matchesAnyOf("fdfdfasd ");
    }
}
