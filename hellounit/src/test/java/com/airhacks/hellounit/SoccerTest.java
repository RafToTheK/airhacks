package com.airhacks.hellounit;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class SoccerTest {

    private Soccer cut;

    @Before
    public void init() {
        this.cut = new Soccer();
    }

    @Test(expected = IllegalStateException.class)
    public void isExciting() {
        this.cut.isExciting();
    }

}
