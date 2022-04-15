// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateAtlasPropertiesResponse {
    /**
     * The state of the resource provisioning, terminal states: Succeeded, Failed, Canceled
     * 
     */
    private final @Nullable String provisioningState;

    @CustomType.Constructor
    private PrivateAtlasPropertiesResponse(@CustomType.Parameter("provisioningState") @Nullable String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * The state of the resource provisioning, terminal states: Succeeded, Failed, Canceled
     * 
    */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateAtlasPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateAtlasPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }        public PrivateAtlasPropertiesResponse build() {
            return new PrivateAtlasPropertiesResponse(provisioningState);
        }
    }
}
