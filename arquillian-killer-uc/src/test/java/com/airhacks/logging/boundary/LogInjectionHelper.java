package com.airhacks.logging.boundary;

import java.util.logging.Logger;
import javax.inject.Inject;

/**
 *
 * @author airhacks.com
 */
public class LogInjectionHelper {

    @Inject
    Logger LOG;

    public Logger getLOG() {
        return LOG;
    }

}
