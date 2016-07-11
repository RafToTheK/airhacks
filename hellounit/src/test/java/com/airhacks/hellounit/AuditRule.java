package com.airhacks.hellounit;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author airhacks.com
 */
public class AuditRule implements TestRule {

    @Override
    public Statement apply(Statement stmnt, Description d) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("-- before: " + d.getMethodName());
                stmnt.evaluate();
                System.out.println("-- after: " + d.getMethodName());
            }
        };

    }

}
