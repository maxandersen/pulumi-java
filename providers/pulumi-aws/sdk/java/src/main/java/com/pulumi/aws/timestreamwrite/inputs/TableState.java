// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.timestreamwrite.inputs;

import com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesGetArgs;
import com.pulumi.aws.timestreamwrite.inputs.TableRetentionPropertiesGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableState extends com.pulumi.resources.ResourceArgs {

    public static final TableState Empty = new TableState();

    /**
     * The ARN that uniquely identifies this table.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the Timestream database.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * Contains properties to set on the table when enabling magnetic store writes. See Magnetic Store Write Properties below for more details.
     * 
     */
    @Import(name="magneticStoreWriteProperties")
    private @Nullable Output<TableMagneticStoreWritePropertiesGetArgs> magneticStoreWriteProperties;

    public Optional<Output<TableMagneticStoreWritePropertiesGetArgs>> magneticStoreWriteProperties() {
        return Optional.ofNullable(this.magneticStoreWriteProperties);
    }

    /**
     * The retention duration for the memory store and magnetic store. See Retention Properties below for more details. If not provided, `magnetic_store_retention_period_in_days` default to 73000 and `memory_store_retention_period_in_hours` defaults to 6.
     * 
     */
    @Import(name="retentionProperties")
    private @Nullable Output<TableRetentionPropertiesGetArgs> retentionProperties;

    public Optional<Output<TableRetentionPropertiesGetArgs>> retentionProperties() {
        return Optional.ofNullable(this.retentionProperties);
    }

    /**
     * The name of the Timestream table.
     * 
     */
    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private TableState() {}

    private TableState(TableState $) {
        this.arn = $.arn;
        this.databaseName = $.databaseName;
        this.magneticStoreWriteProperties = $.magneticStoreWriteProperties;
        this.retentionProperties = $.retentionProperties;
        this.tableName = $.tableName;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableState $;

        public Builder() {
            $ = new TableState();
        }

        public Builder(TableState defaults) {
            $ = new TableState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder magneticStoreWriteProperties(@Nullable Output<TableMagneticStoreWritePropertiesGetArgs> magneticStoreWriteProperties) {
            $.magneticStoreWriteProperties = magneticStoreWriteProperties;
            return this;
        }

        public Builder magneticStoreWriteProperties(TableMagneticStoreWritePropertiesGetArgs magneticStoreWriteProperties) {
            return magneticStoreWriteProperties(Output.of(magneticStoreWriteProperties));
        }

        public Builder retentionProperties(@Nullable Output<TableRetentionPropertiesGetArgs> retentionProperties) {
            $.retentionProperties = retentionProperties;
            return this;
        }

        public Builder retentionProperties(TableRetentionPropertiesGetArgs retentionProperties) {
            return retentionProperties(Output.of(retentionProperties));
        }

        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public TableState build() {
            return $;
        }
    }

}
