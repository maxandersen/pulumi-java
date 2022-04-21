// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A model to associate with a detector.
 * 
 */
public final class DetectorModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorModelArgs Empty = new DetectorModelArgs();

    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    private DetectorModelArgs() {}

    private DetectorModelArgs(DetectorModelArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelArgs $;

        public Builder() {
            $ = new DetectorModelArgs();
        }

        public Builder(DetectorModelArgs defaults) {
            $ = new DetectorModelArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public DetectorModelArgs build() {
            return $;
        }
    }

}
