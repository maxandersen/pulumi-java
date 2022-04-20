// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DocumentDbOutputDataSourceResponse {
    /**
     * The DocumentDB account name or ID. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String accountId;
    /**
     * The account key for the DocumentDB account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String accountKey;
    /**
     * The collection name pattern for the collections to be used. The collection name format can be constructed using the optional {partition} token, where partitions start from 0. See the DocumentDB section of https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for more information. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String collectionNamePattern;
    /**
     * The name of the DocumentDB database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String database;
    /**
     * The name of the field in output events used to specify the primary key which insert or update operations are based on.
     * 
     */
    private final @Nullable String documentId;
    /**
     * The name of the field in output events used to specify the key for partitioning output across collections. If &#39;collectionNamePattern&#39; contains the {partition} token, this property is required to be specified.
     * 
     */
    private final @Nullable String partitionKey;
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Storage/DocumentDB&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DocumentDbOutputDataSourceResponse(
        @CustomType.Parameter("accountId") @Nullable String accountId,
        @CustomType.Parameter("accountKey") @Nullable String accountKey,
        @CustomType.Parameter("collectionNamePattern") @Nullable String collectionNamePattern,
        @CustomType.Parameter("database") @Nullable String database,
        @CustomType.Parameter("documentId") @Nullable String documentId,
        @CustomType.Parameter("partitionKey") @Nullable String partitionKey,
        @CustomType.Parameter("type") String type) {
        this.accountId = accountId;
        this.accountKey = accountKey;
        this.collectionNamePattern = collectionNamePattern;
        this.database = database;
        this.documentId = documentId;
        this.partitionKey = partitionKey;
        this.type = type;
    }

    /**
     * The DocumentDB account name or ID. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * The account key for the DocumentDB account. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }
    /**
     * The collection name pattern for the collections to be used. The collection name format can be constructed using the optional {partition} token, where partitions start from 0. See the DocumentDB section of https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for more information. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> collectionNamePattern() {
        return Optional.ofNullable(this.collectionNamePattern);
    }
    /**
     * The name of the DocumentDB database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }
    /**
     * The name of the field in output events used to specify the primary key which insert or update operations are based on.
     * 
    */
    public Optional<String> documentId() {
        return Optional.ofNullable(this.documentId);
    }
    /**
     * The name of the field in output events used to specify the key for partitioning output across collections. If &#39;collectionNamePattern&#39; contains the {partition} token, this property is required to be specified.
     * 
    */
    public Optional<String> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Storage/DocumentDB&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentDbOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable String accountKey;
        private @Nullable String collectionNamePattern;
        private @Nullable String database;
        private @Nullable String documentId;
        private @Nullable String partitionKey;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentDbOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.accountKey = defaults.accountKey;
    	      this.collectionNamePattern = defaults.collectionNamePattern;
    	      this.database = defaults.database;
    	      this.documentId = defaults.documentId;
    	      this.partitionKey = defaults.partitionKey;
    	      this.type = defaults.type;
        }

        public Builder accountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }
        public Builder collectionNamePattern(@Nullable String collectionNamePattern) {
            this.collectionNamePattern = collectionNamePattern;
            return this;
        }
        public Builder database(@Nullable String database) {
            this.database = database;
            return this;
        }
        public Builder documentId(@Nullable String documentId) {
            this.documentId = documentId;
            return this;
        }
        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DocumentDbOutputDataSourceResponse build() {
            return new DocumentDbOutputDataSourceResponse(accountId, accountKey, collectionNamePattern, database, documentId, partitionKey, type);
        }
    }
}
