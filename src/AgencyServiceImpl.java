public class AgencyServiceImpl implements AgencyService {

    Agency[] agencies = new Agency[15];
    int count = 0;

    @Override
    public void addAgency(Agency agency) {
        agencies[count++] = agency;
    }

    @Override
    public Agency[] getAgencyById() {
        return agencies;
    }

    @Override
    public Agency getAgencyById(long id) {
        try {
            if (id < 0 || id > agencies.length) {
                throw new RuntimeException("id должен быть болше ноля или нету агента по етому id");
            }
            for (Agency agency : agencies) {
                if (agency.getId() == id) {
                    return agency;
                } else {
                    throw new NullPointerException("нету такого id ");
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void updateAgency(long id, Agency newAgency) {
        try {
            int count = 0;
            if (id > agencies.length || id <= 0) {
                throw new RuntimeException("id должен быть болше ноля или нету агента по етому id");
            }
            for (Agency agency : agencies) {
                if (agency.getId() == id) {
                    agencies[count+1] = newAgency;
                }
                count++;
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteAgency(long id) {

        try {
            if (id > agencies.length || id <= 0) {
                throw new RuntimeException("id должен быть болше ноля или нету агента по етому id");
            }
            int indax = -1;

            for (int i = 0; i < agencies.length; i++) {
                if (agencies[i].getId() == id) {
                    indax = i;
                    break;
                }
            }
            System.out.println(indax);

            Agency[] newAgency = new Agency[agencies.length - 1];
            for (int i = 0; i < indax; i++) {
                newAgency[i] = agencies[i];
            }
            for (int i = indax; i < newAgency.length; i++) {
                newAgency[i] = agencies[i + 1];
            }
            agencies = newAgency;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
