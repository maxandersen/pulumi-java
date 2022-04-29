// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.TokenPasswordName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The password that will be used for authenticating the token of a container registry.
 * 
 */
public final class TokenPasswordArgs extends ResourceArgs {

    public static final TokenPasswordArgs Empty = new TokenPasswordArgs();

    /**
     * The creation datetime of the password.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<String> creationTime;

    /**
     * @return The creation datetime of the password.
     * 
     */
    public Optional<Output<String>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * The expiry datetime of the password.
     * 
     */
    @Import(name="expiry")
    private @Nullable Output<String> expiry;

    /**
     * @return The expiry datetime of the password.
     * 
     */
    public Optional<Output<String>> expiry() {
        return Optional.ofNullable(this.expiry);
    }

    /**
     * The password name &#34;password1&#34; or &#34;password2&#34;
     * 
     */
    @Import(name="name")
    private @Nullable Output<Either<String,TokenPasswordName>> name;

    /**
     * @return The password name &#34;password1&#34; or &#34;password2&#34;
     * 
     */
    public Optional<Output<Either<String,TokenPasswordName>>> name() {
        return Optional.ofNullable(this.name);
    }

    private TokenPasswordArgs() {}

    private TokenPasswordArgs(TokenPasswordArgs $) {
        this.creationTime = $.creationTime;
        this.expiry = $.expiry;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TokenPasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TokenPasswordArgs $;

        public Builder() {
            $ = new TokenPasswordArgs();
        }

        public Builder(TokenPasswordArgs defaults) {
            $ = new TokenPasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param creationTime The creation datetime of the password.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<String> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime The creation datetime of the password.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(String creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param expiry The expiry datetime of the password.
         * 
         * @return builder
         * 
         */
        public Builder expiry(@Nullable Output<String> expiry) {
            $.expiry = expiry;
            return this;
        }

        /**
         * @param expiry The expiry datetime of the password.
         * 
         * @return builder
         * 
         */
        public Builder expiry(String expiry) {
            return expiry(Output.of(expiry));
        }

        /**
         * @param name The password name &#34;password1&#34; or &#34;password2&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<Either<String,TokenPasswordName>> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The password name &#34;password1&#34; or &#34;password2&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(Either<String,TokenPasswordName> name) {
            return name(Output.of(name));
        }

        /**
         * @param name The password name &#34;password1&#34; or &#34;password2&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Either.ofLeft(name));
        }

        /**
         * @param name The password name &#34;password1&#34; or &#34;password2&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(TokenPasswordName name) {
            return name(Either.ofRight(name));
        }

        public TokenPasswordArgs build() {
            return $;
        }
    }

}
