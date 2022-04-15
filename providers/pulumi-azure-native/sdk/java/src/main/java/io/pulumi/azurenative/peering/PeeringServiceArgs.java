// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.azurenative.peering.inputs.PeeringServiceSkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeeringServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeeringServiceArgs Empty = new PeeringServiceArgs();

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The location (state/province) of the customer.
     * 
     */
    @Import(name="peeringServiceLocation")
      private final @Nullable Output<String> peeringServiceLocation;

    public Output<String> peeringServiceLocation() {
        return this.peeringServiceLocation == null ? Codegen.empty() : this.peeringServiceLocation;
    }

    /**
     * The name of the peering service.
     * 
     */
    @Import(name="peeringServiceName")
      private final @Nullable Output<String> peeringServiceName;

    public Output<String> peeringServiceName() {
        return this.peeringServiceName == null ? Codegen.empty() : this.peeringServiceName;
    }

    /**
     * The name of the service provider.
     * 
     */
    @Import(name="peeringServiceProvider")
      private final @Nullable Output<String> peeringServiceProvider;

    public Output<String> peeringServiceProvider() {
        return this.peeringServiceProvider == null ? Codegen.empty() : this.peeringServiceProvider;
    }

    /**
     * The backup peering (Microsoft/service provider) location to be used for customer traffic.
     * 
     */
    @Import(name="providerBackupPeeringLocation")
      private final @Nullable Output<String> providerBackupPeeringLocation;

    public Output<String> providerBackupPeeringLocation() {
        return this.providerBackupPeeringLocation == null ? Codegen.empty() : this.providerBackupPeeringLocation;
    }

    /**
     * The primary peering (Microsoft/service provider) location to be used for customer traffic.
     * 
     */
    @Import(name="providerPrimaryPeeringLocation")
      private final @Nullable Output<String> providerPrimaryPeeringLocation;

    public Output<String> providerPrimaryPeeringLocation() {
        return this.providerPrimaryPeeringLocation == null ? Codegen.empty() : this.providerPrimaryPeeringLocation;
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
     * The SKU that defines the type of the peering service.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<PeeringServiceSkuArgs> sku;

    public Output<PeeringServiceSkuArgs> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public PeeringServiceArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> peeringServiceLocation,
        @Nullable Output<String> peeringServiceName,
        @Nullable Output<String> peeringServiceProvider,
        @Nullable Output<String> providerBackupPeeringLocation,
        @Nullable Output<String> providerPrimaryPeeringLocation,
        Output<String> resourceGroupName,
        @Nullable Output<PeeringServiceSkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.peeringServiceLocation = peeringServiceLocation;
        this.peeringServiceName = peeringServiceName;
        this.peeringServiceProvider = peeringServiceProvider;
        this.providerBackupPeeringLocation = providerBackupPeeringLocation;
        this.providerPrimaryPeeringLocation = providerPrimaryPeeringLocation;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private PeeringServiceArgs() {
        this.location = Codegen.empty();
        this.peeringServiceLocation = Codegen.empty();
        this.peeringServiceName = Codegen.empty();
        this.peeringServiceProvider = Codegen.empty();
        this.providerBackupPeeringLocation = Codegen.empty();
        this.providerPrimaryPeeringLocation = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> peeringServiceLocation;
        private @Nullable Output<String> peeringServiceName;
        private @Nullable Output<String> peeringServiceProvider;
        private @Nullable Output<String> providerBackupPeeringLocation;
        private @Nullable Output<String> providerPrimaryPeeringLocation;
        private Output<String> resourceGroupName;
        private @Nullable Output<PeeringServiceSkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.peeringServiceLocation = defaults.peeringServiceLocation;
    	      this.peeringServiceName = defaults.peeringServiceName;
    	      this.peeringServiceProvider = defaults.peeringServiceProvider;
    	      this.providerBackupPeeringLocation = defaults.providerBackupPeeringLocation;
    	      this.providerPrimaryPeeringLocation = defaults.providerPrimaryPeeringLocation;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder peeringServiceLocation(@Nullable Output<String> peeringServiceLocation) {
            this.peeringServiceLocation = peeringServiceLocation;
            return this;
        }
        public Builder peeringServiceLocation(@Nullable String peeringServiceLocation) {
            this.peeringServiceLocation = Codegen.ofNullable(peeringServiceLocation);
            return this;
        }
        public Builder peeringServiceName(@Nullable Output<String> peeringServiceName) {
            this.peeringServiceName = peeringServiceName;
            return this;
        }
        public Builder peeringServiceName(@Nullable String peeringServiceName) {
            this.peeringServiceName = Codegen.ofNullable(peeringServiceName);
            return this;
        }
        public Builder peeringServiceProvider(@Nullable Output<String> peeringServiceProvider) {
            this.peeringServiceProvider = peeringServiceProvider;
            return this;
        }
        public Builder peeringServiceProvider(@Nullable String peeringServiceProvider) {
            this.peeringServiceProvider = Codegen.ofNullable(peeringServiceProvider);
            return this;
        }
        public Builder providerBackupPeeringLocation(@Nullable Output<String> providerBackupPeeringLocation) {
            this.providerBackupPeeringLocation = providerBackupPeeringLocation;
            return this;
        }
        public Builder providerBackupPeeringLocation(@Nullable String providerBackupPeeringLocation) {
            this.providerBackupPeeringLocation = Codegen.ofNullable(providerBackupPeeringLocation);
            return this;
        }
        public Builder providerPrimaryPeeringLocation(@Nullable Output<String> providerPrimaryPeeringLocation) {
            this.providerPrimaryPeeringLocation = providerPrimaryPeeringLocation;
            return this;
        }
        public Builder providerPrimaryPeeringLocation(@Nullable String providerPrimaryPeeringLocation) {
            this.providerPrimaryPeeringLocation = Codegen.ofNullable(providerPrimaryPeeringLocation);
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
        public Builder sku(@Nullable Output<PeeringServiceSkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable PeeringServiceSkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public PeeringServiceArgs build() {
            return new PeeringServiceArgs(location, peeringServiceLocation, peeringServiceName, peeringServiceProvider, providerBackupPeeringLocation, providerPrimaryPeeringLocation, resourceGroupName, sku, tags);
        }
    }
}
