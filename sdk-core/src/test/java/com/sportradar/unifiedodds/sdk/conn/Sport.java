/*
 * Copyright (C) Sportradar AG. See LICENSE for full license governing this code
 */
package com.sportradar.unifiedodds.sdk.conn;

import com.sportradar.utils.Urn;

public enum Sport {
    FOOTBALL(Urn.parse("sr:sport:1")),
    FUTSAL(Urn.parse("sr:sport:29")),
    FORMULA1(Urn.parse("sr:sport:40")),
    ESPORT_DOTA(Urn.parse("sr:sport:111")),
    GOLF(Urn.parse("sr:sport:9")),
    TENNIS(Urn.parse("sr:sport:5")),
    BASEBALL(Urn.parse("sr:sport:3"));

    private final Urn urn;

    private Sport(Urn urn) {
        this.urn = urn;
    }

    public Urn getUrn() {
        return urn;
    }
}
