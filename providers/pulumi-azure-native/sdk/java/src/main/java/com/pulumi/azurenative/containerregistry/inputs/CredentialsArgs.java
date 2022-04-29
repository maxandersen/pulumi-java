// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.CustomRegistryCredentialsArgs;
import com.pulumi.azurenative.containerregistry.inputs.SourceRegistryCredentialsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters that describes a set of credentials that will be used when a run is invoked.
 * 
 */
public final class CredentialsArgs extends ResourceArgs {

    public static final CredentialsArgs Empty = new CredentialsArgs();

    /**
     * Describes the credential parameters for accessing other custom registries. The key
     * for the dictionary item will be the registry login server (myregistry.azurecr.io) and
     * the value of the item will be the registry credentials for accessing the registry.
     * 
     */
    @Import(name="customRegistries")
    private @Nullable Output<Map<String,CustomRegistryCredentialsArgs>> customRegistries;

    /**
     * @return Describes the credential parameters for accessing other custom registries. The key
     * for the dictionary item will be the registry login server (myregistry.azurecr.io) and
     * the value of the item will be the registry credentials for accessing the registry.
     * 
     */
    public Optional<Output<Map<String,CustomRegistryCredentialsArgs>>> customRegistries() {
        return Optional.ofNullable(this.customRegistries);
    }

    /**
     * Describes the credential parameters for accessing the source registry.
     * 
     */
    @Import(name="sourceRegistry")
    private @Nullable Output<SourceRegistryCredentialsArgs> sourceRegistry;

    /**
     * @return Describes the credential parameters for accessing the source registry.
     * 
     */
    public Optional<Output<SourceRegistryCredentialsArgs>> sourceRegistry() {
        return Optional.ofNullable(this.sourceRegistry);
    }

    private CredentialsArgs() {}

    private CredentialsArgs(CredentialsArgs $) {
        this.customRegistries = $.customRegistries;
        this.sourceRegistry = $.sourceRegistry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CredentialsArgs $;

        public Builder() {
            $ = new CredentialsArgs();
        }

        public Builder(CredentialsArgs defaults) {
            $ = new CredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customRegistries Describes the credential parameters for accessing other custom registries. The key
         * for the dictionary item will be the registry login server (myregistry.azurecr.io) and
         * the value of the item will be the registry credentials for accessing the registry.
         * 
         * @return builder
         * 
         */
        public Builder customRegistries(@Nullable Output<Map<String,CustomRegistryCredentialsArgs>> customRegistries) {
            $.customRegistries = customRegistries;
            return this;
        }

        /**
         * @param customRegistries Describes the credential parameters for accessing other custom registries. The key
         * for the dictionary item will be the registry login server (myregistry.azurecr.io) and
         * the value of the item will be the registry credentials for accessing the registry.
         * 
         * @return builder
         * 
         */
        public Builder customRegistries(Map<String,CustomRegistryCredentialsArgs> customRegistries) {
            return customRegistries(Output.of(customRegistries));
        }

        /**
         * @param sourceRegistry Describes the credential parameters for accessing the source registry.
         * 
         * @return builder
         * 
         */
        public Builder sourceRegistry(@Nullable Output<SourceRegistryCredentialsArgs> sourceRegistry) {
            $.sourceRegistry = sourceRegistry;
            return this;
        }

        /**
         * @param sourceRegistry Describes the credential parameters for accessing the source registry.
         * 
         * @return builder
         * 
         */
        public Builder sourceRegistry(SourceRegistryCredentialsArgs sourceRegistry) {
            return sourceRegistry(Output.of(sourceRegistry));
        }

        public CredentialsArgs build() {
            return $;
        }
    }

}
