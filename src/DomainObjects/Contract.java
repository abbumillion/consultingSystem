package DomainObjects;

public class Contract {

    private int id;
    private String StartDate, EndDate, NegotiatedTerms;
    private Boolean Isvalid;
    private Evaluation evaluation;

    public Contract(ContractBuilder contractBuilder) {
    }

    public static class ContractBuilder {

        private int id;
        private String StartDate, EndDate, NegotiatedTerms;
        private Boolean Isvalid;
        private Evaluation evaluation;

        public Contract build() {
            return new Contract(this);
        }

        public ContractBuilder id(int value) {
            this.id = value;
            return this;
        }

        public ContractBuilder StartDate(String value) {
            this.StartDate = value;
            return this;
        }

        public ContractBuilder EndDate(String value) {
            this.EndDate = value;
            return this;
        }

        public ContractBuilder Terms(String value) {
            this.NegotiatedTerms = value;
            return this;
        }

        public ContractBuilder IsValid(boolean value) {
            this.Isvalid = value;
            return this;
        }

        public ContractBuilder Evaluation(Evaluation value) {
            this.evaluation = value;
            return this;
        }
    }

    public int getId() {
        return id;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public String getNegotiatedTerms() {
        return NegotiatedTerms;
    }

    public Boolean getIsvalid() {
        return Isvalid;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }
    
    

}
