// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerAccountResponse {
    /**
     * The account name
     * 
     */
    private final @Nullable String accountName;
    /**
     * The account password
     * 
     */
    private final @Nullable String password;
    /**
     * The account spn
     * 
     */
    private final @Nullable String spn;

    @CustomType.Constructor
    private ContainerAccountResponse(
        @CustomType.Parameter("accountName") @Nullable String accountName,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("spn") @Nullable String spn) {
        this.accountName = accountName;
        this.password = password;
        this.spn = spn;
    }

    /**
     * The account name
     * 
    */
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }
    /**
     * The account password
     * 
    */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The account spn
     * 
    */
    public Optional<String> spn() {
        return Optional.ofNullable(this.spn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountName;
        private @Nullable String password;
        private @Nullable String spn;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.password = defaults.password;
    	      this.spn = defaults.spn;
        }

        public Builder accountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder spn(@Nullable String spn) {
            this.spn = spn;
            return this;
        }        public ContainerAccountResponse build() {
            return new ContainerAccountResponse(accountName, password, spn);
        }
    }
}
