// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.inputs.DatasetDataCatalogInputDefinition;
import com.pulumi.awsnative.databrew.inputs.DatasetDatabaseInputDefinition;
import com.pulumi.awsnative.databrew.inputs.DatasetMetadata;
import com.pulumi.awsnative.databrew.inputs.DatasetS3Location;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input
 * 
 */
public final class DatasetInput extends com.pulumi.resources.InvokeArgs {

    public static final DatasetInput Empty = new DatasetInput();

    @Import(name="dataCatalogInputDefinition")
    private @Nullable DatasetDataCatalogInputDefinition dataCatalogInputDefinition;

    public Optional<DatasetDataCatalogInputDefinition> dataCatalogInputDefinition() {
        return Optional.ofNullable(this.dataCatalogInputDefinition);
    }

    @Import(name="databaseInputDefinition")
    private @Nullable DatasetDatabaseInputDefinition databaseInputDefinition;

    public Optional<DatasetDatabaseInputDefinition> databaseInputDefinition() {
        return Optional.ofNullable(this.databaseInputDefinition);
    }

    @Import(name="metadata")
    private @Nullable DatasetMetadata metadata;

    public Optional<DatasetMetadata> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    @Import(name="s3InputDefinition")
    private @Nullable DatasetS3Location s3InputDefinition;

    public Optional<DatasetS3Location> s3InputDefinition() {
        return Optional.ofNullable(this.s3InputDefinition);
    }

    private DatasetInput() {}

    private DatasetInput(DatasetInput $) {
        this.dataCatalogInputDefinition = $.dataCatalogInputDefinition;
        this.databaseInputDefinition = $.databaseInputDefinition;
        this.metadata = $.metadata;
        this.s3InputDefinition = $.s3InputDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetInput $;

        public Builder() {
            $ = new DatasetInput();
        }

        public Builder(DatasetInput defaults) {
            $ = new DatasetInput(Objects.requireNonNull(defaults));
        }

        public Builder dataCatalogInputDefinition(@Nullable DatasetDataCatalogInputDefinition dataCatalogInputDefinition) {
            $.dataCatalogInputDefinition = dataCatalogInputDefinition;
            return this;
        }

        public Builder databaseInputDefinition(@Nullable DatasetDatabaseInputDefinition databaseInputDefinition) {
            $.databaseInputDefinition = databaseInputDefinition;
            return this;
        }

        public Builder metadata(@Nullable DatasetMetadata metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder s3InputDefinition(@Nullable DatasetS3Location s3InputDefinition) {
            $.s3InputDefinition = s3InputDefinition;
            return this;
        }

        public DatasetInput build() {
            return $;
        }
    }

}
