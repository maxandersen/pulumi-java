// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.AutoscaleSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GraphResourceGetPropertiesResponseOptions extends io.pulumi.resources.InvokeArgs {

    public static final GraphResourceGetPropertiesResponseOptions Empty = new GraphResourceGetPropertiesResponseOptions();

    /**
     * Specifies the Autoscale settings.
     * 
     */
    @Import(name="autoscaleSettings")
      private final @Nullable AutoscaleSettingsResponse autoscaleSettings;

    public Optional<AutoscaleSettingsResponse> autoscaleSettings() {
        return this.autoscaleSettings == null ? Optional.empty() : Optional.ofNullable(this.autoscaleSettings);
    }

    /**
     * Value of the Cosmos DB resource throughput or autoscaleSettings. Use the ThroughputSetting resource when retrieving offer details.
     * 
     */
    @Import(name="throughput")
      private final @Nullable Integer throughput;

    public Optional<Integer> throughput() {
        return this.throughput == null ? Optional.empty() : Optional.ofNullable(this.throughput);
    }

    public GraphResourceGetPropertiesResponseOptions(
        @Nullable AutoscaleSettingsResponse autoscaleSettings,
        @Nullable Integer throughput) {
        this.autoscaleSettings = autoscaleSettings;
        this.throughput = throughput;
    }

    private GraphResourceGetPropertiesResponseOptions() {
        this.autoscaleSettings = null;
        this.throughput = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphResourceGetPropertiesResponseOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscaleSettingsResponse autoscaleSettings;
        private @Nullable Integer throughput;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphResourceGetPropertiesResponseOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleSettings = defaults.autoscaleSettings;
    	      this.throughput = defaults.throughput;
        }

        public Builder autoscaleSettings(@Nullable AutoscaleSettingsResponse autoscaleSettings) {
            this.autoscaleSettings = autoscaleSettings;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }        public GraphResourceGetPropertiesResponseOptions build() {
            return new GraphResourceGetPropertiesResponseOptions(autoscaleSettings, throughput);
        }
    }
}
