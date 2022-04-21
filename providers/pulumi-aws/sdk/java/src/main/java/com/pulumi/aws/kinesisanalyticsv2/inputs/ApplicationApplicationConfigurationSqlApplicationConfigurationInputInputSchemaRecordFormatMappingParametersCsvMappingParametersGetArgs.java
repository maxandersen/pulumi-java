// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs();

    /**
     * The column delimiter. For example, in a CSV format, a comma (`,`) is the typical column delimiter.
     * 
     */
    @Import(name="recordColumnDelimiter", required=true)
    private Output<String> recordColumnDelimiter;

    public Output<String> recordColumnDelimiter() {
        return this.recordColumnDelimiter;
    }

    /**
     * The row delimiter. For example, in a CSV format, `\n` is the typical row delimiter.
     * 
     */
    @Import(name="recordRowDelimiter", required=true)
    private Output<String> recordRowDelimiter;

    public Output<String> recordRowDelimiter() {
        return this.recordRowDelimiter;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs $) {
        this.recordColumnDelimiter = $.recordColumnDelimiter;
        this.recordRowDelimiter = $.recordRowDelimiter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder recordColumnDelimiter(Output<String> recordColumnDelimiter) {
            $.recordColumnDelimiter = recordColumnDelimiter;
            return this;
        }

        public Builder recordColumnDelimiter(String recordColumnDelimiter) {
            return recordColumnDelimiter(Output.of(recordColumnDelimiter));
        }

        public Builder recordRowDelimiter(Output<String> recordRowDelimiter) {
            $.recordRowDelimiter = recordRowDelimiter;
            return this;
        }

        public Builder recordRowDelimiter(String recordRowDelimiter) {
            return recordRowDelimiter(Output.of(recordRowDelimiter));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersGetArgs build() {
            $.recordColumnDelimiter = Objects.requireNonNull($.recordColumnDelimiter, "expected parameter 'recordColumnDelimiter' to be non-null");
            $.recordRowDelimiter = Objects.requireNonNull($.recordRowDelimiter, "expected parameter 'recordRowDelimiter' to be non-null");
            return $;
        }
    }

}
