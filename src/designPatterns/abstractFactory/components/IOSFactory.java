package designPatterns.abstractFactory.components;

import designPatterns.abstractFactory.components.Buttons.Button;
import designPatterns.abstractFactory.components.Buttons.IOSButton;
import designPatterns.abstractFactory.components.Dropdown.Dropdown;
import designPatterns.abstractFactory.components.Dropdown.IOSDropdown;
import designPatterns.abstractFactory.components.Menu.IOSMenu;
import designPatterns.abstractFactory.components.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        return null;
    }

    @Override
    public IOSMenu createMenu() {
        return null;
    }

    @Override
    public IOSDropdown createDropdown() {
        return null;
    }
}
