// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHttpHealthCheckArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHttpHealthCheckArgs Empty = new GetHttpHealthCheckArgs();

    @Import(name="httpHealthCheck", required=true)
    private String httpHealthCheck;

    public String httpHealthCheck() {
        return this.httpHealthCheck;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetHttpHealthCheckArgs() {}

    private GetHttpHealthCheckArgs(GetHttpHealthCheckArgs $) {
        this.httpHealthCheck = $.httpHealthCheck;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHttpHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHttpHealthCheckArgs $;

        public Builder() {
            $ = new GetHttpHealthCheckArgs();
        }

        public Builder(GetHttpHealthCheckArgs defaults) {
            $ = new GetHttpHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        public Builder httpHealthCheck(String httpHealthCheck) {
            $.httpHealthCheck = httpHealthCheck;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetHttpHealthCheckArgs build() {
            $.httpHealthCheck = Objects.requireNonNull($.httpHealthCheck, "expected parameter 'httpHealthCheck' to be non-null");
            return $;
        }
    }

}
