// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue;

import com.pulumi.aws.glue.inputs.CrawlerCatalogTargetArgs;
import com.pulumi.aws.glue.inputs.CrawlerDeltaTargetArgs;
import com.pulumi.aws.glue.inputs.CrawlerDynamodbTargetArgs;
import com.pulumi.aws.glue.inputs.CrawlerJdbcTargetArgs;
import com.pulumi.aws.glue.inputs.CrawlerLineageConfigurationArgs;
import com.pulumi.aws.glue.inputs.CrawlerMongodbTargetArgs;
import com.pulumi.aws.glue.inputs.CrawlerRecrawlPolicyArgs;
import com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs;
import com.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CrawlerArgs extends com.pulumi.resources.ResourceArgs {

    public static final CrawlerArgs Empty = new CrawlerArgs();

    @Import(name="catalogTargets")
      private final @Nullable Output<List<CrawlerCatalogTargetArgs>> catalogTargets;

    public Output<List<CrawlerCatalogTargetArgs>> catalogTargets() {
        return this.catalogTargets == null ? Codegen.empty() : this.catalogTargets;
    }

    /**
     * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
     * 
     */
    @Import(name="classifiers")
      private final @Nullable Output<List<String>> classifiers;

    public Output<List<String>> classifiers() {
        return this.classifiers == null ? Codegen.empty() : this.classifiers;
    }

    /**
     * JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<String> configuration;

    public Output<String> configuration() {
        return this.configuration == null ? Codegen.empty() : this.configuration;
    }

    /**
     * The name of the Glue database to be synchronized.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    @Import(name="deltaTargets")
      private final @Nullable Output<List<CrawlerDeltaTargetArgs>> deltaTargets;

    public Output<List<CrawlerDeltaTargetArgs>> deltaTargets() {
        return this.deltaTargets == null ? Codegen.empty() : this.deltaTargets;
    }

    /**
     * Description of the crawler.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * List of nested DynamoDB target arguments. See Dynamodb Target below.
     * 
     */
    @Import(name="dynamodbTargets")
      private final @Nullable Output<List<CrawlerDynamodbTargetArgs>> dynamodbTargets;

    public Output<List<CrawlerDynamodbTargetArgs>> dynamodbTargets() {
        return this.dynamodbTargets == null ? Codegen.empty() : this.dynamodbTargets;
    }

    /**
     * List of nested JBDC target arguments. See JDBC Target below.
     * 
     */
    @Import(name="jdbcTargets")
      private final @Nullable Output<List<CrawlerJdbcTargetArgs>> jdbcTargets;

    public Output<List<CrawlerJdbcTargetArgs>> jdbcTargets() {
        return this.jdbcTargets == null ? Codegen.empty() : this.jdbcTargets;
    }

    /**
     * Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     * 
     */
    @Import(name="lineageConfiguration")
      private final @Nullable Output<CrawlerLineageConfigurationArgs> lineageConfiguration;

    public Output<CrawlerLineageConfigurationArgs> lineageConfiguration() {
        return this.lineageConfiguration == null ? Codegen.empty() : this.lineageConfiguration;
    }

    /**
     * List nested MongoDB target arguments. See MongoDB Target below.
     * 
     */
    @Import(name="mongodbTargets")
      private final @Nullable Output<List<CrawlerMongodbTargetArgs>> mongodbTargets;

    public Output<List<CrawlerMongodbTargetArgs>> mongodbTargets() {
        return this.mongodbTargets == null ? Codegen.empty() : this.mongodbTargets;
    }

    /**
     * Name of the crawler.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     * 
     */
    @Import(name="recrawlPolicy")
      private final @Nullable Output<CrawlerRecrawlPolicyArgs> recrawlPolicy;

    public Output<CrawlerRecrawlPolicyArgs> recrawlPolicy() {
        return this.recrawlPolicy == null ? Codegen.empty() : this.recrawlPolicy;
    }

    /**
     * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    /**
     * List nested Amazon S3 target arguments. See S3 Target below.
     * 
     */
    @Import(name="s3Targets")
      private final @Nullable Output<List<CrawlerS3TargetArgs>> s3Targets;

    public Output<List<CrawlerS3TargetArgs>> s3Targets() {
        return this.s3Targets == null ? Codegen.empty() : this.s3Targets;
    }

    /**
     * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<String> schedule;

    public Output<String> schedule() {
        return this.schedule == null ? Codegen.empty() : this.schedule;
    }

    /**
     * Policy for the crawler&#39;s update and deletion behavior. See Schema Change Policy below.
     * 
     */
    @Import(name="schemaChangePolicy")
      private final @Nullable Output<CrawlerSchemaChangePolicyArgs> schemaChangePolicy;

    public Output<CrawlerSchemaChangePolicyArgs> schemaChangePolicy() {
        return this.schemaChangePolicy == null ? Codegen.empty() : this.schemaChangePolicy;
    }

    /**
     * The name of Security Configuration to be used by the crawler
     * 
     */
    @Import(name="securityConfiguration")
      private final @Nullable Output<String> securityConfiguration;

    public Output<String> securityConfiguration() {
        return this.securityConfiguration == null ? Codegen.empty() : this.securityConfiguration;
    }

    /**
     * The table prefix used for catalog tables that are created.
     * 
     */
    @Import(name="tablePrefix")
      private final @Nullable Output<String> tablePrefix;

    public Output<String> tablePrefix() {
        return this.tablePrefix == null ? Codegen.empty() : this.tablePrefix;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public CrawlerArgs(
        @Nullable Output<List<CrawlerCatalogTargetArgs>> catalogTargets,
        @Nullable Output<List<String>> classifiers,
        @Nullable Output<String> configuration,
        Output<String> databaseName,
        @Nullable Output<List<CrawlerDeltaTargetArgs>> deltaTargets,
        @Nullable Output<String> description,
        @Nullable Output<List<CrawlerDynamodbTargetArgs>> dynamodbTargets,
        @Nullable Output<List<CrawlerJdbcTargetArgs>> jdbcTargets,
        @Nullable Output<CrawlerLineageConfigurationArgs> lineageConfiguration,
        @Nullable Output<List<CrawlerMongodbTargetArgs>> mongodbTargets,
        @Nullable Output<String> name,
        @Nullable Output<CrawlerRecrawlPolicyArgs> recrawlPolicy,
        Output<String> role,
        @Nullable Output<List<CrawlerS3TargetArgs>> s3Targets,
        @Nullable Output<String> schedule,
        @Nullable Output<CrawlerSchemaChangePolicyArgs> schemaChangePolicy,
        @Nullable Output<String> securityConfiguration,
        @Nullable Output<String> tablePrefix,
        @Nullable Output<Map<String,String>> tags) {
        this.catalogTargets = catalogTargets;
        this.classifiers = classifiers;
        this.configuration = configuration;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.deltaTargets = deltaTargets;
        this.description = description;
        this.dynamodbTargets = dynamodbTargets;
        this.jdbcTargets = jdbcTargets;
        this.lineageConfiguration = lineageConfiguration;
        this.mongodbTargets = mongodbTargets;
        this.name = name;
        this.recrawlPolicy = recrawlPolicy;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.s3Targets = s3Targets;
        this.schedule = schedule;
        this.schemaChangePolicy = schemaChangePolicy;
        this.securityConfiguration = securityConfiguration;
        this.tablePrefix = tablePrefix;
        this.tags = tags;
    }

    private CrawlerArgs() {
        this.catalogTargets = Codegen.empty();
        this.classifiers = Codegen.empty();
        this.configuration = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.deltaTargets = Codegen.empty();
        this.description = Codegen.empty();
        this.dynamodbTargets = Codegen.empty();
        this.jdbcTargets = Codegen.empty();
        this.lineageConfiguration = Codegen.empty();
        this.mongodbTargets = Codegen.empty();
        this.name = Codegen.empty();
        this.recrawlPolicy = Codegen.empty();
        this.role = Codegen.empty();
        this.s3Targets = Codegen.empty();
        this.schedule = Codegen.empty();
        this.schemaChangePolicy = Codegen.empty();
        this.securityConfiguration = Codegen.empty();
        this.tablePrefix = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CrawlerCatalogTargetArgs>> catalogTargets;
        private @Nullable Output<List<String>> classifiers;
        private @Nullable Output<String> configuration;
        private Output<String> databaseName;
        private @Nullable Output<List<CrawlerDeltaTargetArgs>> deltaTargets;
        private @Nullable Output<String> description;
        private @Nullable Output<List<CrawlerDynamodbTargetArgs>> dynamodbTargets;
        private @Nullable Output<List<CrawlerJdbcTargetArgs>> jdbcTargets;
        private @Nullable Output<CrawlerLineageConfigurationArgs> lineageConfiguration;
        private @Nullable Output<List<CrawlerMongodbTargetArgs>> mongodbTargets;
        private @Nullable Output<String> name;
        private @Nullable Output<CrawlerRecrawlPolicyArgs> recrawlPolicy;
        private Output<String> role;
        private @Nullable Output<List<CrawlerS3TargetArgs>> s3Targets;
        private @Nullable Output<String> schedule;
        private @Nullable Output<CrawlerSchemaChangePolicyArgs> schemaChangePolicy;
        private @Nullable Output<String> securityConfiguration;
        private @Nullable Output<String> tablePrefix;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogTargets = defaults.catalogTargets;
    	      this.classifiers = defaults.classifiers;
    	      this.configuration = defaults.configuration;
    	      this.databaseName = defaults.databaseName;
    	      this.deltaTargets = defaults.deltaTargets;
    	      this.description = defaults.description;
    	      this.dynamodbTargets = defaults.dynamodbTargets;
    	      this.jdbcTargets = defaults.jdbcTargets;
    	      this.lineageConfiguration = defaults.lineageConfiguration;
    	      this.mongodbTargets = defaults.mongodbTargets;
    	      this.name = defaults.name;
    	      this.recrawlPolicy = defaults.recrawlPolicy;
    	      this.role = defaults.role;
    	      this.s3Targets = defaults.s3Targets;
    	      this.schedule = defaults.schedule;
    	      this.schemaChangePolicy = defaults.schemaChangePolicy;
    	      this.securityConfiguration = defaults.securityConfiguration;
    	      this.tablePrefix = defaults.tablePrefix;
    	      this.tags = defaults.tags;
        }

        public Builder catalogTargets(@Nullable Output<List<CrawlerCatalogTargetArgs>> catalogTargets) {
            this.catalogTargets = catalogTargets;
            return this;
        }
        public Builder catalogTargets(@Nullable List<CrawlerCatalogTargetArgs> catalogTargets) {
            this.catalogTargets = Codegen.ofNullable(catalogTargets);
            return this;
        }
        public Builder catalogTargets(CrawlerCatalogTargetArgs... catalogTargets) {
            return catalogTargets(List.of(catalogTargets));
        }
        public Builder classifiers(@Nullable Output<List<String>> classifiers) {
            this.classifiers = classifiers;
            return this;
        }
        public Builder classifiers(@Nullable List<String> classifiers) {
            this.classifiers = Codegen.ofNullable(classifiers);
            return this;
        }
        public Builder classifiers(String... classifiers) {
            return classifiers(List.of(classifiers));
        }
        public Builder configuration(@Nullable Output<String> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable String configuration) {
            this.configuration = Codegen.ofNullable(configuration);
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
        public Builder deltaTargets(@Nullable Output<List<CrawlerDeltaTargetArgs>> deltaTargets) {
            this.deltaTargets = deltaTargets;
            return this;
        }
        public Builder deltaTargets(@Nullable List<CrawlerDeltaTargetArgs> deltaTargets) {
            this.deltaTargets = Codegen.ofNullable(deltaTargets);
            return this;
        }
        public Builder deltaTargets(CrawlerDeltaTargetArgs... deltaTargets) {
            return deltaTargets(List.of(deltaTargets));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder dynamodbTargets(@Nullable Output<List<CrawlerDynamodbTargetArgs>> dynamodbTargets) {
            this.dynamodbTargets = dynamodbTargets;
            return this;
        }
        public Builder dynamodbTargets(@Nullable List<CrawlerDynamodbTargetArgs> dynamodbTargets) {
            this.dynamodbTargets = Codegen.ofNullable(dynamodbTargets);
            return this;
        }
        public Builder dynamodbTargets(CrawlerDynamodbTargetArgs... dynamodbTargets) {
            return dynamodbTargets(List.of(dynamodbTargets));
        }
        public Builder jdbcTargets(@Nullable Output<List<CrawlerJdbcTargetArgs>> jdbcTargets) {
            this.jdbcTargets = jdbcTargets;
            return this;
        }
        public Builder jdbcTargets(@Nullable List<CrawlerJdbcTargetArgs> jdbcTargets) {
            this.jdbcTargets = Codegen.ofNullable(jdbcTargets);
            return this;
        }
        public Builder jdbcTargets(CrawlerJdbcTargetArgs... jdbcTargets) {
            return jdbcTargets(List.of(jdbcTargets));
        }
        public Builder lineageConfiguration(@Nullable Output<CrawlerLineageConfigurationArgs> lineageConfiguration) {
            this.lineageConfiguration = lineageConfiguration;
            return this;
        }
        public Builder lineageConfiguration(@Nullable CrawlerLineageConfigurationArgs lineageConfiguration) {
            this.lineageConfiguration = Codegen.ofNullable(lineageConfiguration);
            return this;
        }
        public Builder mongodbTargets(@Nullable Output<List<CrawlerMongodbTargetArgs>> mongodbTargets) {
            this.mongodbTargets = mongodbTargets;
            return this;
        }
        public Builder mongodbTargets(@Nullable List<CrawlerMongodbTargetArgs> mongodbTargets) {
            this.mongodbTargets = Codegen.ofNullable(mongodbTargets);
            return this;
        }
        public Builder mongodbTargets(CrawlerMongodbTargetArgs... mongodbTargets) {
            return mongodbTargets(List.of(mongodbTargets));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder recrawlPolicy(@Nullable Output<CrawlerRecrawlPolicyArgs> recrawlPolicy) {
            this.recrawlPolicy = recrawlPolicy;
            return this;
        }
        public Builder recrawlPolicy(@Nullable CrawlerRecrawlPolicyArgs recrawlPolicy) {
            this.recrawlPolicy = Codegen.ofNullable(recrawlPolicy);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder s3Targets(@Nullable Output<List<CrawlerS3TargetArgs>> s3Targets) {
            this.s3Targets = s3Targets;
            return this;
        }
        public Builder s3Targets(@Nullable List<CrawlerS3TargetArgs> s3Targets) {
            this.s3Targets = Codegen.ofNullable(s3Targets);
            return this;
        }
        public Builder s3Targets(CrawlerS3TargetArgs... s3Targets) {
            return s3Targets(List.of(s3Targets));
        }
        public Builder schedule(@Nullable Output<String> schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder schedule(@Nullable String schedule) {
            this.schedule = Codegen.ofNullable(schedule);
            return this;
        }
        public Builder schemaChangePolicy(@Nullable Output<CrawlerSchemaChangePolicyArgs> schemaChangePolicy) {
            this.schemaChangePolicy = schemaChangePolicy;
            return this;
        }
        public Builder schemaChangePolicy(@Nullable CrawlerSchemaChangePolicyArgs schemaChangePolicy) {
            this.schemaChangePolicy = Codegen.ofNullable(schemaChangePolicy);
            return this;
        }
        public Builder securityConfiguration(@Nullable Output<String> securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }
        public Builder securityConfiguration(@Nullable String securityConfiguration) {
            this.securityConfiguration = Codegen.ofNullable(securityConfiguration);
            return this;
        }
        public Builder tablePrefix(@Nullable Output<String> tablePrefix) {
            this.tablePrefix = tablePrefix;
            return this;
        }
        public Builder tablePrefix(@Nullable String tablePrefix) {
            this.tablePrefix = Codegen.ofNullable(tablePrefix);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public CrawlerArgs build() {
            return new CrawlerArgs(catalogTargets, classifiers, configuration, databaseName, deltaTargets, description, dynamodbTargets, jdbcTargets, lineageConfiguration, mongodbTargets, name, recrawlPolicy, role, s3Targets, schedule, schemaChangePolicy, securityConfiguration, tablePrefix, tags);
        }
    }
}
