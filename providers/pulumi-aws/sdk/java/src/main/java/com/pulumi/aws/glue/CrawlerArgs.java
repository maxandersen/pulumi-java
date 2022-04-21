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
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CrawlerArgs extends com.pulumi.resources.ResourceArgs {

    public static final CrawlerArgs Empty = new CrawlerArgs();

    @Import(name="catalogTargets")
    private @Nullable Output<List<CrawlerCatalogTargetArgs>> catalogTargets;

    public Optional<Output<List<CrawlerCatalogTargetArgs>>> catalogTargets() {
        return Optional.ofNullable(this.catalogTargets);
    }

    /**
     * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
     * 
     */
    @Import(name="classifiers")
    private @Nullable Output<List<String>> classifiers;

    public Optional<Output<List<String>>> classifiers() {
        return Optional.ofNullable(this.classifiers);
    }

    /**
     * JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<String> configuration;

    public Optional<Output<String>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * The name of the Glue database to be synchronized.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    @Import(name="deltaTargets")
    private @Nullable Output<List<CrawlerDeltaTargetArgs>> deltaTargets;

    public Optional<Output<List<CrawlerDeltaTargetArgs>>> deltaTargets() {
        return Optional.ofNullable(this.deltaTargets);
    }

    /**
     * Description of the crawler.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of nested DynamoDB target arguments. See Dynamodb Target below.
     * 
     */
    @Import(name="dynamodbTargets")
    private @Nullable Output<List<CrawlerDynamodbTargetArgs>> dynamodbTargets;

    public Optional<Output<List<CrawlerDynamodbTargetArgs>>> dynamodbTargets() {
        return Optional.ofNullable(this.dynamodbTargets);
    }

    /**
     * List of nested JBDC target arguments. See JDBC Target below.
     * 
     */
    @Import(name="jdbcTargets")
    private @Nullable Output<List<CrawlerJdbcTargetArgs>> jdbcTargets;

    public Optional<Output<List<CrawlerJdbcTargetArgs>>> jdbcTargets() {
        return Optional.ofNullable(this.jdbcTargets);
    }

    /**
     * Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     * 
     */
    @Import(name="lineageConfiguration")
    private @Nullable Output<CrawlerLineageConfigurationArgs> lineageConfiguration;

    public Optional<Output<CrawlerLineageConfigurationArgs>> lineageConfiguration() {
        return Optional.ofNullable(this.lineageConfiguration);
    }

    /**
     * List nested MongoDB target arguments. See MongoDB Target below.
     * 
     */
    @Import(name="mongodbTargets")
    private @Nullable Output<List<CrawlerMongodbTargetArgs>> mongodbTargets;

    public Optional<Output<List<CrawlerMongodbTargetArgs>>> mongodbTargets() {
        return Optional.ofNullable(this.mongodbTargets);
    }

    /**
     * Name of the crawler.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     * 
     */
    @Import(name="recrawlPolicy")
    private @Nullable Output<CrawlerRecrawlPolicyArgs> recrawlPolicy;

    public Optional<Output<CrawlerRecrawlPolicyArgs>> recrawlPolicy() {
        return Optional.ofNullable(this.recrawlPolicy);
    }

    /**
     * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    /**
     * List nested Amazon S3 target arguments. See S3 Target below.
     * 
     */
    @Import(name="s3Targets")
    private @Nullable Output<List<CrawlerS3TargetArgs>> s3Targets;

    public Optional<Output<List<CrawlerS3TargetArgs>>> s3Targets() {
        return Optional.ofNullable(this.s3Targets);
    }

    /**
     * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * Policy for the crawler&#39;s update and deletion behavior. See Schema Change Policy below.
     * 
     */
    @Import(name="schemaChangePolicy")
    private @Nullable Output<CrawlerSchemaChangePolicyArgs> schemaChangePolicy;

    public Optional<Output<CrawlerSchemaChangePolicyArgs>> schemaChangePolicy() {
        return Optional.ofNullable(this.schemaChangePolicy);
    }

    /**
     * The name of Security Configuration to be used by the crawler
     * 
     */
    @Import(name="securityConfiguration")
    private @Nullable Output<String> securityConfiguration;

    public Optional<Output<String>> securityConfiguration() {
        return Optional.ofNullable(this.securityConfiguration);
    }

    /**
     * The table prefix used for catalog tables that are created.
     * 
     */
    @Import(name="tablePrefix")
    private @Nullable Output<String> tablePrefix;

    public Optional<Output<String>> tablePrefix() {
        return Optional.ofNullable(this.tablePrefix);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CrawlerArgs() {}

    private CrawlerArgs(CrawlerArgs $) {
        this.catalogTargets = $.catalogTargets;
        this.classifiers = $.classifiers;
        this.configuration = $.configuration;
        this.databaseName = $.databaseName;
        this.deltaTargets = $.deltaTargets;
        this.description = $.description;
        this.dynamodbTargets = $.dynamodbTargets;
        this.jdbcTargets = $.jdbcTargets;
        this.lineageConfiguration = $.lineageConfiguration;
        this.mongodbTargets = $.mongodbTargets;
        this.name = $.name;
        this.recrawlPolicy = $.recrawlPolicy;
        this.role = $.role;
        this.s3Targets = $.s3Targets;
        this.schedule = $.schedule;
        this.schemaChangePolicy = $.schemaChangePolicy;
        this.securityConfiguration = $.securityConfiguration;
        this.tablePrefix = $.tablePrefix;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CrawlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CrawlerArgs $;

        public Builder() {
            $ = new CrawlerArgs();
        }

        public Builder(CrawlerArgs defaults) {
            $ = new CrawlerArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalogTargets(@Nullable Output<List<CrawlerCatalogTargetArgs>> catalogTargets) {
            $.catalogTargets = catalogTargets;
            return this;
        }

        public Builder catalogTargets(List<CrawlerCatalogTargetArgs> catalogTargets) {
            return catalogTargets(Output.of(catalogTargets));
        }

        public Builder catalogTargets(CrawlerCatalogTargetArgs... catalogTargets) {
            return catalogTargets(List.of(catalogTargets));
        }

        public Builder classifiers(@Nullable Output<List<String>> classifiers) {
            $.classifiers = classifiers;
            return this;
        }

        public Builder classifiers(List<String> classifiers) {
            return classifiers(Output.of(classifiers));
        }

        public Builder classifiers(String... classifiers) {
            return classifiers(List.of(classifiers));
        }

        public Builder configuration(@Nullable Output<String> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(String configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder deltaTargets(@Nullable Output<List<CrawlerDeltaTargetArgs>> deltaTargets) {
            $.deltaTargets = deltaTargets;
            return this;
        }

        public Builder deltaTargets(List<CrawlerDeltaTargetArgs> deltaTargets) {
            return deltaTargets(Output.of(deltaTargets));
        }

        public Builder deltaTargets(CrawlerDeltaTargetArgs... deltaTargets) {
            return deltaTargets(List.of(deltaTargets));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder dynamodbTargets(@Nullable Output<List<CrawlerDynamodbTargetArgs>> dynamodbTargets) {
            $.dynamodbTargets = dynamodbTargets;
            return this;
        }

        public Builder dynamodbTargets(List<CrawlerDynamodbTargetArgs> dynamodbTargets) {
            return dynamodbTargets(Output.of(dynamodbTargets));
        }

        public Builder dynamodbTargets(CrawlerDynamodbTargetArgs... dynamodbTargets) {
            return dynamodbTargets(List.of(dynamodbTargets));
        }

        public Builder jdbcTargets(@Nullable Output<List<CrawlerJdbcTargetArgs>> jdbcTargets) {
            $.jdbcTargets = jdbcTargets;
            return this;
        }

        public Builder jdbcTargets(List<CrawlerJdbcTargetArgs> jdbcTargets) {
            return jdbcTargets(Output.of(jdbcTargets));
        }

        public Builder jdbcTargets(CrawlerJdbcTargetArgs... jdbcTargets) {
            return jdbcTargets(List.of(jdbcTargets));
        }

        public Builder lineageConfiguration(@Nullable Output<CrawlerLineageConfigurationArgs> lineageConfiguration) {
            $.lineageConfiguration = lineageConfiguration;
            return this;
        }

        public Builder lineageConfiguration(CrawlerLineageConfigurationArgs lineageConfiguration) {
            return lineageConfiguration(Output.of(lineageConfiguration));
        }

        public Builder mongodbTargets(@Nullable Output<List<CrawlerMongodbTargetArgs>> mongodbTargets) {
            $.mongodbTargets = mongodbTargets;
            return this;
        }

        public Builder mongodbTargets(List<CrawlerMongodbTargetArgs> mongodbTargets) {
            return mongodbTargets(Output.of(mongodbTargets));
        }

        public Builder mongodbTargets(CrawlerMongodbTargetArgs... mongodbTargets) {
            return mongodbTargets(List.of(mongodbTargets));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder recrawlPolicy(@Nullable Output<CrawlerRecrawlPolicyArgs> recrawlPolicy) {
            $.recrawlPolicy = recrawlPolicy;
            return this;
        }

        public Builder recrawlPolicy(CrawlerRecrawlPolicyArgs recrawlPolicy) {
            return recrawlPolicy(Output.of(recrawlPolicy));
        }

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder s3Targets(@Nullable Output<List<CrawlerS3TargetArgs>> s3Targets) {
            $.s3Targets = s3Targets;
            return this;
        }

        public Builder s3Targets(List<CrawlerS3TargetArgs> s3Targets) {
            return s3Targets(Output.of(s3Targets));
        }

        public Builder s3Targets(CrawlerS3TargetArgs... s3Targets) {
            return s3Targets(List.of(s3Targets));
        }

        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        public Builder schemaChangePolicy(@Nullable Output<CrawlerSchemaChangePolicyArgs> schemaChangePolicy) {
            $.schemaChangePolicy = schemaChangePolicy;
            return this;
        }

        public Builder schemaChangePolicy(CrawlerSchemaChangePolicyArgs schemaChangePolicy) {
            return schemaChangePolicy(Output.of(schemaChangePolicy));
        }

        public Builder securityConfiguration(@Nullable Output<String> securityConfiguration) {
            $.securityConfiguration = securityConfiguration;
            return this;
        }

        public Builder securityConfiguration(String securityConfiguration) {
            return securityConfiguration(Output.of(securityConfiguration));
        }

        public Builder tablePrefix(@Nullable Output<String> tablePrefix) {
            $.tablePrefix = tablePrefix;
            return this;
        }

        public Builder tablePrefix(String tablePrefix) {
            return tablePrefix(Output.of(tablePrefix));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public CrawlerArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
