package designPatterns.abstractFactory.components;

public class Flutter {
    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms){
        this.supportedPlatforms = supportedPlatforms;
    }
    public void setTheme(){

    }

    public void setRefreshRate(){

    }

    public UIFactory createFactory(){
        return  UiFactoryFactory.getUiFactoryForPlatform(supportedPlatforms);
    }
}
