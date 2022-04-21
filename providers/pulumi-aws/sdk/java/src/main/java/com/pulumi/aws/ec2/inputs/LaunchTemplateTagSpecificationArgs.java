// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LaunchTemplateTagSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateTagSpecificationArgs Empty = new LaunchTemplateTagSpecificationArgs();

    /**
     * The type of resource to tag.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * A map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private LaunchTemplateTagSpecificationArgs() {}

    private LaunchTemplateTagSpecificationArgs(LaunchTemplateTagSpecificationArgs $) {
        this.resourceType = $.resourceType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchTemplateTagSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchTemplateTagSpecificationArgs $;

        public Builder() {
            $ = new LaunchTemplateTagSpecificationArgs();
        }

        public Builder(LaunchTemplateTagSpecificationArgs defaults) {
            $ = new LaunchTemplateTagSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public LaunchTemplateTagSpecificationArgs build() {
            return $;
        }
    }

}
