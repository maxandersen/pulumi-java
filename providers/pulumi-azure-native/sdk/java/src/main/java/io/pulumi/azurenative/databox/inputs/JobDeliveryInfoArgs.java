// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional delivery info.
 * 
 */
public final class JobDeliveryInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobDeliveryInfoArgs Empty = new JobDeliveryInfoArgs();

    /**
     * Scheduled date time.
     * 
     */
    @Import(name="scheduledDateTime")
      private final @Nullable Output<String> scheduledDateTime;

    public Output<String> scheduledDateTime() {
        return this.scheduledDateTime == null ? Codegen.empty() : this.scheduledDateTime;
    }

    public JobDeliveryInfoArgs(@Nullable Output<String> scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
    }

    private JobDeliveryInfoArgs() {
        this.scheduledDateTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDeliveryInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> scheduledDateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDeliveryInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduledDateTime = defaults.scheduledDateTime;
        }

        public Builder scheduledDateTime(@Nullable Output<String> scheduledDateTime) {
            this.scheduledDateTime = scheduledDateTime;
            return this;
        }
        public Builder scheduledDateTime(@Nullable String scheduledDateTime) {
            this.scheduledDateTime = Codegen.ofNullable(scheduledDateTime);
            return this;
        }        public JobDeliveryInfoArgs build() {
            return new JobDeliveryInfoArgs(scheduledDateTime);
        }
    }
}
