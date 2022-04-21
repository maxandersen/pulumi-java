// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.aws.rds.inputs.OptionGroupOptionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OptionGroupState extends com.pulumi.resources.ResourceArgs {

    public static final OptionGroupState Empty = new OptionGroupState();

    /**
     * The ARN of the db option group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Specifies the name of the engine that this option group should be associated with.
     * 
     */
    @Import(name="engineName")
    private @Nullable Output<String> engineName;

    public Optional<Output<String>> engineName() {
        return Optional.ofNullable(this.engineName);
    }

    /**
     * Specifies the major version of the engine that this option group should be associated with.
     * 
     */
    @Import(name="majorEngineVersion")
    private @Nullable Output<String> majorEngineVersion;

    public Optional<Output<String>> majorEngineVersion() {
        return Optional.ofNullable(this.majorEngineVersion);
    }

    /**
     * The Name of the setting.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * The description of the option group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Import(name="optionGroupDescription")
    private @Nullable Output<String> optionGroupDescription;

    public Optional<Output<String>> optionGroupDescription() {
        return Optional.ofNullable(this.optionGroupDescription);
    }

    /**
     * A list of Options to apply.
     * 
     */
    @Import(name="options")
    private @Nullable Output<List<OptionGroupOptionGetArgs>> options;

    public Optional<Output<List<OptionGroupOptionGetArgs>>> options() {
        return Optional.ofNullable(this.options);
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

    private OptionGroupState() {}

    private OptionGroupState(OptionGroupState $) {
        this.arn = $.arn;
        this.engineName = $.engineName;
        this.majorEngineVersion = $.majorEngineVersion;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.optionGroupDescription = $.optionGroupDescription;
        this.options = $.options;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OptionGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OptionGroupState $;

        public Builder() {
            $ = new OptionGroupState();
        }

        public Builder(OptionGroupState defaults) {
            $ = new OptionGroupState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder engineName(@Nullable Output<String> engineName) {
            $.engineName = engineName;
            return this;
        }

        public Builder engineName(String engineName) {
            return engineName(Output.of(engineName));
        }

        public Builder majorEngineVersion(@Nullable Output<String> majorEngineVersion) {
            $.majorEngineVersion = majorEngineVersion;
            return this;
        }

        public Builder majorEngineVersion(String majorEngineVersion) {
            return majorEngineVersion(Output.of(majorEngineVersion));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder optionGroupDescription(@Nullable Output<String> optionGroupDescription) {
            $.optionGroupDescription = optionGroupDescription;
            return this;
        }

        public Builder optionGroupDescription(String optionGroupDescription) {
            return optionGroupDescription(Output.of(optionGroupDescription));
        }

        public Builder options(@Nullable Output<List<OptionGroupOptionGetArgs>> options) {
            $.options = options;
            return this;
        }

        public Builder options(List<OptionGroupOptionGetArgs> options) {
            return options(Output.of(options));
        }

        public Builder options(OptionGroupOptionGetArgs... options) {
            return options(List.of(options));
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

        public OptionGroupState build() {
            $.optionGroupDescription = Codegen.stringProp("optionGroupDescription").output().arg($.optionGroupDescription).def("Managed by Pulumi").getNullable();
            return $;
        }
    }

}
