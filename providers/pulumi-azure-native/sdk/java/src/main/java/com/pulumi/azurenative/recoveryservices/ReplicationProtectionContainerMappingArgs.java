// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices;

import com.pulumi.azurenative.recoveryservices.inputs.CreateProtectionContainerMappingInputPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationProtectionContainerMappingArgs extends ResourceArgs {

    public static final ReplicationProtectionContainerMappingArgs Empty = new ReplicationProtectionContainerMappingArgs();

    /**
     * Fabric name.
     * 
     */
    @Import(name="fabricName", required=true)
    private Output<String> fabricName;

    /**
     * @return Fabric name.
     * 
     */
    public Output<String> fabricName() {
        return this.fabricName;
    }

    /**
     * Protection container mapping name.
     * 
     */
    @Import(name="mappingName")
    private @Nullable Output<String> mappingName;

    /**
     * @return Protection container mapping name.
     * 
     */
    public Optional<Output<String>> mappingName() {
        return Optional.ofNullable(this.mappingName);
    }

    /**
     * Configure protection input properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<CreateProtectionContainerMappingInputPropertiesArgs> properties;

    /**
     * @return Configure protection input properties.
     * 
     */
    public Optional<Output<CreateProtectionContainerMappingInputPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Protection container name.
     * 
     */
    @Import(name="protectionContainerName", required=true)
    private Output<String> protectionContainerName;

    /**
     * @return Protection container name.
     * 
     */
    public Output<String> protectionContainerName() {
        return this.protectionContainerName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the recovery services vault is present.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the recovery services vault.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    private ReplicationProtectionContainerMappingArgs() {}

    private ReplicationProtectionContainerMappingArgs(ReplicationProtectionContainerMappingArgs $) {
        this.fabricName = $.fabricName;
        this.mappingName = $.mappingName;
        this.properties = $.properties;
        this.protectionContainerName = $.protectionContainerName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationProtectionContainerMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationProtectionContainerMappingArgs $;

        public Builder() {
            $ = new ReplicationProtectionContainerMappingArgs();
        }

        public Builder(ReplicationProtectionContainerMappingArgs defaults) {
            $ = new ReplicationProtectionContainerMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fabricName Fabric name.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(Output<String> fabricName) {
            $.fabricName = fabricName;
            return this;
        }

        /**
         * @param fabricName Fabric name.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(String fabricName) {
            return fabricName(Output.of(fabricName));
        }

        /**
         * @param mappingName Protection container mapping name.
         * 
         * @return builder
         * 
         */
        public Builder mappingName(@Nullable Output<String> mappingName) {
            $.mappingName = mappingName;
            return this;
        }

        /**
         * @param mappingName Protection container mapping name.
         * 
         * @return builder
         * 
         */
        public Builder mappingName(String mappingName) {
            return mappingName(Output.of(mappingName));
        }

        /**
         * @param properties Configure protection input properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<CreateProtectionContainerMappingInputPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Configure protection input properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(CreateProtectionContainerMappingInputPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param protectionContainerName Protection container name.
         * 
         * @return builder
         * 
         */
        public Builder protectionContainerName(Output<String> protectionContainerName) {
            $.protectionContainerName = protectionContainerName;
            return this;
        }

        /**
         * @param protectionContainerName Protection container name.
         * 
         * @return builder
         * 
         */
        public Builder protectionContainerName(String protectionContainerName) {
            return protectionContainerName(Output.of(protectionContainerName));
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public ReplicationProtectionContainerMappingArgs build() {
            $.fabricName = Objects.requireNonNull($.fabricName, "expected parameter 'fabricName' to be non-null");
            $.protectionContainerName = Objects.requireNonNull($.protectionContainerName, "expected parameter 'protectionContainerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
