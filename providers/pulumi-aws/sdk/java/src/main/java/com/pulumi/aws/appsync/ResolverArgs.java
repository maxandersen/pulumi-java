// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync;

import com.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs;
import com.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs;
import com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResolverArgs Empty = new ResolverArgs();

    /**
     * The API ID for the GraphQL API.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * The CachingConfig.
     * 
     */
    @Import(name="cachingConfig")
    private @Nullable Output<ResolverCachingConfigArgs> cachingConfig;

    public Optional<Output<ResolverCachingConfigArgs>> cachingConfig() {
        return Optional.ofNullable(this.cachingConfig);
    }

    /**
     * The DataSource name.
     * 
     */
    @Import(name="dataSource")
    private @Nullable Output<String> dataSource;

    public Optional<Output<String>> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }

    /**
     * The field name from the schema defined in the GraphQL API.
     * 
     */
    @Import(name="field", required=true)
    private Output<String> field;

    public Output<String> field() {
        return this.field;
    }

    /**
     * The resolver type. Valid values are `UNIT` and `PIPELINE`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    @Import(name="maxBatchSize")
    private @Nullable Output<Integer> maxBatchSize;

    public Optional<Output<Integer>> maxBatchSize() {
        return Optional.ofNullable(this.maxBatchSize);
    }

    /**
     * The PipelineConfig.
     * 
     */
    @Import(name="pipelineConfig")
    private @Nullable Output<ResolverPipelineConfigArgs> pipelineConfig;

    public Optional<Output<ResolverPipelineConfigArgs>> pipelineConfig() {
        return Optional.ofNullable(this.pipelineConfig);
    }

    /**
     * The request mapping template for UNIT resolver or &#39;before mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @Import(name="requestTemplate")
    private @Nullable Output<String> requestTemplate;

    public Optional<Output<String>> requestTemplate() {
        return Optional.ofNullable(this.requestTemplate);
    }

    /**
     * The response mapping template for UNIT resolver or &#39;after mapping template&#39; for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @Import(name="responseTemplate")
    private @Nullable Output<String> responseTemplate;

    public Optional<Output<String>> responseTemplate() {
        return Optional.ofNullable(this.responseTemplate);
    }

    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    @Import(name="syncConfig")
    private @Nullable Output<ResolverSyncConfigArgs> syncConfig;

    public Optional<Output<ResolverSyncConfigArgs>> syncConfig() {
        return Optional.ofNullable(this.syncConfig);
    }

    /**
     * The type name from the schema defined in the GraphQL API.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ResolverArgs() {}

    private ResolverArgs(ResolverArgs $) {
        this.apiId = $.apiId;
        this.cachingConfig = $.cachingConfig;
        this.dataSource = $.dataSource;
        this.field = $.field;
        this.kind = $.kind;
        this.maxBatchSize = $.maxBatchSize;
        this.pipelineConfig = $.pipelineConfig;
        this.requestTemplate = $.requestTemplate;
        this.responseTemplate = $.responseTemplate;
        this.syncConfig = $.syncConfig;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverArgs $;

        public Builder() {
            $ = new ResolverArgs();
        }

        public Builder(ResolverArgs defaults) {
            $ = new ResolverArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        public Builder cachingConfig(@Nullable Output<ResolverCachingConfigArgs> cachingConfig) {
            $.cachingConfig = cachingConfig;
            return this;
        }

        public Builder cachingConfig(ResolverCachingConfigArgs cachingConfig) {
            return cachingConfig(Output.of(cachingConfig));
        }

        public Builder dataSource(@Nullable Output<String> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        public Builder dataSource(String dataSource) {
            return dataSource(Output.of(dataSource));
        }

        public Builder field(Output<String> field) {
            $.field = field;
            return this;
        }

        public Builder field(String field) {
            return field(Output.of(field));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder maxBatchSize(@Nullable Output<Integer> maxBatchSize) {
            $.maxBatchSize = maxBatchSize;
            return this;
        }

        public Builder maxBatchSize(Integer maxBatchSize) {
            return maxBatchSize(Output.of(maxBatchSize));
        }

        public Builder pipelineConfig(@Nullable Output<ResolverPipelineConfigArgs> pipelineConfig) {
            $.pipelineConfig = pipelineConfig;
            return this;
        }

        public Builder pipelineConfig(ResolverPipelineConfigArgs pipelineConfig) {
            return pipelineConfig(Output.of(pipelineConfig));
        }

        public Builder requestTemplate(@Nullable Output<String> requestTemplate) {
            $.requestTemplate = requestTemplate;
            return this;
        }

        public Builder requestTemplate(String requestTemplate) {
            return requestTemplate(Output.of(requestTemplate));
        }

        public Builder responseTemplate(@Nullable Output<String> responseTemplate) {
            $.responseTemplate = responseTemplate;
            return this;
        }

        public Builder responseTemplate(String responseTemplate) {
            return responseTemplate(Output.of(responseTemplate));
        }

        public Builder syncConfig(@Nullable Output<ResolverSyncConfigArgs> syncConfig) {
            $.syncConfig = syncConfig;
            return this;
        }

        public Builder syncConfig(ResolverSyncConfigArgs syncConfig) {
            return syncConfig(Output.of(syncConfig));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ResolverArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.field = Objects.requireNonNull($.field, "expected parameter 'field' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
