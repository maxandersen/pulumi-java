// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class InitializingReplicationStepResponse {
    @CustomType.Constructor
    private InitializingReplicationStepResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitializingReplicationStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(InitializingReplicationStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public InitializingReplicationStepResponse build() {
            return new InitializingReplicationStepResponse();
        }
    }
}
