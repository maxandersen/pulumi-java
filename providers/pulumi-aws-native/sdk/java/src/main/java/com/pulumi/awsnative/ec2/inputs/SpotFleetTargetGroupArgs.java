// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SpotFleetTargetGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetTargetGroupArgs Empty = new SpotFleetTargetGroupArgs();

    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    private SpotFleetTargetGroupArgs() {}

    private SpotFleetTargetGroupArgs(SpotFleetTargetGroupArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetTargetGroupArgs $;

        public Builder() {
            $ = new SpotFleetTargetGroupArgs();
        }

        public Builder(SpotFleetTargetGroupArgs defaults) {
            $ = new SpotFleetTargetGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public SpotFleetTargetGroupArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
