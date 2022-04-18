// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Creator resource properties
 * 
 */
public final class CreatorPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final CreatorPropertiesResponse Empty = new CreatorPropertiesResponse();

    /**
     * The state of the resource provisioning, terminal states: Succeeded, Failed, Canceled
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> provisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    public CreatorPropertiesResponse(@Nullable String provisioningState) {
        this.provisioningState = provisioningState;
    }

    private CreatorPropertiesResponse() {
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreatorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(CreatorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }        public CreatorPropertiesResponse build() {
            return new CreatorPropertiesResponse(provisioningState);
        }
    }
}
