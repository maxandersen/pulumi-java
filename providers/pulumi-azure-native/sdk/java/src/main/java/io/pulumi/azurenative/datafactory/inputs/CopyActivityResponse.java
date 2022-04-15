// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.AmazonMWSSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AmazonRdsForOracleSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AmazonRdsForSqlServerSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AmazonRedshiftSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AvroSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AvroSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDatabricksDeltaLakeSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDatabricksDeltaLakeSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMariaDBSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMySqlSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMySqlSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AzurePostgreSqlSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AzurePostgreSqlSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureQueueSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureSearchIndexSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureSqlSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureSqlSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureTableSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureTableSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.BinarySinkResponse;
import io.pulumi.azurenative.datafactory.inputs.BinarySourceResponse;
import io.pulumi.azurenative.datafactory.inputs.BlobSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.BlobSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.CassandraSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.CommonDataServiceForAppsSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.CommonDataServiceForAppsSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.ConcurSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.CosmosDbMongoDbApiSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.CosmosDbMongoDbApiSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.CosmosDbSqlApiSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.CosmosDbSqlApiSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.CouchbaseSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.Db2SourceResponse;
import io.pulumi.azurenative.datafactory.inputs.DelimitedTextSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.DelimitedTextSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.DocumentDbCollectionSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.DocumentDbCollectionSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.DrillSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.DynamicsAXSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.DynamicsCrmSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.DynamicsCrmSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.DynamicsSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.DynamicsSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.EloquaSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.ExcelSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.FileSystemSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.FileSystemSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.GoogleAdWordsSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.GoogleBigQuerySourceResponse;
import io.pulumi.azurenative.datafactory.inputs.GreenplumSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.HBaseSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.HdfsSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.HiveSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.HttpSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.HubspotSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.ImpalaSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.InformixSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.InformixSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.JiraSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.JsonSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.JsonSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.LogSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.LogStorageSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.MagentoSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.MariaDBSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.MarketoSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.MicrosoftAccessSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.MicrosoftAccessSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.MongoDbAtlasSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.MongoDbAtlasSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.MongoDbSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.MongoDbV2SinkResponse;
import io.pulumi.azurenative.datafactory.inputs.MongoDbV2SourceResponse;
import io.pulumi.azurenative.datafactory.inputs.MySqlSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.NetezzaSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.ODataSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.OdbcSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.OdbcSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.Office365SourceResponse;
import io.pulumi.azurenative.datafactory.inputs.OracleServiceCloudSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.OracleSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.OracleSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.OrcSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.OrcSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParquetSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.ParquetSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.PaypalSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.PhoenixSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.PostgreSqlSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.PrestoSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.QuickBooksSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.RedirectIncompatibleRowSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.RelationalSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.ResponsysSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.RestSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.RestSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SalesforceMarketingCloudSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SalesforceServiceCloudSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.SalesforceServiceCloudSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SalesforceSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.SalesforceSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SapBwSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SapCloudForCustomerSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.SapCloudForCustomerSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SapEccSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SapHanaSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SapOpenHubSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SapTableSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.ServiceNowSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SharePointOnlineListSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.ShopifySourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SkipErrorFileResponse;
import io.pulumi.azurenative.datafactory.inputs.SnowflakeSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.SnowflakeSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SparkSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlDWSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlDWSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlMISinkResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlMISourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlServerSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlServerSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlSinkResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.SquareSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.StagingSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.SybaseSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.TabularSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.TeradataSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.inputs.VerticaSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.WebSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.XeroSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.XmlSourceResponse;
import io.pulumi.azurenative.datafactory.inputs.ZohoSourceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Copy activity.
 * 
 */
