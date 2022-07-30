package day31_Constructors.MyOfferTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {


        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);

        Offer[] myOffers= {offer1,offer2,offer3,offer4,offer5};

        //convert array to collect : asList
        ArrayList<Offer> fullTimeOffers= new ArrayList<>(Arrays.asList(myOffers));

        /* 2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
        2.3.1 Write a program that can remove the offer objects that are not full-time*/
        fullTimeOffers.removeIf(p-> !p.isFullTime); //remove if the offer is NOT Full time
        System.out.println(fullTimeOffers.size());

        /*2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
		2.4.1 Write a program that can remove all the offers that are not from local*/
        ArrayList<Offer> localOffers= new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("VA")); //REMOVES the offer if the offer is not from local area
        System.out.println(localOffers.size());

        /*
        2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
        2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO*/
        ArrayList<Offer> offerWithBenefits=new ArrayList<>(Arrays.asList(myOffers));
        offerWithBenefits.removeIf(p-> !(p.hasBenefit==false && p.hasPTO==false));
        System.out.println(offerWithBenefits.size());

       /* 2.6 Create an ArrayList2 of Offer named sdetOffers and add all the offer objects.
        2.6.1 Write a program that can remove all the offers that are not for SDET */
        ArrayList<Offer> sdetOffers=new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p-> !p.jobTitle.equals("SDET"));
        System.out.println(sdetOffers.size());

        /* 2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
        2.7.1 Write a program that can remove all the offers that are offering less than 100K salary*/
        ArrayList<Offer> offersWith100K=new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p-> !(p.salary < 100000));
        System.out.println(offersWith100K.size());
    }
}
