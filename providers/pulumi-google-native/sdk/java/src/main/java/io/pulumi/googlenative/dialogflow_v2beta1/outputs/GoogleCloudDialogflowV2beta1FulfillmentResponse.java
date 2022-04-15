// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1FulfillmentResponse {
    /**
     * The human-readable name of the fulfillment, unique within the agent. This field is not used for Fulfillment in an Environment.
     * 
     */
    private final String displayName;
    /**
     * Whether fulfillment is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * The field defines whether the fulfillment is enabled for certain features.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse> features;
    /**
     * Configuration for a generic web service.
     * 
     */
    private final GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse genericWebService;
    /**
     * The unique identifier of the fulfillment. Supported formats: - `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used for Fulfillment in an Environment.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1FulfillmentResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("features") List<GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse> features,
        @CustomType.Parameter("genericWebService") GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse genericWebService,
        @CustomType.Parameter("name") String name) {
        this.displayName = displayName;
        this.enabled = enabled;
        this.features = features;
        this.genericWebService = genericWebService;
        this.name = name;
    }

    /**
     * The human-readable name of the fulfillment, unique within the agent. This field is not used for Fulfillment in an Environment.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Whether fulfillment is enabled.
     * 
    */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * The field defines whether the fulfillment is enabled for certain features.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse> features() {
        return this.features;
    }
    /**
     * Configuration for a generic web service.
     * 
    */
    public GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse genericWebService() {
        return this.genericWebService;
    }
    /**
     * The unique identifier of the fulfillment. Supported formats: - `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used for Fulfillment in an Environment.
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1FulfillmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private Boolean enabled;
        private List<GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse> features;
        private GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse genericWebService;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1FulfillmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.features = defaults.features;
    	      this.genericWebService = defaults.genericWebService;
    	      this.name = defaults.name;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder features(List<GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse> features) {
            this.features = Objects.requireNonNull(features);
            return this;
        }
        public Builder features(GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse... features) {
            return features(List.of(features));
        }
        public Builder genericWebService(GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse genericWebService) {
            this.genericWebService = Objects.requireNonNull(genericWebService);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GoogleCloudDialogflowV2beta1FulfillmentResponse build() {
            return new GoogleCloudDialogflowV2beta1FulfillmentResponse(displayName, enabled, features, genericWebService, name);
        }
    }
}
