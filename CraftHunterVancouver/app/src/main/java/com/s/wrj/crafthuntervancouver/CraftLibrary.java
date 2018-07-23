package com.s.wrj.crafthuntervancouver;

public class CraftLibrary {
    private String mName[] = {
            "Stanley Park Brewing",
            "Bomber Brewing","Yaletown Brewing Company",
            "33 Acres Brewing Company","Andina Brewing Company",
            "Big Rock Urban Brewery","Main Street Brewing Company"
    };

    private int mPic[] = {
            R.drawable.stanly1,
            R.drawable.bomeber1,R.drawable.yaletown1,
            R.drawable.acres2,R.drawable.adina,R.drawable.br,R.drawable.main
    };

    private String mHead[]= {
            //Stanley head
            "Address: Stanley Park Brewing Co. \n\n" +
                    " 406-1148 Homer St.Vancouver, BC V6B 2X6\n\n"+
                    "Pricing: $4 – $12 depending on beer and fill size.\n\n" +
                    "Hours: 9am – 5pm(park close) every day.",
            //Bomber Head
            "Address:  Bomber Brewing Co.\n\n" +
                    "1488 Adanac St, Vancouver, BC V5L 3J7 \n\n" +
                    "Pricing: $6 – $12 depending on beer and fill size. \n\n" +
                    "Hours: noon – 11pm every day.",
            //Yealtown Head
            "Address: Yaletown Brewing Co. \n\n" +
                    " 1111 Mainland St., Vancouver, BC V6B 2T9\n\n" +
                    "Pricing: $6 – $12 depending on beer and fill size. \n\n" +
                    "Hours: 11.30am - 12am.",
            //Acres head
            "Address: 33 Acres Brewing Co\n\n" +
                    "15 W 8th Ave, Vancouver, BC V5Y 1M8\n\n" +
                    "Pricing: $5 – $12 depending on beer and fill size. \n\n" +
                    "Hours: 9am - 11pm",
            //Andina head
            "Address: Andina Brewing Co\n\n" +
                    "1507 Powell St, Vancouver, V5L 5C3\n\n" +
                    "Pricing: $5 – $12 depending on beer and fill size. \n\n" +
                    "Hours: 12-11pm",
            //bigrock
            "Address: Big Rock Urban Brewery\n\n" +
                    "310 West 4th Ave., Vancouver, BC V5Y 1G9 \n\n" +
                    "Pricing: $6 – $12 depending on beer and fill size. \n\n" +
                    "Hours: 11am - 11pm",
            //main
            "Address: Main Street Brewing Co.\n" +
                    "261 E 7th Ave, Vancouver, BC V5T 0B4\n\n" +
                    "Pricing: $5 – $12 depending on beer and fill size. \n\n" +
                    "Hours: 2pm-11pm"


    };

