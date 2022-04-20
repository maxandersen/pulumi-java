// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.inputs.ClusteringResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.ConnectionPropertyResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.DatasetReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.EncryptionConfigurationResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.QueryParameterResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.RangePartitioningResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.TableReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.TimePartitioningResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.UserDefinedFunctionResourceResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class JobConfigurationQueryResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobConfigurationQueryResponse Empty = new JobConfigurationQueryResponse();

    /**
     * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance. Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed. However, you must still set destinationTable when result size exceeds the allowed maximum response size.
     * 
     */
    @Import(name="allowLargeResults", required=true)
      private final Boolean allowLargeResults;

    public Boolean allowLargeResults() {
        return this.allowLargeResults;
    }

    /**
     * [Beta] Clustering specification for the destination table. Must be specified with time-based partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    @Import(name="clustering", required=true)
      private final ClusteringResponse clustering;

    public ClusteringResponse clustering() {
        return this.clustering;
    }

    /**
     * Connection properties.
     * 
     */
    @Import(name="connectionProperties", required=true)
      private final List<ConnectionPropertyResponse> connectionProperties;

    public List<ConnectionPropertyResponse> connectionProperties() {
        return this.connectionProperties;
    }

    /**
     * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a &#39;notFound&#39; error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @Import(name="createDisposition", required=true)
      private final String createDisposition;

    public String createDisposition() {
        return this.createDisposition;
    }

    /**
     * If true, creates a new session, where session id will be a server generated random id. If false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs query in non-session mode.
     * 
     */
    @Import(name="createSession", required=true)
      private final Boolean createSession;

    public Boolean createSession() {
        return this.createSession;
    }

    /**
     * [Optional] Specifies the default dataset to use for unqualified table names in the query. Note that this does not alter behavior of unqualified dataset names.
     * 
     */
    @Import(name="defaultDataset", required=true)
      private final DatasetReferenceResponse defaultDataset;

    public DatasetReferenceResponse defaultDataset() {
        return this.defaultDataset;
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    @Import(name="destinationEncryptionConfiguration", required=true)
      private final EncryptionConfigurationResponse destinationEncryptionConfiguration;

    public EncryptionConfigurationResponse destinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration;
    }

    /**
     * [Optional] Describes the table where the query results should be stored. If not present, a new table will be created to store the results. This property must be set for large results that exceed the maximum response size.
     * 
     */
    @Import(name="destinationTable", required=true)
      private final TableReferenceResponse destinationTable;

    public TableReferenceResponse destinationTable() {
        return this.destinationTable;
    }

    /**
     * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results. allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
     * 
     */
    @Import(name="flattenResults", required=true)
      private final Boolean flattenResults;

    public Boolean flattenResults() {
        return this.flattenResults;
    }

    /**
     * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge). If unspecified, this will be set to your project default.
     * 
     */
    @Import(name="maximumBillingTier", required=true)
      private final Integer maximumBillingTier;

    public Integer maximumBillingTier() {
        return this.maximumBillingTier;
    }

    /**
     * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If unspecified, this will be set to your project default.
     * 
     */
    @Import(name="maximumBytesBilled", required=true)
      private final String maximumBytesBilled;

    public String maximumBytesBilled() {
        return this.maximumBytesBilled;
    }

    /**
     * Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
     * 
     */
    @Import(name="parameterMode", required=true)
      private final String parameterMode;

    public String parameterMode() {
        return this.parameterMode;
    }

    /**
     * [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH. The default value is INTERACTIVE.
     * 
     */
    @Import(name="priority", required=true)
      private final String priority;

    public String priority() {
        return this.priority;
    }

    /**
     * [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether the query uses legacy SQL or standard SQL.
     * 
     */
    @Import(name="query", required=true)
      private final String query;

    public String query() {
        return this.query;
    }

    /**
     * Query parameters for standard SQL queries.
     * 
     */
    @Import(name="queryParameters", required=true)
      private final List<QueryParameterResponse> queryParameters;

    public List<QueryParameterResponse> queryParameters() {
        return this.queryParameters;
    }

    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @Import(name="rangePartitioning", required=true)
      private final RangePartitioningResponse rangePartitioning;

    public RangePartitioningResponse rangePartitioning() {
        return this.rangePartitioning;
    }

    /**
     * Allows the schema of the destination table to be updated as a side effect of the query job. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
     */
    @Import(name="schemaUpdateOptions", required=true)
      private final List<String> schemaUpdateOptions;

    public List<String> schemaUpdateOptions() {
        return this.schemaUpdateOptions;
    }

    /**
     * [Optional] If querying an external data source outside of BigQuery, describes the data format, location and other properties of the data source. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
     * 
     */
    @Import(name="tableDefinitions", required=true)
      private final Map<String,String> tableDefinitions;

    public Map<String,String> tableDefinitions() {
        return this.tableDefinitions;
    }

    /**
     * Time-based partitioning specification for the destination table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @Import(name="timePartitioning", required=true)
      private final TimePartitioningResponse timePartitioning;

    public TimePartitioningResponse timePartitioning() {
        return this.timePartitioning;
    }

    /**
     * Specifies whether to use BigQuery&#39;s legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery&#39;s standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be run as if flattenResults is false.
     * 
     */
    @Import(name="useLegacySql", required=true)
      private final Boolean useLegacySql;

    public Boolean useLegacySql() {
        return this.useLegacySql;
    }

    /**
     * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified. The default value is true.
     * 
     */
    @Import(name="useQueryCache", required=true)
      private final Boolean useQueryCache;

    public Boolean useQueryCache() {
        return this.useQueryCache;
    }

    /**
     * Describes user-defined function resources used in the query.
     * 
     */
    @Import(name="userDefinedFunctionResources", required=true)
      private final List<UserDefinedFunctionResourceResponse> userDefinedFunctionResources;

    public List<UserDefinedFunctionResourceResponse> userDefinedFunctionResources() {
        return this.userDefinedFunctionResources;
    }

    /**
     * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a &#39;duplicate&#39; error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @Import(name="writeDisposition", required=true)
      private final String writeDisposition;

    public String writeDisposition() {
        return this.writeDisposition;
    }

    public JobConfigurationQueryResponse(
        Boolean allowLargeResults,
        ClusteringResponse clustering,
        List<ConnectionPropertyResponse> connectionProperties,
        String createDisposition,
        Boolean createSession,
        DatasetReferenceResponse defaultDataset,
        EncryptionConfigurationResponse destinationEncryptionConfiguration,
        TableReferenceResponse destinationTable,
        Boolean flattenResults,
        Integer maximumBillingTier,
        String maximumBytesBilled,
        String parameterMode,
        String priority,
        String query,
        List<QueryParameterResponse> queryParameters,
        RangePartitioningResponse rangePartitioning,
        List<String> schemaUpdateOptions,
        Map<String,String> tableDefinitions,
        TimePartitioningResponse timePartitioning,
        Boolean useLegacySql,
        Boolean useQueryCache,
        List<UserDefinedFunctionResourceResponse> userDefinedFunctionResources,
        String writeDisposition) {
        this.allowLargeResults = Objects.requireNonNull(allowLargeResults, "expected parameter 'allowLargeResults' to be non-null");
        this.clustering = Objects.requireNonNull(clustering, "expected parameter 'clustering' to be non-null");
        this.connectionProperties = Objects.requireNonNull(connectionProperties, "expected parameter 'connectionProperties' to be non-null");
        this.createDisposition = Objects.requireNonNull(createDisposition, "expected parameter 'createDisposition' to be non-null");
        this.createSession = Objects.requireNonNull(createSession, "expected parameter 'createSession' to be non-null");
        this.defaultDataset = Objects.requireNonNull(defaultDataset, "expected parameter 'defaultDataset' to be non-null");
        this.destinationEncryptionConfiguration = Objects.requireNonNull(destinationEncryptionConfiguration, "expected parameter 'destinationEncryptionConfiguration' to be non-null");
        this.destinationTable = Objects.requireNonNull(destinationTable, "expected parameter 'destinationTable' to be non-null");
        this.flattenResults = Objects.requireNonNull(flattenResults, "expected parameter 'flattenResults' to be non-null");
        this.maximumBillingTier = Objects.requireNonNull(maximumBillingTier, "expected parameter 'maximumBillingTier' to be non-null");
        this.maximumBytesBilled = Objects.requireNonNull(maximumBytesBilled, "expected parameter 'maximumBytesBilled' to be non-null");
        this.parameterMode = Objects.requireNonNull(parameterMode, "expected parameter 'parameterMode' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.queryParameters = Objects.requireNonNull(queryParameters, "expected parameter 'queryParameters' to be non-null");
        this.rangePartitioning = Objects.requireNonNull(rangePartitioning, "expected parameter 'rangePartitioning' to be non-null");
        this.schemaUpdateOptions = Objects.requireNonNull(schemaUpdateOptions, "expected parameter 'schemaUpdateOptions' to be non-null");
        this.tableDefinitions = Objects.requireNonNull(tableDefinitions, "expected parameter 'tableDefinitions' to be non-null");
        this.timePartitioning = Objects.requireNonNull(timePartitioning, "expected parameter 'timePartitioning' to be non-null");
        this.useLegacySql = Objects.requireNonNull(useLegacySql, "expected parameter 'useLegacySql' to be non-null");
        this.useQueryCache = Objects.requireNonNull(useQueryCache, "expected parameter 'useQueryCache' to be non-null");
        this.userDefinedFunctionResources = Objects.requireNonNull(userDefinedFunctionResources, "expected parameter 'userDefinedFunctionResources' to be non-null");
        this.writeDisposition = Objects.requireNonNull(writeDisposition, "expected parameter 'writeDisposition' to be non-null");
    }

    private JobConfigurationQueryResponse() {
        this.allowLargeResults = null;
        this.clustering = null;
        this.connectionProperties = List.of();
        this.createDisposition = null;
        this.createSession = null;
        this.defaultDataset = null;
        this.destinationEncryptionConfiguration = null;
        this.destinationTable = null;
        this.flattenResults = null;
        this.maximumBillingTier = null;
        this.maximumBytesBilled = null;
        this.parameterMode = null;
        this.priority = null;
        this.query = null;
        this.queryParameters = List.of();
        this.rangePartitioning = null;
        this.schemaUpdateOptions = List.of();
        this.tableDefinitions = Map.of();
        this.timePartitioning = null;
        this.useLegacySql = null;
        this.useQueryCache = null;
        this.userDefinedFunctionResources = List.of();
        this.writeDisposition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationQueryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowLargeResults;
        private ClusteringResponse clustering;
        private List<ConnectionPropertyResponse> connectionProperties;
        private String createDisposition;
        private Boolean createSession;
        private DatasetReferenceResponse defaultDataset;
        private EncryptionConfigurationResponse destinationEncryptionConfiguration;
        private TableReferenceResponse destinationTable;
        private Boolean flattenResults;
        private Integer maximumBillingTier;
        private String maximumBytesBilled;
        private String parameterMode;
        private String priority;
        private String query;
        private List<QueryParameterResponse> queryParameters;
        private RangePartitioningResponse rangePartitioning;
        private List<String> schemaUpdateOptions;
        private Map<String,String> tableDefinitions;
        private TimePartitioningResponse timePartitioning;
        private Boolean useLegacySql;
        private Boolean useQueryCache;
        private List<UserDefinedFunctionResourceResponse> userDefinedFunctionResources;
        private String writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationQueryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLargeResults = defaults.allowLargeResults;
    	      this.clustering = defaults.clustering;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.createDisposition = defaults.createDisposition;
    	      this.createSession = defaults.createSession;
    	      this.defaultDataset = defaults.defaultDataset;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.flattenResults = defaults.flattenResults;
    	      this.maximumBillingTier = defaults.maximumBillingTier;
    	      this.maximumBytesBilled = defaults.maximumBytesBilled;
    	      this.parameterMode = defaults.parameterMode;
    	      this.priority = defaults.priority;
    	      this.query = defaults.query;
    	      this.queryParameters = defaults.queryParameters;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.schemaUpdateOptions = defaults.schemaUpdateOptions;
    	      this.tableDefinitions = defaults.tableDefinitions;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.useLegacySql = defaults.useLegacySql;
    	      this.useQueryCache = defaults.useQueryCache;
    	      this.userDefinedFunctionResources = defaults.userDefinedFunctionResources;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder allowLargeResults(Boolean allowLargeResults) {
            this.allowLargeResults = Objects.requireNonNull(allowLargeResults);
            return this;
        }
        public Builder clustering(ClusteringResponse clustering) {
            this.clustering = Objects.requireNonNull(clustering);
            return this;
        }
        public Builder connectionProperties(List<ConnectionPropertyResponse> connectionProperties) {
            this.connectionProperties = Objects.requireNonNull(connectionProperties);
            return this;
        }
        public Builder connectionProperties(ConnectionPropertyResponse... connectionProperties) {
            return connectionProperties(List.of(connectionProperties));
        }
        public Builder createDisposition(String createDisposition) {
            this.createDisposition = Objects.requireNonNull(createDisposition);
            return this;
        }
        public Builder createSession(Boolean createSession) {
            this.createSession = Objects.requireNonNull(createSession);
            return this;
        }
        public Builder defaultDataset(DatasetReferenceResponse defaultDataset) {
            this.defaultDataset = Objects.requireNonNull(defaultDataset);
            return this;
        }
        public Builder destinationEncryptionConfiguration(EncryptionConfigurationResponse destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Objects.requireNonNull(destinationEncryptionConfiguration);
            return this;
        }
        public Builder destinationTable(TableReferenceResponse destinationTable) {
            this.destinationTable = Objects.requireNonNull(destinationTable);
            return this;
        }
        public Builder flattenResults(Boolean flattenResults) {
            this.flattenResults = Objects.requireNonNull(flattenResults);
            return this;
        }
        public Builder maximumBillingTier(Integer maximumBillingTier) {
            this.maximumBillingTier = Objects.requireNonNull(maximumBillingTier);
            return this;
        }
        public Builder maximumBytesBilled(String maximumBytesBilled) {
            this.maximumBytesBilled = Objects.requireNonNull(maximumBytesBilled);
            return this;
        }
        public Builder parameterMode(String parameterMode) {
            this.parameterMode = Objects.requireNonNull(parameterMode);
            return this;
        }
        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder queryParameters(List<QueryParameterResponse> queryParameters) {
            this.queryParameters = Objects.requireNonNull(queryParameters);
            return this;
        }
        public Builder queryParameters(QueryParameterResponse... queryParameters) {
            return queryParameters(List.of(queryParameters));
        }
        public Builder rangePartitioning(RangePartitioningResponse rangePartitioning) {
            this.rangePartitioning = Objects.requireNonNull(rangePartitioning);
            return this;
        }
        public Builder schemaUpdateOptions(List<String> schemaUpdateOptions) {
            this.schemaUpdateOptions = Objects.requireNonNull(schemaUpdateOptions);
            return this;
        }
        public Builder schemaUpdateOptions(String... schemaUpdateOptions) {
            return schemaUpdateOptions(List.of(schemaUpdateOptions));
        }
        public Builder tableDefinitions(Map<String,String> tableDefinitions) {
            this.tableDefinitions = Objects.requireNonNull(tableDefinitions);
            return this;
        }
        public Builder timePartitioning(TimePartitioningResponse timePartitioning) {
            this.timePartitioning = Objects.requireNonNull(timePartitioning);
            return this;
        }
        public Builder useLegacySql(Boolean useLegacySql) {
            this.useLegacySql = Objects.requireNonNull(useLegacySql);
            return this;
        }
        public Builder useQueryCache(Boolean useQueryCache) {
            this.useQueryCache = Objects.requireNonNull(useQueryCache);
            return this;
        }
        public Builder userDefinedFunctionResources(List<UserDefinedFunctionResourceResponse> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = Objects.requireNonNull(userDefinedFunctionResources);
            return this;
        }
        public Builder userDefinedFunctionResources(UserDefinedFunctionResourceResponse... userDefinedFunctionResources) {
            return userDefinedFunctionResources(List.of(userDefinedFunctionResources));
        }
        public Builder writeDisposition(String writeDisposition) {
            this.writeDisposition = Objects.requireNonNull(writeDisposition);
            return this;
        }        public JobConfigurationQueryResponse build() {
            return new JobConfigurationQueryResponse(allowLargeResults, clustering, connectionProperties, createDisposition, createSession, defaultDataset, destinationEncryptionConfiguration, destinationTable, flattenResults, maximumBillingTier, maximumBytesBilled, parameterMode, priority, query, queryParameters, rangePartitioning, schemaUpdateOptions, tableDefinitions, timePartitioning, useLegacySql, useQueryCache, userDefinedFunctionResources, writeDisposition);
        }
    }
}
