package com.hadeslee.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Project: JavaLibrary
 * FileName: CommaTest
 * Date: 2016-08-16
 * Time: 오후 2:21
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CommaTest {
    @Test
    public void testComma() throws Exception {
        Comma comma = new Comma();
        assertEquals(184551000, comma.NonComma());

        assertEquals("184,551,000", comma.Comma());
    }


}