// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.AgentPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.ArgumentArgs;
import io.pulumi.azurenative.containerregistry.inputs.CredentialsArgs;
import io.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesArgs;
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
 * The parameters for a docker quick build.
 * 
 */
public final class DockerBuildRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final DockerBuildRequestArgs Empty = new DockerBuildRequestArgs();

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
     * The collection of override arguments to be used when executing the run.
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<List<ArgumentArgs>> arguments;

    public Output<List<ArgumentArgs>> arguments() {
        return this.arguments == null ? Codegen.empty() : this.arguments;
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
     * The Docker file path relative to the source location.
     * 
     */
    @Import(name="dockerFilePath", required=true)
      private final Output<String> dockerFilePath;

    public Output<String> dockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * The fully qualified image names including the repository and tag.
     * 
     */
    @Import(name="imageNames")
      private final @Nullable Output<List<String>> imageNames;

    public Output<List<String>> imageNames() {
        return this.imageNames == null ? Codegen.empty() : this.imageNames;
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
     * The value of this property indicates whether the image built should be pushed to the registry or not.
     * 
     */
    @Import(name="isPushEnabled")
      private final @Nullable Output<Boolean> isPushEnabled;

    public Output<Boolean> isPushEnabled() {
        return this.isPushEnabled == null ? Codegen.empty() : this.isPushEnabled;
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
     * The value of this property indicates whether the image cache is enabled or not.
     * 
     */
    @Import(name="noCache")
      private final @Nullable Output<Boolean> noCache;

    public Output<Boolean> noCache() {
        return this.noCache == null ? Codegen.empty() : this.noCache;
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
     * The name of the target build stage for the docker build.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> target() {
        return this.target == null ? Codegen.empty() : this.target;
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
     * Expected value is 'DockerBuildRequest'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public DockerBuildRequestArgs(
        @Nullable Output<AgentPropertiesArgs> agentConfiguration,
        @Nullable Output<String> agentPoolName,
        @Nullable Output<List<ArgumentArgs>> arguments,
        @Nullable Output<CredentialsArgs> credentials,
        Output<String> dockerFilePath,
        @Nullable Output<List<String>> imageNames,
        @Nullable Output<Boolean> isArchiveEnabled,
        @Nullable Output<Boolean> isPushEnabled,
        @Nullable Output<String> logTemplate,
        @Nullable Output<Boolean> noCache,
        Output<PlatformPropertiesArgs> platform,
        @Nullable Output<String> sourceLocation,
        @Nullable Output<String> target,
        @Nullable Output<Integer> timeout,
        Output<String> type) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.arguments = arguments;
        this.credentials = credentials;
        this.dockerFilePath = Objects.requireNonNull(dockerFilePath, "expected parameter 'dockerFilePath' to be non-null");
        this.imageNames = imageNames;
        this.isArchiveEnabled = isArchiveEnabled == null ? Codegen.ofNullable(false) : isArchiveEnabled;
        this.isPushEnabled = isPushEnabled == null ? Codegen.ofNullable(true) : isPushEnabled;
        this.logTemplate = logTemplate;
        this.noCache = noCache == null ? Codegen.ofNullable(false) : noCache;
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.sourceLocation = sourceLocation;
        this.target = target;
        this.timeout = timeout == null ? Codegen.ofNullable(3600) : timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DockerBuildRequestArgs() {
        this.agentConfiguration = Codegen.empty();
        this.agentPoolName = Codegen.empty();
        this.arguments = Codegen.empty();
        this.credentials = Codegen.empty();
        this.dockerFilePath = Codegen.empty();
        this.imageNames = Codegen.empty();
        this.isArchiveEnabled = Codegen.empty();
        this.isPushEnabled = Codegen.empty();
        this.logTemplate = Codegen.empty();
        this.noCache = Codegen.empty();
        this.platform = Codegen.empty();
        this.sourceLocation = Codegen.empty();
        this.target = Codegen.empty();
        this.timeout = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerBuildRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AgentPropertiesArgs> agentConfiguration;
        private @Nullable Output<String> agentPoolName;
        private @Nullable Output<List<ArgumentArgs>> arguments;
        private @Nullable Output<CredentialsArgs> credentials;
        private Output<String> dockerFilePath;
        private @Nullable Output<List<String>> imageNames;
        private @Nullable Output<Boolean> isArchiveEnabled;
        private @Nullable Output<Boolean> isPushEnabled;
        private @Nullable Output<String> logTemplate;
        private @Nullable Output<Boolean> noCache;
        private Output<PlatformPropertiesArgs> platform;
        private @Nullable Output<String> sourceLocation;
        private @Nullable Output<String> target;
        private @Nullable Output<Integer> timeout;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerBuildRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.arguments = defaults.arguments;
    	      this.credentials = defaults.credentials;
    	      this.dockerFilePath = defaults.dockerFilePath;
    	      this.imageNames = defaults.imageNames;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.noCache = defaults.noCache;
    	      this.platform = defaults.platform;
    	      this.sourceLocation = defaults.sourceLocation;
    	      this.target = defaults.target;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
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
        public Builder arguments(@Nullable Output<List<ArgumentArgs>> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(@Nullable List<ArgumentArgs> arguments) {
            this.arguments = Codegen.ofNullable(arguments);
            return this;
        }
        public Builder arguments(ArgumentArgs... arguments) {
            return arguments(List.of(arguments));
        }
        public Builder credentials(@Nullable Output<CredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable CredentialsArgs credentials) {
            this.credentials = Codegen.ofNullable(credentials);
            return this;
        }
        public Builder dockerFilePath(Output<String> dockerFilePath) {
            this.dockerFilePath = Objects.requireNonNull(dockerFilePath);
            return this;
        }
        public Builder dockerFilePath(String dockerFilePath) {
            this.dockerFilePath = Output.of(Objects.requireNonNull(dockerFilePath));
            return this;
        }
        public Builder imageNames(@Nullable Output<List<String>> imageNames) {
            this.imageNames = imageNames;
            return this;
        }
        public Builder imageNames(@Nullable List<String> imageNames) {
            this.imageNames = Codegen.ofNullable(imageNames);
            return this;
        }
        public Builder imageNames(String... imageNames) {
            return imageNames(List.of(imageNames));
        }
        public Builder isArchiveEnabled(@Nullable Output<Boolean> isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }
        public Builder isArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = Codegen.ofNullable(isArchiveEnabled);
            return this;
        }
        public Builder isPushEnabled(@Nullable Output<Boolean> isPushEnabled) {
            this.isPushEnabled = isPushEnabled;
            return this;
        }
        public Builder isPushEnabled(@Nullable Boolean isPushEnabled) {
            this.isPushEnabled = Codegen.ofNullable(isPushEnabled);
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
        public Builder noCache(@Nullable Output<Boolean> noCache) {
            this.noCache = noCache;
            return this;
        }
        public Builder noCache(@Nullable Boolean noCache) {
            this.noCache = Codegen.ofNullable(noCache);
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
        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Codegen.ofNullable(target);
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
        }        public DockerBuildRequestArgs build() {
            return new DockerBuildRequestArgs(agentConfiguration, agentPoolName, arguments, credentials, dockerFilePath, imageNames, isArchiveEnabled, isPushEnabled, logTemplate, noCache, platform, sourceLocation, target, timeout, type);
        }
    }
}
