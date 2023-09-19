package main;

import steps.*;

public class BrowserManager extends BrowserManagerBase {

    public final HomePageSteps homePage = new HomePageSteps();

    public final SearchSideBarSteps searchSideBar = new SearchSideBarSteps();

    public final SearchResultsSteps searchResult = new SearchResultsSteps();

    public final LoginSteps login = new LoginSteps();

    public final DetailsSteps detailsPage = new DetailsSteps();
}
