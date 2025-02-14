// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wisdom;

import com.pulumi.awsnative.wisdom.enums.AssistantType;
import com.pulumi.awsnative.wisdom.inputs.AssistantServerSideEncryptionConfigurationArgs;
import com.pulumi.awsnative.wisdom.inputs.AssistantTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssistantArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssistantArgs Empty = new AssistantArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="serverSideEncryptionConfiguration")
    private @Nullable Output<AssistantServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;

    public Optional<Output<AssistantServerSideEncryptionConfigurationArgs>> serverSideEncryptionConfiguration() {
        return Optional.ofNullable(this.serverSideEncryptionConfiguration);
    }

    @Import(name="tags")
    private @Nullable Output<List<AssistantTagArgs>> tags;

    public Optional<Output<List<AssistantTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="type", required=true)
    private Output<AssistantType> type;

    public Output<AssistantType> type() {
        return this.type;
    }

    private AssistantArgs() {}

    private AssistantArgs(AssistantArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.serverSideEncryptionConfiguration = $.serverSideEncryptionConfiguration;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssistantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssistantArgs $;

        public Builder() {
            $ = new AssistantArgs();
        }

        public Builder(AssistantArgs defaults) {
            $ = new AssistantArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder serverSideEncryptionConfiguration(@Nullable Output<AssistantServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration) {
            $.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }

        public Builder serverSideEncryptionConfiguration(AssistantServerSideEncryptionConfigurationArgs serverSideEncryptionConfiguration) {
            return serverSideEncryptionConfiguration(Output.of(serverSideEncryptionConfiguration));
        }

        public Builder tags(@Nullable Output<List<AssistantTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<AssistantTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(AssistantTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder type(Output<AssistantType> type) {
            $.type = type;
            return this;
        }

        public Builder type(AssistantType type) {
            return type(Output.of(type));
        }

        public AssistantArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
