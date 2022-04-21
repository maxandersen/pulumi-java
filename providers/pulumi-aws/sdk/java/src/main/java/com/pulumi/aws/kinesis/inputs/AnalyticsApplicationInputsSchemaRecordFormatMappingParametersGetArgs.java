// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs Empty = new AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs();

    /**
     * Mapping information when the record format uses delimiters.
     * See CSV Mapping Parameters below for more details.
     * 
     */
    @Import(name="csv")
    private @Nullable Output<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs> csv;

    public Optional<Output<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs>> csv() {
        return Optional.ofNullable(this.csv);
    }

    /**
     * Mapping information when JSON is the record format on the streaming source.
     * See JSON Mapping Parameters below for more details.
     * 
     */
    @Import(name="json")
    private @Nullable Output<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonGetArgs> json;

    public Optional<Output<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonGetArgs>> json() {
        return Optional.ofNullable(this.json);
    }

    private AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs() {}

    private AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs $) {
        this.csv = $.csv;
        this.json = $.json;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs $;

        public Builder() {
            $ = new AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs();
        }

        public Builder(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs defaults) {
            $ = new AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder csv(@Nullable Output<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs> csv) {
            $.csv = csv;
            return this;
        }

        public Builder csv(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs csv) {
            return csv(Output.of(csv));
        }

        public Builder json(@Nullable Output<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonGetArgs> json) {
            $.json = json;
            return this;
        }

        public Builder json(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonGetArgs json) {
            return json(Output.of(json));
        }

        public AnalyticsApplicationInputsSchemaRecordFormatMappingParametersGetArgs build() {
            return $;
        }
    }

}
