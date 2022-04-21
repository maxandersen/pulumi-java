// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.awsnative.apprunner.inputs.ServiceCodeConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceSourceCodeVersionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Source Code Repository
 * 
 */
public final class ServiceCodeRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceCodeRepositoryArgs Empty = new ServiceCodeRepositoryArgs();

    @Import(name="codeConfiguration")
    private @Nullable Output<ServiceCodeConfigurationArgs> codeConfiguration;

    public Optional<Output<ServiceCodeConfigurationArgs>> codeConfiguration() {
        return Optional.ofNullable(this.codeConfiguration);
    }

    /**
     * Repository Url
     * 
     */
    @Import(name="repositoryUrl", required=true)
    private Output<String> repositoryUrl;

    public Output<String> repositoryUrl() {
        return this.repositoryUrl;
    }

    @Import(name="sourceCodeVersion", required=true)
    private Output<ServiceSourceCodeVersionArgs> sourceCodeVersion;

    public Output<ServiceSourceCodeVersionArgs> sourceCodeVersion() {
        return this.sourceCodeVersion;
    }

    private ServiceCodeRepositoryArgs() {}

    private ServiceCodeRepositoryArgs(ServiceCodeRepositoryArgs $) {
        this.codeConfiguration = $.codeConfiguration;
        this.repositoryUrl = $.repositoryUrl;
        this.sourceCodeVersion = $.sourceCodeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceCodeRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceCodeRepositoryArgs $;

        public Builder() {
            $ = new ServiceCodeRepositoryArgs();
        }

        public Builder(ServiceCodeRepositoryArgs defaults) {
            $ = new ServiceCodeRepositoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder codeConfiguration(@Nullable Output<ServiceCodeConfigurationArgs> codeConfiguration) {
            $.codeConfiguration = codeConfiguration;
            return this;
        }

        public Builder codeConfiguration(ServiceCodeConfigurationArgs codeConfiguration) {
            return codeConfiguration(Output.of(codeConfiguration));
        }

        public Builder repositoryUrl(Output<String> repositoryUrl) {
            $.repositoryUrl = repositoryUrl;
            return this;
        }

        public Builder repositoryUrl(String repositoryUrl) {
            return repositoryUrl(Output.of(repositoryUrl));
        }

        public Builder sourceCodeVersion(Output<ServiceSourceCodeVersionArgs> sourceCodeVersion) {
            $.sourceCodeVersion = sourceCodeVersion;
            return this;
        }

        public Builder sourceCodeVersion(ServiceSourceCodeVersionArgs sourceCodeVersion) {
            return sourceCodeVersion(Output.of(sourceCodeVersion));
        }

        public ServiceCodeRepositoryArgs build() {
            $.repositoryUrl = Objects.requireNonNull($.repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
            $.sourceCodeVersion = Objects.requireNonNull($.sourceCodeVersion, "expected parameter 'sourceCodeVersion' to be non-null");
            return $;
        }
    }

}
