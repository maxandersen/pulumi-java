// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.azurenative.appplatform.outputs.GatewayApiMetadataPropertiesResponse;
import com.pulumi.azurenative.appplatform.outputs.GatewayCorsPropertiesResponse;
import com.pulumi.azurenative.appplatform.outputs.GatewayInstanceResponse;
import com.pulumi.azurenative.appplatform.outputs.GatewayOperatorPropertiesResponse;
import com.pulumi.azurenative.appplatform.outputs.GatewayResourceRequestsResponse;
import com.pulumi.azurenative.appplatform.outputs.SsoPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayPropertiesResponse {
    /**
     * API metadata property for Spring Cloud Gateway
     * 
     */
    private final @Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties;
    /**
     * Cross-Origin Resource Sharing property
     * 
     */
    private final @Nullable GatewayCorsPropertiesResponse corsProperties;
    /**
     * Indicate if only https is allowed.
     * 
     */
    private final @Nullable Boolean httpsOnly;
    /**
     * Collection of instances belong to Spring Cloud Gateway.
     * 
     */
    private final List<GatewayInstanceResponse> instances;
    /**
     * Properties of the Spring Cloud Gateway Operator.
     * 
     */
    private final GatewayOperatorPropertiesResponse operatorProperties;
    /**
     * State of the Spring Cloud Gateway.
     * 
     */
    private final String provisioningState;
    /**
     * Indicates whether the Spring Cloud Gateway exposes endpoint.
     * 
     */
    private final @Nullable Boolean public_;
    /**
     * The requested resource quantity for required CPU and Memory.
     * 
     */
    private final @Nullable GatewayResourceRequestsResponse resourceRequests;
    /**
     * Single sign-on related configuration
     * 
     */
    private final @Nullable SsoPropertiesResponse ssoProperties;
    /**
     * URL of the Spring Cloud Gateway, exposed when &#39;public&#39; is true.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GatewayPropertiesResponse(
        @CustomType.Parameter("apiMetadataProperties") @Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties,
        @CustomType.Parameter("corsProperties") @Nullable GatewayCorsPropertiesResponse corsProperties,
        @CustomType.Parameter("httpsOnly") @Nullable Boolean httpsOnly,
        @CustomType.Parameter("instances") List<GatewayInstanceResponse> instances,
        @CustomType.Parameter("operatorProperties") GatewayOperatorPropertiesResponse operatorProperties,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("public") @Nullable Boolean public_,
        @CustomType.Parameter("resourceRequests") @Nullable GatewayResourceRequestsResponse resourceRequests,
        @CustomType.Parameter("ssoProperties") @Nullable SsoPropertiesResponse ssoProperties,
        @CustomType.Parameter("url") String url) {
        this.apiMetadataProperties = apiMetadataProperties;
        this.corsProperties = corsProperties;
        this.httpsOnly = httpsOnly;
        this.instances = instances;
        this.operatorProperties = operatorProperties;
        this.provisioningState = provisioningState;
        this.public_ = public_;
        this.resourceRequests = resourceRequests;
        this.ssoProperties = ssoProperties;
        this.url = url;
    }

    /**
     * API metadata property for Spring Cloud Gateway
     * 
    */
    public Optional<GatewayApiMetadataPropertiesResponse> apiMetadataProperties() {
        return Optional.ofNullable(this.apiMetadataProperties);
    }
    /**
     * Cross-Origin Resource Sharing property
     * 
    */
    public Optional<GatewayCorsPropertiesResponse> corsProperties() {
        return Optional.ofNullable(this.corsProperties);
    }
    /**
     * Indicate if only https is allowed.
     * 
    */
    public Optional<Boolean> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }
    /**
     * Collection of instances belong to Spring Cloud Gateway.
     * 
    */
    public List<GatewayInstanceResponse> instances() {
        return this.instances;
    }
    /**
     * Properties of the Spring Cloud Gateway Operator.
     * 
    */
    public GatewayOperatorPropertiesResponse operatorProperties() {
        return this.operatorProperties;
    }
    /**
     * State of the Spring Cloud Gateway.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Indicates whether the Spring Cloud Gateway exposes endpoint.
     * 
    */
    public Optional<Boolean> public_() {
        return Optional.ofNullable(this.public_);
    }
    /**
     * The requested resource quantity for required CPU and Memory.
     * 
    */
    public Optional<GatewayResourceRequestsResponse> resourceRequests() {
        return Optional.ofNullable(this.resourceRequests);
    }
    /**
     * Single sign-on related configuration
     * 
    */
    public Optional<SsoPropertiesResponse> ssoProperties() {
        return Optional.ofNullable(this.ssoProperties);
    }
    /**
     * URL of the Spring Cloud Gateway, exposed when &#39;public&#39; is true.
     * 
    */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties;
        private @Nullable GatewayCorsPropertiesResponse corsProperties;
        private @Nullable Boolean httpsOnly;
        private List<GatewayInstanceResponse> instances;
        private GatewayOperatorPropertiesResponse operatorProperties;
        private String provisioningState;
        private @Nullable Boolean public_;
        private @Nullable GatewayResourceRequestsResponse resourceRequests;
        private @Nullable SsoPropertiesResponse ssoProperties;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiMetadataProperties = defaults.apiMetadataProperties;
    	      this.corsProperties = defaults.corsProperties;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.instances = defaults.instances;
    	      this.operatorProperties = defaults.operatorProperties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.public_ = defaults.public_;
    	      this.resourceRequests = defaults.resourceRequests;
    	      this.ssoProperties = defaults.ssoProperties;
    	      this.url = defaults.url;
        }

        public Builder apiMetadataProperties(@Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties) {
            this.apiMetadataProperties = apiMetadataProperties;
            return this;
        }
        public Builder corsProperties(@Nullable GatewayCorsPropertiesResponse corsProperties) {
            this.corsProperties = corsProperties;
            return this;
        }
        public Builder httpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }
        public Builder instances(List<GatewayInstanceResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(GatewayInstanceResponse... instances) {
            return instances(List.of(instances));
        }
        public Builder operatorProperties(GatewayOperatorPropertiesResponse operatorProperties) {
            this.operatorProperties = Objects.requireNonNull(operatorProperties);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder public_(@Nullable Boolean public_) {
            this.public_ = public_;
            return this;
        }
        public Builder resourceRequests(@Nullable GatewayResourceRequestsResponse resourceRequests) {
            this.resourceRequests = resourceRequests;
            return this;
        }
        public Builder ssoProperties(@Nullable SsoPropertiesResponse ssoProperties) {
            this.ssoProperties = ssoProperties;
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GatewayPropertiesResponse build() {
            return new GatewayPropertiesResponse(apiMetadataProperties, corsProperties, httpsOnly, instances, operatorProperties, provisioningState, public_, resourceRequests, ssoProperties, url);
        }
    }
}
