// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.AutoscaleSettingsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableGetPropertiesResponseOptions extends com.pulumi.resources.InvokeArgs {

    public static final TableGetPropertiesResponseOptions Empty = new TableGetPropertiesResponseOptions();

    /**
     * Specifies the Autoscale settings.
     * 
     */
    @Import(name="autoscaleSettings")
    private @Nullable AutoscaleSettingsResponse autoscaleSettings;

    public Optional<AutoscaleSettingsResponse> autoscaleSettings() {
        return Optional.ofNullable(this.autoscaleSettings);
    }

    /**
     * Value of the Cosmos DB resource throughput or autoscaleSettings. Use the ThroughputSetting resource when retrieving offer details.
     * 
     */
    @Import(name="throughput")
    private @Nullable Integer throughput;

    public Optional<Integer> throughput() {
        return Optional.ofNullable(this.throughput);
    }

    private TableGetPropertiesResponseOptions() {}

    private TableGetPropertiesResponseOptions(TableGetPropertiesResponseOptions $) {
        this.autoscaleSettings = $.autoscaleSettings;
        this.throughput = $.throughput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableGetPropertiesResponseOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableGetPropertiesResponseOptions $;

        public Builder() {
            $ = new TableGetPropertiesResponseOptions();
        }

        public Builder(TableGetPropertiesResponseOptions defaults) {
            $ = new TableGetPropertiesResponseOptions(Objects.requireNonNull(defaults));
        }

        public Builder autoscaleSettings(@Nullable AutoscaleSettingsResponse autoscaleSettings) {
            $.autoscaleSettings = autoscaleSettings;
            return this;
        }

        public Builder throughput(@Nullable Integer throughput) {
            $.throughput = throughput;
            return this;
        }

        public TableGetPropertiesResponseOptions build() {
            return $;
        }
    }

}
