package com.codezech.finalgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.codezech.finalgame.Finalgame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Finalgame(), config);
		config.width=Finalgame.width;
		config.height=Finalgame.height;
	}
}
