// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class BuilderConfigResponse {
    @OutputCustomType.Constructor
    private BuilderConfigResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuilderConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(BuilderConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public BuilderConfigResponse build() {
            return new BuilderConfigResponse();
        }
    }
}
