// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.inputs;

import com.pulumi.aws.mskconnect.inputs.CustomPluginLocationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomPluginState extends com.pulumi.resources.ResourceArgs {

    public static final CustomPluginState Empty = new CustomPluginState();

    /**
     * the Amazon Resource Name (ARN) of the custom plugin.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The type of the plugin file. Allowed values are `ZIP` and `JAR`.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * A summary description of the custom plugin.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * an ID of the latest successfully created revision of the custom plugin.
     * 
     */
    @Import(name="latestRevision")
    private @Nullable Output<Integer> latestRevision;

    public Optional<Output<Integer>> latestRevision() {
        return Optional.ofNullable(this.latestRevision);
    }

    /**
     * Information about the location of a custom plugin. See below.
     * 
     */
    @Import(name="location")
    private @Nullable Output<CustomPluginLocationGetArgs> location;

    public Optional<Output<CustomPluginLocationGetArgs>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the custom plugin..
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * the state of the custom plugin.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private CustomPluginState() {}

    private CustomPluginState(CustomPluginState $) {
        this.arn = $.arn;
        this.contentType = $.contentType;
        this.description = $.description;
        this.latestRevision = $.latestRevision;
        this.location = $.location;
        this.name = $.name;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomPluginState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomPluginState $;

        public Builder() {
            $ = new CustomPluginState();
        }

        public Builder(CustomPluginState defaults) {
            $ = new CustomPluginState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder latestRevision(@Nullable Output<Integer> latestRevision) {
            $.latestRevision = latestRevision;
            return this;
        }

        public Builder latestRevision(Integer latestRevision) {
            return latestRevision(Output.of(latestRevision));
        }

        public Builder location(@Nullable Output<CustomPluginLocationGetArgs> location) {
            $.location = location;
            return this;
        }

        public Builder location(CustomPluginLocationGetArgs location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public CustomPluginState build() {
            return $;
        }
    }

}
