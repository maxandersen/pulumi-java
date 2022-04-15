// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetArtifactSourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetArtifactSourceArgs Empty = new GetArtifactSourceArgs();

    /**
     * The name of the artifact source.
     * 
     */
    @Import(name="artifactSourceName", required=true)
      private final String artifactSourceName;

    public String artifactSourceName() {
        return this.artifactSourceName;
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

    public GetArtifactSourceArgs(
        String artifactSourceName,
        String resourceGroupName) {
        this.artifactSourceName = Objects.requireNonNull(artifactSourceName, "expected parameter 'artifactSourceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetArtifactSourceArgs() {
        this.artifactSourceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetArtifactSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactSourceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArtifactSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactSourceName = defaults.artifactSourceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder artifactSourceName(String artifactSourceName) {
            this.artifactSourceName = Objects.requireNonNull(artifactSourceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetArtifactSourceArgs build() {
            return new GetArtifactSourceArgs(artifactSourceName, resourceGroupName);
        }
    }
}
