package com.airhacks.logging.boundary;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author airhacks.com
 */
public class LogManager {

    @Produces
    public Logger expose(InjectionPoint ip) {
        Class<?> clazz = ip.getMember().getDeclaringClass();
        return Logger.getLogger(clazz.getName());
    }

}
