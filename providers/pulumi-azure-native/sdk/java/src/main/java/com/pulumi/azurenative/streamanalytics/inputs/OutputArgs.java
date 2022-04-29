// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.AvroSerializationArgs;
import com.pulumi.azurenative.streamanalytics.inputs.AzureDataLakeStoreOutputDataSourceArgs;
import com.pulumi.azurenative.streamanalytics.inputs.AzureSqlDatabaseOutputDataSourceArgs;
import com.pulumi.azurenative.streamanalytics.inputs.AzureTableOutputDataSourceArgs;
import com.pulumi.azurenative.streamanalytics.inputs.BlobOutputDataSourceArgs;
import com.pulumi.azurenative.streamanalytics.inputs.CsvSerializationArgs;
import com.pulumi.azurenative.streamanalytics.inputs.DocumentDbOutputDataSourceArgs;
import com.pulumi.azurenative.streamanalytics.inputs.EventHubOutputDataSourceArgs;
import com.pulumi.azurenative.streamanalytics.inputs.JsonSerializationArgs;
import com.pulumi.azurenative.streamanalytics.inputs.PowerBIOutputDataSourceArgs;
import com.pulumi.azurenative.streamanalytics.inputs.ServiceBusQueueOutputDataSourceArgs;
import com.pulumi.azurenative.streamanalytics.inputs.ServiceBusTopicOutputDataSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
 * 
 */
public final class OutputArgs extends ResourceArgs {

    public static final OutputArgs Empty = new OutputArgs();

    /**
     * Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="datasource")
    private @Nullable Output<Object> datasource;

    /**
     * @return Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<Object>> datasource() {
        return Optional.ofNullable(this.datasource);
    }

    /**
     * Resource name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="serialization")
    private @Nullable Output<Object> serialization;

    /**
     * @return Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<Object>> serialization() {
        return Optional.ofNullable(this.serialization);
    }

    private OutputArgs() {}

    private OutputArgs(OutputArgs $) {
        this.datasource = $.datasource;
        this.name = $.name;
        this.serialization = $.serialization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputArgs $;

        public Builder() {
            $ = new OutputArgs();
        }

        public Builder(OutputArgs defaults) {
            $ = new OutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasource Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder datasource(@Nullable Output<Object> datasource) {
            $.datasource = datasource;
            return this;
        }

        /**
         * @param datasource Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder datasource(Object datasource) {
            return datasource(Output.of(datasource));
        }

        /**
         * @param name Resource name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serialization Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder serialization(@Nullable Output<Object> serialization) {
            $.serialization = serialization;
            return this;
        }

        /**
         * @param serialization Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder serialization(Object serialization) {
            return serialization(Output.of(serialization));
        }

        public OutputArgs build() {
            return $;
        }
    }

}
