// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dataproc_v1.inputs.LoggingConfigArgs;
import com.pulumi.googlenative.dataproc_v1.inputs.QueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Presto (https://prestosql.io/) queries. IMPORTANT: The Dataproc Presto Optional Component (https://cloud.google.com/dataproc/docs/concepts/components/presto) must be enabled when the cluster is created to submit a Presto job to the cluster.
 * 
 */
public final class PrestoJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrestoJobArgs Empty = new PrestoJobArgs();

    /**
     * Optional. Presto client tags to attach to this query
     * 
     */
    @Import(name="clientTags")
      private final @Nullable Output<List<String>> clientTags;

    public Output<List<String>> clientTags() {
        return this.clientTags == null ? Codegen.empty() : this.clientTags;
    }

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    @Import(name="continueOnFailure")
      private final @Nullable Output<Boolean> continueOnFailure;

    public Output<Boolean> continueOnFailure() {
        return this.continueOnFailure == null ? Codegen.empty() : this.continueOnFailure;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
      private final @Nullable Output<LoggingConfigArgs> loggingConfig;

    public Output<LoggingConfigArgs> loggingConfig() {
        return this.loggingConfig == null ? Codegen.empty() : this.loggingConfig;
    }

    /**
     * Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
     */
    @Import(name="outputFormat")
      private final @Nullable Output<String> outputFormat;

    public Output<String> outputFormat() {
        return this.outputFormat == null ? Codegen.empty() : this.outputFormat;
    }

    /**
     * Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @Import(name="queryFileUri")
      private final @Nullable Output<String> queryFileUri;

    public Output<String> queryFileUri() {
        return this.queryFileUri == null ? Codegen.empty() : this.queryFileUri;
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList")
      private final @Nullable Output<QueryListArgs> queryList;

    public Output<QueryListArgs> queryList() {
        return this.queryList == null ? Codegen.empty() : this.queryList;
    }

    public PrestoJobArgs(
        @Nullable Output<List<String>> clientTags,
        @Nullable Output<Boolean> continueOnFailure,
        @Nullable Output<LoggingConfigArgs> loggingConfig,
        @Nullable Output<String> outputFormat,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<String> queryFileUri,
        @Nullable Output<QueryListArgs> queryList) {
        this.clientTags = clientTags;
        this.continueOnFailure = continueOnFailure;
        this.loggingConfig = loggingConfig;
        this.outputFormat = outputFormat;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
    }

    private PrestoJobArgs() {
        this.clientTags = Codegen.empty();
        this.continueOnFailure = Codegen.empty();
        this.loggingConfig = Codegen.empty();
        this.outputFormat = Codegen.empty();
        this.properties = Codegen.empty();
        this.queryFileUri = Codegen.empty();
        this.queryList = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrestoJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> clientTags;
        private @Nullable Output<Boolean> continueOnFailure;
        private @Nullable Output<LoggingConfigArgs> loggingConfig;
        private @Nullable Output<String> outputFormat;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<String> queryFileUri;
        private @Nullable Output<QueryListArgs> queryList;

        public Builder() {
    	      // Empty
        }

        public Builder(PrestoJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTags = defaults.clientTags;
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.outputFormat = defaults.outputFormat;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
        }

        public Builder clientTags(@Nullable Output<List<String>> clientTags) {
            this.clientTags = clientTags;
            return this;
        }
        public Builder clientTags(@Nullable List<String> clientTags) {
            this.clientTags = Codegen.ofNullable(clientTags);
            return this;
        }
        public Builder clientTags(String... clientTags) {
            return clientTags(List.of(clientTags));
        }
        public Builder continueOnFailure(@Nullable Output<Boolean> continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }
        public Builder continueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = Codegen.ofNullable(continueOnFailure);
            return this;
        }
        public Builder loggingConfig(@Nullable Output<LoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder loggingConfig(@Nullable LoggingConfigArgs loggingConfig) {
            this.loggingConfig = Codegen.ofNullable(loggingConfig);
            return this;
        }
        public Builder outputFormat(@Nullable Output<String> outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public Builder outputFormat(@Nullable String outputFormat) {
            this.outputFormat = Codegen.ofNullable(outputFormat);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder queryFileUri(@Nullable Output<String> queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }
        public Builder queryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = Codegen.ofNullable(queryFileUri);
            return this;
        }
        public Builder queryList(@Nullable Output<QueryListArgs> queryList) {
            this.queryList = queryList;
            return this;
        }
        public Builder queryList(@Nullable QueryListArgs queryList) {
            this.queryList = Codegen.ofNullable(queryList);
            return this;
        }        public PrestoJobArgs build() {
            return new PrestoJobArgs(clientTags, continueOnFailure, loggingConfig, outputFormat, properties, queryFileUri, queryList);
        }
    }
}
