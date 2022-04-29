// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App Secret.
 * 
 */
public final class SecretArgs extends ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * Secret Name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Secret Name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Secret Value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Secret Value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private SecretArgs() {}

    private SecretArgs(SecretArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretArgs $;

        public Builder() {
            $ = new SecretArgs();
        }

        public Builder(SecretArgs defaults) {
            $ = new SecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Secret Name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Secret Name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Secret Value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Secret Value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SecretArgs build() {
            return $;
        }
    }

}
