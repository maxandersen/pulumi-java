// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobTriggerArgs Empty = new GetJobTriggerArgs();

    @Import(name="jobTriggerId", required=true)
    private String jobTriggerId;

    public String jobTriggerId() {
        return this.jobTriggerId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetJobTriggerArgs() {}

    private GetJobTriggerArgs(GetJobTriggerArgs $) {
        this.jobTriggerId = $.jobTriggerId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobTriggerArgs $;

        public Builder() {
            $ = new GetJobTriggerArgs();
        }

        public Builder(GetJobTriggerArgs defaults) {
            $ = new GetJobTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobTriggerId(String jobTriggerId) {
            $.jobTriggerId = jobTriggerId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetJobTriggerArgs build() {
            $.jobTriggerId = Objects.requireNonNull($.jobTriggerId, "expected parameter 'jobTriggerId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
