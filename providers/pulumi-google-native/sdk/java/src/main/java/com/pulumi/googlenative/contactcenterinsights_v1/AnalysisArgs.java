// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalysisArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalysisArgs Empty = new AnalysisArgs();

    @Import(name="conversationId", required=true)
    private Output<String> conversationId;

    public Output<String> conversationId() {
        return this.conversationId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Immutable. The resource name of the analysis. Format: projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private AnalysisArgs() {}

    private AnalysisArgs(AnalysisArgs $) {
        this.conversationId = $.conversationId;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalysisArgs $;

        public Builder() {
            $ = new AnalysisArgs();
        }

        public Builder(AnalysisArgs defaults) {
            $ = new AnalysisArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationId(Output<String> conversationId) {
            $.conversationId = conversationId;
            return this;
        }

        public Builder conversationId(String conversationId) {
            return conversationId(Output.of(conversationId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
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

        public AnalysisArgs build() {
            $.conversationId = Objects.requireNonNull($.conversationId, "expected parameter 'conversationId' to be non-null");
            return $;
        }
    }

}
