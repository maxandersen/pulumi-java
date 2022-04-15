// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiVersionConstraintResponse {
    /**
     * Limit control plane API calls to API Management service with version equal to or newer than this value.
     * 
     */
    private final @Nullable String minApiVersion;

    @CustomType.Constructor
    private ApiVersionConstraintResponse(@CustomType.Parameter("minApiVersion") @Nullable String minApiVersion) {
        this.minApiVersion = minApiVersion;
    }

    /**
     * Limit control plane API calls to API Management service with version equal to or newer than this value.
     * 
    */
    public Optional<String> minApiVersion() {
        return Optional.ofNullable(this.minApiVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiVersionConstraintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String minApiVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiVersionConstraintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minApiVersion = defaults.minApiVersion;
        }

        public Builder minApiVersion(@Nullable String minApiVersion) {
            this.minApiVersion = minApiVersion;
            return this;
        }        public ApiVersionConstraintResponse build() {
            return new ApiVersionConstraintResponse(minApiVersion);
        }
    }
}
