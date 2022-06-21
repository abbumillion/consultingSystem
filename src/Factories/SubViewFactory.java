package Factories;

import PopUps.AddInterviewSubView;
import PopUps.CompanyDetailSubView;
import PopUps.AddEvaluationSubView;
import PopUps.AddJobContractSubView;
import PopUps.AddJobOrderSubView;
import PopUps.AddSkillCategorySubView;
import PopUps.AddSkillSubView;
import ViewsBase.PopUpType;
import ViewsBase.SubView;

public class SubViewFactory {

    static SubView v;

    public static SubView getSubView(PopUpType navType) {
        switch (navType) {
            case COMPANYINFONAV:
                v = new CompanyDetailSubView();
                break;
            case ADDJOBORDERSUBVIEW:
                v = new AddJobOrderSubView();
                break;
            case ADDINTERVIEWSUBVIEW:
                v = new AddInterviewSubView();
                break;
            case ADDEVALUATIONSUBVIEW:
                v = new AddEvaluationSubView();
                break;
            case ADDJOBCONTRACTSUBVIEW:
                v = new AddJobContractSubView();
                break;
            case ADDNEWSKILLSUBVIEW:
                v = new AddSkillSubView();
                break;
            case ADDSKILLCATEGORYSUBVIEW:
                v = new AddSkillCategorySubView();
                break;
            default:
                v = null;
                break;
        }

        v.getReady();
        return v;
    }

}
