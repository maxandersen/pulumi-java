// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Monitor Metrics destination.
 * 
 */
public final class DestinationsSpecAzureMonitorMetricsArgs extends ResourceArgs {

    public static final DestinationsSpecAzureMonitorMetricsArgs Empty = new DestinationsSpecAzureMonitorMetricsArgs();

    /**
     * A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DestinationsSpecAzureMonitorMetricsArgs() {}

    private DestinationsSpecAzureMonitorMetricsArgs(DestinationsSpecAzureMonitorMetricsArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DestinationsSpecAzureMonitorMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DestinationsSpecAzureMonitorMetricsArgs $;

        public Builder() {
            $ = new DestinationsSpecAzureMonitorMetricsArgs();
        }

        public Builder(DestinationsSpecAzureMonitorMetricsArgs defaults) {
            $ = new DestinationsSpecAzureMonitorMetricsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A friendly name for the destination.
         * This name should be unique across all destinations (regardless of type) within the data collection rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name for the destination.
         * This name should be unique across all destinations (regardless of type) within the data collection rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DestinationsSpecAzureMonitorMetricsArgs build() {
            return $;
        }
    }

}
