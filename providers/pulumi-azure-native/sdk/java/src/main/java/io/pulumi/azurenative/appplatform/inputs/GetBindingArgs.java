// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBindingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBindingArgs Empty = new GetBindingArgs();

    /**
     * The name of the App resource.
     * 
     */
    @Import(name="appName", required=true)
      private final String appName;

    public String appName() {
        return this.appName;
    }

    /**
     * The name of the Binding resource.
     * 
     */
    @Import(name="bindingName", required=true)
      private final String bindingName;

    public String bindingName() {
        return this.bindingName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    public GetBindingArgs(
        String appName,
        String bindingName,
        String resourceGroupName,
        String serviceName) {
        this.appName = Objects.requireNonNull(appName, "expected parameter 'appName' to be non-null");
        this.bindingName = Objects.requireNonNull(bindingName, "expected parameter 'bindingName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetBindingArgs() {
        this.appName = null;
        this.bindingName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appName;
        private String bindingName;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.bindingName = defaults.bindingName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder appName(String appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }
        public Builder bindingName(String bindingName) {
            this.bindingName = Objects.requireNonNull(bindingName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetBindingArgs build() {
            return new GetBindingArgs(appName, bindingName, resourceGroupName, serviceName);
        }
    }
}
