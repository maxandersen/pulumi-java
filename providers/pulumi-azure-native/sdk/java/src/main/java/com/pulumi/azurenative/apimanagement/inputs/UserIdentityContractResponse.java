// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User identity details.
 * 
 */
public final class UserIdentityContractResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserIdentityContractResponse Empty = new UserIdentityContractResponse();

    /**
     * Identifier value within provider.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Identity provider name.
     * 
     */
    @Import(name="provider")
      private final @Nullable String provider;

    public Optional<String> provider() {
        return this.provider == null ? Optional.empty() : Optional.ofNullable(this.provider);
    }

    public UserIdentityContractResponse(
        @Nullable String id,
        @Nullable String provider) {
        this.id = id;
        this.provider = provider;
    }

    private UserIdentityContractResponse() {
        this.id = null;
        this.provider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String provider;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.provider = defaults.provider;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder provider(@Nullable String provider) {
            this.provider = provider;
            return this;
        }        public UserIdentityContractResponse build() {
            return new UserIdentityContractResponse(id, provider);
        }
    }
}
