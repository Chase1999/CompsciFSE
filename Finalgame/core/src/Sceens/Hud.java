package Sceens;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.*;
import com.codezech.finalgame.Finalgame;

public class Hud {
	public static Stage stage;
	private Viewport Viewport;
	private Integer worldtimer;
	@SuppressWarnings("unused")
	private float timecount;
	private Integer score;
	
	Label countdownlabel;
	Label scorelabel;
	Label timelabel;
	Label levellabel;
	Label worldlabel;
	Label playerlabel;
	
	public Hud(SpriteBatch sb){
		worldtimer=300;
		timecount=0;
		score=0;
		Viewport = new FitViewport(Finalgame.width,Finalgame.height, new OrthographicCamera());
		stage=new Stage(Viewport, sb);
		Table table = new Table();
		table.top();
		table.setFillParent(true);
		countdownlabel=new Label(String.format("%03d",worldtimer ),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		scorelabel=new Label(String.format("%06d",score ),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		timelabel=new Label("TIME",new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		levellabel=new Label("1-1",new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		worldlabel=new Label("WORLD",new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		playerlabel=new Label("MARIO",new Label.LabelStyle(new BitmapFont(), Color.WHITE));

		
		table.add(playerlabel).expandX().padTop(10);
		table.add(worldlabel).expandX().padTop(10);
		table.add(timelabel).expandX().padTop(10);
		table.row();
		table.add(scorelabel).expandX().padTop(10);
		table.add(levellabel).expandX().padTop(10);
		table.add(countdownlabel).expandX().padTop(10);
		
		stage.addActor(table);
	}
}
