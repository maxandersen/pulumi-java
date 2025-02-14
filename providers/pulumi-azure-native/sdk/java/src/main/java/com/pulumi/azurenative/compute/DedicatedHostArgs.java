// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.compute.enums.DedicatedHostLicenseTypes;
import com.pulumi.azurenative.compute.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DedicatedHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final DedicatedHostArgs Empty = new DedicatedHostArgs();

    /**
     * Specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to &#39;true&#39; when not provided.
     * 
     */
    @Import(name="autoReplaceOnFailure")
    private @Nullable Output<Boolean> autoReplaceOnFailure;

    /**
     * @return Specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to &#39;true&#39; when not provided.
     * 
     */
    public Optional<Output<Boolean>> autoReplaceOnFailure() {
        return Optional.ofNullable(this.autoReplaceOnFailure);
    }

    /**
     * The name of the dedicated host group.
     * 
     */
    @Import(name="hostGroupName", required=true)
    private Output<String> hostGroupName;

    /**
     * @return The name of the dedicated host group.
     * 
     */
    public Output<String> hostGroupName() {
        return this.hostGroupName;
    }

    /**
     * The name of the dedicated host .
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    /**
     * @return The name of the dedicated host .
     * 
     */
    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * Specifies the software license type that will be applied to the VMs deployed on the dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default: **None**
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<DedicatedHostLicenseTypes> licenseType;

    /**
     * @return Specifies the software license type that will be applied to the VMs deployed on the dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default: **None**
     * 
     */
    public Optional<Output<DedicatedHostLicenseTypes>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Fault domain of the dedicated host within a dedicated host group.
     * 
     */
    @Import(name="platformFaultDomain")
    private @Nullable Output<Integer> platformFaultDomain;

    /**
     * @return Fault domain of the dedicated host within a dedicated host group.
     * 
     */
    public Optional<Output<Integer>> platformFaultDomain() {
        return Optional.ofNullable(this.platformFaultDomain);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SKU of the dedicated host for Hardware Generation and VM family. Only name is required to be set. List Microsoft.Compute SKUs for a list of possible values.
     * 
     */
    @Import(name="sku", required=true)
    private Output<SkuArgs> sku;

    /**
     * @return SKU of the dedicated host for Hardware Generation and VM family. Only name is required to be set. List Microsoft.Compute SKUs for a list of possible values.
     * 
     */
    public Output<SkuArgs> sku() {
        return this.sku;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DedicatedHostArgs() {}

    private DedicatedHostArgs(DedicatedHostArgs $) {
        this.autoReplaceOnFailure = $.autoReplaceOnFailure;
        this.hostGroupName = $.hostGroupName;
        this.hostName = $.hostName;
        this.licenseType = $.licenseType;
        this.location = $.location;
        this.platformFaultDomain = $.platformFaultDomain;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DedicatedHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DedicatedHostArgs $;

        public Builder() {
            $ = new DedicatedHostArgs();
        }

        public Builder(DedicatedHostArgs defaults) {
            $ = new DedicatedHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoReplaceOnFailure Specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to &#39;true&#39; when not provided.
         * 
         * @return builder
         * 
         */
        public Builder autoReplaceOnFailure(@Nullable Output<Boolean> autoReplaceOnFailure) {
            $.autoReplaceOnFailure = autoReplaceOnFailure;
            return this;
        }

        /**
         * @param autoReplaceOnFailure Specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to &#39;true&#39; when not provided.
         * 
         * @return builder
         * 
         */
        public Builder autoReplaceOnFailure(Boolean autoReplaceOnFailure) {
            return autoReplaceOnFailure(Output.of(autoReplaceOnFailure));
        }

        /**
         * @param hostGroupName The name of the dedicated host group.
         * 
         * @return builder
         * 
         */
        public Builder hostGroupName(Output<String> hostGroupName) {
            $.hostGroupName = hostGroupName;
            return this;
        }

        /**
         * @param hostGroupName The name of the dedicated host group.
         * 
         * @return builder
         * 
         */
        public Builder hostGroupName(String hostGroupName) {
            return hostGroupName(Output.of(hostGroupName));
        }

        /**
         * @param hostName The name of the dedicated host .
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName The name of the dedicated host .
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param licenseType Specifies the software license type that will be applied to the VMs deployed on the dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default: **None**
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<DedicatedHostLicenseTypes> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType Specifies the software license type that will be applied to the VMs deployed on the dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default: **None**
         * 
         * @return builder
         * 
         */
        public Builder licenseType(DedicatedHostLicenseTypes licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param platformFaultDomain Fault domain of the dedicated host within a dedicated host group.
         * 
         * @return builder
         * 
         */
        public Builder platformFaultDomain(@Nullable Output<Integer> platformFaultDomain) {
            $.platformFaultDomain = platformFaultDomain;
            return this;
        }

        /**
         * @param platformFaultDomain Fault domain of the dedicated host within a dedicated host group.
         * 
         * @return builder
         * 
         */
        public Builder platformFaultDomain(Integer platformFaultDomain) {
            return platformFaultDomain(Output.of(platformFaultDomain));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku SKU of the dedicated host for Hardware Generation and VM family. Only name is required to be set. List Microsoft.Compute SKUs for a list of possible values.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku SKU of the dedicated host for Hardware Generation and VM family. Only name is required to be set. List Microsoft.Compute SKUs for a list of possible values.
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DedicatedHostArgs build() {
            $.hostGroupName = Objects.requireNonNull($.hostGroupName, "expected parameter 'hostGroupName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
