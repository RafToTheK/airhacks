package com.airhacks.hellounit;

import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * @author airhacks.com
 */
public class SoccerTest {

    private Soccer cut;

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Before
    public void init() {
        this.cut = new Soccer();
    }

    @Test(expected = IllegalStateException.class)
    public void isExciting() {
        this.cut.isExciting();
    }

    @Test
    public void isExcitingWrongQuestion() {
        expected.expect(RuntimeException.class);
        expected.expectMessage(containsString("question"));
        this.cut.isExciting();
    }

}
