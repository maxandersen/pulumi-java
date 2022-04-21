// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StudioLifecycleConfigState extends com.pulumi.resources.ResourceArgs {

    public static final StudioLifecycleConfigState Empty = new StudioLifecycleConfigState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Studio Lifecycle Config.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The App type that the Lifecycle Configuration is attached to. Valid values are `JupyterServer` and `KernelGateway`.
     * 
     */
    @Import(name="studioLifecycleConfigAppType")
    private @Nullable Output<String> studioLifecycleConfigAppType;

    public Optional<Output<String>> studioLifecycleConfigAppType() {
        return Optional.ofNullable(this.studioLifecycleConfigAppType);
    }

    /**
     * The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     * 
     */
    @Import(name="studioLifecycleConfigContent")
    private @Nullable Output<String> studioLifecycleConfigContent;

    public Optional<Output<String>> studioLifecycleConfigContent() {
        return Optional.ofNullable(this.studioLifecycleConfigContent);
    }

    /**
     * The name of the Studio Lifecycle Configuration to create.
     * 
     */
    @Import(name="studioLifecycleConfigName")
    private @Nullable Output<String> studioLifecycleConfigName;

    public Optional<Output<String>> studioLifecycleConfigName() {
        return Optional.ofNullable(this.studioLifecycleConfigName);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private StudioLifecycleConfigState() {}

    private StudioLifecycleConfigState(StudioLifecycleConfigState $) {
        this.arn = $.arn;
        this.studioLifecycleConfigAppType = $.studioLifecycleConfigAppType;
        this.studioLifecycleConfigContent = $.studioLifecycleConfigContent;
        this.studioLifecycleConfigName = $.studioLifecycleConfigName;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StudioLifecycleConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StudioLifecycleConfigState $;

        public Builder() {
            $ = new StudioLifecycleConfigState();
        }

        public Builder(StudioLifecycleConfigState defaults) {
            $ = new StudioLifecycleConfigState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder studioLifecycleConfigAppType(@Nullable Output<String> studioLifecycleConfigAppType) {
            $.studioLifecycleConfigAppType = studioLifecycleConfigAppType;
            return this;
        }

        public Builder studioLifecycleConfigAppType(String studioLifecycleConfigAppType) {
            return studioLifecycleConfigAppType(Output.of(studioLifecycleConfigAppType));
        }

        public Builder studioLifecycleConfigContent(@Nullable Output<String> studioLifecycleConfigContent) {
            $.studioLifecycleConfigContent = studioLifecycleConfigContent;
            return this;
        }

        public Builder studioLifecycleConfigContent(String studioLifecycleConfigContent) {
            return studioLifecycleConfigContent(Output.of(studioLifecycleConfigContent));
        }

        public Builder studioLifecycleConfigName(@Nullable Output<String> studioLifecycleConfigName) {
            $.studioLifecycleConfigName = studioLifecycleConfigName;
            return this;
        }

        public Builder studioLifecycleConfigName(String studioLifecycleConfigName) {
            return studioLifecycleConfigName(Output.of(studioLifecycleConfigName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public StudioLifecycleConfigState build() {
            return $;
        }
    }

}
