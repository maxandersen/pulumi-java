// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotScheduleArgs Empty = new SnapshotScheduleArgs();

    /**
     * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
     * 
     */
    @Import(name="definitions", required=true)
    private Output<List<String>> definitions;

    public Output<List<String>> definitions() {
        return this.definitions;
    }

    /**
     * The description of the snapshot schedule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Creates a unique
     * identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @Import(name="identifierPrefix")
    private @Nullable Output<String> identifierPrefix;

    public Optional<Output<String>> identifierPrefix() {
        return Optional.ofNullable(this.identifierPrefix);
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

    private SnapshotScheduleArgs() {}

    private SnapshotScheduleArgs(SnapshotScheduleArgs $) {
        this.definitions = $.definitions;
        this.description = $.description;
        this.forceDestroy = $.forceDestroy;
        this.identifier = $.identifier;
        this.identifierPrefix = $.identifierPrefix;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotScheduleArgs $;

        public Builder() {
            $ = new SnapshotScheduleArgs();
        }

        public Builder(SnapshotScheduleArgs defaults) {
            $ = new SnapshotScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder definitions(Output<List<String>> definitions) {
            $.definitions = definitions;
            return this;
        }

        public Builder definitions(List<String> definitions) {
            return definitions(Output.of(definitions));
        }

        public Builder definitions(String... definitions) {
            return definitions(List.of(definitions));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public Builder identifierPrefix(@Nullable Output<String> identifierPrefix) {
            $.identifierPrefix = identifierPrefix;
            return this;
        }

        public Builder identifierPrefix(String identifierPrefix) {
            return identifierPrefix(Output.of(identifierPrefix));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SnapshotScheduleArgs build() {
            $.definitions = Objects.requireNonNull($.definitions, "expected parameter 'definitions' to be non-null");
            return $;
        }
    }

}
