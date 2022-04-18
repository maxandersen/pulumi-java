// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppInsightsCredentialsResponse {
    /**
     * The AppInsights application ID.
     * 
     */
    private final @Nullable String appId;
    /**
     * The AppInsights instrumentation key. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
     * 
     */
    private final @Nullable String instrumentationKey;

    @CustomType.Constructor
    private AppInsightsCredentialsResponse(
        @CustomType.Parameter("appId") @Nullable String appId,
        @CustomType.Parameter("instrumentationKey") @Nullable String instrumentationKey) {
        this.appId = appId;
        this.instrumentationKey = instrumentationKey;
    }

    /**
     * The AppInsights application ID.
     * 
    */
    public Optional<String> appId() {
        return Optional.ofNullable(this.appId);
    }
    /**
     * The AppInsights instrumentation key. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
     * 
    */
    public Optional<String> instrumentationKey() {
        return Optional.ofNullable(this.instrumentationKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppInsightsCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appId;
        private @Nullable String instrumentationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AppInsightsCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.instrumentationKey = defaults.instrumentationKey;
        }

        public Builder appId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }
        public Builder instrumentationKey(@Nullable String instrumentationKey) {
            this.instrumentationKey = instrumentationKey;
            return this;
        }        public AppInsightsCredentialsResponse build() {
            return new AppInsightsCredentialsResponse(appId, instrumentationKey);
        }
    }
}
