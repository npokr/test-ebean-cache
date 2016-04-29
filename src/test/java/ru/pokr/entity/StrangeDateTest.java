package ru.pokr.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by N on 29.04.2016.
 */
@Test
public class StrangeDateTest {

    public void testInsert() throws Exception {
        StrangeDate row = new StrangeDate();
        row.setCode("test");
        row.save();

        row = StrangeDate.finder.setLoadBeanCache(true).where().eq("code", "test").findUnique();
        assertNotNull(row);
        row = StrangeDate.finder.setLoadBeanCache(true).where().eq("code", "test").findUnique();
        assertNotNull(row);
    }

}