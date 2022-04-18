// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Control Plane Apis version constraint for the API Management service.
 * 
 */
public final class ApiVersionConstraintResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApiVersionConstraintResponse Empty = new ApiVersionConstraintResponse();

    /**
     * Limit control plane API calls to API Management service with version equal to or newer than this value.
     * 
     */
    @Import(name="minApiVersion")
      private final @Nullable String minApiVersion;

    public Optional<String> minApiVersion() {
        return this.minApiVersion == null ? Optional.empty() : Optional.ofNullable(this.minApiVersion);
    }

    public ApiVersionConstraintResponse(@Nullable String minApiVersion) {
        this.minApiVersion = minApiVersion;
    }

    private ApiVersionConstraintResponse() {
        this.minApiVersion = null;
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