    private String mDes[] = {
            //Stanley description
            "There’s something about a walk under the canopy of an old growth forest, or a brisk stroll on the seawall that awakens the senses and " +
                    "reinvigorates the soul. Experiences like this stay with you. And they inspired us to craft a lineup of beer to evoke that very same feeling. " +
                    "From windstorms to daytrips to incredible sunsets best viewed from the beach, every beer we make is a tasty tribute to Stanley Park and the experiences had within it. " +
                    "And just like the Park, we craft each one to be an exciting break from the everyday, an experience to be explored and savoured.\n" +
                    "\n",
            //Bomber description
            "Bomber Brewing Company is all about “hockey, friendship, and beer,” and this is the feeling you get when you enter their tasting room.\n" +
                    "\n" +
                    "The wood-panelled tasting room and bar area offer patrons a view of the hockey game on the projection television, giving the atmosphere the comfort of watching the game at your friend’s house in the basement lounge converted into a bar.  Guests are treated to a large selection of Bomber’s mainstays as well as some newer one-off beers and experimental brews.\n" +
                    "\n" +
                    "Snacks are available, including soft pretzels with mustard to accompany some of the great German-style beers on offer.  At the heart of the Yeast Van area of the city, Bomber Brewing Company is well placed to be your primary tasting lounge, or simply one stop of many in the neighbourhood.\n" +
                    "\n" +
                    "They folks at Bomber Brewing Company welcome families and children, and even have some board games for patrons if you’re so inclined to play a game or two with your crew.",
            //yaletown description
            " Yaletown Brewing Company\n" +
                    "The Yaletown Brewing Company is Vancouver’s original brewpub. Founded in 1994, just as the former warehouse district of Yaletown was beginning to emerge as a destination for businesses and residents, the YBC was built with the vision of being a true neighbourhood pub – a welcoming gathering place whether you arrived dressed in a suit or flip-flops.\n" +
                    "\n" +
                    "During the intervening years, the neighbourhood has undergone tremendous change, but the brewing company has remained Yaletown’s premiere destination for superb beers, inspired menus and unpretentious good times.\n" +
                    "\n" +
                    "The hard work of the brewmaster, head chef and staff has resulted in a whole wall full of awards for the Yaletown Brewing Company. " +
                    "It has been voted best brewpub in Canada on several occasions and holds a virtual lock on annual Readers’ Choice awards for Best in Vancouver. Despite the success, " +
                    "everyone at YBC still works diligently to challenge and surprise customers with seasonal beers, evolving menus and entertaining event nights. That’s why it’s the true neighbourhood pub in Vancouver’s most vibrant neighbourhood.",
            //acres description
            "33 Acres Brewing Co.\n" +
                    "Established in 2013, this is what the brewery has to say for itself: “Our vision was born out of enjoyment for the binding elements of life. " +
                    "The spirit of community sharing – drink, food, conversation, space and ideas. We carry a strong appreciation for the boundless limits created by hard work. We’re influenced by the natural elements of our surroundings, " +
                    "fueled by creative thinking, and driven to make the highest quality product.",
            //andina description
            "About Andina Brewing Company\n" +
                    "By infusing the vibrant flavours, scents, sights and sounds of South America and British Columbia, " +
                    "Andina Brewing Company offers Vancouver a brand new experience in the craft beer landscape. Colombian/Canadian brothers and founders, " +
                    "Andrés and Nicolás Amaya, are passionate about beer, music, culture, family and friends. After living in Vancouver for more than 18 years, they funnelled that passion into a brewery of their own.",
            //bigrock
            "About Big Rock Urban Brewery\n" +
                    "As Canada’s largest independent craft brewer, Big Rock Urban Brewery has been making premium, all-natural craft beers and ciders since 1985." +
                    " The company has a brewery in Alberta, as well as this one in BC and their BC brews are locally inspired and crafted using as many Lower Mainland ingredients as possible.",
            "About Main Street Brewing Co.\n" +
                    "RESIDES IN ONE OF VANCOUVER’S FEW SURVIVING INDUSTRIAL HERITAGE BUILDINGS, THE “VANCOUVER BREWERIES GARAGE” (1913)," +
                    " IN THE HISTORIC BREWERY CREEK DISTRICT."
    };


