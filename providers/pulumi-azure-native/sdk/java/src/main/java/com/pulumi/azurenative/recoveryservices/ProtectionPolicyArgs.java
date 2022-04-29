// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices;

import com.pulumi.azurenative.recoveryservices.inputs.AzureFileShareProtectionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureIaaSVMProtectionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureSqlProtectionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadProtectionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.GenericProtectionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.MabProtectionPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProtectionPolicyArgs extends ResourceArgs {

    public static final ProtectionPolicyArgs Empty = new ProtectionPolicyArgs();

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
     * Backup policy to be created.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return Backup policy to be created.
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * ProtectionPolicyResource properties
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Object> properties;

    /**
     * @return ProtectionPolicyResource properties
     * 
     */
    public Optional<Output<Object>> properties() {
        return Optional.ofNullable(this.properties);
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

    private ProtectionPolicyArgs() {}

    private ProtectionPolicyArgs(ProtectionPolicyArgs $) {
        this.eTag = $.eTag;
        this.location = $.location;
        this.policyName = $.policyName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProtectionPolicyArgs $;

        public Builder() {
            $ = new ProtectionPolicyArgs();
        }

        public Builder(ProtectionPolicyArgs defaults) {
            $ = new ProtectionPolicyArgs(Objects.requireNonNull(defaults));
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
         * @param policyName Backup policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Backup policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param properties ProtectionPolicyResource properties
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Object> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties ProtectionPolicyResource properties
         * 
         * @return builder
         * 
         */
        public Builder properties(Object properties) {
            return properties(Output.of(properties));
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

        public ProtectionPolicyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
