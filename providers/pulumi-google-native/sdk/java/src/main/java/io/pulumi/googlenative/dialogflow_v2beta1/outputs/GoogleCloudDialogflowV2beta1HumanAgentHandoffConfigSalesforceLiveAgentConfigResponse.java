// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse {
    /**
     * Live Agent chat button ID.
     * 
     */
    private final String buttonId;
    /**
     * Live Agent deployment ID.
     * 
     */
    private final String deploymentId;
    /**
     * Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
     * 
     */
    private final String endpointDomain;
    /**
     * The organization ID of the Salesforce account.
     * 
     */
    private final String organizationId;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse(
        @CustomType.Parameter("buttonId") String buttonId,
        @CustomType.Parameter("deploymentId") String deploymentId,
        @CustomType.Parameter("endpointDomain") String endpointDomain,
        @CustomType.Parameter("organizationId") String organizationId) {
        this.buttonId = buttonId;
        this.deploymentId = deploymentId;
        this.endpointDomain = endpointDomain;
        this.organizationId = organizationId;
    }

    /**
     * Live Agent chat button ID.
     * 
    */
    public String buttonId() {
        return this.buttonId;
    }
    /**
     * Live Agent deployment ID.
     * 
    */
    public String deploymentId() {
        return this.deploymentId;
    }
    /**
     * Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
     * 
    */
    public String endpointDomain() {
        return this.endpointDomain;
    }
    /**
     * The organization ID of the Salesforce account.
     * 
    */
    public String organizationId() {
        return this.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String buttonId;
        private String deploymentId;
        private String endpointDomain;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttonId = defaults.buttonId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.endpointDomain = defaults.endpointDomain;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder buttonId(String buttonId) {
            this.buttonId = Objects.requireNonNull(buttonId);
            return this;
        }
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }
        public Builder endpointDomain(String endpointDomain) {
            this.endpointDomain = Objects.requireNonNull(endpointDomain);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }        public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse(buttonId, deploymentId, endpointDomain, organizationId);
        }
    }
}
