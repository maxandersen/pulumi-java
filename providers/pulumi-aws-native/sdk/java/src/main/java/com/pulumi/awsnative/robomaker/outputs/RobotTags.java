// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class RobotTags {
    @CustomType.Constructor
    private RobotTags() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RobotTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RobotTags defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RobotTags build() {
            return new RobotTags();
        }
    }
}
