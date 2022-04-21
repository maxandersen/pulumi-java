// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.awsnative.iotanalytics.inputs.DatastoreJsonConfigurationArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatastoreParquetConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreFileFormatConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastoreFileFormatConfigurationArgs Empty = new DatastoreFileFormatConfigurationArgs();

    @Import(name="jsonConfiguration")
    private @Nullable Output<DatastoreJsonConfigurationArgs> jsonConfiguration;

    public Optional<Output<DatastoreJsonConfigurationArgs>> jsonConfiguration() {
        return Optional.ofNullable(this.jsonConfiguration);
    }

    @Import(name="parquetConfiguration")
    private @Nullable Output<DatastoreParquetConfigurationArgs> parquetConfiguration;

    public Optional<Output<DatastoreParquetConfigurationArgs>> parquetConfiguration() {
        return Optional.ofNullable(this.parquetConfiguration);
    }

    private DatastoreFileFormatConfigurationArgs() {}

    private DatastoreFileFormatConfigurationArgs(DatastoreFileFormatConfigurationArgs $) {
        this.jsonConfiguration = $.jsonConfiguration;
        this.parquetConfiguration = $.parquetConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastoreFileFormatConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastoreFileFormatConfigurationArgs $;

        public Builder() {
            $ = new DatastoreFileFormatConfigurationArgs();
        }

        public Builder(DatastoreFileFormatConfigurationArgs defaults) {
            $ = new DatastoreFileFormatConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder jsonConfiguration(@Nullable Output<DatastoreJsonConfigurationArgs> jsonConfiguration) {
            $.jsonConfiguration = jsonConfiguration;
            return this;
        }

        public Builder jsonConfiguration(DatastoreJsonConfigurationArgs jsonConfiguration) {
            return jsonConfiguration(Output.of(jsonConfiguration));
        }

        public Builder parquetConfiguration(@Nullable Output<DatastoreParquetConfigurationArgs> parquetConfiguration) {
            $.parquetConfiguration = parquetConfiguration;
            return this;
        }

        public Builder parquetConfiguration(DatastoreParquetConfigurationArgs parquetConfiguration) {
            return parquetConfiguration(Output.of(parquetConfiguration));
        }

        public DatastoreFileFormatConfigurationArgs build() {
            return $;
        }
    }

}
