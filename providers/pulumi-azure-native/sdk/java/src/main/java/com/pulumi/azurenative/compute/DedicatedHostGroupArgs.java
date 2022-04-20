// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DedicatedHostGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final DedicatedHostGroupArgs Empty = new DedicatedHostGroupArgs();

    /**
     * The name of the dedicated host group.
     * 
     */
    @Import(name="hostGroupName")
      private final @Nullable Output<String> hostGroupName;

    public Output<String> hostGroupName() {
        return this.hostGroupName == null ? Codegen.empty() : this.hostGroupName;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Number of fault domains that the host group can span.
     * 
     */
    @Import(name="platformFaultDomainCount", required=true)
      private final Output<Integer> platformFaultDomainCount;

    public Output<Integer> platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies whether virtual machines or virtual machine scale sets can be placed automatically on the dedicated host group. Automatic placement means resources are allocated on dedicated hosts, that are chosen by Azure, under the dedicated host group. The value is defaulted to &#39;false&#39; when not provided. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     * 
     */
    @Import(name="supportAutomaticPlacement")
      private final @Nullable Output<Boolean> supportAutomaticPlacement;

    public Output<Boolean> supportAutomaticPlacement() {
        return this.supportAutomaticPlacement == null ? Codegen.empty() : this.supportAutomaticPlacement;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Availability Zone to use for this host group. Only single zone is supported. The zone can be assigned only during creation. If not provided, the group supports all zones in the region. If provided, enforces each host in the group to be in the same zone.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> zones() {
        return this.zones == null ? Codegen.empty() : this.zones;
    }

    public DedicatedHostGroupArgs(
        @Nullable Output<String> hostGroupName,
        @Nullable Output<String> location,
        Output<Integer> platformFaultDomainCount,
        Output<String> resourceGroupName,
        @Nullable Output<Boolean> supportAutomaticPlacement,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<String>> zones) {
        this.hostGroupName = hostGroupName;
        this.location = location;
        this.platformFaultDomainCount = Objects.requireNonNull(platformFaultDomainCount, "expected parameter 'platformFaultDomainCount' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.supportAutomaticPlacement = supportAutomaticPlacement;
        this.tags = tags;
        this.zones = zones;
    }

    private DedicatedHostGroupArgs() {
        this.hostGroupName = Codegen.empty();
        this.location = Codegen.empty();
        this.platformFaultDomainCount = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.supportAutomaticPlacement = Codegen.empty();
        this.tags = Codegen.empty();
        this.zones = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostGroupName;
        private @Nullable Output<String> location;
        private Output<Integer> platformFaultDomainCount;
        private Output<String> resourceGroupName;
        private @Nullable Output<Boolean> supportAutomaticPlacement;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostGroupName = defaults.hostGroupName;
    	      this.location = defaults.location;
    	      this.platformFaultDomainCount = defaults.platformFaultDomainCount;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.supportAutomaticPlacement = defaults.supportAutomaticPlacement;
    	      this.tags = defaults.tags;
    	      this.zones = defaults.zones;
        }

        public Builder hostGroupName(@Nullable Output<String> hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public Builder hostGroupName(@Nullable String hostGroupName) {
            this.hostGroupName = Codegen.ofNullable(hostGroupName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder platformFaultDomainCount(Output<Integer> platformFaultDomainCount) {
            this.platformFaultDomainCount = Objects.requireNonNull(platformFaultDomainCount);
            return this;
        }
        public Builder platformFaultDomainCount(Integer platformFaultDomainCount) {
            this.platformFaultDomainCount = Output.of(Objects.requireNonNull(platformFaultDomainCount));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder supportAutomaticPlacement(@Nullable Output<Boolean> supportAutomaticPlacement) {
            this.supportAutomaticPlacement = supportAutomaticPlacement;
            return this;
        }
        public Builder supportAutomaticPlacement(@Nullable Boolean supportAutomaticPlacement) {
            this.supportAutomaticPlacement = Codegen.ofNullable(supportAutomaticPlacement);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = Codegen.ofNullable(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public DedicatedHostGroupArgs build() {
            return new DedicatedHostGroupArgs(hostGroupName, location, platformFaultDomainCount, resourceGroupName, supportAutomaticPlacement, tags, zones);
        }
    }
}
