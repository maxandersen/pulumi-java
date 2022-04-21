// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOccurrenceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOccurrenceArgs Empty = new GetOccurrenceArgs();

    @Import(name="occurrenceId", required=true)
    private String occurrenceId;

    public String occurrenceId() {
        return this.occurrenceId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetOccurrenceArgs() {}

    private GetOccurrenceArgs(GetOccurrenceArgs $) {
        this.occurrenceId = $.occurrenceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOccurrenceArgs $;

        public Builder() {
            $ = new GetOccurrenceArgs();
        }

        public Builder(GetOccurrenceArgs defaults) {
            $ = new GetOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder occurrenceId(String occurrenceId) {
            $.occurrenceId = occurrenceId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetOccurrenceArgs build() {
            $.occurrenceId = Objects.requireNonNull($.occurrenceId, "expected parameter 'occurrenceId' to be non-null");
            return $;
        }
    }

}
