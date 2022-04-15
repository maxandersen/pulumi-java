// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDscpConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDscpConfigurationArgs Empty = new GetDscpConfigurationArgs();

    /**
     * The name of the resource.
     * 
     */
    @Import(name="dscpConfigurationName", required=true)
      private final String dscpConfigurationName;

    public String dscpConfigurationName() {
        return this.dscpConfigurationName;
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

    public GetDscpConfigurationArgs(
        String dscpConfigurationName,
        String resourceGroupName) {
        this.dscpConfigurationName = Objects.requireNonNull(dscpConfigurationName, "expected parameter 'dscpConfigurationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDscpConfigurationArgs() {
        this.dscpConfigurationName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDscpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dscpConfigurationName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDscpConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dscpConfigurationName = defaults.dscpConfigurationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder dscpConfigurationName(String dscpConfigurationName) {
            this.dscpConfigurationName = Objects.requireNonNull(dscpConfigurationName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetDscpConfigurationArgs build() {
            return new GetDscpConfigurationArgs(dscpConfigurationName, resourceGroupName);
        }
    }
}
