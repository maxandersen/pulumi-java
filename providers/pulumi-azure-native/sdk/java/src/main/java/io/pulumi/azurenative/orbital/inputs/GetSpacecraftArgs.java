// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSpacecraftArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSpacecraftArgs Empty = new GetSpacecraftArgs();

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
     * Spacecraft ID
     * 
     */
    @Import(name="spacecraftName", required=true)
      private final String spacecraftName;

    public String spacecraftName() {
        return this.spacecraftName;
    }

    public GetSpacecraftArgs(
        String resourceGroupName,
        String spacecraftName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.spacecraftName = Objects.requireNonNull(spacecraftName, "expected parameter 'spacecraftName' to be non-null");
    }

    private GetSpacecraftArgs() {
        this.resourceGroupName = null;
        this.spacecraftName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpacecraftArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String spacecraftName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpacecraftArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.spacecraftName = defaults.spacecraftName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder spacecraftName(String spacecraftName) {
            this.spacecraftName = Objects.requireNonNull(spacecraftName);
            return this;
        }        public GetSpacecraftArgs build() {
            return new GetSpacecraftArgs(resourceGroupName, spacecraftName);
        }
    }
}
