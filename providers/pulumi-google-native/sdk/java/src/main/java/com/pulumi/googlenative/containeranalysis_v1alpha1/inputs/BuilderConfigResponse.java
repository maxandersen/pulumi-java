// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import java.util.Objects;


public final class BuilderConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final BuilderConfigResponse Empty = new BuilderConfigResponse();

    public BuilderConfigResponse() {
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
