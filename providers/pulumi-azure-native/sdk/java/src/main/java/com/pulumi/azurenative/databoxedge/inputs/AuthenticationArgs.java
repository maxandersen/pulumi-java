// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.inputs.SymmetricKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authentication mechanism for IoT devices.
 * 
 */
public final class AuthenticationArgs extends ResourceArgs {

    public static final AuthenticationArgs Empty = new AuthenticationArgs();

    /**
     * Symmetric key for authentication.
     * 
     */
    @Import(name="symmetricKey")
    private @Nullable Output<SymmetricKeyArgs> symmetricKey;

    /**
     * @return Symmetric key for authentication.
     * 
     */
    public Optional<Output<SymmetricKeyArgs>> symmetricKey() {
        return Optional.ofNullable(this.symmetricKey);
    }

    private AuthenticationArgs() {}

    private AuthenticationArgs(AuthenticationArgs $) {
        this.symmetricKey = $.symmetricKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationArgs $;

        public Builder() {
            $ = new AuthenticationArgs();
        }

        public Builder(AuthenticationArgs defaults) {
            $ = new AuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param symmetricKey Symmetric key for authentication.
         * 
         * @return builder
         * 
         */
        public Builder symmetricKey(@Nullable Output<SymmetricKeyArgs> symmetricKey) {
            $.symmetricKey = symmetricKey;
            return this;
        }

        /**
         * @param symmetricKey Symmetric key for authentication.
         * 
         * @return builder
         * 
         */
        public Builder symmetricKey(SymmetricKeyArgs symmetricKey) {
            return symmetricKey(Output.of(symmetricKey));
        }

        public AuthenticationArgs build() {
            return $;
        }
    }

}
