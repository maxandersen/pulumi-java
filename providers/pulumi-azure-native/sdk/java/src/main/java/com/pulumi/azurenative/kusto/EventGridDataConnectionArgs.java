// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.azurenative.kusto.enums.BlobStorageEventType;
import com.pulumi.azurenative.kusto.enums.EventGridDataFormat;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventGridDataConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventGridDataConnectionArgs Empty = new EventGridDataConnectionArgs();

    /**
     * The name of blob storage event type to process.
     * 
     */
    @Import(name="blobStorageEventType")
      private final @Nullable Output<Either<String,BlobStorageEventType>> blobStorageEventType;

    public Output<Either<String,BlobStorageEventType>> blobStorageEventType() {
        return this.blobStorageEventType == null ? Codegen.empty() : this.blobStorageEventType;
    }

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The event hub consumer group.
     * 
     */
    @Import(name="consumerGroup", required=true)
      private final Output<String> consumerGroup;

    public Output<String> consumerGroup() {
        return this.consumerGroup;
    }

    /**
     * The name of the data connection.
     * 
     */
    @Import(name="dataConnectionName")
      private final @Nullable Output<String> dataConnectionName;

    public Output<String> dataConnectionName() {
        return this.dataConnectionName == null ? Codegen.empty() : this.dataConnectionName;
    }

    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @Import(name="dataFormat")
      private final @Nullable Output<Either<String,EventGridDataFormat>> dataFormat;

    public Output<Either<String,EventGridDataFormat>> dataFormat() {
        return this.dataFormat == null ? Codegen.empty() : this.dataFormat;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The resource ID where the event grid is configured to send events.
     * 
     */
    @Import(name="eventHubResourceId", required=true)
      private final Output<String> eventHubResourceId;

    public Output<String> eventHubResourceId() {
        return this.eventHubResourceId;
    }

    /**
     * A Boolean value that, if set to true, indicates that ingestion should ignore the first record of every file
     * 
     */
    @Import(name="ignoreFirstRecord")
      private final @Nullable Output<Boolean> ignoreFirstRecord;

    public Output<Boolean> ignoreFirstRecord() {
        return this.ignoreFirstRecord == null ? Codegen.empty() : this.ignoreFirstRecord;
    }

    /**
     * Kind of the endpoint for the data connection
     * Expected value is &#39;EventGrid&#39;.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @Import(name="mappingRuleName")
      private final @Nullable Output<String> mappingRuleName;

    public Output<String> mappingRuleName() {
        return this.mappingRuleName == null ? Codegen.empty() : this.mappingRuleName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource ID of the storage account where the data resides.
     * 
     */
    @Import(name="storageAccountResourceId", required=true)
      private final Output<String> storageAccountResourceId;

    public Output<String> storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @Import(name="tableName")
      private final @Nullable Output<String> tableName;

    public Output<String> tableName() {
        return this.tableName == null ? Codegen.empty() : this.tableName;
    }

    public EventGridDataConnectionArgs(
        @Nullable Output<Either<String,BlobStorageEventType>> blobStorageEventType,
        Output<String> clusterName,
        Output<String> consumerGroup,
        @Nullable Output<String> dataConnectionName,
        @Nullable Output<Either<String,EventGridDataFormat>> dataFormat,
        Output<String> databaseName,
        Output<String> eventHubResourceId,
        @Nullable Output<Boolean> ignoreFirstRecord,
        Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<String> mappingRuleName,
        Output<String> resourceGroupName,
        Output<String> storageAccountResourceId,
        @Nullable Output<String> tableName) {
        this.blobStorageEventType = blobStorageEventType;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.consumerGroup = Objects.requireNonNull(consumerGroup, "expected parameter 'consumerGroup' to be non-null");
        this.dataConnectionName = dataConnectionName;
        this.dataFormat = dataFormat;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId, "expected parameter 'eventHubResourceId' to be non-null");
        this.ignoreFirstRecord = ignoreFirstRecord;
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.location = location;
        this.mappingRuleName = mappingRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountResourceId = Objects.requireNonNull(storageAccountResourceId, "expected parameter 'storageAccountResourceId' to be non-null");
        this.tableName = tableName;
    }

    private EventGridDataConnectionArgs() {
        this.blobStorageEventType = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.consumerGroup = Codegen.empty();
        this.dataConnectionName = Codegen.empty();
        this.dataFormat = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.eventHubResourceId = Codegen.empty();
        this.ignoreFirstRecord = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.mappingRuleName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.storageAccountResourceId = Codegen.empty();
        this.tableName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventGridDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BlobStorageEventType>> blobStorageEventType;
        private Output<String> clusterName;
        private Output<String> consumerGroup;
        private @Nullable Output<String> dataConnectionName;
        private @Nullable Output<Either<String,EventGridDataFormat>> dataFormat;
        private Output<String> databaseName;
        private Output<String> eventHubResourceId;
        private @Nullable Output<Boolean> ignoreFirstRecord;
        private Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<String> mappingRuleName;
        private Output<String> resourceGroupName;
        private Output<String> storageAccountResourceId;
        private @Nullable Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventGridDataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobStorageEventType = defaults.blobStorageEventType;
    	      this.clusterName = defaults.clusterName;
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.dataFormat = defaults.dataFormat;
    	      this.databaseName = defaults.databaseName;
    	      this.eventHubResourceId = defaults.eventHubResourceId;
    	      this.ignoreFirstRecord = defaults.ignoreFirstRecord;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountResourceId = defaults.storageAccountResourceId;
    	      this.tableName = defaults.tableName;
        }

        public Builder blobStorageEventType(@Nullable Output<Either<String,BlobStorageEventType>> blobStorageEventType) {
            this.blobStorageEventType = blobStorageEventType;
            return this;
        }
        public Builder blobStorageEventType(@Nullable Either<String,BlobStorageEventType> blobStorageEventType) {
            this.blobStorageEventType = Codegen.ofNullable(blobStorageEventType);
            return this;
        }
        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder consumerGroup(Output<String> consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }
        public Builder consumerGroup(String consumerGroup) {
            this.consumerGroup = Output.of(Objects.requireNonNull(consumerGroup));
            return this;
        }
        public Builder dataConnectionName(@Nullable Output<String> dataConnectionName) {
            this.dataConnectionName = dataConnectionName;
            return this;
        }
        public Builder dataConnectionName(@Nullable String dataConnectionName) {
            this.dataConnectionName = Codegen.ofNullable(dataConnectionName);
            return this;
        }
        public Builder dataFormat(@Nullable Output<Either<String,EventGridDataFormat>> dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Builder dataFormat(@Nullable Either<String,EventGridDataFormat> dataFormat) {
            this.dataFormat = Codegen.ofNullable(dataFormat);
            return this;
        }
        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder eventHubResourceId(Output<String> eventHubResourceId) {
            this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId);
            return this;
        }
        public Builder eventHubResourceId(String eventHubResourceId) {
            this.eventHubResourceId = Output.of(Objects.requireNonNull(eventHubResourceId));
            return this;
        }
        public Builder ignoreFirstRecord(@Nullable Output<Boolean> ignoreFirstRecord) {
            this.ignoreFirstRecord = ignoreFirstRecord;
            return this;
        }
        public Builder ignoreFirstRecord(@Nullable Boolean ignoreFirstRecord) {
            this.ignoreFirstRecord = Codegen.ofNullable(ignoreFirstRecord);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder mappingRuleName(@Nullable Output<String> mappingRuleName) {
            this.mappingRuleName = mappingRuleName;
            return this;
        }
        public Builder mappingRuleName(@Nullable String mappingRuleName) {
            this.mappingRuleName = Codegen.ofNullable(mappingRuleName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder storageAccountResourceId(Output<String> storageAccountResourceId) {
            this.storageAccountResourceId = Objects.requireNonNull(storageAccountResourceId);
            return this;
        }
        public Builder storageAccountResourceId(String storageAccountResourceId) {
            this.storageAccountResourceId = Output.of(Objects.requireNonNull(storageAccountResourceId));
            return this;
        }
        public Builder tableName(@Nullable Output<String> tableName) {
            this.tableName = tableName;
            return this;
        }
        public Builder tableName(@Nullable String tableName) {
            this.tableName = Codegen.ofNullable(tableName);
            return this;
        }        public EventGridDataConnectionArgs build() {
            return new EventGridDataConnectionArgs(blobStorageEventType, clusterName, consumerGroup, dataConnectionName, dataFormat, databaseName, eventHubResourceId, ignoreFirstRecord, kind, location, mappingRuleName, resourceGroupName, storageAccountResourceId, tableName);
        }
    }
}
