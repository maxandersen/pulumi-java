// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Intrusion detection signatures specification states.
 * 
 */
public final class FirewallPolicyIntrusionDetectionSignatureSpecificationResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyIntrusionDetectionSignatureSpecificationResponse Empty = new FirewallPolicyIntrusionDetectionSignatureSpecificationResponse();

    /**
     * Signature id.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The signature state.
     * 
     */
    @Import(name="mode")
      private final @Nullable String mode;

    public Optional<String> mode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    public FirewallPolicyIntrusionDetectionSignatureSpecificationResponse(
        @Nullable String id,
        @Nullable String mode) {
        this.id = id;
        this.mode = mode;
    }

    private FirewallPolicyIntrusionDetectionSignatureSpecificationResponse() {
        this.id = null;
        this.mode = null;
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
