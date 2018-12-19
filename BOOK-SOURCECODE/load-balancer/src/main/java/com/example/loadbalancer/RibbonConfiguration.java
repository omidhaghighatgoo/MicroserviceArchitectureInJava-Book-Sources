package com.example.loadbalancer;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * Created by OmiD.HaghighatgoO on 10/21/2018.
 */

    public class RibbonConfiguration {

        @Autowired
        IClientConfig ribbonClient;

        @Bean
        public IPing ping(IClientConfig config) {
            return new PingUrl();
        }

        public IRule rule(IClientConfig config) {
            return new AvailabilityFilteringRule();
        }


    }


