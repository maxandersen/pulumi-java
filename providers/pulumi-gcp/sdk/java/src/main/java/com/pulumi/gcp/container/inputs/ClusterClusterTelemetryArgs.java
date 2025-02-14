// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterClusterTelemetryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterTelemetryArgs Empty = new ClusterClusterTelemetryArgs();

    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ClusterClusterTelemetryArgs() {}

    private ClusterClusterTelemetryArgs(ClusterClusterTelemetryArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterTelemetryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterTelemetryArgs $;

        public Builder() {
            $ = new ClusterClusterTelemetryArgs();
        }

        public Builder(ClusterClusterTelemetryArgs defaults) {
            $ = new ClusterClusterTelemetryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ClusterClusterTelemetryArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
