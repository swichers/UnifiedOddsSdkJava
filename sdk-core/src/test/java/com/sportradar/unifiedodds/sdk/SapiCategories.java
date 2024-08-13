/*
 * Copyright (C) Sportradar AG. See LICENSE for full license governing this code
 */
package com.sportradar.unifiedodds.sdk;

import com.sportradar.uf.sportsapi.datamodel.SapiCategory;

public class SapiCategories {

    public static SapiCategory international() {
        SapiCategory category = new SapiCategory();
        category.setId("sr:category:4");
        category.setName("International");
        return category;
    }

    public static SapiCategory nascar() {
        SapiCategory category = new SapiCategory();
        category.setId("sr:category:6");
        category.setName("NASCAR");
        return category;
    }

    public static SapiCategory usa() {
        SapiCategory category = new SapiCategory();
        category.setId("sr:category:37");
        category.setName("USA");
        category.setCountryCode("USA");
        return category;
    }

    public static SapiCategory england() {
        SapiCategory category = new SapiCategory();
        category.setId("sr:category:1");
        category.setName("England");
        category.setCountryCode("ENG");
        return category;
    }

    public static SapiCategory formula1() {
        SapiCategory category = new SapiCategory();
        category.setId("sr:category:36");
        category.setName("Formula 1");
        return category;
    }
}
