/*
 * Copyright © 2016-2022 Dell Inc. or its subsidiaries.
 * All Rights Reserved.
 */

package com.emc.cm.adapter.obsdetails;

import com.emc.autoconfigure.CloudIQ;
import org.springframework.boot.SpringApplication;

@CloudIQ
public class TestApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(TestApplication.class, args);
    }
}
