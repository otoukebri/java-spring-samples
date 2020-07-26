package tn.zelda.projects.salesapp;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by zelda on 12/02/17.
 */

@FeignClient("customer-service")
public interface CustomerClient {


}
