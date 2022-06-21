package Controllers.PopUps;

import Controllers.SubView.SubViewController;
import DomainObjects.Contract;
import Models.Model;
import PopUps.AddJobContractSubView;
import ViewsBase.SubView;
import java.time.LocalDate;

public class JobContractController extends SubViewController {

    final AddJobContractSubView v;

    public JobContractController(SubView subView, Model model) {
        super(subView, model);
        v = (AddJobContractSubView) subView;

    }

    @Override
    public void StartController() {
        v.showView();
    }

    @Override
    public void RegisterEvents() {
        v.getSubmitButton().setOnAction(e -> {

            if (v.getNegotiatedTermsTextArea().getText().isEmpty()) {
            } else {
                //-------------------------------------------------------------//
                //----------insert job contract data to database here----------//
                //-------------------------------------------------------------//

                String startdate = v.getStartDate().getValue().toString();
                String enddate = v.getEndDate().getValue().toString();
                String negotiatedterms = v.getNegotiatedTermsTextArea().getText();
                Contract contract = new Contract.ContractBuilder().StartDate(startdate).EndDate(enddate).Terms(negotiatedterms).build();
                model.getContractModel().InsertContract(contract);
                //-------------------------------------------------------------//
            }

        });
        v.getResetButton().setOnAction(e -> {
            //
            //reset all fields here
            //
            v.getNegotiatedTermsTextArea().setText("");
            v.getStartDate().setValue(LocalDate.now());
            v.getEndDate().setValue(LocalDate.now());
            //
            //
        });
    }

}
