// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayRequestRoutingRuleResponse {
    /**
     * Backend address pool resource of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse backendAddressPool;
    /**
     * Backend http settings resource of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse backendHttpSettings;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Http listener resource of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse httpListener;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the request routing rule that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * Priority of the request routing rule.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The provisioning state of the request routing rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * Redirect configuration resource of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse redirectConfiguration;
    /**
     * Rewrite Rule Set resource in Basic rule of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse rewriteRuleSet;
    /**
     * Rule type.
     * 
     */
    private final @Nullable String ruleType;
    /**
     * Type of the resource.
     * 
     */
    private final String type;
    /**
     * URL path map resource of the application gateway.
     * 
     */
    private final @Nullable SubResourceResponse urlPathMap;

    @CustomType.Constructor
    private ApplicationGatewayRequestRoutingRuleResponse(
        @CustomType.Parameter("backendAddressPool") @Nullable SubResourceResponse backendAddressPool,
        @CustomType.Parameter("backendHttpSettings") @Nullable SubResourceResponse backendHttpSettings,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("httpListener") @Nullable SubResourceResponse httpListener,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("redirectConfiguration") @Nullable SubResourceResponse redirectConfiguration,
        @CustomType.Parameter("rewriteRuleSet") @Nullable SubResourceResponse rewriteRuleSet,
        @CustomType.Parameter("ruleType") @Nullable String ruleType,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("urlPathMap") @Nullable SubResourceResponse urlPathMap) {
        this.backendAddressPool = backendAddressPool;
        this.backendHttpSettings = backendHttpSettings;
        this.etag = etag;
        this.httpListener = httpListener;
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.provisioningState = provisioningState;
        this.redirectConfiguration = redirectConfiguration;
        this.rewriteRuleSet = rewriteRuleSet;
        this.ruleType = ruleType;
        this.type = type;
        this.urlPathMap = urlPathMap;
    }

    /**
     * Backend address pool resource of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> backendAddressPool() {
        return Optional.ofNullable(this.backendAddressPool);
    }
    /**
     * Backend http settings resource of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> backendHttpSettings() {
        return Optional.ofNullable(this.backendHttpSettings);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Http listener resource of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> httpListener() {
        return Optional.ofNullable(this.httpListener);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the request routing rule that is unique within an Application Gateway.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Priority of the request routing rule.
     * 
    */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The provisioning state of the request routing rule resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Redirect configuration resource of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> redirectConfiguration() {
        return Optional.ofNullable(this.redirectConfiguration);
    }
    /**
     * Rewrite Rule Set resource in Basic rule of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> rewriteRuleSet() {
        return Optional.ofNullable(this.rewriteRuleSet);
    }
    /**
     * Rule type.
     * 
    */
    public Optional<String> ruleType() {
        return Optional.ofNullable(this.ruleType);
    }
    /**
     * Type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * URL path map resource of the application gateway.
     * 
    */
    public Optional<SubResourceResponse> urlPathMap() {
        return Optional.ofNullable(this.urlPathMap);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRequestRoutingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse backendAddressPool;
        private @Nullable SubResourceResponse backendHttpSettings;
        private String etag;
        private @Nullable SubResourceResponse httpListener;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String provisioningState;
        private @Nullable SubResourceResponse redirectConfiguration;
        private @Nullable SubResourceResponse rewriteRuleSet;
        private @Nullable String ruleType;
        private String type;
        private @Nullable SubResourceResponse urlPathMap;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRequestRoutingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.backendHttpSettings = defaults.backendHttpSettings;
    	      this.etag = defaults.etag;
    	      this.httpListener = defaults.httpListener;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.redirectConfiguration = defaults.redirectConfiguration;
    	      this.rewriteRuleSet = defaults.rewriteRuleSet;
    	      this.ruleType = defaults.ruleType;
    	      this.type = defaults.type;
    	      this.urlPathMap = defaults.urlPathMap;
        }

        public Builder backendAddressPool(@Nullable SubResourceResponse backendAddressPool) {
            this.backendAddressPool = backendAddressPool;
            return this;
        }
        public Builder backendHttpSettings(@Nullable SubResourceResponse backendHttpSettings) {
            this.backendHttpSettings = backendHttpSettings;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder httpListener(@Nullable SubResourceResponse httpListener) {
            this.httpListener = httpListener;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder redirectConfiguration(@Nullable SubResourceResponse redirectConfiguration) {
            this.redirectConfiguration = redirectConfiguration;
            return this;
        }
        public Builder rewriteRuleSet(@Nullable SubResourceResponse rewriteRuleSet) {
            this.rewriteRuleSet = rewriteRuleSet;
            return this;
        }
        public Builder ruleType(@Nullable String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder urlPathMap(@Nullable SubResourceResponse urlPathMap) {
            this.urlPathMap = urlPathMap;
            return this;
        }        public ApplicationGatewayRequestRoutingRuleResponse build() {
            return new ApplicationGatewayRequestRoutingRuleResponse(backendAddressPool, backendHttpSettings, etag, httpListener, id, name, priority, provisioningState, redirectConfiguration, rewriteRuleSet, ruleType, type, urlPathMap);
        }
    }
}
