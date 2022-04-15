// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListTenantAccessSecretsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListTenantAccessSecretsArgs Empty = new ListTenantAccessSecretsArgs();

    /**
     * The identifier of the Access configuration.
     * 
     */
    @Import(name="accessName", required=true)
      private final String accessName;

    public String accessName() {
        return this.accessName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    public ListTenantAccessSecretsArgs(
        String accessName,
        String resourceGroupName,
        String serviceName) {
        this.accessName = Objects.requireNonNull(accessName, "expected parameter 'accessName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ListTenantAccessSecretsArgs() {
        this.accessName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTenantAccessSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessName;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTenantAccessSecretsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessName = defaults.accessName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder accessName(String accessName) {
            this.accessName = Objects.requireNonNull(accessName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public ListTenantAccessSecretsArgs build() {
            return new ListTenantAccessSecretsArgs(accessName, resourceGroupName, serviceName);
        }
    }
}
