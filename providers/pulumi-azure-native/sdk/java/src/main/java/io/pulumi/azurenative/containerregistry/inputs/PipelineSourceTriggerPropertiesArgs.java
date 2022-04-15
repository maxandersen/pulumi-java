// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.TriggerStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class PipelineSourceTriggerPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineSourceTriggerPropertiesArgs Empty = new PipelineSourceTriggerPropertiesArgs();

    /**
     * The current status of the source trigger.
     * 
     */
    @Import(name="status", required=true)
      private final Output<Either<String,TriggerStatus>> status;

    public Output<Either<String,TriggerStatus>> status() {
        return this.status;
    }

    public PipelineSourceTriggerPropertiesArgs(Output<Either<String,TriggerStatus>> status) {
        this.status = status == null ? Output.ofLeft("Enabled") : Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private PipelineSourceTriggerPropertiesArgs() {
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineSourceTriggerPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,TriggerStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineSourceTriggerPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(Output<Either<String,TriggerStatus>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(Either<String,TriggerStatus> status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public PipelineSourceTriggerPropertiesArgs build() {
            return new PipelineSourceTriggerPropertiesArgs(status);
        }
    }
}
