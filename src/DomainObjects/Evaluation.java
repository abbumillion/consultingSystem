package DomainObjects;

public class Evaluation {

    private int evaluationId;
    private String evaluationDate, Remarks;
    private Interview interview;

    public Evaluation(EvaluationBuilder evaluationBuilder) {
        this.Remarks = evaluationBuilder.Remarks;
        this.evaluationDate = evaluationBuilder.evaluationDate;
        this.evaluationId = evaluationBuilder.evaluationId;
        this.interview = evaluationBuilder.interview;
    }

    public static class EvaluationBuilder {

        private int evaluationId;
        private String evaluationDate, Remarks;
        private Interview interview;

        public Evaluation build() {
            return new Evaluation(this);
        }

        public EvaluationBuilder id(int value) {
            this.evaluationId = value;
            return this;
        }

        public EvaluationBuilder DateAndTime(String value) {
            this.evaluationDate = value;
            return this;
        }

        public EvaluationBuilder Remarks(String value) {
            this.Remarks = value;
            return this;
        }

        public EvaluationBuilder Interview(Interview value) {
            this.interview = value;
            return this;
        }
    }

    public int getEvaluationId() {
        return evaluationId;
    }

    public String getEvaluationDate() {
        return evaluationDate;
    }

    public String getRemarks() {
        return Remarks;
    }

    public Interview getInterview() {
        return interview;
    }

}
