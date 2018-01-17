package game.states;

import game.main.Handler;
import game.managers.GuiManager;
import org.lwjgl.input.Keyboard;

public class LoseState extends State {

    private GuiManager guiManager;

    public LoseState(Handler handler) {
        super(handler);
        guiManager = new GuiManager(handler);
    }

    public void create() {
        guiManager.addGuiObj(handler.getAssetManager().loseGUI);
    }

    public void update() {
        guiManager.update();
        if(Keyboard.next() && Keyboard.isKeyDown(Keyboard.KEY_RETURN))
            handler.getStateManager().setState(0);
    }

}