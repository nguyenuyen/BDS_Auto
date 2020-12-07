import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyPage {
    WebDriver webDriver;

    @FindBy(xpath = "")
    WebElement type;

    @FindBy(xpath = "")
    WebElement isBuilding;

    @FindBy(xpath = "")
    WebElement buyTime;

    @FindBy(xpath = "")
    WebElement title;

    @FindBy(xpath = "")
    WebElement name;

    @FindBy(xpath = "")
    WebElement roomNumber;

    @FindBy(xpath = "")
    WebElement currentLocation;

    @FindBy(xpath = "")
    WebElement bedRoomMin;

    @FindBy(xpath = "")
    WebElement bedRoomMax;

    @FindBy(xpath = "")
    WebElement bathRoomNumber;

    @FindBy(xpath = "")
    WebElement pricePropertyMin;

    @FindBy(xpath = "")
    WebElement pricePropertyMax;

    @FindBy(xpath = "")
    WebElement localCurrencyMin;

    @FindBy(xpath = "")
    WebElement localCurrencyMax;

    @FindBy(xpath = "")
    WebElement profit;

    @FindBy(xpath = "")
    WebElement propertyType;

    @FindBy(xpath = "")
    WebElement traffic;

    @FindBy(xpath = "")
    WebElement floorNumber;

    @FindBy(xpath = "")
    WebElement totalProperty;

    @FindBy(xpath = "")
    WebElement yearCompletionContruction;

    @FindBy(xpath = "")
    WebElement planFloorName;

    @FindBy(xpath = "")
    WebElement planFloorDescription;

    @FindBy(xpath = "")
    WebElement imageFloor;

    @FindBy(xpath = "")
    WebElement country;

    @FindBy(xpath = "")
    WebElement city;

    @FindBy(xpath = "")
    WebElement zipcode;

    @FindBy(xpath = "")
    WebElement nearestStation;

    @FindBy(xpath = "")
    WebElement privateMoney;

    @FindBy(xpath = "")
    WebElement moveTime;

    @FindBy(xpath = "")
    WebElement lodgingOperation;

    @FindBy(xpath = "")
    WebElement purpose;

    @FindBy(xpath = "")
    WebElement area;

    @FindBy(xpath = "")
    WebElement managementFee;

    @FindBy(xpath = "")
    WebElement repairReserveFund;

    @FindBy(xpath = "")
    WebElement parkingFee;

    @FindBy(xpath = "")
    WebElement ownerShip;

    @FindBy(xpath = "")
    WebElement buildingStructure;

    @FindBy(xpath = "")
    WebElement companyInformation;

    @FindBy(xpath = "")
    WebElement seller;

    @FindBy(xpath = "")
    WebElement moveIn;

    @FindBy(xpath = "")
    WebElement sellerInformation;

    @FindBy(xpath = "")
    WebElement sellerLogo;

    @FindBy(xpath = "")
    WebElement streetAddress;

    @FindBy(xpath = "")
    WebElement btnNext;

    @FindBy(xpath = "")
    WebElement btnBack;

    @FindBy(xpath = "")
    WebElement btnDraft;

    @FindBy(xpath = "")
    WebElement btnPreview;

    @FindBy(xpath = "")
    WebElement imageList;

    @FindBy(xpath = "")
    WebElement propertyDescription;

    @FindBy(xpath = "")
    WebElement imageDesign;

    @FindBy(xpath = "")
    WebElement propertyDesign;

    @FindBy(xpath = "")
    WebElement imageModelRoom;

    @FindBy(xpath = "")
    WebElement propertyModelRoom;

    @FindBy(xpath = "")
    WebElement imageContactInfo;

    @FindBy(xpath = "")
    WebElement propertyContactInfo;

    public PropertyPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }


}
