package com.s.wrj.crafthuntervancouver;

public class CraftLibrary {
    private String mName[] = {
            "Stanley Park Brewing",
            "Bomber Brewing", "Yaletown Brewing Company",
            "33 Acres Brewing Company", "Andina Brewing Company",
            "Big Rock Urban Brewery", "Main Street Brewing Company",
            "Off The Rail Brewing Co.", "Postmark Brewing", "Powell Street Craft Brewery",
            "Steamworks Brewing Company", "Strange Fellows Brewing", "Dogwood Brewing Company"

    };

    private int mPic[] = {
            R.drawable.stanly1,
            R.drawable.bomeber1, R.drawable.yaletown1,
            R.drawable.acresthree, R.drawable.andina, R.drawable.bigr, R.drawable.mainone,
            R.drawable.offrailbrew, R.drawable.postmark, R.drawable.powell, R.drawable.steam,
            R.drawable.fellow, R.drawable.dog
    };

    private String mHead[] = {
            //Stanley head
            "Address: Stanley Park Brewing Co. \n\n\n" +
                    " 406-1148 Homer St.Vancouver, BC V6B 2X6\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t8a.m.–6p.m.\n" +
                    "Tuesday\t8a.m.–6p.m.\n" +
                    "Wednesday\t8a.m.–6p.m\n" +
                    "Thursday\t8a.m.–6p.m.\n" +
                    "Friday\t8a.m.–6p.m.\n" +
                    "Saturday\t8a.m.–6p.m.\n" +
                    "Sunday\tClosed",
            //Bomber Head
            "Address:  Bomber Brewing Co.\n\n\n" +
                    "1488 Adanac St, Vancouver, BC V5L 3J7 \n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t12–11p.m.\n" +
                    "Tuesday\t12–11p.m.\n" +
                    "Wednesday\t12–11p.m.\n" +
                    "Thursday\t12–11p.m.\n" +
                    "Friday\t12–11p.m.\n" +
                    "Saturday\t12–11p.m.\n" +
                    "Sunday\t12–11p.m.",
            //Yealtown Head
            "Address: Yaletown Brewing Co. \n\n\n" +
                    " 1111 Mainland St., Vancouver, BC V6B 2T9\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t11:30a.m.–12a.m.\n" +
                    "Tuesday\t11:30a.m.–12a.m.\n" +
                    "Wednesday\t11:30a.m.–12a.m.\n" +
                    "Thursday\t11:30a.m.–1a.m.\n" +
                    "Friday\t11:30a.m.–3a.m.\n" +
                    "Saturday\t11:30a.m.–3a.m.\n" +
                    "Sunday\t11:30a.m.–12a.m.\n",
            //Acres head
            "Address: 33 Acres Brewing Co\n\n\n" +
                    "15 W 8th Ave, Vancouver, BC V5Y 1M8\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t9a.m.–11p.m.\n" +
                    "Tuesday\t9a.m.–11p.m.\n" +
                    "Wednesday\t9a.m.–11p.m.\n" +
                    "Thursday\t9a.m.–11p.m.\n" +
                    "Friday\t9a.m.–11p.m.\n" +
                    "Saturday\t10a.m.–11p.m.\n" +
                    "Sunday\t10a.m.–11p.m.",
            //Andina head
            "Address: Andina Brewing Co\n\n\n" +
                    "1507 Powell St, Vancouver, V5L 5C3\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t12–11p.m.\n" +
                    "Tuesday\t12–11p.m.\n" +
                    "Wednesday\t12–11p.m.\n" +
                    "Thursday\t12–11p.m.\n" +
                    "Friday\t12–11p.m.\n" +
                    "Saturday\t12–11p.m.\n" +
                    "Sunday\t12–11p.m.",
            //bigrock
            "Address: Big Rock Urban Brewery\n\n\n" +
                    "310 West 4th Ave., Vancouver, BC V5Y 1G9 \n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t11a.m.–11p.m.\n" +
                    "Tuesday\t11a.m.–11p.m.\n" +
                    "Wednesday\t11a.m.–11p.m.\n" +
                    "Thursday\t11a.m.–11p.m.\n" +
                    "Friday\t11a.m.–12a.m.\n" +
                    "Saturday\t11a.m.–12a.m.\n" +
                    "Sunday\t11a.m.–11p.m.\n",
            //main
            "Address: Main Street Brewing Co.\n\n\n" +
                    "261 E 7th Ave, Vancouver, BC V5T 0B4\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t2–11p.m.\n" +
                    "Tuesday\t2–11p.m.\n" +
                    "Wednesday\t2–11p.m.\n" +
                    "Thursday\t2–11p.m.\n" +
                    "Friday\t12–11p.m.\n" +
                    "Saturday\t12–11p.m.\n" +
                    "Sunday\t12–11p.m.\n",
            //offrail
            "Address: Off The Rail Brewing Co.\n\n\n" +
                    "1351 Adanac St, Vancouver, BC V5L 2C4\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t12–8p.m.\n" +
                    "Tuesday\t12–8p.m.\n" +
                    "Wednesday\t12–8p.m.\n" +
                    "Thursday\t12–8p.m.\n" +
                    "Friday\t12–10p.m.\n" +
                    "Saturday\t12–10p.m.\n" +
                    "Sunday\t12–8p.m.",
            //postmarl
            "Address: Postmark Brewing Co.\n\n\n" +
                    " 55 Dunlevy Ave, Vancouver, BC V6A 1G7\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t11a.m.–11p.m.\n" +
                    "Tuesday\t11a.m.–11p.m.\n" +
                    "Wednesday\t11a.m.–11p.m\n." +
                    "Thursday\t11a.m.–11p.m.\n" +
                    "Friday\t11a.m.–11p.m.\n" +
                    "Saturday\t10a.m.–11p.m.\n" +
                    "Sunday\t10a.m.–11p.m.",
            //powell
            "Address: Powell Brewery\n\n\n" +
                    "1357 Powell St, Vancouver, BC V5L 1G8\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t2–9p.m.\n" +
                    "Tuesday\t2–9p.m.\n" +
                    "Wednesday\t2–9p.m.\n" +
                    "Thursday\t2–9p.m.\n" +
                    "Friday\t12–10p.m.\n" +
                    "Saturday\t12–10p.m.\n" +
                    "Sunday\t12–9p.m.",
            //steamwork
            "Address: Steamworks Brewery\n\n\n" +
                    " 375 Water St, Vancouver, BC V6B 1B8n\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t12–10p.m.\n" +
                    "Tuesday\t12–10p.m.\n" +
                    "Wednesday\t12–10p.m.\n" +
                    "Thursday\t12–11p.m.\n" +
                    "Friday\t12–11p.m.\n" +
                    "Saturday\t12–11p.m.\n" +
                    "Sunday\t12–10p.m.",
            //STRANG
            "Address: Strange Fellows Brewing\n\n\n" +
                    "1345 Clark Dr., Vancouver, BC V5L 3K9\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\t12–11p.m.\n" +
                    "Tuesday\t12–11p.m.\n" +
                    "Wednesday\t12–11p.m.\n" +
                    "Thursday\t12–11p.m.\n" +
                    "Friday\t12–11p.m.\n" +
                    "Saturday\t12–11p.m.\n" +
                    "Sunday\t12–11p.m.",
            //dog
            "Address: Dogwood Brewing Co\n\n\n" +
                    "8284 Sherbrooke St, Vancouver, BC V5X 4R6\n\n\n" +
                    "Hours: \n\n" +
                    "Monday\tClosed\n" +
                    "Tuesday\tClosed\n" +
                    "Wednesday\t3:30–8p.m.\n" +
                    "Thursday\t3:30–8p.m.\n" +
                    "Friday\t12–8p.m.\n" +
                    "Saturday\t12–8p.m.\n" +
                    "Sunday\t12–8p.m."


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
                    " IN THE HISTORIC BREWERY CREEK DISTRICT.",

            //offtherail
            "About Off the Rail Brewing\n" +
                    " is equipped with a 2000 L brewhouse and both 4000 L and 2000 L fermentation tanks.\n" +
                    "\n" +
                    "We will be adding two 6000 L fermentation tanks that will be dedicated Pilsner and Lager vessels in the upcoming months.\n" +
                    "\n" +
                    "Our 4000 L tanks are home to our ‘main line’ beers with the 2000 L tanks normally reserved for seasonal brews.\n" +
                    "\n" +
                    "Many of our tasting room beers are done in a 45 L test batch system and are only available until the next batch is complete. Some make their way to a 2000 L batch of 650 mL bottles.\n" +
                    "\n" +
                    "Steve’s love for traditional English ales, German lagers, and US IPAs make up the majority of what we brew… along with a few other gems that we put into our tasting room rotation.",
            //postmark
            "About Postmark Brewing\n" +
                    "In the spring of 2013, three long-time friends with a passion for great beer dove head first into crafting their own quality-driven recipes – while having too much fun throughout the process. " +
                    "Postmark Brewing was born. With a work hard/play hard mentality, " +
                    "Postmark Brewing boasts a line up of sessionable craft beers that cater to the BC leisure and activity lifestyle.",
            //powelllogo
            "About Powell Street Craft Brewery\n" +
                    "Powell Street Craft Brewery is a microbrewery focused on producing high-quality, full-flavoured, handcrafted beers, using all natural and preferably local ingredients. Winner of Beer of the Year in Canada, 2013, for their Old Jalopy Pale Ale.",

            //steam
            "About Steamworks Brewing Company\n" +
                    "In 1995, when we first took hold of our historic Gastown brewpub location, we discovered that the building had a rare steam heat system, a remnant from forward thinkers of a century past.\n" +
                    "\n" +
                    "Our brewmaster had only read of steam-powered brewing, but had never seen a functional steam brewery. These are very rare indeed. We ventured forth, experimented and created a one-of-a-kind, steam-generated brewery – the only one in Canada. To our pleasure, we found our test brews to be distinctively fresh and flavourful. For nearly 20 years, beer aficionados have been migrating to our Steamworks brewpub for a taste of these unconventional beers.\n" +
                    "\n" +
                    "Since 2013, with the advent of our brewery in Burnaby Heights, you can now take the brewpub experience home with you. Bottling, kegging and canning tallboys, we’re still brewing with the power of steam.\n" +
                    "\n" +
                    "Find us in your local BC liquor or private liquor store, and in your favourite local restaurants and pubs very soon",
            //fellows
            "About Strange Fellows Brewing\n" +
                    "We are an East Vancouver craft brewery inspired by tradition and creativity, and go beyond the ordinary to celebrate that which is strange* and extraordinary.\n" +
                    "\n" +
                    "The beer we make is influenced both by old world traditions and West coast ingenuity as well as by seasonal ingredients. Our barrel programme promises unique aged beers, and we have a bit of a thing for sour beer.\n" +
                    "\n" +
                    "Open daily for growler fills and gathering with friends, our Tasting Room offers an ever-changing selection of beer as well as tasty locally sourced grub to go with.",

            //dog
            "About: Dogwood Brewing\n" +
                    "Opening in 2015, Dogwood Brewing will be Vancouver’s only organic brewery, with an emphasis on local BC ingredients and sustainable practices. Brewer owned and operated to" +
                    " bring you the best quality and flavours, with four varieties of beer in the works. Continue to check out the brewery’s website and Facebook page for updated information."
    };
    //Stanley inside subclass
    private int mSub1[] = {
            R.drawable.sub1_1, R.drawable.sub1_2, R.drawable.sub1_3, R.drawable.sub1_4
    };

