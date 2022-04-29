// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices;

import com.pulumi.azurenative.recoveryservices.inputs.AzureFileshareProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureIaaSClassicComputeVMProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureIaaSComputeVMProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureIaaSVMProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureSqlProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadSAPAseDatabaseProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadSAPHanaDatabaseProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadSQLDatabaseProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.DPMProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.GenericProtectedItemArgs;
import com.pulumi.azurenative.recoveryservices.inputs.MabFileFolderProtectedItemArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProtectedItemArgs extends ResourceArgs {

    public static final ProtectedItemArgs Empty = new ProtectedItemArgs();

    /**
     * Container name associated with the backup item.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return Container name associated with the backup item.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * Optional ETag.
     * 
     */
    @Import(name="eTag")
    private @Nullable Output<String> eTag;

    /**
     * @return Optional ETag.
     * 
     */
    public Optional<Output<String>> eTag() {
        return Optional.ofNullable(this.eTag);
    }

    /**
     * Fabric name associated with the backup item.
     * 
     */
    @Import(name="fabricName", required=true)
    private Output<String> fabricName;

    /**
     * @return Fabric name associated with the backup item.
     * 
     */
    public Output<String> fabricName() {
        return this.fabricName;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * ProtectedItemResource properties
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Object> properties;

    /**
     * @return ProtectedItemResource properties
     * 
     */
    public Optional<Output<Object>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Item name to be backed up.
     * 
     */
    @Import(name="protectedItemName")
    private @Nullable Output<String> protectedItemName;

    /**
     * @return Item name to be backed up.
     * 
     */
    public Optional<Output<String>> protectedItemName() {
        return Optional.ofNullable(this.protectedItemName);
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="vaultName", required=true)
    private Output<String> vaultName;

    /**
     * @return The name of the recovery services vault.
     * 
     */
    public Output<String> vaultName() {
        return this.vaultName;
    }

    private ProtectedItemArgs() {}

    private ProtectedItemArgs(ProtectedItemArgs $) {
        this.containerName = $.containerName;
        this.eTag = $.eTag;
        this.fabricName = $.fabricName;
        this.location = $.location;
        this.properties = $.properties;
        this.protectedItemName = $.protectedItemName;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProtectedItemArgs $;

        public Builder() {
            $ = new ProtectedItemArgs();
        }

        public Builder(ProtectedItemArgs defaults) {
            $ = new ProtectedItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName Container name associated with the backup item.
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName Container name associated with the backup item.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param eTag Optional ETag.
         * 
         * @return builder
         * 
         */
        public Builder eTag(@Nullable Output<String> eTag) {
            $.eTag = eTag;
            return this;
        }

        /**
         * @param eTag Optional ETag.
         * 
         * @return builder
         * 
         */
        public Builder eTag(String eTag) {
            return eTag(Output.of(eTag));
        }

        /**
         * @param fabricName Fabric name associated with the backup item.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(Output<String> fabricName) {
            $.fabricName = fabricName;
            return this;
        }

        /**
         * @param fabricName Fabric name associated with the backup item.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(String fabricName) {
            return fabricName(Output.of(fabricName));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties ProtectedItemResource properties
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Object> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties ProtectedItemResource properties
         * 
         * @return builder
         * 
         */
        public Builder properties(Object properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param protectedItemName Item name to be backed up.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemName(@Nullable Output<String> protectedItemName) {
            $.protectedItemName = protectedItemName;
            return this;
        }

        /**
         * @param protectedItemName Item name to be backed up.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemName(String protectedItemName) {
            return protectedItemName(Output.of(protectedItemName));
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
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vaultName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(Output<String> vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        /**
         * @param vaultName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            return vaultName(Output.of(vaultName));
        }

        public ProtectedItemArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.fabricName = Objects.requireNonNull($.fabricName, "expected parameter 'fabricName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
