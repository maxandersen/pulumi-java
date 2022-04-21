// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionConfigurationDistributionContainerDistributionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionContainerDistributionConfigurationArgs Empty = new DistributionConfigurationDistributionContainerDistributionConfigurationArgs();

    /**
     * Set of tags that are attached to the container distribution configuration.
     * 
     */
    @Import(name="containerTags")
    private @Nullable Output<List<String>> containerTags;

    public Optional<Output<List<String>>> containerTags() {
        return Optional.ofNullable(this.containerTags);
    }

    /**
     * Description of the container distribution configuration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Configuration block with the destination repository for the container distribution configuration.
     * 
     */
    @Import(name="targetRepository", required=true)
    private Output<DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryArgs> targetRepository;

    public Output<DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryArgs> targetRepository() {
        return this.targetRepository;
    }

    private DistributionConfigurationDistributionContainerDistributionConfigurationArgs() {}

    private DistributionConfigurationDistributionContainerDistributionConfigurationArgs(DistributionConfigurationDistributionContainerDistributionConfigurationArgs $) {
        this.containerTags = $.containerTags;
        this.description = $.description;
        this.targetRepository = $.targetRepository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionConfigurationDistributionContainerDistributionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionConfigurationDistributionContainerDistributionConfigurationArgs $;

        public Builder() {
            $ = new DistributionConfigurationDistributionContainerDistributionConfigurationArgs();
        }

        public Builder(DistributionConfigurationDistributionContainerDistributionConfigurationArgs defaults) {
            $ = new DistributionConfigurationDistributionContainerDistributionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerTags(@Nullable Output<List<String>> containerTags) {
            $.containerTags = containerTags;
            return this;
        }

        public Builder containerTags(List<String> containerTags) {
            return containerTags(Output.of(containerTags));
        }

        public Builder containerTags(String... containerTags) {
            return containerTags(List.of(containerTags));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder targetRepository(Output<DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryArgs> targetRepository) {
            $.targetRepository = targetRepository;
            return this;
        }

        public Builder targetRepository(DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryArgs targetRepository) {
            return targetRepository(Output.of(targetRepository));
        }

        public DistributionConfigurationDistributionContainerDistributionConfigurationArgs build() {
            $.targetRepository = Objects.requireNonNull($.targetRepository, "expected parameter 'targetRepository' to be non-null");
            return $;
        }
    }

}
