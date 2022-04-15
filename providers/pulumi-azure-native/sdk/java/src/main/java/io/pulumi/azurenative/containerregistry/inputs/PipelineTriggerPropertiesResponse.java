// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.PipelineSourceTriggerPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineTriggerPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineTriggerPropertiesResponse Empty = new PipelineTriggerPropertiesResponse();

    /**
     * The source trigger properties of the pipeline.
     * 
     */
    @Import(name="sourceTrigger")
      private final @Nullable PipelineSourceTriggerPropertiesResponse sourceTrigger;

    public Optional<PipelineSourceTriggerPropertiesResponse> sourceTrigger() {
        return this.sourceTrigger == null ? Optional.empty() : Optional.ofNullable(this.sourceTrigger);
    }

    public PipelineTriggerPropertiesResponse(@Nullable PipelineSourceTriggerPropertiesResponse sourceTrigger) {
        this.sourceTrigger = sourceTrigger;
    }

    private PipelineTriggerPropertiesResponse() {
        this.sourceTrigger = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineTriggerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineSourceTriggerPropertiesResponse sourceTrigger;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineTriggerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceTrigger = defaults.sourceTrigger;
        }

        public Builder sourceTrigger(@Nullable PipelineSourceTriggerPropertiesResponse sourceTrigger) {
            this.sourceTrigger = sourceTrigger;
            return this;
        }        public PipelineTriggerPropertiesResponse build() {
            return new PipelineTriggerPropertiesResponse(sourceTrigger);
        }
    }
}