    //Stanley inside subclass
    private int mSub1 []={
            R.drawable.sub1_1, R.drawable.sub1_2, R.drawable.sub1_3,R.drawable.sub1_4
    };
    private String head1[]={
            "Stanley Park Noble Pilsner","Stanley Park 1897 Amber","Stanley Park Windstorm",
            "Stanley Park DayTrip"
    };
    private String des1[]={
            " Brewed by: \n \nStanley Park Brewing British Columbia, Canada\n\n 5.1%Alc./Vol. \n\n 12IBU \n\n Crisp, clean and inviting, with light malt body and subtle floral hop aroma. " +
                    "Our Noble Pilsner is like the seawall on a Saturday: always welcoming and a " +
                    "total crowd pleaser. \n\n Taste \n\n Malt 7/10 \n\n Hops 3.5/10 \n\n Bitterness 3/10",
            "Brewed by: \n \nStanley Park Brewing British Columbia, Canada\n\n 5.1%Alc./Vol. \n\n 15IBU \n\n Our traditional pub-style Amber ale, with soft caramel aroma and toasted malt flavour. " +
                    "It’s a timeless favourite. \n\n Taste \n\n Malt 8/10 \n\n Hops 3/10 \n\n Bitterness 3/10",
            "Brewed by: \n \nStanley Park Brewing British Columbia, Canada\n\n 5.4%Alc./Vol.\n\n 35IBU \n\n Tropical fruit and citrus hop character give our Windstorm Pale Ale a medium body and full unfiltered flavour. Brace yourselves. " +
                    "It’s a flavourful force of nature that’s best enjoyed with adventurous friends. " +
                    "\n\n Taste \n\n Malt 8/10 \n\n Hops 8/10 // Bitterness 5/10",
            "Brewed by: \n \nStanley Park Brewing British Columbia, Canada\n\n 4.4Alc./Vol. \n\n 25IBU \n\n Smooth tasting and sessionable, with light citrus hop character. Our DayTrip West Coast Lager is well-balanced, packed with flavour, and inspired by the adventurous spirit of our west coast.\n" +
                    "\n Taste \n\n Malt 8/10 \n\n Hop 6/10 \n\n Bitterness 3/10"
    };



    //bomber inside subclass
    private int mSub2 []={
            R.drawable.sub2_1, R.drawable.sub2_2, R.drawable.sub2_3
    };

    private String head2[]={
            "Bomber Pilsner","Bomber Pale Ale","Bomber ESB"
    };
    private String des2[] ={
            " Brewed by: \n" +
                    "Bomber Brewing" + "British Columbia, Canada\n\n4.8%Alc./Vol. \n\n 28IBU \n\n Imported Czech Saaz hops provide the floral aroma and finish to our refreshing and clean-drinking lager," +
                    " for the seasoned craft beer drinker or the team that wants a cold one after the game! " +
                    "\n\n Taste \n\n Aroma 4/5 \n\n Appearance 4/5 \n\n Taste 4/5 \n\n Palate 4/5",
            "Brewed by: \n" +
                    "Bomber Brewing " + "British Columbia, Canada\n\n 5%Alc./Vol.\n\n 25IBU  \n\n As an homage to a Vancouver institution, " +
                    "this brew, taken directly from his recipe book, is one of the most often made by both new and veteran patrons of Dan Small’s " +
                    "landmark brew shop. Opening ‘Dan’s Homebrewing Supplies’ in 1991, Dan inspired and served home brewers and many current commercial brewers " +
                    "(including 3 of our own!) in and around Vancouver until he succumbed to cancer on July 31st, 2013. \n\n" +
                    "Taste  \n\n Aroma 4/5 \n\n Appearance 4/5 \n\n Taste 4/5 \n\n Palate 4/5",
            "Brewed by: \n Bomber Brewing British Columbia, Canada\n\n %.2%Alc./Vol. \n\n 45IBU \n\n Extra Special Bitter (ESB) Review. In East Vancouver's Bomber Brewing's initial and standard offering comes the ESB, an Extra special bitter ringing in at a modest 5.2%." +
                    " This beer pours a copper colour topped with two fingers of dense and lacing head." +
                    "\n\n Taste  \n\n Aroma 4/5 \n\n Appearance 4/5 \n\n Taste 4/5 \n\n Palate 4/5"
    };


    //yaletown inside subclass
    private int mSub3[]={

    };

    //acres inside subclass
    private int Sub4[]={
        R.drawable.ac1,R.drawable.ac2,R.drawable.ac3
    };

