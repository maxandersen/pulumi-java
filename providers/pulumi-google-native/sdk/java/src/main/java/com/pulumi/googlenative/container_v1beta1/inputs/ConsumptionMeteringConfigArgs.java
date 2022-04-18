// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for controlling consumption metering.
 * 
 */
public final class ConsumptionMeteringConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsumptionMeteringConfigArgs Empty = new ConsumptionMeteringConfigArgs();

    /**
     * Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    public ConsumptionMeteringConfigArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private ConsumptionMeteringConfigArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsumptionMeteringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsumptionMeteringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }        public ConsumptionMeteringConfigArgs build() {
            return new ConsumptionMeteringConfigArgs(enabled);
        }
    }
}
