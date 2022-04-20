// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the nonce used in the login flow.
 * 
 */
public final class NonceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NonceArgs Empty = new NonceArgs();

    /**
     * The time after the request is made when the nonce should expire.
     * 
     */
    @Import(name="nonceExpirationInterval")
      private final @Nullable Output<String> nonceExpirationInterval;

    public Output<String> nonceExpirationInterval() {
        return this.nonceExpirationInterval == null ? Codegen.empty() : this.nonceExpirationInterval;
    }

    /**
     * &lt;code&gt;false&lt;/code&gt; if the nonce should not be validated while completing the login flow; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="validateNonce")
      private final @Nullable Output<Boolean> validateNonce;

    public Output<Boolean> validateNonce() {
        return this.validateNonce == null ? Codegen.empty() : this.validateNonce;
    }

    public NonceArgs(
        @Nullable Output<String> nonceExpirationInterval,
        @Nullable Output<Boolean> validateNonce) {
        this.nonceExpirationInterval = nonceExpirationInterval;
        this.validateNonce = validateNonce;
    }

    private NonceArgs() {
        this.nonceExpirationInterval = Codegen.empty();
        this.validateNonce = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> nonceExpirationInterval;
        private @Nullable Output<Boolean> validateNonce;

        public Builder() {
    	      // Empty
        }

        public Builder(NonceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonceExpirationInterval = defaults.nonceExpirationInterval;
    	      this.validateNonce = defaults.validateNonce;
        }

        public Builder nonceExpirationInterval(@Nullable Output<String> nonceExpirationInterval) {
            this.nonceExpirationInterval = nonceExpirationInterval;
            return this;
        }
        public Builder nonceExpirationInterval(@Nullable String nonceExpirationInterval) {
            this.nonceExpirationInterval = Codegen.ofNullable(nonceExpirationInterval);
            return this;
        }
        public Builder validateNonce(@Nullable Output<Boolean> validateNonce) {
            this.validateNonce = validateNonce;
            return this;
        }
        public Builder validateNonce(@Nullable Boolean validateNonce) {
            this.validateNonce = Codegen.ofNullable(validateNonce);
            return this;
        }        public NonceArgs build() {
            return new NonceArgs(nonceExpirationInterval, validateNonce);
        }
    }
}