    private String Head4[]={
            "33 ACRES OF LIFE","33 ACRES OF OCEAN","33 ACRES OF SUNSHINE"
    };
    private String Des4[]={
          "Brewed by: \n 33 Acres Brewing Company \n\n" +
                  "Style: California Common\n" +
                  "Colour: Reddish amber\n" +
                  "Alcohol: 4.8% by volume\n" +
                  "Aroma: Faint fruit, toasted malt, caramel\n" +
                  "Flavour: Sharp carbonation bite; pronounced hop character; \n\n" +
                  "light caramel aftertaste. Relatively clean finish.\n\n " +
                  "Rooted in West Coast convictions of resourcefulness and persistence, " +
                  "the California Common was born out of the Gold Rush of 1848." +
                  " Even back when brewing equipment was scarce beer enthusiasts were unwilling to put their craft on hold. Making do with less," +
                  " inventive brewing techniques led to the creation of a hybrid lager and ale.",

            "Brewed by: \n 33 Acres Brewing Company \n\n" +
            "Style: West Coast Pale Ale\n" +
                    "Colour: Light amber\n" +
                    "Alcohol: 5.6% by volume\n" +
                    "Aroma: Fruit, floral hop aroma, predominantly citrus and a little pine\n" +
                    "Flavour: Light caramel, strong hop flavour.\n\n" +
                    "This is a full flavoured beer integrated with a distinct floral hop which gives it a quality unique to our Pacific Northwest surroundings." +
                    " This style is evolutionary from a typical IPA with an assertive hop, lower alcohol content, and slight pine aroma." +
                    " Low in malt character, this beer has a refined quality and a refreshing temperament.",
            "Brewed by: \n 33 Acres Brewing Company \n\n" +
            "Style: French Blanchè\n" +
                    "Colour: Hazy blonde\n" +
                    "Alcohol: 5.0% by volume\n" +
                    "Aroma: Fruity; orange peel; coriander; black liquorice\n" +
                    "Flavour: Fruity; orange peel; coriander; black liquorice; sweet aftertaste\n" +
                    "Wondrously, people may ponder, how is ‘Sunshine’ made? With vital gear prepped and necessities intact," +
                    " adventurous natures gesture the ways. Centered among lively ambiance, teeming winds and waves amplify magnificent terrains. " +
                    "An exquisite alchemy forms as firing swells synch between greatly planting feet, and grand drafting hands, surfacing vast expanses. These picturesque balancings serenade the dynamic first breaths, " +
                    "through last drops, and beyond the dawning horizons."
    };
//andina inside subclass
    private int sub5[]={
            R.drawable.an1,R.drawable.an2,R.drawable.an3,R.drawable.an4

    };
    private String head5[]={
            "Andina Totuma", "Andina Melcocha","Andina Ayayay","Andina Monita"

    };
    private String des5[]={
            " Brewed by: \nAndina Brewing Co\n\n" +
                    "Type: Kolsch \n\n" +
                    "4.5Alc./Vol.\n\n 22IBU \n\n \n" +
                    "HOPSHallertau Tradition\n" +
                    "MALTPatagonia Pilsner Malt \n\n " +
                    "Pours a very clear straw yellow. Aromatics of light stone fruit with a complimenting malt biscuitiness and a clean crisp taste with just a hint of noble hops. " +
                    "This style’s fermentation process yields a light, vinous character which is accompanied by a slightly dry, refreshing finish. ",

            " Brewed by:\nAndina Brewing Co \n\n" +
                    "Type: Andean Ale \n\n" +
                    "4.5Alc./Vol.\n\n 22IBU \n\n" +
                    "\n" +
                    "HOPSNorthern Brewer, Sterling\n" +
                    "MALTBC 2-row, Munich2, Flaked wheat, Brown, Biscuit\n\nPours a copper-brown reminiscent of Panela. The aromatics are abundant with brown bread, candied nuts, molasses and hints of chocolate." +
                    " The taste is full flavoured with its unique characteristics coming from a substantial panela addition. " +
                    "Because of the panela’s handcrafted process—dehydrating raw sugarcane juice over low heat—it retains the flavourful molasses. ",

            " Brewed by:\nAndina Brewing Co \n\n" +
                    "Type: Belgian Pale Ale \n\n" +
                    "4.5Alc./Vol.\n\n 22IBU\n\n\n" +
                    "HOPSCascade, Centennial, Idaho 7\n" +
                    "MALTPatagonia 2-row, Oats, Wheat, Carahell, T50, DRC\n\n" +
                    "Pours a light copper- orange with aromatics of pine, grapefruit, tangerine from dry hop additions and bubblegum and banana from the Belgian yeast." +
                    " The taste has hints of caramel and cookie but is primarily hop driven with a crispy dry finish and clean cascade bitterness.\n" +
                    "\n",
            " Brewed by:\nAndina Brewing Co \n\n" +
                    "Type: Blonde IPA \n\n" +
                    "4.5Alc./Vol.\n\n 22IBU\n\n\n" +
                    "HOPSAmarillo, Mosaic\n" +
                    "MALTGolden Promise, Pilsner Malt, Carahell, Honey Malt\n\n" +
                    "Pours bright yellow with a touch of honey. Prominent aromas of citrus and tropical fruit come forward from the dry hop additions. By definition, an India Pale Ale is hoppier and higher in alcohol than its little sister, the pale ale, and has become the de facto flagship beer of modern craft brewing." +
                    " Monita is relatively lighter. The taste is crisp with a solid malt body of honey and biscuit that carries the bitterness throughout but does not have an unpleasantly long aftertaste that you might expect from an American IPA."
    };

