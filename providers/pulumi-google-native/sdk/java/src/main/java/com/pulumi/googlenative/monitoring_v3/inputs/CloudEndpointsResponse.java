// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Cloud Endpoints service. Learn more at https://cloud.google.com/endpoints.
 * 
 */
public final class CloudEndpointsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudEndpointsResponse Empty = new CloudEndpointsResponse();

    /**
     * The name of the Cloud Endpoints service underlying this service. Corresponds to the service resource label in the api monitored resource: https://cloud.google.com/monitoring/api/resources#tag_api
     * 
     */
    @Import(name="service", required=true)
    private String service;

    public String service() {
        return this.service;
    }

    private CloudEndpointsResponse() {}

    private CloudEndpointsResponse(CloudEndpointsResponse $) {
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudEndpointsResponse $;

        public Builder() {
            $ = new CloudEndpointsResponse();
        }

        public Builder(CloudEndpointsResponse defaults) {
            $ = new CloudEndpointsResponse(Objects.requireNonNull(defaults));
        }

        public Builder service(String service) {
            $.service = service;
            return this;
        }

        public CloudEndpointsResponse build() {
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
