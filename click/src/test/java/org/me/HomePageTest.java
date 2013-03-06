package org.me;

import junit.framework.Assert;

public class HomePageTest extends BaseClickTestCase {

    public void testHomePage() {
        // Bootstrap the container   
        container.start();

        // Simulate a user requesting the page, HomePage.   
        HomePage page = (HomePage) container.testPage(HomePage.class);

        // Assert that HomePage presents the title field.  
        Assert.assertTrue(page.title.equals("Home"));

        container.stop();
    }
}
