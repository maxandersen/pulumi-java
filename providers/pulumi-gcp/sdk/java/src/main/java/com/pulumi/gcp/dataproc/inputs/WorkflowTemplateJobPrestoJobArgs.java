// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobLoggingConfigArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobQueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobPrestoJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobPrestoJobArgs Empty = new WorkflowTemplateJobPrestoJobArgs();

    /**
     * Optional. Presto client tags to attach to this query
     * 
     */
    @Import(name="clientTags")
    private @Nullable Output<List<String>> clientTags;

    public Optional<Output<List<String>>> clientTags() {
        return Optional.ofNullable(this.clientTags);
    }

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is `false`. Setting to `true` can be useful when executing independent parallel queries.
     * 
     */
    @Import(name="continueOnFailure")
    private @Nullable Output<Boolean> continueOnFailure;

    public Optional<Output<Boolean>> continueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<WorkflowTemplateJobPrestoJobLoggingConfigArgs> loggingConfig;

    public Optional<Output<WorkflowTemplateJobPrestoJobLoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
     */
    @Import(name="outputFormat")
    private @Nullable Output<String> outputFormat;

    public Optional<Output<String>> outputFormat() {
        return Optional.ofNullable(this.outputFormat);
    }

    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @Import(name="queryFileUri")
    private @Nullable Output<String> queryFileUri;

    public Optional<Output<String>> queryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList")
    private @Nullable Output<WorkflowTemplateJobPrestoJobQueryListArgs> queryList;

    public Optional<Output<WorkflowTemplateJobPrestoJobQueryListArgs>> queryList() {
        return Optional.ofNullable(this.queryList);
    }

    private WorkflowTemplateJobPrestoJobArgs() {}

    private WorkflowTemplateJobPrestoJobArgs(WorkflowTemplateJobPrestoJobArgs $) {
        this.clientTags = $.clientTags;
        this.continueOnFailure = $.continueOnFailure;
        this.loggingConfig = $.loggingConfig;
        this.outputFormat = $.outputFormat;
        this.properties = $.properties;
        this.queryFileUri = $.queryFileUri;
        this.queryList = $.queryList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplateJobPrestoJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplateJobPrestoJobArgs $;

        public Builder() {
            $ = new WorkflowTemplateJobPrestoJobArgs();
        }

        public Builder(WorkflowTemplateJobPrestoJobArgs defaults) {
            $ = new WorkflowTemplateJobPrestoJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientTags(@Nullable Output<List<String>> clientTags) {
            $.clientTags = clientTags;
            return this;
        }

        public Builder clientTags(List<String> clientTags) {
            return clientTags(Output.of(clientTags));
        }

        public Builder clientTags(String... clientTags) {
            return clientTags(List.of(clientTags));
        }

        public Builder continueOnFailure(@Nullable Output<Boolean> continueOnFailure) {
            $.continueOnFailure = continueOnFailure;
            return this;
        }

        public Builder continueOnFailure(Boolean continueOnFailure) {
            return continueOnFailure(Output.of(continueOnFailure));
        }

        public Builder loggingConfig(@Nullable Output<WorkflowTemplateJobPrestoJobLoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(WorkflowTemplateJobPrestoJobLoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        public Builder outputFormat(@Nullable Output<String> outputFormat) {
            $.outputFormat = outputFormat;
            return this;
        }

        public Builder outputFormat(String outputFormat) {
            return outputFormat(Output.of(outputFormat));
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public Builder queryFileUri(@Nullable Output<String> queryFileUri) {
            $.queryFileUri = queryFileUri;
            return this;
        }

        public Builder queryFileUri(String queryFileUri) {
            return queryFileUri(Output.of(queryFileUri));
        }

        public Builder queryList(@Nullable Output<WorkflowTemplateJobPrestoJobQueryListArgs> queryList) {
            $.queryList = queryList;
            return this;
        }

        public Builder queryList(WorkflowTemplateJobPrestoJobQueryListArgs queryList) {
            return queryList(Output.of(queryList));
        }

        public WorkflowTemplateJobPrestoJobArgs build() {
            return $;
        }
    }

}
