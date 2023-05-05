package designPatterns.abstractFactory.components;

import designPatterns.abstractFactory.components.Buttons.Button;

public class client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory = flutter.createFactory();
        Button button = uiFactory.createButton();
        button.changeSize();
    }
}
