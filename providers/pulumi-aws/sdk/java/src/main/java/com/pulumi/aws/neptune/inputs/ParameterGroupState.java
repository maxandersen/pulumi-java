// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune.inputs;

import com.pulumi.aws.neptune.inputs.ParameterGroupParameterGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ParameterGroupState extends com.pulumi.resources.ResourceArgs {

    public static final ParameterGroupState Empty = new ParameterGroupState();

    /**
     * The Neptune parameter group Amazon Resource Name (ARN).
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The description of the Neptune parameter group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The family of the Neptune parameter group.
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The name of the Neptune parameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of Neptune parameters to apply.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<ParameterGroupParameterGetArgs>> parameters;

    public Optional<Output<List<ParameterGroupParameterGetArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ParameterGroupState() {}

    private ParameterGroupState(ParameterGroupState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.family = $.family;
        this.name = $.name;
        this.parameters = $.parameters;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParameterGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParameterGroupState $;

        public Builder() {
            $ = new ParameterGroupState();
        }

        public Builder(ParameterGroupState defaults) {
            $ = new ParameterGroupState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        public Builder family(String family) {
            return family(Output.of(family));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parameters(@Nullable Output<List<ParameterGroupParameterGetArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<ParameterGroupParameterGetArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(ParameterGroupParameterGetArgs... parameters) {
            return parameters(List.of(parameters));
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

        public ParameterGroupState build() {
            return $;
        }
    }

}
