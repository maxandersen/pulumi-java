// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.BastionHostIPConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BastionHostArgs extends io.pulumi.resources.ResourceArgs {

    public static final BastionHostArgs Empty = new BastionHostArgs();

    /**
     * The name of the Bastion Host.
     * 
     */
    @Import(name="bastionHostName")
      private final @Nullable Output<String> bastionHostName;

    public Output<String> bastionHostName() {
        return this.bastionHostName == null ? Codegen.empty() : this.bastionHostName;
    }

    /**
     * FQDN for the endpoint on which bastion host is accessible.
     * 
     */
    @Import(name="dnsName")
      private final @Nullable Output<String> dnsName;

    public Output<String> dnsName() {
        return this.dnsName == null ? Codegen.empty() : this.dnsName;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * IP configuration of the Bastion Host resource.
     * 
     */
    @Import(name="ipConfigurations")
      private final @Nullable Output<List<BastionHostIPConfigurationArgs>> ipConfigurations;

    public Output<List<BastionHostIPConfigurationArgs>> ipConfigurations() {
        return this.ipConfigurations == null ? Codegen.empty() : this.ipConfigurations;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public BastionHostArgs(
        @Nullable Output<String> bastionHostName,
        @Nullable Output<String> dnsName,
        @Nullable Output<String> id,
        @Nullable Output<List<BastionHostIPConfigurationArgs>> ipConfigurations,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.bastionHostName = bastionHostName;
        this.dnsName = dnsName;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private BastionHostArgs() {
        this.bastionHostName = Codegen.empty();
        this.dnsName = Codegen.empty();
        this.id = Codegen.empty();
        this.ipConfigurations = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BastionHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bastionHostName;
        private @Nullable Output<String> dnsName;
        private @Nullable Output<String> id;
        private @Nullable Output<List<BastionHostIPConfigurationArgs>> ipConfigurations;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BastionHostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bastionHostName = defaults.bastionHostName;
    	      this.dnsName = defaults.dnsName;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder bastionHostName(@Nullable Output<String> bastionHostName) {
            this.bastionHostName = bastionHostName;
            return this;
        }
        public Builder bastionHostName(@Nullable String bastionHostName) {
            this.bastionHostName = Codegen.ofNullable(bastionHostName);
            return this;
        }
        public Builder dnsName(@Nullable Output<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }
        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = Codegen.ofNullable(dnsName);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder ipConfigurations(@Nullable Output<List<BastionHostIPConfigurationArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }
        public Builder ipConfigurations(@Nullable List<BastionHostIPConfigurationArgs> ipConfigurations) {
            this.ipConfigurations = Codegen.ofNullable(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(BastionHostIPConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public BastionHostArgs build() {
            return new BastionHostArgs(bastionHostName, dnsName, id, ipConfigurations, location, resourceGroupName, tags);
        }
    }
}
