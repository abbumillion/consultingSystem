package Factories;

import Tabs.Home.AdminHomeTab;
import Tabs.Home.ApplicantHomeTab;
import Tabs.Home.CompanyHomeTab;
import Tabs.HelpTab;
import Tabs.Listviews.ListViewTab;
import Tabs.Search.SearchTab;
import Tabs.SettingsTab;
import Tabs.StatisticsTab;
import ViewsBase.SubView;
import ViewsBase.TabType;

public class TabFactory {

    //tab producer factory
    static SubView tab;

    public static SubView getTab(TabType tabType) {

        switch (tabType) {

            case ADMINHOMETAB:
                tab = new AdminHomeTab();
                break;
            case COMPANYHOMETAB:
                tab = new CompanyHomeTab();
                break;
            case APPLICANTHOMETAB:
                tab = new ApplicantHomeTab();
                break;
            case LISTVIEWTAB:
                tab = new ListViewTab();
                break;
            case SETTINGSTAB:
                tab = new SettingsTab();
                break;
            case MYACCOUNTTAB:
              //  tab = new MyAccountTab();
                break;
            case STATISTICSTAB:
                tab = new StatisticsTab();
                break;
            case HELPTAB:
                tab = new HelpTab();
                break;
            case SEARCHTAB:
                tab=new SearchTab();
                break;

        }

        tab.getReady();
        return tab;
    }

}
