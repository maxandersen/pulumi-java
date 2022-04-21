// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordColumnGetArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsSchemaGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsSchemaGetArgs Empty = new AnalyticsApplicationInputsSchemaGetArgs();

    /**
     * The Record Column mapping for the streaming source data element.
     * See Record Columns below for more details.
     * 
     */
    @Import(name="recordColumns", required=true)
    private Output<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns;

    public Output<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns() {
        return this.recordColumns;
    }

    /**
     * The Encoding of the record in the streaming source.
     * 
     */
    @Import(name="recordEncoding")
    private @Nullable Output<String> recordEncoding;

    public Optional<Output<String>> recordEncoding() {
        return Optional.ofNullable(this.recordEncoding);
    }

    /**
     * The Record Format and mapping information to schematize a record.
     * See Record Format below for more details.
     * 
     */
    @Import(name="recordFormat", required=true)
    private Output<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat;

    public Output<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat() {
        return this.recordFormat;
    }

    private AnalyticsApplicationInputsSchemaGetArgs() {}

    private AnalyticsApplicationInputsSchemaGetArgs(AnalyticsApplicationInputsSchemaGetArgs $) {
        this.recordColumns = $.recordColumns;
        this.recordEncoding = $.recordEncoding;
        this.recordFormat = $.recordFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationInputsSchemaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationInputsSchemaGetArgs $;

        public Builder() {
            $ = new AnalyticsApplicationInputsSchemaGetArgs();
        }

        public Builder(AnalyticsApplicationInputsSchemaGetArgs defaults) {
            $ = new AnalyticsApplicationInputsSchemaGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder recordColumns(Output<List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs>> recordColumns) {
            $.recordColumns = recordColumns;
            return this;
        }

        public Builder recordColumns(List<AnalyticsApplicationInputsSchemaRecordColumnGetArgs> recordColumns) {
            return recordColumns(Output.of(recordColumns));
        }

        public Builder recordColumns(AnalyticsApplicationInputsSchemaRecordColumnGetArgs... recordColumns) {
            return recordColumns(List.of(recordColumns));
        }

        public Builder recordEncoding(@Nullable Output<String> recordEncoding) {
            $.recordEncoding = recordEncoding;
            return this;
        }

        public Builder recordEncoding(String recordEncoding) {
            return recordEncoding(Output.of(recordEncoding));
        }

        public Builder recordFormat(Output<AnalyticsApplicationInputsSchemaRecordFormatGetArgs> recordFormat) {
            $.recordFormat = recordFormat;
            return this;
        }

        public Builder recordFormat(AnalyticsApplicationInputsSchemaRecordFormatGetArgs recordFormat) {
            return recordFormat(Output.of(recordFormat));
        }

        public AnalyticsApplicationInputsSchemaGetArgs build() {
            $.recordColumns = Objects.requireNonNull($.recordColumns, "expected parameter 'recordColumns' to be non-null");
            $.recordFormat = Objects.requireNonNull($.recordFormat, "expected parameter 'recordFormat' to be non-null");
            return $;
        }
    }

}
