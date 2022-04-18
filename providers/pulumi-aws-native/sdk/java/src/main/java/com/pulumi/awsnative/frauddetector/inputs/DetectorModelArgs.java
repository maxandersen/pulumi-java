// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A model to associate with a detector.
 * 
 */
public final class DetectorModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorModelArgs Empty = new DetectorModelArgs();

    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    public DetectorModelArgs(@Nullable Output<String> arn) {
        this.arn = arn;
    }

    private DetectorModelArgs() {
        this.arn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }        public DetectorModelArgs build() {
            return new DetectorModelArgs(arn);
        }
    }
}
