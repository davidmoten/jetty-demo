package org.me;

import junit.framework.TestCase;
import org.apache.click.MockContainer;

public abstract class BaseClickTestCase extends TestCase {

    protected MockContainer container;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // initialize container
        // Specify the project web directory. Thanks to maven, this place is known.
        container = new MockContainer("src/main/webapp");
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        container = null;
    }
} 

