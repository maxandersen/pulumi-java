// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.inputs.AutoUserSpecificationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specify either the userName or autoUser property, but not both.
 * 
 */
public final class UserIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserIdentityResponse Empty = new UserIdentityResponse();

    /**
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     * 
     */
    @Import(name="autoUser")
      private final @Nullable AutoUserSpecificationResponse autoUser;

    public Optional<AutoUserSpecificationResponse> autoUser() {
        return this.autoUser == null ? Optional.empty() : Optional.ofNullable(this.autoUser);
    }

    /**
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     * 
     */
    @Import(name="userName")
      private final @Nullable String userName;

    public Optional<String> userName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public UserIdentityResponse(
        @Nullable AutoUserSpecificationResponse autoUser,
        @Nullable String userName) {
        this.autoUser = autoUser;
        this.userName = userName;
    }

    private UserIdentityResponse() {
        this.autoUser = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoUserSpecificationResponse autoUser;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUser = defaults.autoUser;
    	      this.userName = defaults.userName;
        }

        public Builder autoUser(@Nullable AutoUserSpecificationResponse autoUser) {
            this.autoUser = autoUser;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }        public UserIdentityResponse build() {
            return new UserIdentityResponse(autoUser, userName);
        }
    }
}
