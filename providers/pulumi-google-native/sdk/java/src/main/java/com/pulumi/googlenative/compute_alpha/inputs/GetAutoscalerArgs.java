// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAutoscalerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutoscalerArgs Empty = new GetAutoscalerArgs();

    @Import(name="autoscaler", required=true)
    private String autoscaler;

    public String autoscaler() {
        return this.autoscaler;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private GetAutoscalerArgs() {}

    private GetAutoscalerArgs(GetAutoscalerArgs $) {
        this.autoscaler = $.autoscaler;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutoscalerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutoscalerArgs $;

        public Builder() {
            $ = new GetAutoscalerArgs();
        }

        public Builder(GetAutoscalerArgs defaults) {
            $ = new GetAutoscalerArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoscaler(String autoscaler) {
            $.autoscaler = autoscaler;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetAutoscalerArgs build() {
            $.autoscaler = Objects.requireNonNull($.autoscaler, "expected parameter 'autoscaler' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
