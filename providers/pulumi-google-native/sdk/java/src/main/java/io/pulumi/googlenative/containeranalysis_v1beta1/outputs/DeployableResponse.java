// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DeployableResponse {
    /**
     * Resource URI for the artifact being deployed.
     * 
     */
    private final List<String> resourceUri;

    @OutputCustomType.Constructor
    private DeployableResponse(@OutputCustomType.Parameter("resourceUri") List<String> resourceUri) {
        this.resourceUri = resourceUri;
    }

    /**
     * Resource URI for the artifact being deployed.
     * 
    */
    public List<String> getResourceUri() {
        return this.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeployableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DeployableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setResourceUri(List<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public DeployableResponse build() {
            return new DeployableResponse(resourceUri);
        }
    }
}
