// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkScopedResourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkScopedResourceArgs Empty = new GetPrivateLinkScopedResourceArgs();

    /**
     * The name of the scoped resource object.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Monitor PrivateLinkScope resource.
     * 
     */
    @Import(name="scopeName", required=true)
      private final String scopeName;

    public String scopeName() {
        return this.scopeName;
    }

    public GetPrivateLinkScopedResourceArgs(
        String name,
        String resourceGroupName,
        String scopeName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scopeName = Objects.requireNonNull(scopeName, "expected parameter 'scopeName' to be non-null");
    }

    private GetPrivateLinkScopedResourceArgs() {
        this.name = null;
        this.resourceGroupName = null;
        this.scopeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkScopedResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceGroupName;
        private String scopeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateLinkScopedResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopeName = defaults.scopeName;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder scopeName(String scopeName) {
            this.scopeName = Objects.requireNonNull(scopeName);
            return this;
        }        public GetPrivateLinkScopedResourceArgs build() {
            return new GetPrivateLinkScopedResourceArgs(name, resourceGroupName, scopeName);
        }
    }
}
