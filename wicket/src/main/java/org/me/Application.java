package org.me;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.me.page.Hello;

public class Application extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return Hello.class; // return default page
	}

}