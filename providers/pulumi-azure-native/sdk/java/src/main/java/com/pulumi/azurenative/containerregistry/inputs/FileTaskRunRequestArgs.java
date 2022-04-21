// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.AgentPropertiesArgs;
import com.pulumi.azurenative.containerregistry.inputs.CredentialsArgs;
import com.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesArgs;
import com.pulumi.azurenative.containerregistry.inputs.SetValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The request parameters for a scheduling run against a task file.
 * 
 */
public final class FileTaskRunRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileTaskRunRequestArgs Empty = new FileTaskRunRequestArgs();

    /**
     * The machine configuration of the run agent.
     * 
     */
    @Import(name="agentConfiguration")
    private @Nullable Output<AgentPropertiesArgs> agentConfiguration;

    public Optional<Output<AgentPropertiesArgs>> agentConfiguration() {
        return Optional.ofNullable(this.agentConfiguration);
    }

    /**
     * The dedicated agent pool for the run.
     * 
     */
    @Import(name="agentPoolName")
    private @Nullable Output<String> agentPoolName;

    public Optional<Output<String>> agentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }

    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<CredentialsArgs> credentials;

    public Optional<Output<CredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    @Import(name="isArchiveEnabled")
    private @Nullable Output<Boolean> isArchiveEnabled;

    public Optional<Output<Boolean>> isArchiveEnabled() {
        return Optional.ofNullable(this.isArchiveEnabled);
    }

    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @Import(name="logTemplate")
    private @Nullable Output<String> logTemplate;

    public Optional<Output<String>> logTemplate() {
        return Optional.ofNullable(this.logTemplate);
    }

    /**
     * The platform properties against which the run has to happen.
     * 
     */
    @Import(name="platform", required=true)
    private Output<PlatformPropertiesArgs> platform;

    public Output<PlatformPropertiesArgs> platform() {
        return this.platform;
    }

    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
     */
    @Import(name="sourceLocation")
    private @Nullable Output<String> sourceLocation;

    public Optional<Output<String>> sourceLocation() {
        return Optional.ofNullable(this.sourceLocation);
    }

    /**
     * The template/definition file path relative to the source.
     * 
     */
    @Import(name="taskFilePath", required=true)
    private Output<String> taskFilePath;

    public Output<String> taskFilePath() {
        return this.taskFilePath;
    }

    /**
     * Run timeout in seconds.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The type of the run request.
     * Expected value is &#39;FileTaskRunRequest&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<SetValueArgs>> values;

    public Optional<Output<List<SetValueArgs>>> values() {
        return Optional.ofNullable(this.values);
    }

    /**
     * The values/parameters file path relative to the source.
     * 
     */
    @Import(name="valuesFilePath")
    private @Nullable Output<String> valuesFilePath;

    public Optional<Output<String>> valuesFilePath() {
        return Optional.ofNullable(this.valuesFilePath);
    }

    private FileTaskRunRequestArgs() {}

    private FileTaskRunRequestArgs(FileTaskRunRequestArgs $) {
        this.agentConfiguration = $.agentConfiguration;
        this.agentPoolName = $.agentPoolName;
        this.credentials = $.credentials;
        this.isArchiveEnabled = $.isArchiveEnabled;
        this.logTemplate = $.logTemplate;
        this.platform = $.platform;
        this.sourceLocation = $.sourceLocation;
        this.taskFilePath = $.taskFilePath;
        this.timeout = $.timeout;
        this.type = $.type;
        this.values = $.values;
        this.valuesFilePath = $.valuesFilePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileTaskRunRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileTaskRunRequestArgs $;

        public Builder() {
            $ = new FileTaskRunRequestArgs();
        }

        public Builder(FileTaskRunRequestArgs defaults) {
            $ = new FileTaskRunRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentConfiguration(@Nullable Output<AgentPropertiesArgs> agentConfiguration) {
            $.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder agentConfiguration(AgentPropertiesArgs agentConfiguration) {
            return agentConfiguration(Output.of(agentConfiguration));
        }

        public Builder agentPoolName(@Nullable Output<String> agentPoolName) {
            $.agentPoolName = agentPoolName;
            return this;
        }

        public Builder agentPoolName(String agentPoolName) {
            return agentPoolName(Output.of(agentPoolName));
        }

        public Builder credentials(@Nullable Output<CredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder credentials(CredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        public Builder isArchiveEnabled(@Nullable Output<Boolean> isArchiveEnabled) {
            $.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder isArchiveEnabled(Boolean isArchiveEnabled) {
            return isArchiveEnabled(Output.of(isArchiveEnabled));
        }

        public Builder logTemplate(@Nullable Output<String> logTemplate) {
            $.logTemplate = logTemplate;
            return this;
        }

        public Builder logTemplate(String logTemplate) {
            return logTemplate(Output.of(logTemplate));
        }

        public Builder platform(Output<PlatformPropertiesArgs> platform) {
            $.platform = platform;
            return this;
        }

        public Builder platform(PlatformPropertiesArgs platform) {
            return platform(Output.of(platform));
        }

        public Builder sourceLocation(@Nullable Output<String> sourceLocation) {
            $.sourceLocation = sourceLocation;
            return this;
        }

        public Builder sourceLocation(String sourceLocation) {
            return sourceLocation(Output.of(sourceLocation));
        }

        public Builder taskFilePath(Output<String> taskFilePath) {
            $.taskFilePath = taskFilePath;
            return this;
        }

        public Builder taskFilePath(String taskFilePath) {
            return taskFilePath(Output.of(taskFilePath));
        }

        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder values(@Nullable Output<List<SetValueArgs>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<SetValueArgs> values) {
            return values(Output.of(values));
        }

        public Builder values(SetValueArgs... values) {
            return values(List.of(values));
        }

        public Builder valuesFilePath(@Nullable Output<String> valuesFilePath) {
            $.valuesFilePath = valuesFilePath;
            return this;
        }

        public Builder valuesFilePath(String valuesFilePath) {
            return valuesFilePath(Output.of(valuesFilePath));
        }

        public FileTaskRunRequestArgs build() {
            $.isArchiveEnabled = Codegen.booleanProp("isArchiveEnabled").output().arg($.isArchiveEnabled).def(false).getNullable();
            $.platform = Objects.requireNonNull($.platform, "expected parameter 'platform' to be non-null");
            $.taskFilePath = Objects.requireNonNull($.taskFilePath, "expected parameter 'taskFilePath' to be non-null");
            $.timeout = Codegen.integerProp("timeout").output().arg($.timeout).def(3600).getNullable();
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
