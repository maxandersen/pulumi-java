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
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that are associated with an input containing reference data.
 * 
 */
public final class ReferenceInputPropertiesArgs extends ResourceArgs {

    public static final ReferenceInputPropertiesArgs Empty = new ReferenceInputPropertiesArgs();

    /**
     * Describes an input data source that contains reference data. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="datasource")
    private @Nullable Output<BlobReferenceInputDataSourceArgs> datasource;

    /**
     * @return Describes an input data source that contains reference data. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<BlobReferenceInputDataSourceArgs>> datasource() {
        return Optional.ofNullable(this.datasource);
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

    /**
     * Indicates whether the input is a source of reference data or stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Reference&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Indicates whether the input is a source of reference data or stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Reference&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ReferenceInputPropertiesArgs() {}

    private ReferenceInputPropertiesArgs(ReferenceInputPropertiesArgs $) {
        this.datasource = $.datasource;
        this.serialization = $.serialization;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReferenceInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReferenceInputPropertiesArgs $;

        public Builder() {
            $ = new ReferenceInputPropertiesArgs();
        }

        public Builder(ReferenceInputPropertiesArgs defaults) {
            $ = new ReferenceInputPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasource Describes an input data source that contains reference data. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder datasource(@Nullable Output<BlobReferenceInputDataSourceArgs> datasource) {
            $.datasource = datasource;
            return this;
        }

        /**
         * @param datasource Describes an input data source that contains reference data. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder datasource(BlobReferenceInputDataSourceArgs datasource) {
            return datasource(Output.of(datasource));
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

        /**
         * @param type Indicates whether the input is a source of reference data or stream data. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Reference&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Indicates whether the input is a source of reference data or stream data. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Reference&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ReferenceInputPropertiesArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
