package HomeWork.HW2;

import java.util.List;

public interface MarketBehavior {

    void acceptToMarket(Buyer actor);

    void releaseFromMarket(Buyer actors);

    void releaseFromMarket(List<Buyer> actors);

    void update();
}