    private int sub6[]={
            R.drawable.br1,R.drawable.br2,R.drawable.br3,R.drawable.br4,
    };
    private String head6[]={
            "Grasshopper","Tradition Ale","Rhine Stone Cowboy","Pilsner"

    };
    private String des6[]={
        "Brewed by:\nBig Rock Brewing Co \n\n" +
                "Type:Filtered wheat ale\n\n" +
                "5%Alc./Vol. \n\n 16IBU\n\n" +
                "Fresh from the prairie hoppers, our Grasshopper wheat ale has a crisp finish," +
                " balancing its soft sweetness with fruity and bready notes.",
            "Brewed by:\nBig Rock Brewing Co \n\n" +
                    "Type:English style brown ale\n\n" +
                    "5%Alc./Vol. \n\n 20IBU\n\n" +
                    "A recipe gone untouched since Big Rock’s founding. Toasty malt and sweet caramel up front, " +
                    "Big Rock Traditional Ale finishes with a nutty flavour," +
                    " medium creamy carbonation and mild hop bitterness.",
            "Brewed by:\nBig Rock Brewing Co \n\n" +
                    "Type:Lagered Ale\n\n" +
                    "3.6%Alc./Vol. \n\n 18IBU\n\n" +"A Kolsh style ale born from the banks of the Rhine. Light in body and appearance, " +
                    "our Rhine Stone Cowboy ale contains aromas of clean malt, fruit, and a touch of noble hops. 2017 Ontario Brewing Awards – Bronze: Lagered Ale\n",
            "Brewed by:\nBig Rock Brewing Co \n\n" +
                    "Type:Czech style Pilsner\n\n" +
                    "4.9%Alc./Vol. \n\n 28IBU\n\n"+"Here’s a classic Pilsner born from the original Czech style, as reliable as Prague’s landmark time piece. " +
                    "The mild bitterness and fragrant hop nose of Czech’s Saaz hops are balanced with Pale malt. A thirst quenching experience… anytime."
    };
    private int sub7[]={
            R.drawable.main1,R.drawable.main2,R.drawable.main3,R.drawable.main4

    };
    private String head7[]={
            "Main Street Pilsner","Naked Fox IPA","Old Knight Pale Ale","No.7 Saison"

    };
    private String des7[]={
            "Brewed by \nMain Street Brewing Co\n\n" +
                    "Style: Pilsner\n\n" +
                    "ABV: 5%\n\n" +
                    "IBU: 22\n\n" +
                    "Hops: Saaz\n\n" +
                    "Released: May 2014\n\n" +
                    "This is a Pilsner. Bright, golden and medium bodied. Created with noble hops, the result is a clean, " +
                    "easy drinking beer that finishes crisply. Afterall, The Main Thing Is The Beer.",
            "Brewed by \nMain Street Brewing Co\n\n" +
                    "NAKED FOX IPA\n" +
                    "Style: IPA\n" +
                    "ABV: 6.8%\n" +
                    "IBU: 55\n" +
                    "Released: March 2016\n" +
                    "Born from infamy, our Naked Fox is a sly one. This dry IPA is brewed using a variety of North American and Southern Hemisphere hops," +
                    " packing in everything you’d want in hop flavour and aroma into a single beer." +
                    " The dryness on the malt side lets the hops shine through.",
            "Brewed by \nMain Street Brewing Co\n\n" +
                    "Style: IPA\n" +
                    "ABV: 5.5%\n" +
                    "IBU: 50\n" +
                    "Hops: Cascade hops\n" +
                    "Released: March 2016\n" +
                    "Named for our neighbours, the artist-run Western Front studio (former home of the Knights of Pythias), Old Knights Pale Ale is a Pacific" +
                    " Northwest take on the classic English Pale Ale – hop forward, aromatic with slight citrus and lots of pine notes. Brewed with Columbus and Cascade hops.",
            "Brewed by \nMain Street Brewing Co\n\n" +
                    "Style: Saison\n" +
                    "ABV: 6%\n" +
                    "IBU: 15\n" +
                    "Released: January 2015\n" +
                    "Saison No.7 is fermented with a blend of saison yeasts. Light in colour with a golden haze," +
                    " this farmhouse saison shows through with fruity esters, pepper and citrus notes. A perfect summer sipper."



    };