    private String head1[] = {
            "Stanley Park Noble Pilsner", "Stanley Park 1897 Amber", "Stanley Park Windstorm",
            "Stanley Park DayTrip"
    };
    private String des1[] = {
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
    private int mSub2[] = {
            R.drawable.sub2_1, R.drawable.sub2_2, R.drawable.sub2_3
    };
    private String price2[] = {
            "Price: $5/16oz Glasses","Price: $5/16oz Glasses",
            "Price: $5/16oz Glasses",
            "Price: $5/16oz Glasses"
    };

    private String head2[] = {
            "Bomber Pilsner", "Bomber Pale Ale", "Bomber ESB"
    };
    private String des2[] = {
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
    private int mSub3[] = {

    };

    //acres inside subclass
    private int Sub4[] = {
            R.drawable.ac1, R.drawable.ac2, R.drawable.ac3
    };
    private String price4[] = {
            "Price: $4.25/10.5oz Glasses", "Price: $4.25/10.5oz Glasses"
            , "Price: $4.25/10.5oz Glasses"
    };
    private String Head4[] = {
            "33 ACRES OF LIFE", "33 ACRES OF OCEAN", "33 ACRES OF SUNSHINE"
    };
    private String Des4[] = {
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
    private int sub5[] = {
            R.drawable.an1, R.drawable.an2, R.drawable.an3, R.drawable.an4

    };
    private String price5[] = {
            "Price: $5/13oz Glasses", "Price: $5/13oz Glasses",
            "Price: $5/13oz Glasses", "Price: $6/13oz Glasses"
    };
    private String head5[] = {
            "Andina Totuma", "Andina Melcocha", "Andina Ayayay", "Andina Monita"

    };
    private String des5[] = {
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

    private int sub6[] = {
            R.drawable.br1, R.drawable.br2, R.drawable.br3, R.drawable.br4,
    };
    private String price6[] = {
            "Price: $14.50/6Bottle 330ml", "Price: $14.50/6Bottle 330ml",
            "Price: $14.50/6Bottle 330ml", "Price: $3.15/1Can 473ml"
    };
    private String head6[] = {
            "Grasshopper", "Tradition Ale", "Rhine Stone Cowboy", "Pilsner"

    };
    private String des6[] = {
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
                    "3.6%Alc./Vol. \n\n 18IBU\n\n" + "A Kolsh style ale born from the banks of the Rhine. Light in body and appearance, " +
                    "our Rhine Stone Cowboy ale contains aromas of clean malt, fruit, and a touch of noble hops. 2017 Ontario Brewing Awards – Bronze: Lagered Ale\n",
            "Brewed by:\nBig Rock Brewing Co \n\n" +
                    "Type:Czech style Pilsner\n\n" +
                    "4.9%Alc./Vol. \n\n 28IBU\n\n" + "Here’s a classic Pilsner born from the original Czech style, as reliable as Prague’s landmark time piece. " +
                    "The mild bitterness and fragrant hop nose of Czech’s Saaz hops are balanced with Pale malt. A thirst quenching experience… anytime."
    };
    private int sub7[] = {
            R.drawable.main1, R.drawable.main2, R.drawable.main3, R.drawable.main4

    };
    private String price7[] = {
            "Price: $4.50/12oz Glasses", "Price: $4.50/12oz Glasses",
            "Price: updating", "Price: $5/8oz Glasses"

    };
    private String head7[] = {
            "Main Street Pilsner", "Naked Fox IPA", "Old Knight Pale Ale", "No.7 Saison"

    };
    private String des7[] = {
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
                    "Style: IPA\n\n" +
                    "ABV: 6.8%\n\n" +
                    "IBU: 55\n\n" +
                    "Released: March 2016\n\n" +
                    "Born from infamy, our Naked Fox is a sly one. This dry IPA is brewed using a variety of North American and Southern Hemisphere hops," +
                    " packing in everything you’d want in hop flavour and aroma into a single beer." +
                    " The dryness on the malt side lets the hops shine through.",
            "Brewed by \nMain Street Brewing Co\n\n" +
                    "Style: IPA\n\n" +
                    "ABV: 5.5%\n\n" +
                    "IBU: 50\n\n" +
                    "Hops: Cascade hops\n\n" +
                    "Released: March 2016\n\n" +
                    "Named for our neighbours, the artist-run Western Front studio (former home of the Knights of Pythias), Old Knights Pale Ale is a Pacific" +
                    " Northwest take on the classic English Pale Ale – hop forward, aromatic with slight citrus and lots of pine notes. Brewed with Columbus and Cascade hops.",
            "Brewed by \nMain Street Brewing Co\n\n" +
                    "Style: Saison\n\n" +
                    "ABV: 6%\n\n" +
                    "IBU: 15\n\n" +
                    "Released: January 2015\n\n" +
                    "Saison No.7 is fermented with a blend of saison yeasts. Light in colour with a golden haze," +
                    " this farmhouse saison shows through with fruity esters, pepper and citrus notes. A perfect summer sipper."
    };

    private int sub8[] = {
            R.drawable.rail1, R.drawable.rail2, R.drawable.rail3, R.drawable.rail4
    };
    private String price8[] = {
            "Price: $4/12oz Glasses","Price: $4/12oz Glasses",
            "Price: $4/12oz Glasses","Price: $4/12oz Glasses"
    };
    private String head8[] = {
            "CLASSIC PALE ALE", "PSYCLE PATH LAGER",
            "CZECHMATE PILSNER", "CRAZY TRAIN IPA"
    };
    private String des8[] = {
            "Brewed by \nOff The Rail Brewing Co.\n\n" +
                    "Style: PALE ALE\n\n" +
                    "ABV: 5%\n\n" +
                    "IBU: 40\n\n" + "Our pale ale is made from premium 2-row and lightly roasted English Barley." +
                    " With well-rounded caramel flavor and pleasantly finished with traditional Golding hops, " +
                    "our ale will satisfy your taste buds and take you back to your favourite Old English Inn.",

            "Brewed by \nOff The Rail Brewing Co.\n\n" +
                    "Style: Lager\n\n" +
                    "ABV: 5%\n\n" +
                    "IBU: 12\n\n" +
                    "Our lager is well balanced, smooth and refreshing. Our lagers are not released until conditioning or “lagering” at lower temperatures is complete." +
                    " As someone else said, “we will serve no beer before its time,” and we know you will appreciate the difference in the time we take to mature our lager.",


            "Brewed by \nOff The Rail Brewing Co.\n\n" +
                    "Style: PILSNER\n\n" +
                    "ABV: 5.2%\n\n" +
                    "IBU: 22\n\n" + "Our Czech style pilsner combines premium pilsner malt and just the right amount of bittering hops to give this medium-bodied pilsner a full, well-rounded flavor." +
                    " A unique taste boldly finished with the noble Czech Saaz hop.",

            "Brewed by \nOff The Rail Brewing Co.\n\n" +
                    "Style: IPA\n\n" +
                    "ABV: 6.5%\n\n" +
                    "IBU: 75\n\n" + "Going Off The Rail for a Crazy Train! English style IPA with plenty of malt balance and substantial" +
                    " amounts of Chinook and Cascade for a full, rich flavour."

    };
    //postmark
    private int sub9[] = {
            R.drawable.pm1, R.drawable.pm2, R.drawable.pm3, R.drawable.pm4

    };
    private String price9[] = {
            "Price: $12.95/6pk cans","Price: $12.95/6pk cans",
            "Price: $11.75/6pk cans","Price: $12.95/6pk cans"
    };
    private String head9[] = {
            "Sevens IPA", "Postmark Stout", "Mosaic IPA", "PSF Lager"

    };
    private String des9[] = {
            "Brewed by \nPostmark Brewing Co.\n\n" +
                    "Style: IPA\n\n" +
                    "6.0% ABV\n\n" +
                    "52 IBU\n\n" +

                    "Balanced | Coastal | Mighty | Brewed in honour of the Canada Sevens; this IPA has large tropical notes and a balanced bitterness.",

            "Brewed by \nPostmark Brewing Co.\n\n" +
                    "Style: Stout\n\n" +
                    "4.8 ABV\n\n" +
                    "30 IBU\n\n" +

                    "Roasty | Dark | Refined | Designed for drinkability. This Stout has a perfectly balanced body with notes of chocolate, " +
                    "coffee and hints of caramel.",

            "Brewed by \nPostmark Brewing Co.\n\n" +
                    "Style: IPA\n\n" +
                    "6 ABV\n\n" +
                    "54 IBU\n\n" +

                    "Tropical | Golden | Polished | A golden IPA filled with the tropical notes of the Mosaic Hops. A profile perfect for a NW IPA.",

            "Brewed by \nPostmark Brewing Co.\n\n" +
                    "Style: Lager\n\n" +
                    "4.7 ABV\n\n" +
                    "18 IBU\n\n" +
                    "Tranquil | Striking | Pleasant | Brewed in collaboration with Pacific Salmon Foundation to support salmon conservation project in BC."

    };

    private int sub10[] = {
            R.drawable.powell1, R.drawable.powell2, R.drawable.powell3, R.drawable.powell4
    };
    private String price10[] = {
        "Price: $6.25/650ml","Price: $7.50/650ml",
            "Price: $7.50/650ml", "Price: $7.40/650ml"
    };

    private String head10[] = {
            "OLD JALOPY PALE ALE",
            "ODE TO CITRA PALE ALE",
            "LAZY D’HAZE IPA", "DIVE BOMB DARK ALE"
    };
    private String des10[] = {
            "Brewed by \nPowell Brewing Co.\n\n" +
                    "Style: Pale Ale" +
                    "5.5%ABV" +
                    "40IBU" +
                    "A twist on a traditional English Pale Ale. English pale and caramel malts combined with the spicy, " +
                    "citrusy, and floral notes of the North American Hop gives this ale a very distinct sensory profile.",

            "Brewed by \nPowell Brewing Co.\n\n" +
                    "Style: Pale Ale\n\n" +
                    "5.5%ABV\n\n" +
                    "35IBU\n\n" +
                    "Our West Coast style pale ale showcases the tropical juiciness of the Citra hop. " +
                    "Aromas of mango and passionfruit lead into flavours of sweet citrus, with a subtle malt finish. " +
                    "A tribute to one of our favourite hops, this amber coloured beer is as flavourful as it is sessionable. ",


            "Brewed by \nPowell Brewing Co.\n\n" +
                    "Style: IPA\n\n" +
                    "7%%ABV\n\n" +
                    "58IBU\n\n" +
                    "A North Eastern Style Hazy IPA showcasing the juiciness of Amarillo and Equinox hops." +
                    " Intense aromas of grapefruit, orange, apricot, melon, and berries are highlighted by the use of pale ale malt , " +
                    "vienna malt, and wheat. Let’s enjoy these Lazy D’haze.",

            "Brewed by \nPowell Brewing Co.\n\n" +
                    "Style: Dark Ale\n\n" +
                    "5%%ABV\n\n" +
                    "33IBU\n\n" +
                    "This dark ale is a light, refreshing, and sessionable. " +
                    "Flavours of caramel, toffee, chocolate and nuts are complimented with Golding hops that add just the right amount of bitterness and a slight floral aroma."

    };

    private int sub11[] = {
            R.drawable.steam1, R.drawable.steam2, R.drawable.steam3, R.drawable.steam4
    };
    private String price11[] = {
            "Price: 12.975$/6 x 355ml", "Price: 12.975$/6 x 355ml",
            "Price: 12.975$/6 x 355ml",  "Price: 12.975$/6 x 355ml"
    };
    private String head11[] = {
            "SUMMER ALE", "FLAGSHIP IPA", "WHITE ANGEL IPA", "PILSNER"
    };
    private String des11[] = {
            "Brewed by \nSteamworks Brewing Co.\n\n" +
                    "Style:Ale\n\n" +
                    "MALTS: Best Heidelberg, Wheat \n\n" +
                    "HOPS: Hüll Melon, Amarillo \n\n" +
                    "4.8% ABV\n\n" +
                    "20IBU\n\n" +
                    "Crisp and thirst quenching with a distinct citrus aroma, this wheat ale gets a " +
                    "refreshing kick from sweet orange peel, lemon peel and grains of paradise. The balance of bright citrus, " +
                    "fruity hops, and spice make this lively brew perfect for any summer day." +
                    " Perfect for poolside chilling or more intrepid adventures. ",

            "Brewed by \nSteamworks Brewing Co.\n\n" +
                    "Style: IPA\n\n" +
                    "MALTS: Premium 2-Row, Caramalt, Carapils & Oat Malt \n\n" +
                    "HOPS: Mosaic, Galaxy & Citra \n\n" +
                    "4.8% ABV\n\n" +
                    "20IBU\n\n" +
                    "At last this steam-powered flagship has sailed into port. This Northeast style IPA is generously hopped with Mosaic, Galaxy & Citra and pours cloudy with an intense juicy, " +
                    "tropical fruit aroma that gives way to a balanced bitterness. Steamworks Flagship IPA is a confident and powerful brew perfect for discerning hop-heads and casual drinkers alike. " +
                    "This Flagship IPA recently picked up Gold for North American IPA as well as Best in Show from the 2016 BC Beer Awards.",

            "Brewed by \nSteamworks Brewing Co.\n\n" +
                    "Style: IPA\n\n" +
                    "MALTS: Pilsner, Unmalted Wheat & Wheat \n\n" +
                    "HOPS:  Cascade, Centennial & Galaxy \n\n" +
                    "6.9% ABV\n\n" +
                    "60IBU\n\n" +
                    "\n" +
                    "This angelic White IPA leads with beautiful citrus aromas from Cascade, Centennial and Galaxy hops that meld with Belgian yeast, " +
                    "coriander and orange peel. The combination of herbs, and hops creates a fruity and spicy quality in the finish," +
                    " while the Belgian-style yeast strains adds hints of bubblegum and clove.",

            "Brewed by \nSteamworks Brewing Co.\n\n" +
                    "Style: Pilsner\n\n" +
                    "MALTS: Pilsner \n\n" +
                    "HOPS: Magnum, Tradition, Tettnang, Spalt select, Saphir\n\n" +
                    "5% ABV\n\n" +
                    "30IBU\n\n" +
                    "The most popular beers in the world call themselves Pilsners, but they barely resemble the original from the city of Pilsn in the Czech Republic that gave its name to the style in 1842." +
                    " Steamworks’ version comes close, which explains why it has won Best Beer in BC for two years running. It is a rich, malty lager with a spicy, floral hop character – crisp, complex and delicious."

    };

    private int sub12[] = {
            R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4
    };
    private String price12[] = {
            "Price: 13.90$/6pk cans(Craft Retailer)","Price: 13.90$/6pk cans(Craft Retailer)","Price: 13.90$/6pk cans(Craft Retailer)","Price: 13.90$/6pk cans(Craft Retailer)"

    };
    private String head12[] = {
            "Talisman Pale Ale", "Jongleur", "Guardian IPA", "Nocturnum Galactica"
    };
    private String des12[] = {
            "Brewed by \nStrange Fellows Brewing Co.\n\n" +
                    "Style: West Coast Pale Ale\n\n" +
                    "MALTS: Maris Otter, Pale \n\n" +
                    "HOPS: Assertive \n\n" +
                    "4% ABV\n\n" +
                    "29IBU\n\n" +
                    "\n" +
                    "The Siren of the Seas is a fickle creature: benevolent or spiteful, she can bestow a safe passage & a bountiful catch, or provoke storms & shipwrecks. " +
                    "Sailors have long cast gifts of flowers, food or trinkets into the sea in exchange for good fortune. " +
                    "Talisman – our delicately dry-hopped & golden-hued ale with its tropical & citrusy aroma – may be just the thing to encourage the Siren’s blessing.",

            "Brewed by \nStrange Fellows Brewing Co.\n\n" +
                    "Style: BELGIAN STYLE WIT\n\n" +
                    "Yeast: Dual Belgian Strains \n\n" +
                    "HOPS: Subdued \n\n" +
                    "4.5% ABV\n\n" +
                    "12IBU\n\n" +
                    "Amid bursts of confetti & music, the Juggler entertains us with a handful of oranges. As the oranges rise & fall, the planets revolve in the universe, babies are born," +
                    " & the old pass on. Jongleur – our silky bodied, spicy & aromatic Wit – infuses any moment with a spark of joy." +
                    " A glass of this bright & refreshing beer reminds us of the juggler’s simple lesson: to take pleasure in both the big & the small things in life.",

            "Brewed by \nStrange Fellows Brewing Co.\n\n" +
                    "Style: White IPA\n\n" +
                    "Yeast: Proprietary \n\n" +
                    "HOPS: Amarillo & Dry-Hopped With Citra\n\n" +
                    "6.5% ABV\n\n" +
                    "60IBU\n\n" +
                    "The Dragon embodies those things we fear, wound up in a mass of greed & destruction, while the valiant knight is our protector, fated to save us from ruin." +
                    " Our Guardian White IPA – with the spicy character of a Wit & the hops of an IPA – is inspired by this legendary battle between good & evil.  So if you have a dragon to slay, make the act more enjoyable with this bold & flavourful beer.",

            "Brewed by \nStrange Fellows Brewing Co.\n\n" +
                    "Style: DARK IPA\n\n" +
                    "Yeast: No Detail\n\n" +
                    "HOPS: No Detail \n\n" +
                    "6.5% ABV\n\n" +
                    "65IBU\n\n" +
                    "With his insatiable appetite, the Wolf is guilty of devouring livestock & little old ladies, & is even thought to be able to swallow the sun. People of the old country observe strange rituals to appease his hunger, " +
                    "& never leave the house after dark for fear of being eaten. Maybe we’re not all superstitious, but it wouldn’t hurt to stay indoors with friends & share a glass of Nocturnum – our robust & balanced dark hoppy ale – brewed to keep evil at bay."
    };

    private int sub13[] = {
            R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4

    };

    private String price13[] = {
        "Price: 11.65$/6pk cans","Price: 11.95$/6pk cans","Price: 11.95$/6pk cans","Price: 11.95$/6pk cans"
    };
    private String head13[] = {
            "HONEY", "FEST", "IPA", "STOUT"
    };

    private String des13[] = {
            "Brewed by \nDog Wood Brewing Co.\n\n" +
                    "Style: Lager\n\n" +
                    "4.5% ABV\n\n" +
                    "15IBU\n\n" +
                    "Bees go to the end of the earth twice (roughly 100,000km) to produce the honey for our beer. " +
                    " Crisp, clean and refreshing with just a touch of honey sweetness. ",
            "Brewed by \nDog Wood Brewing Co.\n\n" +
                    "Style: Märzen / Oktoberfest \n\n" +
                    "6.9% ABV\n\n" +
                    "20IBU\n\n" +
                    "Inspired by a 300 year old recipe for a German festival beer and brewed with Weihenstephan yeast," +
                    " the oldest brewery in the world.  Rich and malty with a balanced sweetness.",

            "Brewed by \nDog Wood Brewing Co.\n\n" +
                    "Style: IPA \n\n" +
                    "5.9% ABV\n\n" +
                    "50IBU\n\n" +
                    "This IPA showcases the beauty of West Coast hops, grown by our friends at Harvesters of Organic Hops.  " +
                    "Deep golden in color with an enduring hop aroma.",


            "Brewed by \nDog Wood Brewing Co.\n\n" +
                    "Style: STOUT \n\n" +
                    "4% ABV\n\n" +
                    "20IBU\n\n" +
                    "This is not your typical stout. Refreshingly light and crisp, this stout boasts bold flavours of cold brew coffee, " +
                    "chocolate and a hint of molasses. Popular all year round. "
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
        String acesHead = Head4[a];
        return acesHead;
    }

    public String getDes4(int a) {
        String acesDes = Des4[a];
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

    public int getSub8(int a) {
        int railSub = sub8[a];
        return railSub;
    }

    public String getHead8(int a) {
        String railHead = head8[a];
        return railHead;
    }

    public String getDes8(int a) {
        String railDes = des8[a];
        return railDes;
    }

    public int getSub9(int a) {
        int postSub = sub9[a];
        return postSub;
    }

    public String getHead9(int a) {
        String postHead = head9[a];
        return postHead;
    }

    public String getDes9(int a) {
        String postDes = des9[a];
        return postDes;
    }

    public int getSub10(int a) {
        int powellsub = sub10[a];
        return powellsub;
    }

    public String getHead10(int a) {
        String powellHead = head10[a];
        return powellHead;
    }

    public String getDes10(int a) {
        String powellDes = des10[a];
        return powellDes;
    }

    public int getSub11(int a) {
        int steamSub = sub11[a];
        return steamSub;
    }

    public String getHead11(int a) {
        String steamHead = head11[a];
        return steamHead;
    }

    public String getDes11(int a) {
        String steamDes = des11[a];
        return steamDes;

    }

    public int getSub12(int a) {
        int fs12 = sub12[a];
        return fs12;
    }

    public String getHead12(int a) {
        String fh12 = head12[a];
        return fh12;
    }

    public String getDes12(int a) {
        String fd12 = des12[a];
        return fd12;
    }

    public int getSub13(int a) {
        int dw13 = sub13[a];
        return dw13;
    }

    public String getHead13(int a) {
        String dh13 = head13[a];
        return dh13;
    }

    public String getDes13(int a) {
        String dd13 = des13[a];
        return dd13;

    }
    public String getPrice2(int a) {
        String p2 = price2[a];
        return p2;
    }
    public String getPrice4(int a) {
        String p4 = price4[a];
        return p4;
    }
    public String getPrice5(int a) {
        String p5 = price5[a];
        return p5;
    }
    public String getPrice6(int a) {
        String p6 = price6[a];
        return p6;
    }
    public String getPrice7(int a) {
        String p7 = price7[a];
        return p7;
    }
    public String getPrice8(int a) {
        String p8 = price8[a];
        return p8;
    }
    public String getPrice9(int a) {
        String p9 = price9[a];
        return p9;
    }
    public String getPrice10(int a) {
        String p10 = price10[a];
        return p10;
    }
    public String getPrice11(int a) {
        String p11 = price11[a];
        return p11;
    }
    public String getPrice12(int a) {
        String p12 = price12[a];
        return p12;
    }
    public String getPrice13(int a) {
        String p13 = price13[a];
        return p13;
    }
}