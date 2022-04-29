// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadNetworkVMGroupArgs extends ResourceArgs {

    public static final WorkloadNetworkVMGroupArgs Empty = new WorkloadNetworkVMGroupArgs();

    /**
     * Display name of the VM group.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name of the VM group.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Virtual machine members of this group.
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<String>> members;

    /**
     * @return Virtual machine members of this group.
     * 
     */
    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private Output<String> privateCloudName;

    /**
     * @return Name of the private cloud
     * 
     */
    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * NSX revision number.
     * 
     */
    @Import(name="revision")
    private @Nullable Output<Double> revision;

    /**
     * @return NSX revision number.
     * 
     */
    public Optional<Output<Double>> revision() {
        return Optional.ofNullable(this.revision);
    }

    /**
     * NSX VM Group identifier. Generally the same as the VM Group&#39;s display name
     * 
     */
    @Import(name="vmGroupId")
    private @Nullable Output<String> vmGroupId;

    /**
     * @return NSX VM Group identifier. Generally the same as the VM Group&#39;s display name
     * 
     */
    public Optional<Output<String>> vmGroupId() {
        return Optional.ofNullable(this.vmGroupId);
    }

    private WorkloadNetworkVMGroupArgs() {}

    private WorkloadNetworkVMGroupArgs(WorkloadNetworkVMGroupArgs $) {
        this.displayName = $.displayName;
        this.members = $.members;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
        this.revision = $.revision;
        this.vmGroupId = $.vmGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadNetworkVMGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadNetworkVMGroupArgs $;

        public Builder() {
            $ = new WorkloadNetworkVMGroupArgs();
        }

        public Builder(WorkloadNetworkVMGroupArgs defaults) {
            $ = new WorkloadNetworkVMGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Display name of the VM group.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name of the VM group.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param members Virtual machine members of this group.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members Virtual machine members of this group.
         * 
         * @return builder
         * 
         */
        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        /**
         * @param members Virtual machine members of this group.
         * 
         * @return builder
         * 
         */
        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(Output<String> privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            return privateCloudName(Output.of(privateCloudName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param revision NSX revision number.
         * 
         * @return builder
         * 
         */
        public Builder revision(@Nullable Output<Double> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision NSX revision number.
         * 
         * @return builder
         * 
         */
        public Builder revision(Double revision) {
            return revision(Output.of(revision));
        }

        /**
         * @param vmGroupId NSX VM Group identifier. Generally the same as the VM Group&#39;s display name
         * 
         * @return builder
         * 
         */
        public Builder vmGroupId(@Nullable Output<String> vmGroupId) {
            $.vmGroupId = vmGroupId;
            return this;
        }

        /**
         * @param vmGroupId NSX VM Group identifier. Generally the same as the VM Group&#39;s display name
         * 
         * @return builder
         * 
         */
        public Builder vmGroupId(String vmGroupId) {
            return vmGroupId(Output.of(vmGroupId));
        }

        public WorkloadNetworkVMGroupArgs build() {
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
