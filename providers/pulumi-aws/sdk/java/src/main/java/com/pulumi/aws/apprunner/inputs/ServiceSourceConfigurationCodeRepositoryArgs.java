// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.inputs;

import com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs;
import com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceSourceConfigurationCodeRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationCodeRepositoryArgs Empty = new ServiceSourceConfigurationCodeRepositoryArgs();

    /**
     * Configuration for building and running the service from a source code repository. See Code Configuration below for more details.
     * 
     */
    @Import(name="codeConfiguration")
    private @Nullable Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs> codeConfiguration;

    public Optional<Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs>> codeConfiguration() {
        return Optional.ofNullable(this.codeConfiguration);
    }

    /**
     * The location of the repository that contains the source code.
     * 
     */
    @Import(name="repositoryUrl", required=true)
    private Output<String> repositoryUrl;

    public Output<String> repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * The version that should be used within the source code repository. See Source Code Version below for more details.
     * 
     */
    @Import(name="sourceCodeVersion", required=true)
    private Output<ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs> sourceCodeVersion;

    public Output<ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs> sourceCodeVersion() {
        return this.sourceCodeVersion;
    }

    private ServiceSourceConfigurationCodeRepositoryArgs() {}

    private ServiceSourceConfigurationCodeRepositoryArgs(ServiceSourceConfigurationCodeRepositoryArgs $) {
        this.codeConfiguration = $.codeConfiguration;
        this.repositoryUrl = $.repositoryUrl;
        this.sourceCodeVersion = $.sourceCodeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSourceConfigurationCodeRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSourceConfigurationCodeRepositoryArgs $;

        public Builder() {
            $ = new ServiceSourceConfigurationCodeRepositoryArgs();
        }

        public Builder(ServiceSourceConfigurationCodeRepositoryArgs defaults) {
            $ = new ServiceSourceConfigurationCodeRepositoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder codeConfiguration(@Nullable Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs> codeConfiguration) {
            $.codeConfiguration = codeConfiguration;
            return this;
        }

        public Builder codeConfiguration(ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs codeConfiguration) {
            return codeConfiguration(Output.of(codeConfiguration));
        }

        public Builder repositoryUrl(Output<String> repositoryUrl) {
            $.repositoryUrl = repositoryUrl;
            return this;
        }

        public Builder repositoryUrl(String repositoryUrl) {
            return repositoryUrl(Output.of(repositoryUrl));
        }

        public Builder sourceCodeVersion(Output<ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs> sourceCodeVersion) {
            $.sourceCodeVersion = sourceCodeVersion;
            return this;
        }

        public Builder sourceCodeVersion(ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs sourceCodeVersion) {
            return sourceCodeVersion(Output.of(sourceCodeVersion));
        }

        public ServiceSourceConfigurationCodeRepositoryArgs build() {
            $.repositoryUrl = Objects.requireNonNull($.repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
            $.sourceCodeVersion = Objects.requireNonNull($.sourceCodeVersion, "expected parameter 'sourceCodeVersion' to be non-null");
            return $;
        }
    }

}
