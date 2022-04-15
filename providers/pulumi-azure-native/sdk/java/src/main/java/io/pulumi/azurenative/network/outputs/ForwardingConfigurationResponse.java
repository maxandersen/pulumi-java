// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.CacheConfigurationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ForwardingConfigurationResponse {
    /**
     * A reference to the BackendPool which this rule routes to.
     * 
     */
    private final @Nullable SubResourceResponse backendPool;
    /**
     * The caching configuration associated with this rule.
     * 
     */
    private final @Nullable CacheConfigurationResponse cacheConfiguration;
    /**
     * A custom path used to rewrite resource paths matched by this rule. Leave empty to use incoming path.
     * 
     */
    private final @Nullable String customForwardingPath;
    /**
     * Protocol this rule will use when forwarding traffic to backends.
     * 
     */
    private final @Nullable String forwardingProtocol;
    /**
     * Expected value is '#Microsoft.Azure.FrontDoor.Models.FrontdoorForwardingConfiguration'.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private ForwardingConfigurationResponse(
        @CustomType.Parameter("backendPool") @Nullable SubResourceResponse backendPool,
        @CustomType.Parameter("cacheConfiguration") @Nullable CacheConfigurationResponse cacheConfiguration,
        @CustomType.Parameter("customForwardingPath") @Nullable String customForwardingPath,
        @CustomType.Parameter("forwardingProtocol") @Nullable String forwardingProtocol,
        @CustomType.Parameter("odataType") String odataType) {
        this.backendPool = backendPool;
        this.cacheConfiguration = cacheConfiguration;
        this.customForwardingPath = customForwardingPath;
        this.forwardingProtocol = forwardingProtocol;
        this.odataType = odataType;
    }

    /**
     * A reference to the BackendPool which this rule routes to.
     * 
    */
    public Optional<SubResourceResponse> backendPool() {
        return Optional.ofNullable(this.backendPool);
    }
    /**
     * The caching configuration associated with this rule.
     * 
    */
    public Optional<CacheConfigurationResponse> cacheConfiguration() {
        return Optional.ofNullable(this.cacheConfiguration);
    }
    /**
     * A custom path used to rewrite resource paths matched by this rule. Leave empty to use incoming path.
     * 
    */
    public Optional<String> customForwardingPath() {
        return Optional.ofNullable(this.customForwardingPath);
    }
    /**
     * Protocol this rule will use when forwarding traffic to backends.
     * 
    */
    public Optional<String> forwardingProtocol() {
        return Optional.ofNullable(this.forwardingProtocol);
    }
    /**
     * Expected value is '#Microsoft.Azure.FrontDoor.Models.FrontdoorForwardingConfiguration'.
     * 
    */
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardingConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse backendPool;
        private @Nullable CacheConfigurationResponse cacheConfiguration;
        private @Nullable String customForwardingPath;
        private @Nullable String forwardingProtocol;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardingConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPool = defaults.backendPool;
    	      this.cacheConfiguration = defaults.cacheConfiguration;
    	      this.customForwardingPath = defaults.customForwardingPath;
    	      this.forwardingProtocol = defaults.forwardingProtocol;
    	      this.odataType = defaults.odataType;
        }

        public Builder backendPool(@Nullable SubResourceResponse backendPool) {
            this.backendPool = backendPool;
            return this;
        }
        public Builder cacheConfiguration(@Nullable CacheConfigurationResponse cacheConfiguration) {
            this.cacheConfiguration = cacheConfiguration;
            return this;
        }
        public Builder customForwardingPath(@Nullable String customForwardingPath) {
            this.customForwardingPath = customForwardingPath;
            return this;
        }
        public Builder forwardingProtocol(@Nullable String forwardingProtocol) {
            this.forwardingProtocol = forwardingProtocol;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public ForwardingConfigurationResponse build() {
            return new ForwardingConfigurationResponse(backendPool, cacheConfiguration, customForwardingPath, forwardingProtocol, odataType);
        }
    }
}
