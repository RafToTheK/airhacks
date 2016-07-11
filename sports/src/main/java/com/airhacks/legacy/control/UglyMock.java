package com.airhacks.legacy.control;

import javax.enterprise.inject.Specializes;

/**
 *
 * This class MUST NOT reside in the same project
 *
 * @author airhacks.com
 */
@Specializes
public class UglyMock extends UglySoap {

    @Override
    public String legacyGame() {
        return "whatever";
    }

}
