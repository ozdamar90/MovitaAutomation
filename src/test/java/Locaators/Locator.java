package Locaators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Locator {
    String url = "https://movita.com.tr/";
    By llogo = By.xpath("//a[@class='standard-logo']");
    By lMobilVasita = By.xpath("//div[@class='tp-mask-wrap']//div[text()='Mobil Vasıta İzleme Takip Sistemi']");
    String str = "Mobil Vasıta İzleme Takip Sistemi";
    By lEnterButton = By.xpath("//button[@id='dropdownMenuButton']/parent::div");
    By lEnglishLang = By.xpath("(//button[@id='dropdownMenuButton']/parent::div//a)[1]");
    By lTurkishLang = By.xpath("(//button[@id='dropdownMenuButton']/parent::div//a)[2]");
    By lHeaderMenuLink = By.xpath("//ul[@class='menu-container']//div");
    By lAnaSayfa = By.xpath("//ul[@class='menu-container']//div[text()='Ana Sayfa']");
    By lSubMenuKurumsal=By.xpath("(//ul[@class='sub-menu-container'])[1]//div");

    WebElement homePageMenu(String text);


    String TOP_MENU = "//*[@id='header-wrap']//a[contains(.,'%s')]";
    By lLanguageOptionButton = By.xpath("//div[@class='dropdown dropdown-langs']//button");
    By lTextOfMobilVasitaIzlemeTakipSistemi = By.xpath("//div[@class='tp-mask-wrap']//div[contains(text(),'Mobil')]");
    By lLoginFormUsername = By.id("username");
    By lLoginFormPassword = By.id("password");
    By lLoginFormSubmitButton = By.xpath("//form//button[@type='submit']");
    By lLoginFormUsernameWarningMessage = By.xpath("//div[contains(text(),'Lütfen kullanıcı adı girin!')]");
    By lLoginFormPasswordWarningMessage = By.xpath("//div[contains(text(),'Lütfen şifre girin!')]");
    By lLoginFormInvalidUsernamePasswordWarningMessage = By.xpath("//div[@class='toast-message']");
    By lDemoFileDropdownMenuLogout = By.xpath("//a[contains(.,' Çıkış Yap')]");
    By lDemoFileDropdownMenu = By.xpath("//a[contains(.,'Demo Filo (129)')]");



}
