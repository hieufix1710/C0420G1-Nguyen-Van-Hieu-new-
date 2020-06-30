package Models;

import java.util.SplittableRandom;

public abstract class Services {
    protected String id;
    protected String nameService;
    protected int areaUse;
    protected  int rentFee;
    protected int amountPeople;
    protected String typeRent;



    public String showInfor() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", rentFee=" + rentFee +
                ", amountPeople=" + amountPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
