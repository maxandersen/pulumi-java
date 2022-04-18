// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyIntrusionDetectionSignatureSpecificationResponse {
    /**
     * Signature id.
     * 
     */
    private final @Nullable String id;
    /**
     * The signature state.
     * 
     */
    private final @Nullable String mode;

    @CustomType.Constructor
    private FirewallPolicyIntrusionDetectionSignatureSpecificationResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("mode") @Nullable String mode) {
        this.id = id;
        this.mode = mode;
    }

    /**
     * Signature id.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The signature state.
     * 
    */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyIntrusionDetectionSignatureSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyIntrusionDetectionSignatureSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mode = defaults.mode;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }        public FirewallPolicyIntrusionDetectionSignatureSpecificationResponse build() {
            return new FirewallPolicyIntrusionDetectionSignatureSpecificationResponse(id, mode);
        }
    }
}
