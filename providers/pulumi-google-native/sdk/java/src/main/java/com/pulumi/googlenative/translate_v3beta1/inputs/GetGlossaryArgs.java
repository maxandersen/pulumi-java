// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.translate_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlossaryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlossaryArgs Empty = new GetGlossaryArgs();

    @Import(name="glossaryId", required=true)
    private String glossaryId;

    public String glossaryId() {
        return this.glossaryId;
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

    private GetGlossaryArgs() {}

    private GetGlossaryArgs(GetGlossaryArgs $) {
        this.glossaryId = $.glossaryId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlossaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlossaryArgs $;

        public Builder() {
            $ = new GetGlossaryArgs();
        }

        public Builder(GetGlossaryArgs defaults) {
            $ = new GetGlossaryArgs(Objects.requireNonNull(defaults));
        }

        public Builder glossaryId(String glossaryId) {
            $.glossaryId = glossaryId;
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

        public GetGlossaryArgs build() {
            $.glossaryId = Objects.requireNonNull($.glossaryId, "expected parameter 'glossaryId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
