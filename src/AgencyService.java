public interface AgencyService {

    void addAgency(Agency agency);

    Agency[] getAgencyById();

    Agency getAgencyById(long id);

    void updateAgency(long id,Agency newAgency);

    void deleteAgency(long id);

}