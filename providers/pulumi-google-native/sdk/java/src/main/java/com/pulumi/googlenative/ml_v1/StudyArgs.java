// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__StudyConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StudyArgs extends com.pulumi.resources.ResourceArgs {

    public static final StudyArgs Empty = new StudyArgs();

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Configuration of the study.
     * 
     */
    @Import(name="studyConfig", required=true)
    private Output<GoogleCloudMlV1__StudyConfigArgs> studyConfig;

    public Output<GoogleCloudMlV1__StudyConfigArgs> studyConfig() {
        return this.studyConfig;
    }

    @Import(name="studyId", required=true)
    private Output<String> studyId;

    public Output<String> studyId() {
        return this.studyId;
    }

    private StudyArgs() {}

    private StudyArgs(StudyArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.studyConfig = $.studyConfig;
        this.studyId = $.studyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StudyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StudyArgs $;

        public Builder() {
            $ = new StudyArgs();
        }

        public Builder(StudyArgs defaults) {
            $ = new StudyArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder studyConfig(Output<GoogleCloudMlV1__StudyConfigArgs> studyConfig) {
            $.studyConfig = studyConfig;
            return this;
        }

        public Builder studyConfig(GoogleCloudMlV1__StudyConfigArgs studyConfig) {
            return studyConfig(Output.of(studyConfig));
        }

        public Builder studyId(Output<String> studyId) {
            $.studyId = studyId;
            return this;
        }

        public Builder studyId(String studyId) {
            return studyId(Output.of(studyId));
        }

        public StudyArgs build() {
            $.studyConfig = Objects.requireNonNull($.studyConfig, "expected parameter 'studyConfig' to be non-null");
            $.studyId = Objects.requireNonNull($.studyId, "expected parameter 'studyId' to be non-null");
            return $;
        }
    }

}
