// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.AgentPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.CredentialsArgs;
import io.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.SetValueArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The request parameters for a scheduling run against a task file.
 * 
 */
public final class FileTaskRunRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileTaskRunRequestArgs Empty = new FileTaskRunRequestArgs();

    /**
     * The machine configuration of the run agent.
     * 
     */
    @Import(name="agentConfiguration")
      private final @Nullable Output<AgentPropertiesArgs> agentConfiguration;

    public Output<AgentPropertiesArgs> agentConfiguration() {
        return this.agentConfiguration == null ? Codegen.empty() : this.agentConfiguration;
    }

    /**
     * The dedicated agent pool for the run.
     * 
     */
    @Import(name="agentPoolName")
      private final @Nullable Output<String> agentPoolName;

    public Output<String> agentPoolName() {
        return this.agentPoolName == null ? Codegen.empty() : this.agentPoolName;
    }

    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<CredentialsArgs> credentials;

    public Output<CredentialsArgs> credentials() {
        return this.credentials == null ? Codegen.empty() : this.credentials;
    }

    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    @Import(name="isArchiveEnabled")
      private final @Nullable Output<Boolean> isArchiveEnabled;

    public Output<Boolean> isArchiveEnabled() {
        return this.isArchiveEnabled == null ? Codegen.empty() : this.isArchiveEnabled;
    }

    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @Import(name="logTemplate")
      private final @Nullable Output<String> logTemplate;

    public Output<String> logTemplate() {
        return this.logTemplate == null ? Codegen.empty() : this.logTemplate;
    }

    /**
     * The platform properties against which the run has to happen.
     * 
     */
    @Import(name="platform", required=true)
      private final Output<PlatformPropertiesArgs> platform;

    public Output<PlatformPropertiesArgs> platform() {
        return this.platform;
    }

    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
     */
    @Import(name="sourceLocation")
      private final @Nullable Output<String> sourceLocation;

    public Output<String> sourceLocation() {
        return this.sourceLocation == null ? Codegen.empty() : this.sourceLocation;
    }

    /**
     * The template/definition file path relative to the source.
     * 
     */
    @Import(name="taskFilePath", required=true)
      private final Output<String> taskFilePath;

    public Output<String> taskFilePath() {
        return this.taskFilePath;
    }

    /**
     * Run timeout in seconds.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<Integer> timeout;

    public Output<Integer> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    /**
     * The type of the run request.
     * Expected value is 'FileTaskRunRequest'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<SetValueArgs>> values;

    public Output<List<SetValueArgs>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    /**
     * The values/parameters file path relative to the source.
     * 
     */
    @Import(name="valuesFilePath")
      private final @Nullable Output<String> valuesFilePath;

    public Output<String> valuesFilePath() {
        return this.valuesFilePath == null ? Codegen.empty() : this.valuesFilePath;
    }

    public FileTaskRunRequestArgs(
        @Nullable Output<AgentPropertiesArgs> agentConfiguration,
        @Nullable Output<String> agentPoolName,
        @Nullable Output<CredentialsArgs> credentials,
        @Nullable Output<Boolean> isArchiveEnabled,
        @Nullable Output<String> logTemplate,
        Output<PlatformPropertiesArgs> platform,
        @Nullable Output<String> sourceLocation,
        Output<String> taskFilePath,
        @Nullable Output<Integer> timeout,
        Output<String> type,
        @Nullable Output<List<SetValueArgs>> values,
        @Nullable Output<String> valuesFilePath) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.credentials = credentials;
        this.isArchiveEnabled = isArchiveEnabled == null ? Codegen.ofNullable(false) : isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.sourceLocation = sourceLocation;
        this.taskFilePath = Objects.requireNonNull(taskFilePath, "expected parameter 'taskFilePath' to be non-null");
        this.timeout = timeout == null ? Codegen.ofNullable(3600) : timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
        this.valuesFilePath = valuesFilePath;
    }

    private FileTaskRunRequestArgs() {
        this.agentConfiguration = Codegen.empty();
        this.agentPoolName = Codegen.empty();
        this.credentials = Codegen.empty();
        this.isArchiveEnabled = Codegen.empty();
        this.logTemplate = Codegen.empty();
        this.platform = Codegen.empty();
        this.sourceLocation = Codegen.empty();
        this.taskFilePath = Codegen.empty();
        this.timeout = Codegen.empty();
        this.type = Codegen.empty();
        this.values = Codegen.empty();
        this.valuesFilePath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileTaskRunRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AgentPropertiesArgs> agentConfiguration;
        private @Nullable Output<String> agentPoolName;
        private @Nullable Output<CredentialsArgs> credentials;
        private @Nullable Output<Boolean> isArchiveEnabled;
        private @Nullable Output<String> logTemplate;
        private Output<PlatformPropertiesArgs> platform;
        private @Nullable Output<String> sourceLocation;
        private Output<String> taskFilePath;
        private @Nullable Output<Integer> timeout;
        private Output<String> type;
        private @Nullable Output<List<SetValueArgs>> values;
        private @Nullable Output<String> valuesFilePath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileTaskRunRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.credentials = defaults.credentials;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.platform = defaults.platform;
    	      this.sourceLocation = defaults.sourceLocation;
    	      this.taskFilePath = defaults.taskFilePath;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
    	      this.valuesFilePath = defaults.valuesFilePath;
        }

        public Builder agentConfiguration(@Nullable Output<AgentPropertiesArgs> agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }
        public Builder agentConfiguration(@Nullable AgentPropertiesArgs agentConfiguration) {
            this.agentConfiguration = Codegen.ofNullable(agentConfiguration);
            return this;
        }
        public Builder agentPoolName(@Nullable Output<String> agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }
        public Builder agentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = Codegen.ofNullable(agentPoolName);
            return this;
        }
        public Builder credentials(@Nullable Output<CredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable CredentialsArgs credentials) {
            this.credentials = Codegen.ofNullable(credentials);
            return this;
        }
        public Builder isArchiveEnabled(@Nullable Output<Boolean> isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }
        public Builder isArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = Codegen.ofNullable(isArchiveEnabled);
            return this;
        }
        public Builder logTemplate(@Nullable Output<String> logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }
        public Builder logTemplate(@Nullable String logTemplate) {
            this.logTemplate = Codegen.ofNullable(logTemplate);
            return this;
        }
        public Builder platform(Output<PlatformPropertiesArgs> platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }
        public Builder platform(PlatformPropertiesArgs platform) {
            this.platform = Output.of(Objects.requireNonNull(platform));
            return this;
        }
        public Builder sourceLocation(@Nullable Output<String> sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }
        public Builder sourceLocation(@Nullable String sourceLocation) {
            this.sourceLocation = Codegen.ofNullable(sourceLocation);
            return this;
        }
        public Builder taskFilePath(Output<String> taskFilePath) {
            this.taskFilePath = Objects.requireNonNull(taskFilePath);
            return this;
        }
        public Builder taskFilePath(String taskFilePath) {
            this.taskFilePath = Output.of(Objects.requireNonNull(taskFilePath));
            return this;
        }
        public Builder timeout(@Nullable Output<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder values(@Nullable Output<List<SetValueArgs>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<SetValueArgs> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }
        public Builder values(SetValueArgs... values) {
            return values(List.of(values));
        }
        public Builder valuesFilePath(@Nullable Output<String> valuesFilePath) {
            this.valuesFilePath = valuesFilePath;
            return this;
        }
        public Builder valuesFilePath(@Nullable String valuesFilePath) {
            this.valuesFilePath = Codegen.ofNullable(valuesFilePath);
            return this;
        }        public FileTaskRunRequestArgs build() {
            return new FileTaskRunRequestArgs(agentConfiguration, agentPoolName, credentials, isArchiveEnabled, logTemplate, platform, sourceLocation, taskFilePath, timeout, type, values, valuesFilePath);
        }
    }
}
