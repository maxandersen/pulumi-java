// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.dynamodb.inputs;

import com.pulumi.awsnative.dynamodb.inputs.GlobalTableKeySchema;
import com.pulumi.awsnative.dynamodb.inputs.GlobalTableProjection;
import com.pulumi.awsnative.dynamodb.inputs.GlobalTableWriteProvisionedThroughputSettings;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalTableGlobalSecondaryIndex extends com.pulumi.resources.InvokeArgs {

    public static final GlobalTableGlobalSecondaryIndex Empty = new GlobalTableGlobalSecondaryIndex();

    @Import(name="indexName", required=true)
    private String indexName;

    public String indexName() {
        return this.indexName;
    }

    @Import(name="keySchema", required=true)
    private List<GlobalTableKeySchema> keySchema;

    public List<GlobalTableKeySchema> keySchema() {
        return this.keySchema;
    }

    @Import(name="projection", required=true)
    private GlobalTableProjection projection;

    public GlobalTableProjection projection() {
        return this.projection;
    }

    @Import(name="writeProvisionedThroughputSettings")
    private @Nullable GlobalTableWriteProvisionedThroughputSettings writeProvisionedThroughputSettings;

    public Optional<GlobalTableWriteProvisionedThroughputSettings> writeProvisionedThroughputSettings() {
        return Optional.ofNullable(this.writeProvisionedThroughputSettings);
    }

    private GlobalTableGlobalSecondaryIndex() {}

    private GlobalTableGlobalSecondaryIndex(GlobalTableGlobalSecondaryIndex $) {
        this.indexName = $.indexName;
        this.keySchema = $.keySchema;
        this.projection = $.projection;
        this.writeProvisionedThroughputSettings = $.writeProvisionedThroughputSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalTableGlobalSecondaryIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalTableGlobalSecondaryIndex $;

        public Builder() {
            $ = new GlobalTableGlobalSecondaryIndex();
        }

        public Builder(GlobalTableGlobalSecondaryIndex defaults) {
            $ = new GlobalTableGlobalSecondaryIndex(Objects.requireNonNull(defaults));
        }

        public Builder indexName(String indexName) {
            $.indexName = indexName;
            return this;
        }

        public Builder keySchema(List<GlobalTableKeySchema> keySchema) {
            $.keySchema = keySchema;
            return this;
        }

        public Builder keySchema(GlobalTableKeySchema... keySchema) {
            return keySchema(List.of(keySchema));
        }

        public Builder projection(GlobalTableProjection projection) {
            $.projection = projection;
            return this;
        }

        public Builder writeProvisionedThroughputSettings(@Nullable GlobalTableWriteProvisionedThroughputSettings writeProvisionedThroughputSettings) {
            $.writeProvisionedThroughputSettings = writeProvisionedThroughputSettings;
            return this;
        }

        public GlobalTableGlobalSecondaryIndex build() {
            $.indexName = Objects.requireNonNull($.indexName, "expected parameter 'indexName' to be non-null");
            $.keySchema = Objects.requireNonNull($.keySchema, "expected parameter 'keySchema' to be non-null");
            $.projection = Objects.requireNonNull($.projection, "expected parameter 'projection' to be non-null");
            return $;
        }
    }

}
