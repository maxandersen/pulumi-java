// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInspectTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInspectTemplateArgs Empty = new GetInspectTemplateArgs();

    @Import(name="inspectTemplateId", required=true)
    private String inspectTemplateId;

    public String inspectTemplateId() {
        return this.inspectTemplateId;
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

    private GetInspectTemplateArgs() {}

    private GetInspectTemplateArgs(GetInspectTemplateArgs $) {
        this.inspectTemplateId = $.inspectTemplateId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInspectTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInspectTemplateArgs $;

        public Builder() {
            $ = new GetInspectTemplateArgs();
        }

        public Builder(GetInspectTemplateArgs defaults) {
            $ = new GetInspectTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder inspectTemplateId(String inspectTemplateId) {
            $.inspectTemplateId = inspectTemplateId;
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

        public GetInspectTemplateArgs build() {
            $.inspectTemplateId = Objects.requireNonNull($.inspectTemplateId, "expected parameter 'inspectTemplateId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
