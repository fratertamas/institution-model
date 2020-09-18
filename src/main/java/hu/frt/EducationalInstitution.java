package hu.frt;

public class EducationalInstitution {
    private InstitutionData institutionData;
    private HeadOfInstitutionData headOfInstitutionData;

    public InstitutionData getInstitutionData() {
        return institutionData;
    }

    public void setInstitutionData(InstitutionData institutionData) {
        this.institutionData = institutionData;
    }

    public HeadOfInstitutionData getHeadOfInstitutionData() {
        return headOfInstitutionData;
    }

    public void setHeadOfInstitutionData(HeadOfInstitutionData headOfInstitutionData) {
        this.headOfInstitutionData = headOfInstitutionData;
    }

    @Override
    public String toString(){
        return "Education Institution{" +
                "Institution data: " + institutionData +
                "Head of institution data" + headOfInstitutionData +
                "}";
    }
}
