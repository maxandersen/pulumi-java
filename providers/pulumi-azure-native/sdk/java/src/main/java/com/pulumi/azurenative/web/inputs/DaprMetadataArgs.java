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
 * Container App Dapr component metadata.
 * 
 */
public final class DaprMetadataArgs extends ResourceArgs {

    public static final DaprMetadataArgs Empty = new DaprMetadataArgs();

    /**
     * Metadata property name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Metadata property name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the Container App secret from which to pull the metadata property value.
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<String> secretRef;

    /**
     * @return Name of the Container App secret from which to pull the metadata property value.
     * 
     */
    public Optional<Output<String>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    /**
     * Metadata property value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Metadata property value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private DaprMetadataArgs() {}

    private DaprMetadataArgs(DaprMetadataArgs $) {
        this.name = $.name;
        this.secretRef = $.secretRef;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DaprMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DaprMetadataArgs $;

        public Builder() {
            $ = new DaprMetadataArgs();
        }

        public Builder(DaprMetadataArgs defaults) {
            $ = new DaprMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Metadata property name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Metadata property name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secretRef Name of the Container App secret from which to pull the metadata property value.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable Output<String> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param secretRef Name of the Container App secret from which to pull the metadata property value.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(String secretRef) {
            return secretRef(Output.of(secretRef));
        }

        /**
         * @param value Metadata property value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Metadata property value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DaprMetadataArgs build() {
            return $;
        }
    }

}
