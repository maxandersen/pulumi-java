// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetAssignmentResult {
    @CustomType.Constructor
    private GetAssignmentResult() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GetAssignmentResult build() {
            return new GetAssignmentResult();
        }
    }
}
