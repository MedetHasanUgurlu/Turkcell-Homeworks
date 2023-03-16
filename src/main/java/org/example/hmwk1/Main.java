package org.example.hmwk1;

import org.example.hmwk1.adapter.CheckService;
import org.example.hmwk1.adapter.MernisService;
import org.example.hmwk1.entity.Campaign;
import org.example.hmwk1.entity.Customer;
import org.example.hmwk1.entity.Game;
import org.example.hmwk1.service.CampaignManager;
import org.example.hmwk1.service.SellingManager;
import org.example.hmwk1.service.UserManager;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(1,"Battlefront 2",50,"Star Wars fps game",true);
        Game game2 = new Game(2,"Hogwarts Legacy",100,"Chosen boy ",false);



        Customer john = new Customer(1,"7676@gmail.com","4321","John","Williams","767676767676",1932,game);
        Customer harry = new Customer(2,"7676@gmail.com","4321","Harry","Potter","12121212",2000,game2);
        Customer weasley = new Customer(3,"7676@gmail.com","4321","Weasley","Williams","13131313",2002,game2);
        Customer snape = new Customer(4,"7676@gmail.com","4321","Snape","Williams","1111111",2006,game2);

        CheckService checkService = new MernisService();

        UserManager userManager = new UserManager(checkService);
        userManager.addUser(john);
        userManager.addUser(harry);
        userManager.addUser(weasley);
        userManager.getUsers().stream().forEach(System.out::println);
        userManager.deleteUser(harry);
        userManager.getUsers().stream().forEach(System.out::println);


        userManager.updateUser(1,new Customer(1,"7676@gmail.com","4321","Cristopher","Lee","767676767676",1932,game));
        userManager.getUsers().stream().forEach(System.out::println);
        System.out.println("***");
        userManager.getUsers().stream().forEach(System.out::println);

        Campaign campaign = new Campaign(1,75,15,game2);
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.addCampaign(campaign);
        campaignManager.getCampaigns().stream().forEach(System.out::println);

        SellingManager sellingManager = new SellingManager(campaignManager,userManager);
        sellingManager.sell(weasley,game2);
        System.out.println(weasley);












    }
}
