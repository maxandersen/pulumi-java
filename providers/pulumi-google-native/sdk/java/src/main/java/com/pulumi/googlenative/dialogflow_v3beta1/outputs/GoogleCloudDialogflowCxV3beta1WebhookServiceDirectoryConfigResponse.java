// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse {
    /**
     * Generic Service configuration of this webhook.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService;
    /**
     * The name of [Service Directory](https://cloud.google.com/service-directory) service. Format: `projects//locations//namespaces//services/`. `Location ID` of the service directory must be the same as the location of the agent.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse(
        @CustomType.Parameter("genericWebService") GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService,
        @CustomType.Parameter("service") String service) {
        this.genericWebService = genericWebService;
        this.service = service;
    }

    /**
     * Generic Service configuration of this webhook.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService() {
        return this.genericWebService;
    }
    /**
     * The name of [Service Directory](https://cloud.google.com/service-directory) service. Format: `projects//locations//namespaces//services/`. `Location ID` of the service directory must be the same as the location of the agent.
     * 
    */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.genericWebService = defaults.genericWebService;
    	      this.service = defaults.service;
        }

        public Builder genericWebService(GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService) {
            this.genericWebService = Objects.requireNonNull(genericWebService);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse build() {
            return new GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse(genericWebService, service);
        }
    }
}
