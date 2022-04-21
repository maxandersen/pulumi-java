// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaIamPolicyArgs Empty = new GetSchemaIamPolicyArgs();

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="schemaId", required=true)
    private String schemaId;

    public String schemaId() {
        return this.schemaId;
    }

    private GetSchemaIamPolicyArgs() {}

    private GetSchemaIamPolicyArgs(GetSchemaIamPolicyArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.schemaId = $.schemaId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaIamPolicyArgs $;

        public Builder() {
            $ = new GetSchemaIamPolicyArgs();
        }

        public Builder(GetSchemaIamPolicyArgs defaults) {
            $ = new GetSchemaIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder schemaId(String schemaId) {
            $.schemaId = schemaId;
            return this;
        }

        public GetSchemaIamPolicyArgs build() {
            $.schemaId = Objects.requireNonNull($.schemaId, "expected parameter 'schemaId' to be non-null");
            return $;
        }
    }

}
