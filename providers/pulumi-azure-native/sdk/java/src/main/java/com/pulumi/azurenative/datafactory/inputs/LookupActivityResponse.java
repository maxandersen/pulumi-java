// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import com.pulumi.azurenative.datafactory.inputs.AmazonMWSSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AmazonRdsForOracleSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AmazonRdsForSqlServerSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AmazonRedshiftSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AvroSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureDataExplorerSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureDatabricksDeltaLakeSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureMariaDBSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureMySqlSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AzurePostgreSqlSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureSqlSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureTableSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.BinarySourceResponse;
import com.pulumi.azurenative.datafactory.inputs.BlobSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.CassandraSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.CommonDataServiceForAppsSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.ConcurSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.CosmosDbMongoDbApiSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.CosmosDbSqlApiSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.CouchbaseSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.Db2SourceResponse;
import com.pulumi.azurenative.datafactory.inputs.DelimitedTextSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.DocumentDbCollectionSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.DrillSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.DynamicsAXSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.DynamicsCrmSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.DynamicsSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.EloquaSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.ExcelSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.FileSystemSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.GoogleAdWordsSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.GoogleBigQuerySourceResponse;
import com.pulumi.azurenative.datafactory.inputs.GreenplumSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.HBaseSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.HdfsSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.HiveSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.HttpSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.HubspotSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.ImpalaSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.InformixSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.JiraSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.JsonSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.MagentoSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.MariaDBSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.MarketoSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.MicrosoftAccessSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.MongoDbAtlasSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.MongoDbSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.MongoDbV2SourceResponse;
import com.pulumi.azurenative.datafactory.inputs.MySqlSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.NetezzaSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.ODataSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.OdbcSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.Office365SourceResponse;
import com.pulumi.azurenative.datafactory.inputs.OracleServiceCloudSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.OracleSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.OrcSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParquetSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.PaypalSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.PhoenixSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.PostgreSqlSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.PrestoSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.QuickBooksSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.RelationalSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.ResponsysSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.RestSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SalesforceMarketingCloudSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SalesforceServiceCloudSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SalesforceSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SapBwSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SapCloudForCustomerSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SapEccSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SapHanaSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SapOpenHubSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SapTableSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.ServiceNowSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SharePointOnlineListSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.ShopifySourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SnowflakeSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SparkSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SqlDWSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SqlMISourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SqlServerSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SqlSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SquareSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.SybaseSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.TabularSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.TeradataSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import com.pulumi.azurenative.datafactory.inputs.VerticaSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.WebSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.XeroSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.XmlSourceResponse;
import com.pulumi.azurenative.datafactory.inputs.ZohoSourceResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Lookup activity.
 * 
 */
public final class LookupActivityResponse extends com.pulumi.resources.InvokeArgs {

    public static final LookupActivityResponse Empty = new LookupActivityResponse();

    /**
     * Lookup activity dataset reference.
     * 
     */
    @Import(name="dataset", required=true)
      private final DatasetReferenceResponse dataset;

    public DatasetReferenceResponse dataset() {
        return this.dataset;
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
     * Whether to return first row or all rows. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="firstRowOnly")
      private final @Nullable Object firstRowOnly;

    public Optional<Object> firstRowOnly() {
        return this.firstRowOnly == null ? Optional.empty() : Optional.ofNullable(this.firstRowOnly);
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
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
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
     * Dataset-specific source properties, same as copy activity source.
     * 
     */
    @Import(name="source", required=true)
      private final Object source;

    public Object source() {
        return this.source;
    }

    /**
     * Type of activity.
     * Expected value is &#39;Lookup&#39;.
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

    public LookupActivityResponse(
        DatasetReferenceResponse dataset,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object firstRowOnly,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        @Nullable ActivityPolicyResponse policy,
        Object source,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.firstRowOnly = firstRowOnly;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.type = Codegen.stringProp("type").arg(type).require();
        this.userProperties = userProperties;
    }

    private LookupActivityResponse() {
        this.dataset = null;
        this.dependsOn = List.of();
        this.description = null;
        this.firstRowOnly = null;
        this.linkedServiceName = null;
        this.name = null;
        this.policy = null;
        this.source = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LookupActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetReferenceResponse dataset;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object firstRowOnly;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private Object source;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(LookupActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.firstRowOnly = defaults.firstRowOnly;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder dataset(DatasetReferenceResponse dataset) {
            this.dataset = Objects.requireNonNull(dataset);
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
        public Builder firstRowOnly(@Nullable Object firstRowOnly) {
            this.firstRowOnly = firstRowOnly;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder source(Object source) {
            this.source = Objects.requireNonNull(source);
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
        }        public LookupActivityResponse build() {
            return new LookupActivityResponse(dataset, dependsOn, description, firstRowOnly, linkedServiceName, name, policy, source, type, userProperties);
        }
    }
}
