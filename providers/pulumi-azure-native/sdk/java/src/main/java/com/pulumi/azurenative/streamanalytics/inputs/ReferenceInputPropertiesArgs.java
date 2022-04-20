// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.AvroSerializationArgs;
import com.pulumi.azurenative.streamanalytics.inputs.BlobReferenceInputDataSourceArgs;
import com.pulumi.azurenative.streamanalytics.inputs.CsvSerializationArgs;
import com.pulumi.azurenative.streamanalytics.inputs.JsonSerializationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that are associated with an input containing reference data.
 * 
 */
public final class ReferenceInputPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReferenceInputPropertiesArgs Empty = new ReferenceInputPropertiesArgs();

    /**
     * Describes an input data source that contains reference data. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="datasource")
      private final @Nullable Output<BlobReferenceInputDataSourceArgs> datasource;

    public Output<BlobReferenceInputDataSourceArgs> datasource() {
        return this.datasource == null ? Codegen.empty() : this.datasource;
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

    /**
     * Indicates whether the input is a source of reference data or stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Reference&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ReferenceInputPropertiesArgs(
        @Nullable Output<BlobReferenceInputDataSourceArgs> datasource,
        @Nullable Output<Object> serialization,
        Output<String> type) {
        this.datasource = datasource;
        this.serialization = serialization;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private ReferenceInputPropertiesArgs() {
        this.datasource = Codegen.empty();
        this.serialization = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReferenceInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BlobReferenceInputDataSourceArgs> datasource;
        private @Nullable Output<Object> serialization;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReferenceInputPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.serialization = defaults.serialization;
    	      this.type = defaults.type;
        }

        public Builder datasource(@Nullable Output<BlobReferenceInputDataSourceArgs> datasource) {
            this.datasource = datasource;
            return this;
        }
        public Builder datasource(@Nullable BlobReferenceInputDataSourceArgs datasource) {
            this.datasource = Codegen.ofNullable(datasource);
            return this;
        }
        public Builder serialization(@Nullable Output<Object> serialization) {
            this.serialization = serialization;
            return this;
        }
        public Builder serialization(@Nullable Object serialization) {
            this.serialization = Codegen.ofNullable(serialization);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ReferenceInputPropertiesArgs build() {
            return new ReferenceInputPropertiesArgs(datasource, serialization, type);
        }
    }
}