    public String getmName(int a) {
        String Name = mName[a];
        return Name;
    }



    public int getmPic(int a) {
        int Pic = mPic[a];
        return Pic;
    }

    public String getmHead(int a) {
        String Head = mHead[a];
        return Head;
    }


    public String getmDes(int a) {
        String Des = mDes[a];
        return Des;
    }

    public int getmSub1(int a) {
        int Sub1 = mSub1[a];
        return Sub1;
    }

    public int getmSub2(int a) {
        int Sub2 = mSub2[a];
        return Sub2;
    }

    public String getHead1(int a) {
        String headd = head1[a];
        return headd;
    }

    public String getDes1(int a) {
        String dess = des1[a];
        return dess;
    }

    public String getHead2(int a) {
        String headdd = head2[a];
        return headdd;
    }

    public String getDes2(int a) {
        String desss = des2[a];
        return desss;
    }


    public int getSub4(int a) {
        int aces = Sub4[a];
        return aces;
    }

    public String getHead4(int a) {
        String  acesHead = Head4[a];
        return acesHead;
    }

    public String getDes4(int a) {
        String  acesDes = Des4[a];
        return acesDes;
    }

    public int getSub5(int a) {
        int andinahead = sub5[a];
        return andinahead;
    }

    public String getHead5(int a) {
        String andinaHead = head5[a];
        return andinaHead;
    }

    public String getDes5(int a) {
        String andinaDes = des5[a];
        return andinaDes;
    }

    public int getSub6(int a) {
        int bigsub = sub6[a];
        return bigsub;
    }

    public String getHead6(int a) {
        String bighead = head6[a];
        return bighead;
    }

    public String getDes6(int a) {
        String bigdes = des6[a];
        return bigdes;
    }
    public int getSub7(int a) {
        int mainSub = sub7[a];
        return mainSub;
    }

    public String getHead7(int a) {
        String mainHead = head7[a];
        return mainHead;
    }

    public String getDes7(int a) {
        String mainDes = des7[a];
        return mainDes;
    }
}

