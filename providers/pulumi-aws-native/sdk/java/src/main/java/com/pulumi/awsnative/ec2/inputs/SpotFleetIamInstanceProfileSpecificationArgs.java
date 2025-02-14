// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetIamInstanceProfileSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetIamInstanceProfileSpecificationArgs Empty = new SpotFleetIamInstanceProfileSpecificationArgs();

    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    private SpotFleetIamInstanceProfileSpecificationArgs() {}

    private SpotFleetIamInstanceProfileSpecificationArgs(SpotFleetIamInstanceProfileSpecificationArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetIamInstanceProfileSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetIamInstanceProfileSpecificationArgs $;

        public Builder() {
            $ = new SpotFleetIamInstanceProfileSpecificationArgs();
        }

        public Builder(SpotFleetIamInstanceProfileSpecificationArgs defaults) {
            $ = new SpotFleetIamInstanceProfileSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public SpotFleetIamInstanceProfileSpecificationArgs build() {
            return $;
        }
    }

}
