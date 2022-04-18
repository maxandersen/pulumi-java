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
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
 * 
 */
public final class OutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutputArgs Empty = new OutputArgs();

    /**
     * Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="datasource")
      private final @Nullable Output<Object> datasource;

    public Output<Object> datasource() {
        return this.datasource == null ? Codegen.empty() : this.datasource;
    }

    /**
     * Resource name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="serialization")
      private final @Nullable Output<Object> serialization;

    public Output<Object> serialization() {
        return this.serialization == null ? Codegen.empty() : this.serialization;
    }

    public OutputArgs(
        @Nullable Output<Object> datasource,
        @Nullable Output<String> name,
        @Nullable Output<Object> serialization) {
        this.datasource = datasource;
        this.name = name;
        this.serialization = serialization;
    }

    private OutputArgs() {
        this.datasource = Codegen.empty();
        this.name = Codegen.empty();
        this.serialization = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> datasource;
        private @Nullable Output<String> name;
        private @Nullable Output<Object> serialization;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.name = defaults.name;
    	      this.serialization = defaults.serialization;
        }

        public Builder datasource(@Nullable Output<Object> datasource) {
            this.datasource = datasource;
            return this;
        }
        public Builder datasource(@Nullable Object datasource) {
            this.datasource = Codegen.ofNullable(datasource);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder serialization(@Nullable Output<Object> serialization) {
            this.serialization = serialization;
            return this;
        }
        public Builder serialization(@Nullable Object serialization) {
            this.serialization = Codegen.ofNullable(serialization);
            return this;
        }        public OutputArgs build() {
            return new OutputArgs(datasource, name, serialization);
        }
    }
}
