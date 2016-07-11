package com.airhacks;

import org.hamcrest.CustomMatcher;

/**
 *
 * @author airhacks.com
 */
public class DukeMatcher extends CustomMatcher {

    public DukeMatcher(String description) {
        super(description);
    }

    @Override
    public boolean matches(Object item) {
        if (item instanceof String) {
            String input = (String) item;
            return input.contains("duke");
        } else {
            return false;
        }

    }

}
