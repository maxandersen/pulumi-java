// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automanage.inputs;

import com.pulumi.azurenative.automanage.enums.ResourceIdentityType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity for the Automanage account.
 * 
 */
public final class AccountIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountIdentityArgs Empty = new AccountIdentityArgs();

    /**
     * The type of identity used for the Automanage account. Currently, the only supported type is &#39;SystemAssigned&#39;, which implicitly creates an identity.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<ResourceIdentityType> type;

    public Output<ResourceIdentityType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public AccountIdentityArgs(@Nullable Output<ResourceIdentityType> type) {
        this.type = type;
    }

    private AccountIdentityArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable ResourceIdentityType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public AccountIdentityArgs build() {
            return new AccountIdentityArgs(type);
        }
    }
}
