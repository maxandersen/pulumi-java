// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.agfoodplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExtensionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExtensionArgs Empty = new GetExtensionArgs();

    /**
     * Id of extension resource.
     * 
     */
    @Import(name="extensionId", required=true)
      private final String extensionId;

    public String extensionId() {
        return this.extensionId;
    }

    /**
     * FarmBeats resource name.
     * 
     */
    @Import(name="farmBeatsResourceName", required=true)
      private final String farmBeatsResourceName;

    public String farmBeatsResourceName() {
        return this.farmBeatsResourceName;
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

    public GetExtensionArgs(
        String extensionId,
        String farmBeatsResourceName,
        String resourceGroupName) {
        this.extensionId = Objects.requireNonNull(extensionId, "expected parameter 'extensionId' to be non-null");
        this.farmBeatsResourceName = Objects.requireNonNull(farmBeatsResourceName, "expected parameter 'farmBeatsResourceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetExtensionArgs() {
        this.extensionId = null;
        this.farmBeatsResourceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String extensionId;
        private String farmBeatsResourceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensionId = defaults.extensionId;
    	      this.farmBeatsResourceName = defaults.farmBeatsResourceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder extensionId(String extensionId) {
            this.extensionId = Objects.requireNonNull(extensionId);
            return this;
        }
        public Builder farmBeatsResourceName(String farmBeatsResourceName) {
            this.farmBeatsResourceName = Objects.requireNonNull(farmBeatsResourceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetExtensionArgs build() {
            return new GetExtensionArgs(extensionId, farmBeatsResourceName, resourceGroupName);
        }
    }
}
