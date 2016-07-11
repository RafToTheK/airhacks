package com.airhacks;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class HelloTest {

    @Test
    public void asserts() {
        String input = "hello world";
        assertThat(input, containsString("world"));
    }

    @Test
    public void collections() {
        List<String> everything = Arrays.asList("hello", "world");
        assertThat(everything, hasItem("hello"));
    }

    @Test
    public void dukeCompatible() {
        String input = "duke";
        assertThat(input, new DukeMatcher("should contain duke"));
    }

    @Test
    public void dukeCompatibleFails() {
        String input = "nuke";
        assertThat(input, new DukeMatcher("should contain duke"));
    }

}
