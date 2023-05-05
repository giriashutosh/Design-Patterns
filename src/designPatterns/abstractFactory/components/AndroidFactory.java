package designPatterns.abstractFactory.components;

import designPatterns.abstractFactory.components.Buttons.AndroidButton;
import designPatterns.abstractFactory.components.Buttons.Button;
import designPatterns.abstractFactory.components.Dropdown.AndroidDropdown;
import designPatterns.abstractFactory.components.Dropdown.Dropdown;
import designPatterns.abstractFactory.components.Menu.AndroidMenu;
import designPatterns.abstractFactory.components.Menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return null;
    }

    @Override
    public AndroidMenu createMenu() {
        return null;
    }

    @Override
    public AndroidDropdown createDropdown() {
        return null;
    }
}
