package page.objects;

import pages.base.BasePage;

public class NewCarsPage extends BasePage {

    public KiaCarPage gotoKia() {
        click("kia_LINK");
        return new KiaCarPage();
    }

    public ToyotaCarPage gotoToyota() {
        click("toyota_LINK");
        return new ToyotaCarPage();
    }

    public BMWCarPage gotoBMW() {
        click("bmw_LINK");
        return new BMWCarPage();
    }

    public HyundaiCarPage gotoHyundai() {
        click("hyundai_LINK");
        return new HyundaiCarPage();
    }
}
