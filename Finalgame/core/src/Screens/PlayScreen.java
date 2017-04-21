package Screens;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.utils.viewport.*;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.codezech.finalgame.Finalgame;

import Sceens.Hud;
public class PlayScreen implements Screen {
	private Finalgame game;
	Texture texture;
	private OrthographicCamera gamecam;
	private Viewport gameport;
	private Hud hud; 
	
	private TmxMapLoader loader;
	private TiledMap map;
	public PlayScreen(Finalgame game){
		hud=new Hud(game.sb);
		this.game=game;
		gamecam=new OrthographicCamera();
		gameport=new StretchViewport(Finalgame.width,Finalgame.height,gamecam);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		game.sb.setProjectionMatrix(hud.stage.getCamera().combined);
		Hud.stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		gameport.update(width, height);
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
