// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.composer.inputs.EnvironmentConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Configuration parameters for this environment.
     * 
     */
    @Import(name="config")
    private @Nullable Output<EnvironmentConfigArgs> config;

    public Optional<Output<EnvironmentConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
     * are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
     * must conform to the following regular expression: [a-z]([-a-z0-9]*[a-z0-9])?. Label values must be between 0 and 63
     * characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?. No more than 64 labels can be
     * associated with a given environment. Both keys and values must be &lt;= 128 bytes in size.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The location or Compute Engine region for the environment.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.config = $.config;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder config(@Nullable Output<EnvironmentConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(EnvironmentConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public EnvironmentArgs build() {
            return $;
        }
    }

}
