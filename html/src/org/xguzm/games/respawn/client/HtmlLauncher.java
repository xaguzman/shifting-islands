package org.xguzm.games.respawn.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import org.xguzm.games.respawn.ShiftingIslands;

public class HtmlLauncher extends GwtApplication {

	ShiftingIslands game;
	
	@Override
	public GwtApplicationConfiguration getConfig() {
		return new GwtApplicationConfiguration(800, 480);
	}
	
	@Override
	public ApplicationListener getApplicationListener() {
		if ( game == null)
			game = new ShiftingIslands();
		return game;
	}
}