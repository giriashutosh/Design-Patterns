package designPatterns.abstractFactory.components;

public class UiFactoryFactory {
    public static UIFactory getUiFactoryForPlatform(SupportedPlatforms platform){
        return switch (platform){
            case IOS -> new IOSFactory();
            case ANDROID -> new AndroidFactory();
        };
    }
}
