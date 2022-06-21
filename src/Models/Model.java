package Models;

import DomainObjects.Authenticable;
import java.util.ArrayList;
import java.util.List;

public class Model {

    private final UserModel userModel;
    private final JobModel jobModel;
    private final InterviewModel interviewModel;
    private final EvaluationModel evaluationModel;
    private final ContractModel contractModel;
    private final CompanyModel companyModel;
    private final AddressModel addressModel;
    private final SkillModel skillModel;
    private final SkillCategoryModel skillCategoryModel;
    private final JobSkillModel jobSkillModel;

    public Model() {
        jobModel = new JobModel();
        interviewModel = new InterviewModel();
        evaluationModel = new EvaluationModel();
        contractModel = new ContractModel();
        companyModel = new CompanyModel();
        addressModel = new AddressModel();
        userModel = new UserModel();
        skillModel = new SkillModel();
        skillCategoryModel = new SkillCategoryModel();
        jobSkillModel = new JobSkillModel();
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public JobModel getJobModel() {
        return jobModel;
    }

    public InterviewModel getInterviewModel() {
        return interviewModel;
    }

    public SkillModel getSkillModel() {
        return skillModel;
    }

    public EvaluationModel getEvaluationModel() {
        return evaluationModel;
    }

    public ContractModel getContractModel() {
        return contractModel;
    }

    public CompanyModel getCompanyModel() {
        return companyModel;
    }

    public AddressModel getAddressModel() {
        return addressModel;
    }

    public JobSkillModel getJobSkillModel() {
        return jobSkillModel;
    }

    public SkillCategoryModel getSkillCategoryModel() {
        return skillCategoryModel;
    }

    public Authenticable Auth(String un, String pwd) {
        //
        //
        //
        //

        List applicants = getUserModel().getApplicants();
        List admins = getUserModel().getAdmins();
        List companies = getCompanyModel().getCompanies();

        List allusers = new ArrayList<>();
        //
        allusers.addAll(admins);
        allusers.addAll(applicants);
        allusers.addAll(companies);

        for (Object obj : allusers) {
            Authenticable auth = (Authenticable) obj;

            //
            if (auth.getUserName().equals(un) & auth.getPassword().equals(pwd)) {
                //
                System.out.println("Found");
                return auth;
            }
        }

        //
        //
        //
        //
        return null;
    }
}
