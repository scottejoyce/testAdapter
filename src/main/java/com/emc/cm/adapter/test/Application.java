/*
 * Copyright © 2016-2022 Dell Inc. or its subsidiaries.
 * All Rights Reserved.
 */

package com.emc.cm.adapter.obsdetails;

import com.emc.autoconfigure.CloudIQ;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableAutoConfiguration
@EnableConfigurationProperties
@EnableEurekaClient
@CloudIQ
public class Application {

	public static void main(String[] args) {
	 
	    SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
	}

}
