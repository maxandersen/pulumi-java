// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azureactivedirectory;

import com.pulumi.azurenative.azureactivedirectory.inputs.B2CResourceSKUArgs;
import com.pulumi.azurenative.azureactivedirectory.inputs.CreateTenantRequestBodyPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class B2CTenantArgs extends com.pulumi.resources.ResourceArgs {

    public static final B2CTenantArgs Empty = new B2CTenantArgs();

    /**
     * The location in which the resource is hosted and data resides. Can be one of &#39;United States&#39;, &#39;Europe&#39;, &#39;Asia Pacific&#39;, or &#39;Australia&#39; (preview). Refer to [this documentation](https://aka.ms/B2CDataResidency) for more information.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="properties", required=true)
      private final Output<CreateTenantRequestBodyPropertiesArgs> properties;

    public Output<CreateTenantRequestBodyPropertiesArgs> properties() {
        return this.properties;
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
     * The initial domain name of the B2C tenant.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName == null ? Codegen.empty() : this.resourceName;
    }

    /**
     * SKU properties of the Azure AD B2C tenant. Learn more about Azure AD B2C billing at [aka.ms/b2cBilling](https://aka.ms/b2cBilling).
     * 
     */
    @Import(name="sku", required=true)
      private final Output<B2CResourceSKUArgs> sku;

    public Output<B2CResourceSKUArgs> sku() {
        return this.sku;
    }

    /**
     * Resource Tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public B2CTenantArgs(
        @Nullable Output<String> location,
        Output<CreateTenantRequestBodyPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        Output<B2CResourceSKUArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private B2CTenantArgs() {
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(B2CTenantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private Output<CreateTenantRequestBodyPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private Output<B2CResourceSKUArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(B2CTenantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
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
        public Builder properties(Output<CreateTenantRequestBodyPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(CreateTenantRequestBodyPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
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
        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Codegen.ofNullable(resourceName);
            return this;
        }
        public Builder sku(Output<B2CResourceSKUArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(B2CResourceSKUArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public B2CTenantArgs build() {
            return new B2CTenantArgs(location, properties, resourceGroupName, resourceName, sku, tags);
        }
    }
}
