// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.LoggingConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.QueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Apache Pig (https://pig.apache.org/) queries on YARN.
 * 
 */
public final class PigJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final PigJobArgs Empty = new PigJobArgs();

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
     * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
     * 
     */
    @Import(name="jarFileUris")
      private final @Nullable Output<List<String>> jarFileUris;

    public Output<List<String>> jarFileUris() {
        return this.jarFileUris == null ? Codegen.empty() : this.jarFileUris;
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
     * Optional. A mapping of property names to values, used to configure Pig. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains the Pig queries.
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

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Pig command: name=[value]).
     * 
     */
    @Import(name="scriptVariables")
      private final @Nullable Output<Map<String,String>> scriptVariables;

    public Output<Map<String,String>> scriptVariables() {
        return this.scriptVariables == null ? Codegen.empty() : this.scriptVariables;
    }

    public PigJobArgs(
        @Nullable Output<Boolean> continueOnFailure,
        @Nullable Output<List<String>> jarFileUris,
        @Nullable Output<LoggingConfigArgs> loggingConfig,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<String> queryFileUri,
        @Nullable Output<QueryListArgs> queryList,
        @Nullable Output<Map<String,String>> scriptVariables) {
        this.continueOnFailure = continueOnFailure;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
        this.scriptVariables = scriptVariables;
    }

    private PigJobArgs() {
        this.continueOnFailure = Codegen.empty();
        this.jarFileUris = Codegen.empty();
        this.loggingConfig = Codegen.empty();
        this.properties = Codegen.empty();
        this.queryFileUri = Codegen.empty();
        this.queryList = Codegen.empty();
        this.scriptVariables = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PigJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> continueOnFailure;
        private @Nullable Output<List<String>> jarFileUris;
        private @Nullable Output<LoggingConfigArgs> loggingConfig;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<String> queryFileUri;
        private @Nullable Output<QueryListArgs> queryList;
        private @Nullable Output<Map<String,String>> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(PigJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder continueOnFailure(@Nullable Output<Boolean> continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }
        public Builder continueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = Codegen.ofNullable(continueOnFailure);
            return this;
        }
        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }
        public Builder jarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Codegen.ofNullable(jarFileUris);
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder loggingConfig(@Nullable Output<LoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder loggingConfig(@Nullable LoggingConfigArgs loggingConfig) {
            this.loggingConfig = Codegen.ofNullable(loggingConfig);
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
        }
        public Builder scriptVariables(@Nullable Output<Map<String,String>> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }
        public Builder scriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = Codegen.ofNullable(scriptVariables);
            return this;
        }        public PigJobArgs build() {
            return new PigJobArgs(continueOnFailure, jarFileUris, loggingConfig, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}
