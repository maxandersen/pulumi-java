// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.JobPrestoConfigLoggingConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobPrestoConfig {
    /**
     * @return Presto client tags to attach to this query.
     * 
     */
    private final @Nullable List<String> clientTags;
    /**
     * @return Whether to continue executing queries if a query fails. Setting to true can be useful when executing independent parallel queries. Defaults to false.
     * 
     */
    private final @Nullable Boolean continueOnFailure;
    private final @Nullable JobPrestoConfigLoggingConfig loggingConfig;
    /**
     * @return The format in which query output will be displayed. See the Presto documentation for supported output formats.
     * 
     */
    private final @Nullable String outputFormat;
    /**
     * @return A mapping of property names to values. Used to set Presto session properties Equivalent to using the --session flag in the Presto CLI.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * @return The HCFS URI of the script that contains SQL queries.
     * Conflicts with `query_list`
     * 
     */
    private final @Nullable String queryFileUri;
    /**
     * @return The list of SQL queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    private final @Nullable List<String> queryLists;

    @CustomType.Constructor
    private JobPrestoConfig(
        @CustomType.Parameter("clientTags") @Nullable List<String> clientTags,
        @CustomType.Parameter("continueOnFailure") @Nullable Boolean continueOnFailure,
        @CustomType.Parameter("loggingConfig") @Nullable JobPrestoConfigLoggingConfig loggingConfig,
        @CustomType.Parameter("outputFormat") @Nullable String outputFormat,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("queryFileUri") @Nullable String queryFileUri,
        @CustomType.Parameter("queryLists") @Nullable List<String> queryLists) {
        this.clientTags = clientTags;
        this.continueOnFailure = continueOnFailure;
        this.loggingConfig = loggingConfig;
        this.outputFormat = outputFormat;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryLists = queryLists;
    }

    /**
     * @return Presto client tags to attach to this query.
     * 
     */
    public List<String> clientTags() {
        return this.clientTags == null ? List.of() : this.clientTags;
    }
    /**
     * @return Whether to continue executing queries if a query fails. Setting to true can be useful when executing independent parallel queries. Defaults to false.
     * 
     */
    public Optional<Boolean> continueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }
    public Optional<JobPrestoConfigLoggingConfig> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }
    /**
     * @return The format in which query output will be displayed. See the Presto documentation for supported output formats.
     * 
     */
    public Optional<String> outputFormat() {
        return Optional.ofNullable(this.outputFormat);
    }
    /**
     * @return A mapping of property names to values. Used to set Presto session properties Equivalent to using the --session flag in the Presto CLI.
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return The HCFS URI of the script that contains SQL queries.
     * Conflicts with `query_list`
     * 
     */
    public Optional<String> queryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }
    /**
     * @return The list of SQL queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    public List<String> queryLists() {
        return this.queryLists == null ? List.of() : this.queryLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPrestoConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> clientTags;
        private @Nullable Boolean continueOnFailure;
        private @Nullable JobPrestoConfigLoggingConfig loggingConfig;
        private @Nullable String outputFormat;
        private @Nullable Map<String,String> properties;
        private @Nullable String queryFileUri;
        private @Nullable List<String> queryLists;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPrestoConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTags = defaults.clientTags;
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.outputFormat = defaults.outputFormat;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryLists = defaults.queryLists;
        }

        public Builder clientTags(@Nullable List<String> clientTags) {
            this.clientTags = clientTags;
            return this;
        }
        public Builder clientTags(String... clientTags) {
            return clientTags(List.of(clientTags));
        }
        public Builder continueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }
        public Builder loggingConfig(@Nullable JobPrestoConfigLoggingConfig loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder outputFormat(@Nullable String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder queryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }
        public Builder queryLists(@Nullable List<String> queryLists) {
            this.queryLists = queryLists;
            return this;
        }
        public Builder queryLists(String... queryLists) {
            return queryLists(List.of(queryLists));
        }        public JobPrestoConfig build() {
            return new JobPrestoConfig(clientTags, continueOnFailure, loggingConfig, outputFormat, properties, queryFileUri, queryLists);
        }
    }
}
