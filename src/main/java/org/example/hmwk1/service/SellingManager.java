package org.example.hmwk1.service;

import org.example.hmwk1.entity.Game;
import org.example.hmwk1.entity.Campaign;
import org.example.hmwk1.entity.Customer;

public class SellingManager implements SellingService {
    private final CampaignService campaignService;
    private final UserService userService;

    public SellingManager(CampaignService campaignService,UserService userService) {
        this.campaignService = campaignService;
        this.userService = userService;
    }

    @Override
    public void sell(Customer customer, Game game) {
        for(Campaign campaign:campaignService.getCampaigns()){

            if(campaign.getGame().getName()==game.getName()){
                game.setCost(game.getCost()-(game.getCost()*campaign.getDiscountAmount()/100));
                System.out.println("New Cost "+ game.getName()+" is "+game.getCost());
                customer.setGame(game);
                customer.getGame().setHasOwner(true);

            }
        }

    }
}
