// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality;

import io.pulumi.azurenative.mixedreality.inputs.IdentityArgs;
import io.pulumi.azurenative.mixedreality.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpatialAnchorsAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpatialAnchorsAccountArgs Empty = new SpatialAnchorsAccountArgs();

    /**
     * Name of an Mixed Reality Account.
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName == null ? Codegen.empty() : this.accountName;
    }

    /**
     * The identity associated with this account
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<IdentityArgs> identity;

    public Output<IdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The kind of account, if supported
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<SkuArgs> kind;

    public Output<SkuArgs> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The plan associated with this account
     * 
     */
    @Import(name="plan")
      private final @Nullable Output<IdentityArgs> plan;

    public Output<IdentityArgs> plan() {
        return this.plan == null ? Codegen.empty() : this.plan;
    }

    /**
     * Name of an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku associated with this account
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * The name of the storage account associated with this accountId
     * 
     */
    @Import(name="storageAccountName")
      private final @Nullable Output<String> storageAccountName;

    public Output<String> storageAccountName() {
        return this.storageAccountName == null ? Codegen.empty() : this.storageAccountName;
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

    public SpatialAnchorsAccountArgs(
        @Nullable Output<String> accountName,
        @Nullable Output<IdentityArgs> identity,
        @Nullable Output<SkuArgs> kind,
        @Nullable Output<String> location,
        @Nullable Output<IdentityArgs> plan,
        Output<String> resourceGroupName,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<String> storageAccountName,
        @Nullable Output<Map<String,String>> tags) {
        this.accountName = accountName;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.plan = plan;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.storageAccountName = storageAccountName;
        this.tags = tags;
    }

    private SpatialAnchorsAccountArgs() {
        this.accountName = Codegen.empty();
        this.identity = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.plan = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.storageAccountName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpatialAnchorsAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountName;
        private @Nullable Output<IdentityArgs> identity;
        private @Nullable Output<SkuArgs> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<IdentityArgs> plan;
        private Output<String> resourceGroupName;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<String> storageAccountName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SpatialAnchorsAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.plan = defaults.plan;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.tags = defaults.tags;
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = Codegen.ofNullable(accountName);
            return this;
        }
        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable IdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder kind(@Nullable Output<SkuArgs> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable SkuArgs kind) {
            this.kind = Codegen.ofNullable(kind);
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
        public Builder plan(@Nullable Output<IdentityArgs> plan) {
            this.plan = plan;
            return this;
        }
        public Builder plan(@Nullable IdentityArgs plan) {
            this.plan = Codegen.ofNullable(plan);
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
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }
        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = Codegen.ofNullable(storageAccountName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public SpatialAnchorsAccountArgs build() {
            return new SpatialAnchorsAccountArgs(accountName, identity, kind, location, plan, resourceGroupName, sku, storageAccountName, tags);
        }
    }
}
