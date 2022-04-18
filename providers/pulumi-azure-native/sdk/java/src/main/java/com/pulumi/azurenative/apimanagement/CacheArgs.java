// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CacheArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheArgs Empty = new CacheArgs();

    /**
     * Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region identifier).
     * 
     */
    @Import(name="cacheId")
      private final @Nullable Output<String> cacheId;

    public Output<String> cacheId() {
        return this.cacheId == null ? Codegen.empty() : this.cacheId;
    }

    /**
     * Runtime connection string to cache
     * 
     */
    @Import(name="connectionString", required=true)
      private final Output<String> connectionString;

    public Output<String> connectionString() {
        return this.connectionString;
    }

    /**
     * Cache description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
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
     * Original uri of entity in external system cache points to
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Location identifier to use cache from (should be either 'default' or valid Azure region identifier)
     * 
     */
    @Import(name="useFromLocation", required=true)
      private final Output<String> useFromLocation;

    public Output<String> useFromLocation() {
        return this.useFromLocation;
    }

    public CacheArgs(
        @Nullable Output<String> cacheId,
        Output<String> connectionString,
        @Nullable Output<String> description,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceId,
        Output<String> serviceName,
        Output<String> useFromLocation) {
        this.cacheId = cacheId;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.description = description;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceId = resourceId;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.useFromLocation = Objects.requireNonNull(useFromLocation, "expected parameter 'useFromLocation' to be non-null");
    }

    private CacheArgs() {
        this.cacheId = Codegen.empty();
        this.connectionString = Codegen.empty();
        this.description = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.useFromLocation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cacheId;
        private Output<String> connectionString;
        private @Nullable Output<String> description;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceId;
        private Output<String> serviceName;
        private Output<String> useFromLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheId = defaults.cacheId;
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.serviceName = defaults.serviceName;
    	      this.useFromLocation = defaults.useFromLocation;
        }

        public Builder cacheId(@Nullable Output<String> cacheId) {
            this.cacheId = cacheId;
            return this;
        }
        public Builder cacheId(@Nullable String cacheId) {
            this.cacheId = Codegen.ofNullable(cacheId);
            return this;
        }
        public Builder connectionString(Output<String> connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder connectionString(String connectionString) {
            this.connectionString = Output.of(Objects.requireNonNull(connectionString));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder useFromLocation(Output<String> useFromLocation) {
            this.useFromLocation = Objects.requireNonNull(useFromLocation);
            return this;
        }
        public Builder useFromLocation(String useFromLocation) {
            this.useFromLocation = Output.of(Objects.requireNonNull(useFromLocation));
            return this;
        }        public CacheArgs build() {
            return new CacheArgs(cacheId, connectionString, description, resourceGroupName, resourceId, serviceName, useFromLocation);
        }
    }
}