public final class CopyActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final CopyActivityResponse Empty = new CopyActivityResponse();

    /**
     * Maximum number of data integration units that can be used to perform this data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="dataIntegrationUnits")
      private final @Nullable Object dataIntegrationUnits;

    public Optional<Object> dataIntegrationUnits() {
        return this.dataIntegrationUnits == null ? Optional.empty() : Optional.ofNullable(this.dataIntegrationUnits);
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Whether to skip incompatible row. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableSkipIncompatibleRow")
      private final @Nullable Object enableSkipIncompatibleRow;

    public Optional<Object> enableSkipIncompatibleRow() {
        return this.enableSkipIncompatibleRow == null ? Optional.empty() : Optional.ofNullable(this.enableSkipIncompatibleRow);
    }

    /**
     * Specifies whether to copy data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableStaging")
      private final @Nullable Object enableStaging;

    public Optional<Object> enableStaging() {
        return this.enableStaging == null ? Optional.empty() : Optional.ofNullable(this.enableStaging);
    }

    /**
     * List of inputs for the activity.
     * 
     */
    @Import(name="inputs")
      private final @Nullable List<DatasetReferenceResponse> inputs;

    public List<DatasetReferenceResponse> inputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
      private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Log settings customer needs provide when enabling log.
     * 
     */
    @Import(name="logSettings")
      private final @Nullable LogSettingsResponse logSettings;

    public Optional<LogSettingsResponse> logSettings() {
        return this.logSettings == null ? Optional.empty() : Optional.ofNullable(this.logSettings);
    }

    /**
     * (Deprecated. Please use LogSettings) Log storage settings customer need to provide when enabling session log.
     * 
     */
    @Import(name="logStorageSettings")
      private final @Nullable LogStorageSettingsResponse logStorageSettings;

    public Optional<LogStorageSettingsResponse> logStorageSettings() {
        return this.logStorageSettings == null ? Optional.empty() : Optional.ofNullable(this.logStorageSettings);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * List of outputs for the activity.
     * 
     */
    @Import(name="outputs")
      private final @Nullable List<DatasetReferenceResponse> outputs;

    public List<DatasetReferenceResponse> outputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }

    /**
     * Maximum number of concurrent sessions opened on the source or sink to avoid overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="parallelCopies")
      private final @Nullable Object parallelCopies;

    public Optional<Object> parallelCopies() {
        return this.parallelCopies == null ? Optional.empty() : Optional.ofNullable(this.parallelCopies);
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> policy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    /**
     * Preserve rules.
     * 
     */
    @Import(name="preserve")
      private final @Nullable List<Object> preserve;

    public List<Object> preserve() {
        return this.preserve == null ? List.of() : this.preserve;
    }

    /**
     * Preserve Rules.
     * 
     */
    @Import(name="preserveRules")
      private final @Nullable List<Object> preserveRules;

    public List<Object> preserveRules() {
        return this.preserveRules == null ? List.of() : this.preserveRules;
    }

    /**
     * Redirect incompatible row settings when EnableSkipIncompatibleRow is true.
     * 
     */
    @Import(name="redirectIncompatibleRowSettings")
      private final @Nullable RedirectIncompatibleRowSettingsResponse redirectIncompatibleRowSettings;

    public Optional<RedirectIncompatibleRowSettingsResponse> redirectIncompatibleRowSettings() {
        return this.redirectIncompatibleRowSettings == null ? Optional.empty() : Optional.ofNullable(this.redirectIncompatibleRowSettings);
    }

    /**
     * Copy activity sink.
     * 
     */
    @Import(name="sink", required=true)
      private final Object sink;

    public Object sink() {
        return this.sink;
    }

    /**
     * Specify the fault tolerance for data consistency.
     * 
     */
    @Import(name="skipErrorFile")
      private final @Nullable SkipErrorFileResponse skipErrorFile;

    public Optional<SkipErrorFileResponse> skipErrorFile() {
        return this.skipErrorFile == null ? Optional.empty() : Optional.ofNullable(this.skipErrorFile);
    }

    /**
     * Copy activity source.
     * 
     */
    @Import(name="source", required=true)
      private final Object source;

    public Object source() {
        return this.source;
    }

    /**
     * Specifies interim staging settings when EnableStaging is true.
     * 
     */
    @Import(name="stagingSettings")
      private final @Nullable StagingSettingsResponse stagingSettings;

    public Optional<StagingSettingsResponse> stagingSettings() {
        return this.stagingSettings == null ? Optional.empty() : Optional.ofNullable(this.stagingSettings);
    }

    /**
     * Copy activity translator. If not specified, tabular translator is used.
     * 
     */
    @Import(name="translator")
      private final @Nullable Object translator;

    public Optional<Object> translator() {
        return this.translator == null ? Optional.empty() : Optional.ofNullable(this.translator);
    }

    /**
     * Type of activity.
     * Expected value is 'Copy'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    /**
     * Whether to enable Data Consistency validation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="validateDataConsistency")
      private final @Nullable Object validateDataConsistency;

    public Optional<Object> validateDataConsistency() {
        return this.validateDataConsistency == null ? Optional.empty() : Optional.ofNullable(this.validateDataConsistency);
    }

    public CopyActivityResponse(
        @Nullable Object dataIntegrationUnits,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object enableSkipIncompatibleRow,
        @Nullable Object enableStaging,
        @Nullable List<DatasetReferenceResponse> inputs,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @Nullable LogSettingsResponse logSettings,
        @Nullable LogStorageSettingsResponse logStorageSettings,
        String name,
        @Nullable List<DatasetReferenceResponse> outputs,
        @Nullable Object parallelCopies,
        @Nullable ActivityPolicyResponse policy,
        @Nullable List<Object> preserve,
        @Nullable List<Object> preserveRules,
        @Nullable RedirectIncompatibleRowSettingsResponse redirectIncompatibleRowSettings,
        Object sink,
        @Nullable SkipErrorFileResponse skipErrorFile,
        Object source,
        @Nullable StagingSettingsResponse stagingSettings,
        @Nullable Object translator,
        String type,
        @Nullable List<UserPropertyResponse> userProperties,
        @Nullable Object validateDataConsistency) {
        this.dataIntegrationUnits = dataIntegrationUnits;
        this.dependsOn = dependsOn;
        this.description = description;
        this.enableSkipIncompatibleRow = enableSkipIncompatibleRow;
        this.enableStaging = enableStaging;
        this.inputs = inputs;
        this.linkedServiceName = linkedServiceName;
        this.logSettings = logSettings;
        this.logStorageSettings = logStorageSettings;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputs = outputs;
        this.parallelCopies = parallelCopies;
        this.policy = policy;
        this.preserve = preserve;
        this.preserveRules = preserveRules;
        this.redirectIncompatibleRowSettings = redirectIncompatibleRowSettings;
        this.sink = Objects.requireNonNull(sink, "expected parameter 'sink' to be non-null");
        this.skipErrorFile = skipErrorFile;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.stagingSettings = stagingSettings;
        this.translator = translator;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.validateDataConsistency = validateDataConsistency;
    }

    private CopyActivityResponse() {
        this.dataIntegrationUnits = null;
        this.dependsOn = List.of();
        this.description = null;
        this.enableSkipIncompatibleRow = null;
        this.enableStaging = null;
        this.inputs = List.of();
        this.linkedServiceName = null;
        this.logSettings = null;
        this.logStorageSettings = null;
        this.name = null;
        this.outputs = List.of();
        this.parallelCopies = null;
        this.policy = null;
        this.preserve = List.of();
        this.preserveRules = List.of();
        this.redirectIncompatibleRowSettings = null;
        this.sink = null;
        this.skipErrorFile = null;
        this.source = null;
        this.stagingSettings = null;
        this.translator = null;
        this.type = null;
        this.userProperties = List.of();
        this.validateDataConsistency = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object dataIntegrationUnits;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object enableSkipIncompatibleRow;
        private @Nullable Object enableStaging;
        private @Nullable List<DatasetReferenceResponse> inputs;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable LogSettingsResponse logSettings;
        private @Nullable LogStorageSettingsResponse logStorageSettings;
        private String name;
        private @Nullable List<DatasetReferenceResponse> outputs;
        private @Nullable Object parallelCopies;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable List<Object> preserve;
        private @Nullable List<Object> preserveRules;
        private @Nullable RedirectIncompatibleRowSettingsResponse redirectIncompatibleRowSettings;
        private Object sink;
        private @Nullable SkipErrorFileResponse skipErrorFile;
        private Object source;
        private @Nullable StagingSettingsResponse stagingSettings;
        private @Nullable Object translator;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable Object validateDataConsistency;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataIntegrationUnits = defaults.dataIntegrationUnits;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.enableSkipIncompatibleRow = defaults.enableSkipIncompatibleRow;
    	      this.enableStaging = defaults.enableStaging;
    	      this.inputs = defaults.inputs;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.logSettings = defaults.logSettings;
    	      this.logStorageSettings = defaults.logStorageSettings;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.parallelCopies = defaults.parallelCopies;
    	      this.policy = defaults.policy;
    	      this.preserve = defaults.preserve;
    	      this.preserveRules = defaults.preserveRules;
    	      this.redirectIncompatibleRowSettings = defaults.redirectIncompatibleRowSettings;
    	      this.sink = defaults.sink;
    	      this.skipErrorFile = defaults.skipErrorFile;
    	      this.source = defaults.source;
    	      this.stagingSettings = defaults.stagingSettings;
    	      this.translator = defaults.translator;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.validateDataConsistency = defaults.validateDataConsistency;
        }

        public Builder dataIntegrationUnits(@Nullable Object dataIntegrationUnits) {
            this.dataIntegrationUnits = dataIntegrationUnits;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enableSkipIncompatibleRow(@Nullable Object enableSkipIncompatibleRow) {
            this.enableSkipIncompatibleRow = enableSkipIncompatibleRow;
            return this;
        }
        public Builder enableStaging(@Nullable Object enableStaging) {
            this.enableStaging = enableStaging;
            return this;
        }
        public Builder inputs(@Nullable List<DatasetReferenceResponse> inputs) {
            this.inputs = inputs;
            return this;
        }
        public Builder inputs(DatasetReferenceResponse... inputs) {
            return inputs(List.of(inputs));
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder logSettings(@Nullable LogSettingsResponse logSettings) {
            this.logSettings = logSettings;
            return this;
        }
        public Builder logStorageSettings(@Nullable LogStorageSettingsResponse logStorageSettings) {
            this.logStorageSettings = logStorageSettings;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outputs(@Nullable List<DatasetReferenceResponse> outputs) {
            this.outputs = outputs;
            return this;
        }
        public Builder outputs(DatasetReferenceResponse... outputs) {
            return outputs(List.of(outputs));
        }
        public Builder parallelCopies(@Nullable Object parallelCopies) {
            this.parallelCopies = parallelCopies;
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder preserve(@Nullable List<Object> preserve) {
            this.preserve = preserve;
            return this;
        }
        public Builder preserve(Object... preserve) {
            return preserve(List.of(preserve));
        }
        public Builder preserveRules(@Nullable List<Object> preserveRules) {
            this.preserveRules = preserveRules;
            return this;
        }
        public Builder preserveRules(Object... preserveRules) {
            return preserveRules(List.of(preserveRules));
        }
        public Builder redirectIncompatibleRowSettings(@Nullable RedirectIncompatibleRowSettingsResponse redirectIncompatibleRowSettings) {
            this.redirectIncompatibleRowSettings = redirectIncompatibleRowSettings;
            return this;
        }
        public Builder sink(Object sink) {
            this.sink = Objects.requireNonNull(sink);
            return this;
        }
        public Builder skipErrorFile(@Nullable SkipErrorFileResponse skipErrorFile) {
            this.skipErrorFile = skipErrorFile;
            return this;
        }
        public Builder source(Object source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder stagingSettings(@Nullable StagingSettingsResponse stagingSettings) {
            this.stagingSettings = stagingSettings;
            return this;
        }
        public Builder translator(@Nullable Object translator) {
            this.translator = translator;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }
        public Builder validateDataConsistency(@Nullable Object validateDataConsistency) {
            this.validateDataConsistency = validateDataConsistency;
            return this;
        }        public CopyActivityResponse build() {
            return new CopyActivityResponse(dataIntegrationUnits, dependsOn, description, enableSkipIncompatibleRow, enableStaging, inputs, linkedServiceName, logSettings, logStorageSettings, name, outputs, parallelCopies, policy, preserve, preserveRules, redirectIncompatibleRowSettings, sink, skipErrorFile, source, stagingSettings, translator, type, userProperties, validateDataConsistency);
        }
    }
}
