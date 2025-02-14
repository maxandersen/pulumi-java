// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.outputs;

import com.pulumi.awsnative.imagebuilder.enums.DistributionConfigurationTargetContainerRepositoryService;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionConfigurationTargetContainerRepository {
    /**
     * @return The repository name of target container repository.
     * 
     */
    private final @Nullable String repositoryName;
    /**
     * @return The service of target container repository.
     * 
     */
    private final @Nullable DistributionConfigurationTargetContainerRepositoryService service;

    @CustomType.Constructor
    private DistributionConfigurationTargetContainerRepository(
        @CustomType.Parameter("repositoryName") @Nullable String repositoryName,
        @CustomType.Parameter("service") @Nullable DistributionConfigurationTargetContainerRepositoryService service) {
        this.repositoryName = repositoryName;
        this.service = service;
    }

    /**
     * @return The repository name of target container repository.
     * 
     */
    public Optional<String> repositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }
    /**
     * @return The service of target container repository.
     * 
     */
    public Optional<DistributionConfigurationTargetContainerRepositoryService> service() {
        return Optional.ofNullable(this.service);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationTargetContainerRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String repositoryName;
        private @Nullable DistributionConfigurationTargetContainerRepositoryService service;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationTargetContainerRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
    	      this.service = defaults.service;
        }

        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public Builder service(@Nullable DistributionConfigurationTargetContainerRepositoryService service) {
            this.service = service;
            return this;
        }        public DistributionConfigurationTargetContainerRepository build() {
            return new DistributionConfigurationTargetContainerRepository(repositoryName, service);
        }
    }
}
