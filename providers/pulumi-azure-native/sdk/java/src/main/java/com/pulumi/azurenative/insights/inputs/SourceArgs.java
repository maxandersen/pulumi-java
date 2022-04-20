// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.QueryType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the log search query.
 * 
 */
public final class SourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * List of  Resource referred into query
     * 
     */
    @Import(name="authorizedResources")
      private final @Nullable Output<List<String>> authorizedResources;

    public Output<List<String>> authorizedResources() {
        return this.authorizedResources == null ? Codegen.empty() : this.authorizedResources;
    }

    /**
     * The resource uri over which log search query is to be run.
     * 
     */
    @Import(name="dataSourceId", required=true)
      private final Output<String> dataSourceId;

    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }

    /**
     * Log search query. Required for action type - AlertingAction
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> query() {
        return this.query == null ? Codegen.empty() : this.query;
    }

    /**
     * Set value to &#39;ResultCount&#39; .
     * 
     */
    @Import(name="queryType")
      private final @Nullable Output<Either<String,QueryType>> queryType;

    public Output<Either<String,QueryType>> queryType() {
        return this.queryType == null ? Codegen.empty() : this.queryType;
    }

    public SourceArgs(
        @Nullable Output<List<String>> authorizedResources,
        Output<String> dataSourceId,
        @Nullable Output<String> query,
        @Nullable Output<Either<String,QueryType>> queryType) {
        this.authorizedResources = authorizedResources;
        this.dataSourceId = Objects.requireNonNull(dataSourceId, "expected parameter 'dataSourceId' to be non-null");
        this.query = query;
        this.queryType = queryType;
    }

    private SourceArgs() {
        this.authorizedResources = Codegen.empty();
        this.dataSourceId = Codegen.empty();
        this.query = Codegen.empty();
        this.queryType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> authorizedResources;
        private Output<String> dataSourceId;
        private @Nullable Output<String> query;
        private @Nullable Output<Either<String,QueryType>> queryType;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedResources = defaults.authorizedResources;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.query = defaults.query;
    	      this.queryType = defaults.queryType;
        }

        public Builder authorizedResources(@Nullable Output<List<String>> authorizedResources) {
            this.authorizedResources = authorizedResources;
            return this;
        }
        public Builder authorizedResources(@Nullable List<String> authorizedResources) {
            this.authorizedResources = Codegen.ofNullable(authorizedResources);
            return this;
        }
        public Builder authorizedResources(String... authorizedResources) {
            return authorizedResources(List.of(authorizedResources));
        }
        public Builder dataSourceId(Output<String> dataSourceId) {
            this.dataSourceId = Objects.requireNonNull(dataSourceId);
            return this;
        }
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = Output.of(Objects.requireNonNull(dataSourceId));
            return this;
        }
        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = Codegen.ofNullable(query);
            return this;
        }
        public Builder queryType(@Nullable Output<Either<String,QueryType>> queryType) {
            this.queryType = queryType;
            return this;
        }
        public Builder queryType(@Nullable Either<String,QueryType> queryType) {
            this.queryType = Codegen.ofNullable(queryType);
            return this;
        }        public SourceArgs build() {
            return new SourceArgs(authorizedResources, dataSourceId, query, queryType);
        }
    }
}
