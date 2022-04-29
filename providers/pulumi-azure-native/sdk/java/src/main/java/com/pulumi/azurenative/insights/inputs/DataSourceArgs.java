// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.DataSourceConfigurationArgs;
import com.pulumi.azurenative.insights.inputs.SinkConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Data source object contains configuration to collect telemetry and one or more sinks to send that telemetry data to
 * 
 */
public final class DataSourceArgs extends ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    @Import(name="configuration", required=true)
    private Output<DataSourceConfigurationArgs> configuration;

    public Output<DataSourceConfigurationArgs> configuration() {
        return this.configuration;
    }

    /**
     * Datasource kind
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Datasource kind
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    @Import(name="sinks", required=true)
    private Output<List<SinkConfigurationArgs>> sinks;

    public Output<List<SinkConfigurationArgs>> sinks() {
        return this.sinks;
    }

    private DataSourceArgs() {}

    private DataSourceArgs(DataSourceArgs $) {
        this.configuration = $.configuration;
        this.kind = $.kind;
        this.sinks = $.sinks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceArgs $;

        public Builder() {
            $ = new DataSourceArgs();
        }

        public Builder(DataSourceArgs defaults) {
            $ = new DataSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder configuration(Output<DataSourceConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(DataSourceConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param kind Datasource kind
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Datasource kind
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder sinks(Output<List<SinkConfigurationArgs>> sinks) {
            $.sinks = sinks;
            return this;
        }

        public Builder sinks(List<SinkConfigurationArgs> sinks) {
            return sinks(Output.of(sinks));
        }

        public Builder sinks(SinkConfigurationArgs... sinks) {
            return sinks(List.of(sinks));
        }

        public DataSourceArgs build() {
            $.configuration = Objects.requireNonNull($.configuration, "expected parameter 'configuration' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.sinks = Objects.requireNonNull($.sinks, "expected parameter 'sinks' to be non-null");
            return $;
        }
    }

}
