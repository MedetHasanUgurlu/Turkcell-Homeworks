package org.example.hmwk1.service.impl;

import org.example.hmwk1.entity.Game;
import org.example.hmwk1.entity.Campaign;
import org.example.hmwk1.entity.Customer;
import org.example.hmwk1.service.CampaignService;
import org.example.hmwk1.service.SellingService;
import org.example.hmwk1.service.UserService;


public class SellingManager implements SellingService {
    private final CampaignService campaignService;
    private final UserService userService;

    public SellingManager(CampaignService campaignService,UserService userService) {
        this.campaignService = campaignService;
        this.userService = userService;
    }
    public void sell(Customer customer, Game game) {
        if(customer.getGames().contains(game)){
            System.out.println("bu oyuna zaten sahipsin");
            return;
        }
        for(Campaign campaign:campaignService.getCampaigns()){

            if(campaign.getGames().contains(game) ){
                game.setCost(game.getCost()-(game.getCost()*campaign.getDiscountAmount()/100));
                game.setCountOwner(game.getCountOwner()+1);
                System.out.println("New Cost "+ game.getName()+" is "+game.getCost());
                System.out.println("Game " + game.getName() + " sold to " + customer.getName());
                customer.addGame(game);

            }
        }
        if(!(customer.getGames().contains(game))){
            game.setCountOwner(game.getCountOwner() + 1);
            customer.addGame(game);
            System.out.println("Game " + game.getName() + " sold to " + customer.getName()+" cost: "+game.getCost());
        }

    }
//    @Override
//    public void campaignSell(Customer customer, Game game) {
//        for(Campaign campaign:campaignService.getCampaigns()){
//
//            if(campaign.getGames().contains(game) && !(customer.getGames().contains(game))){
//                game.setCost(game.getCost()-(game.getCost()*campaign.getDiscountAmount()/100));
//                game.setCountOwner(game.getCountOwner()+1);
//                System.out.println("New Cost "+ game.getName()+" is "+game.getCost());
//                customer.addGame(game);
//
//            }
//        }
//
//    }

    /*@Override
    public void sell(Customer customer, Game game) {
        for(Campaign campaign:campaignService.getCampaigns()){

            if(campaign.getGames().contains(game) && !(customer.getGames().contains(game))){
                game.setCost(game.getCost()-(game.getCost()*campaign.getDiscountAmount()/100));
                game.setCountOwner(game.getCountOwner()+1);
                System.out.println("New Cost "+ game.getName()+" is "+game.getCost());
                System.out.println("Game " + game.getName() + " sold to " + customer.getName());
                customer.addGame(game);

            }
        }
        if (customer.getGames().contains(game)) {
            return;
        } else {
            game.setCountOwner(game.getCountOwner() + 1);
            customer.addGame(game);
            System.out.println("Game " + game.getName() + " sold to " + customer.getName());
        }
    }*/


}
