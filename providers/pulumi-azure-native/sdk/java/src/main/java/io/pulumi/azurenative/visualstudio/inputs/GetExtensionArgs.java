// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.visualstudio.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExtensionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExtensionArgs Empty = new GetExtensionArgs();

    /**
     * The name of the Visual Studio Team Services account resource.
     * 
     */
    @Import(name="accountResourceName", required=true)
      private final String accountResourceName;

    public String accountResourceName() {
        return this.accountResourceName;
    }

    /**
     * The name of the extension.
     * 
     */
    @Import(name="extensionResourceName", required=true)
      private final String extensionResourceName;

    public String extensionResourceName() {
        return this.extensionResourceName;
    }

    /**
     * Name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetExtensionArgs(
        String accountResourceName,
        String extensionResourceName,
        String resourceGroupName) {
        this.accountResourceName = Objects.requireNonNull(accountResourceName, "expected parameter 'accountResourceName' to be non-null");
        this.extensionResourceName = Objects.requireNonNull(extensionResourceName, "expected parameter 'extensionResourceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetExtensionArgs() {
        this.accountResourceName = null;
        this.extensionResourceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountResourceName;
        private String extensionResourceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountResourceName = defaults.accountResourceName;
    	      this.extensionResourceName = defaults.extensionResourceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountResourceName(String accountResourceName) {
            this.accountResourceName = Objects.requireNonNull(accountResourceName);
            return this;
        }
        public Builder extensionResourceName(String extensionResourceName) {
            this.extensionResourceName = Objects.requireNonNull(extensionResourceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetExtensionArgs build() {
            return new GetExtensionArgs(accountResourceName, extensionResourceName, resourceGroupName);
        }
    }
}
