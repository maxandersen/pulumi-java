// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Keys for endpoint authentication.
 * 
 */
public final class EndpointAuthKeysArgs extends ResourceArgs {

    public static final EndpointAuthKeysArgs Empty = new EndpointAuthKeysArgs();

    /**
     * The primary key.
     * 
     */
    @Import(name="primaryKey")
    private @Nullable Output<String> primaryKey;

    /**
     * @return The primary key.
     * 
     */
    public Optional<Output<String>> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }

    /**
     * The secondary key.
     * 
     */
    @Import(name="secondaryKey")
    private @Nullable Output<String> secondaryKey;

    /**
     * @return The secondary key.
     * 
     */
    public Optional<Output<String>> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    private EndpointAuthKeysArgs() {}

    private EndpointAuthKeysArgs(EndpointAuthKeysArgs $) {
        this.primaryKey = $.primaryKey;
        this.secondaryKey = $.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointAuthKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointAuthKeysArgs $;

        public Builder() {
            $ = new EndpointAuthKeysArgs();
        }

        public Builder(EndpointAuthKeysArgs defaults) {
            $ = new EndpointAuthKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param primaryKey The primary key.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(@Nullable Output<String> primaryKey) {
            $.primaryKey = primaryKey;
            return this;
        }

        /**
         * @param primaryKey The primary key.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(String primaryKey) {
            return primaryKey(Output.of(primaryKey));
        }

        /**
         * @param secondaryKey The secondary key.
         * 
         * @return builder
         * 
         */
        public Builder secondaryKey(@Nullable Output<String> secondaryKey) {
            $.secondaryKey = secondaryKey;
            return this;
        }

        /**
         * @param secondaryKey The secondary key.
         * 
         * @return builder
         * 
         */
        public Builder secondaryKey(String secondaryKey) {
            return secondaryKey(Output.of(secondaryKey));
        }

        public EndpointAuthKeysArgs build() {
            return $;
        }
    }

}
