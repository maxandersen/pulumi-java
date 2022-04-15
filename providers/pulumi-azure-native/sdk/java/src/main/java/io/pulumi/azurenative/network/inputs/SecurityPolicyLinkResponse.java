// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Resource ID for a Security Policy.
 * 
 */
public final class SecurityPolicyLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyLinkResponse Empty = new SecurityPolicyLinkResponse();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public SecurityPolicyLinkResponse(@Nullable String id) {
        this.id = id;
    }

    private SecurityPolicyLinkResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public SecurityPolicyLinkResponse build() {
            return new SecurityPolicyLinkResponse(id);
        }
    }
}
