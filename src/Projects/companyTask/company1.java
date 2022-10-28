package Projects.companyTask;

public class company1 implements bank {
    @Override
    public void payBills() {
        System.out.println("Company 1 pays bills");
    }

    @Override
    public void payCredits() {
        System.out.println("Company 1 pays credits");
    }

    @Override
    public void verifyYourself() {
        System.out.println("Verify yourself");
    }
}
