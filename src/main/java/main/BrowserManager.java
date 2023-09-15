package main;

import steps.HomePageSteps;
import steps.LoginSteps;
import steps.SearchResultsSteps;
import steps.SearchSideBarSteps;

public class BrowserManager extends BrowserManagerBase {

    public final HomePageSteps homePage = new HomePageSteps();

    public final SearchSideBarSteps searchSideBar = new SearchSideBarSteps();

    public final SearchResultsSteps searchResult = new SearchResultsSteps();

    public final LoginSteps login = new LoginSteps();
}
