package org.me;

import org.apache.click.Page;
/* To enable Menu, just uncomment
import org.apache.click.extras.control.Menu;
import org.apache.click.extras.control.MenuFactory;
 */

public class BorderPage extends Page {
/* To enable Menu, just uncomment
    private Menu rootMenu;

    public BorderPage() {
        MenuFactory menuFactory = new MenuFactory();
        rootMenu = menuFactory.getRootMenu();
        addControl(rootMenu);
    }
 */

    /**
     * @see #getTemplate()
     */
    @Override
    public String getTemplate() {
        return "border-template.htm";
    }
}
