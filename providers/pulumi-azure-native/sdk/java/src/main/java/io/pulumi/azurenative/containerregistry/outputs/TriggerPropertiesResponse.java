// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.BaseImageTriggerResponse;
import io.pulumi.azurenative.containerregistry.outputs.SourceTriggerResponse;
import io.pulumi.azurenative.containerregistry.outputs.TimerTriggerResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerPropertiesResponse {
    /**
     * The trigger based on base image dependencies.
     * 
     */
    private final @Nullable BaseImageTriggerResponse baseImageTrigger;
    /**
     * The collection of triggers based on source code repository.
     * 
     */
    private final @Nullable List<SourceTriggerResponse> sourceTriggers;
    /**
     * The collection of timer triggers.
     * 
     */
    private final @Nullable List<TimerTriggerResponse> timerTriggers;

    @CustomType.Constructor
    private TriggerPropertiesResponse(
        @CustomType.Parameter("baseImageTrigger") @Nullable BaseImageTriggerResponse baseImageTrigger,
        @CustomType.Parameter("sourceTriggers") @Nullable List<SourceTriggerResponse> sourceTriggers,
        @CustomType.Parameter("timerTriggers") @Nullable List<TimerTriggerResponse> timerTriggers) {
        this.baseImageTrigger = baseImageTrigger;
        this.sourceTriggers = sourceTriggers;
        this.timerTriggers = timerTriggers;
    }

    /**
     * The trigger based on base image dependencies.
     * 
    */
    public Optional<BaseImageTriggerResponse> baseImageTrigger() {
        return Optional.ofNullable(this.baseImageTrigger);
    }
    /**
     * The collection of triggers based on source code repository.
     * 
    */
    public List<SourceTriggerResponse> sourceTriggers() {
        return this.sourceTriggers == null ? List.of() : this.sourceTriggers;
    }
    /**
     * The collection of timer triggers.
     * 
    */
    public List<TimerTriggerResponse> timerTriggers() {
        return this.timerTriggers == null ? List.of() : this.timerTriggers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BaseImageTriggerResponse baseImageTrigger;
        private @Nullable List<SourceTriggerResponse> sourceTriggers;
        private @Nullable List<TimerTriggerResponse> timerTriggers;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseImageTrigger = defaults.baseImageTrigger;
    	      this.sourceTriggers = defaults.sourceTriggers;
    	      this.timerTriggers = defaults.timerTriggers;
        }

        public Builder baseImageTrigger(@Nullable BaseImageTriggerResponse baseImageTrigger) {
            this.baseImageTrigger = baseImageTrigger;
            return this;
        }
        public Builder sourceTriggers(@Nullable List<SourceTriggerResponse> sourceTriggers) {
            this.sourceTriggers = sourceTriggers;
            return this;
        }
        public Builder sourceTriggers(SourceTriggerResponse... sourceTriggers) {
            return sourceTriggers(List.of(sourceTriggers));
        }
        public Builder timerTriggers(@Nullable List<TimerTriggerResponse> timerTriggers) {
            this.timerTriggers = timerTriggers;
            return this;
        }
        public Builder timerTriggers(TimerTriggerResponse... timerTriggers) {
            return timerTriggers(List.of(timerTriggers));
        }        public TriggerPropertiesResponse build() {
            return new TriggerPropertiesResponse(baseImageTrigger, sourceTriggers, timerTriggers);
        }
    }
}
