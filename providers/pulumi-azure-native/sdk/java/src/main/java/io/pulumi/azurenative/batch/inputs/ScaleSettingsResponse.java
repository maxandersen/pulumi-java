// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.AutoScaleSettingsResponse;
import io.pulumi.azurenative.batch.inputs.FixedScaleSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes is specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
 * 
 */
public final class ScaleSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScaleSettingsResponse Empty = new ScaleSettingsResponse();

    /**
     * This property and fixedScale are mutually exclusive and one of the properties must be specified.
     * 
     */
    @Import(name="autoScale")
      private final @Nullable AutoScaleSettingsResponse autoScale;

    public Optional<AutoScaleSettingsResponse> autoScale() {
        return this.autoScale == null ? Optional.empty() : Optional.ofNullable(this.autoScale);
    }

    /**
     * This property and autoScale are mutually exclusive and one of the properties must be specified.
     * 
     */
    @Import(name="fixedScale")
      private final @Nullable FixedScaleSettingsResponse fixedScale;

    public Optional<FixedScaleSettingsResponse> fixedScale() {
        return this.fixedScale == null ? Optional.empty() : Optional.ofNullable(this.fixedScale);
    }

    public ScaleSettingsResponse(
        @Nullable AutoScaleSettingsResponse autoScale,
        @Nullable FixedScaleSettingsResponse fixedScale) {
        this.autoScale = autoScale;
        this.fixedScale = fixedScale;
    }

    private ScaleSettingsResponse() {
        this.autoScale = null;
        this.fixedScale = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoScaleSettingsResponse autoScale;
        private @Nullable FixedScaleSettingsResponse fixedScale;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScale = defaults.autoScale;
    	      this.fixedScale = defaults.fixedScale;
        }

        public Builder autoScale(@Nullable AutoScaleSettingsResponse autoScale) {
            this.autoScale = autoScale;
            return this;
        }
        public Builder fixedScale(@Nullable FixedScaleSettingsResponse fixedScale) {
            this.fixedScale = fixedScale;
            return this;
        }        public ScaleSettingsResponse build() {
            return new ScaleSettingsResponse(autoScale, fixedScale);
        }
    }
}
