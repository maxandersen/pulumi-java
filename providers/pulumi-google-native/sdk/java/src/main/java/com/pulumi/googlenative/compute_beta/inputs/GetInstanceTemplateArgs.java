// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateArgs Empty = new GetInstanceTemplateArgs();

    @Import(name="instanceTemplate", required=true)
    private String instanceTemplate;

    public String instanceTemplate() {
        return this.instanceTemplate;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInstanceTemplateArgs() {}

    private GetInstanceTemplateArgs(GetInstanceTemplateArgs $) {
        this.instanceTemplate = $.instanceTemplate;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTemplateArgs $;

        public Builder() {
            $ = new GetInstanceTemplateArgs();
        }

        public Builder(GetInstanceTemplateArgs defaults) {
            $ = new GetInstanceTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceTemplate(String instanceTemplate) {
            $.instanceTemplate = instanceTemplate;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetInstanceTemplateArgs build() {
            $.instanceTemplate = Objects.requireNonNull($.instanceTemplate, "expected parameter 'instanceTemplate' to be non-null");
            return $;
        }
    }

}
