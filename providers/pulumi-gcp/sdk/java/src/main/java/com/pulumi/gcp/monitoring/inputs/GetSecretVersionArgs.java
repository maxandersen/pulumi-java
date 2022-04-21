// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretVersionArgs Empty = new GetSecretVersionArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="secret", required=true)
    private String secret;

    public String secret() {
        return this.secret;
    }

    @Import(name="version")
    private @Nullable String version;

    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private GetSecretVersionArgs() {}

    private GetSecretVersionArgs(GetSecretVersionArgs $) {
        this.project = $.project;
        this.secret = $.secret;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretVersionArgs $;

        public Builder() {
            $ = new GetSecretVersionArgs();
        }

        public Builder(GetSecretVersionArgs defaults) {
            $ = new GetSecretVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder secret(String secret) {
            $.secret = secret;
            return this;
        }

        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public GetSecretVersionArgs build() {
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}
