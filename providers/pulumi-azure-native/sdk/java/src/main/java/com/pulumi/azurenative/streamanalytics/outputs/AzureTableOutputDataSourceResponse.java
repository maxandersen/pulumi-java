// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureTableOutputDataSourceResponse {
    /**
     * The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String accountKey;
    /**
     * The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String accountName;
    /**
     * The number of rows to write to the Azure Table at a time.
     * 
     */
    private final @Nullable Integer batchSize;
    /**
     * If specified, each item in the array is the name of a column to remove (if present) from output event entities.
     * 
     */
    private final @Nullable List<String> columnsToRemove;
    /**
     * This element indicates the name of a column from the SELECT statement in the query that will be used as the partition key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String partitionKey;
    /**
     * This element indicates the name of a column from the SELECT statement in the query that will be used as the row key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String rowKey;
    /**
     * The name of the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String table;
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Storage/Table'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureTableOutputDataSourceResponse(
        @CustomType.Parameter("accountKey") @Nullable String accountKey,
        @CustomType.Parameter("accountName") @Nullable String accountName,
        @CustomType.Parameter("batchSize") @Nullable Integer batchSize,
        @CustomType.Parameter("columnsToRemove") @Nullable List<String> columnsToRemove,
        @CustomType.Parameter("partitionKey") @Nullable String partitionKey,
        @CustomType.Parameter("rowKey") @Nullable String rowKey,
        @CustomType.Parameter("table") @Nullable String table,
        @CustomType.Parameter("type") String type) {
        this.accountKey = accountKey;
        this.accountName = accountName;
        this.batchSize = batchSize;
        this.columnsToRemove = columnsToRemove;
        this.partitionKey = partitionKey;
        this.rowKey = rowKey;
        this.table = table;
        this.type = type;
    }

    /**
     * The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }
    /**
     * The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }
    /**
     * The number of rows to write to the Azure Table at a time.
     * 
    */
    public Optional<Integer> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * If specified, each item in the array is the name of a column to remove (if present) from output event entities.
     * 
    */
    public List<String> columnsToRemove() {
        return this.columnsToRemove == null ? List.of() : this.columnsToRemove;
    }
    /**
     * This element indicates the name of a column from the SELECT statement in the query that will be used as the partition key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    /**
     * This element indicates the name of a column from the SELECT statement in the query that will be used as the row key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> rowKey() {
        return Optional.ofNullable(this.rowKey);
    }
    /**
     * The name of the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> table() {
        return Optional.ofNullable(this.table);
    }
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Storage/Table'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureTableOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountKey;
        private @Nullable String accountName;
        private @Nullable Integer batchSize;
        private @Nullable List<String> columnsToRemove;
        private @Nullable String partitionKey;
        private @Nullable String rowKey;
        private @Nullable String table;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureTableOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.batchSize = defaults.batchSize;
    	      this.columnsToRemove = defaults.columnsToRemove;
    	      this.partitionKey = defaults.partitionKey;
    	      this.rowKey = defaults.rowKey;
    	      this.table = defaults.table;
    	      this.type = defaults.type;
        }

        public Builder accountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder batchSize(@Nullable Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Builder columnsToRemove(@Nullable List<String> columnsToRemove) {
            this.columnsToRemove = columnsToRemove;
            return this;
        }
        public Builder columnsToRemove(String... columnsToRemove) {
            return columnsToRemove(List.of(columnsToRemove));
        }
        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder rowKey(@Nullable String rowKey) {
            this.rowKey = rowKey;
            return this;
        }
        public Builder table(@Nullable String table) {
            this.table = table;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureTableOutputDataSourceResponse build() {
            return new AzureTableOutputDataSourceResponse(accountKey, accountName, batchSize, columnsToRemove, partitionKey, rowKey, table, type);
        }
    }
}
