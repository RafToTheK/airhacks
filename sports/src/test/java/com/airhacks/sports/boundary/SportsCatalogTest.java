package com.airhacks.sports.boundary;

import com.airhacks.legacy.control.UglySoap;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        this.cut.us = mock(UglySoap.class);
    }

    @Test
    public void backendReturnsSoccer() {
        expected.expect(IllegalStateException.class);
        when(this.cut.us.legacyGame()).thenReturn("soccer");
        this.cut.all("-does not matter");

    }

    @Test
    public void allWithInvalidParameter() {
        expected.expect(IllegalArgumentException.class);
        this.cut.all(null);
    }

    @Test
    public void allWithValid() {
        when(this.cut.us.legacyGame()).thenReturn("not-soccer");
        String result = this.cut.all("duke");
        assertThat(result, containsString("chess"));
    }

}
