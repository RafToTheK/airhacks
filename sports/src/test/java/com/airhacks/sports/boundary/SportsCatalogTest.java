package com.airhacks.sports.boundary;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * @author airhacks.com
 */
public class SportsCatalogTest {

    private SportsCatalog cut;

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Before
    public void init() {
        this.cut = new SportsCatalog();
    }

    @Test
    public void allWithInvalidParameter() {
        expected.expect(IllegalArgumentException.class);
        this.cut.all(null);
    }

    @Test
    public void allWithValid() {
        String result = this.cut.all("duke");
        assertThat(result, containsString("chess"));
    }

}
