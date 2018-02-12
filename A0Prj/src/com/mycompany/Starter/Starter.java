package com.mycompany.Starter;

import static com.codename1.ui.CN.*;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.Label;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.io.Log;
import com.codename1.ui.Toolbar;
import java.io.IOException;
import com.codename1.ui.layouts.BoxLayout;

@SuppressWarnings("unused")
public class Starter {

	private Form current;
	private Resources theme;

	public void init(Object context) {
		theme = UIManager.initFirstTheme("/theme");

		// Enable Toolbar on all Forms by default
		Toolbar.setGlobalToolbar(true);

		// Pro only feature, uncomment if you have a pro subscription
		Log.bindCrashProtection(true);
	}

	public void start() {
		if (current != null) { 
			current.show();
			return;
		}
		Game g = new Game();
	}

	public void stop() {
		current = getCurrentForm();
		if (current instanceof Dialog) {
			((Dialog) current).dispose();
			current = getCurrentForm();
		}
	}

	public void destroy() {
	}

}
